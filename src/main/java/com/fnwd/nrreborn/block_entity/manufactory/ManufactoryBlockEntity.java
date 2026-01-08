package com.fnwd.nrreborn.block_entity.manufactory;

import com.fnwd.nrreborn.block.manufactory.ManufactoryBlock;
import com.fnwd.nrreborn.block_entity.NRRBlockEntities;
import com.fnwd.nrreborn.block_entity.NRRWrappedMachineBlockEntity;
import com.fnwd.nrreborn.client.screen.manufactory.ManufactoryMenu;
import com.fnwd.nrreborn.item.NRRItems;
import com.fnwd.nrreborn.recipe.NRRRecipes;
import com.fnwd.nrreborn.recipe.manufactory.ManufactoryRecipeInput;
import com.fnwd.nrreborn.util.NRREnergyStorage;
import com.fnwd.nrreborn.util.WrappedHandler;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.Containers;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.neoforge.energy.IEnergyStorage;
import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.items.ItemHandlerHelper;
import net.neoforged.neoforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.math.BigDecimal;

public class ManufactoryBlockEntity extends NRRWrappedMachineBlockEntity implements MenuProvider {
    public final ItemStackHandler inventory = new ItemStackHandler(4) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
            assert level != null;
            if (!level.isClientSide()) {
                level.sendBlockUpdated(getBlockPos(), getBlockState(), getBlockState(), 3);
            }
        }

        @Override
        protected int getStackLimit(int slot, @NotNull ItemStack stack) {
            return 64;
        }

        @Override
        public boolean isItemValid(int slot, @NotNull ItemStack stack) {
            return switch (slot) {
                case 0 -> stack.getItem() == NRRItems.SPEED_UPGRADE.get();
                case 1 -> stack.getItem() == NRRItems.ENERGY_UPGRADE.get();
                case 2 -> true;
                case 3 -> false;
                default -> super.isItemValid(slot, stack);
            };
        }
    };
    public final NRREnergyStorage energy = new NRREnergyStorage(24000, Integer.MAX_VALUE, Integer.MAX_VALUE) {
        @Override
        public void onEnergyChanged() {
            setChanged();
        }
    };
    public final WrappedHandler disabled = new WrappedHandler(inventory,
            slot -> false,
            (slot, stack) -> false);
    public final WrappedHandler input1 = new WrappedHandler(inventory,
            slot -> false,
            (slot, stack) -> slot != 0 && slot != 1);
    public final WrappedHandler output1 = new WrappedHandler(inventory,
            slot -> slot != 0 && slot != 1 && slot != 2,
            (slot, stack) -> false);
    public final WrappedHandler input1_output1 = new WrappedHandler(inventory,
            slot -> slot != 0 && slot != 1 && slot != 2,
            (slot, stack) -> slot != 0 && slot != 1);

    protected final ContainerData data;
    private int progress = 0;
    private int maxProgress = 4000;
    public int currentMaxEnergy = 24000;

    public ManufactoryBlockEntity(BlockPos pos, BlockState blockState) {
        super(NRRBlockEntities.MANUFACTORY_BLOCK_ENTITY.get(), pos, blockState);
        data = new ContainerData() {
            @Override
            public int get(int i) {
                return switch (i) {
                    case 0 -> ManufactoryBlockEntity.this.progress;
                    case 1 -> ManufactoryBlockEntity.this.maxProgress;
                    default -> 0;
                };
            }

            @Override
            public void set(int i, int i1) {
                switch (i) {
                    case 0: ManufactoryBlockEntity.this.progress = i1; break;
                    case 1: ManufactoryBlockEntity.this.maxProgress = i1; break;
                }
            }

            @Override
            public int getCount() {
                return 2;
            }
        };
    }

    public void clearContents() {
        for (int i = 0; i < inventory.getSlots(); i++) {
            inventory.setStackInSlot(i, ItemStack.EMPTY);
        }
    }

    public void drops() {
        var inventory = new SimpleContainer(this.inventory.getSlots());
        for (int i = 0; i < this.inventory.getSlots(); i++) {
            inventory.setItem(i, this.inventory.getStackInSlot(i));
        }
        assert level != null;
        Containers.dropContents(level, worldPosition, inventory);
    }

    @Override
    protected void saveAdditional(@NotNull CompoundTag tag, HolderLookup.@NotNull Provider registries) {
        super.saveAdditional(tag, registries);
        tag.put("inventory", inventory.serializeNBT(registries));
        tag.putInt("manufactory.progress", progress);
        tag.putInt("manufactory.max_progress", maxProgress);
        tag.putInt("manufactory.energy", energy.getEnergyStored());
        tag.putInt("manufactory.capacity", energy.getMaxEnergyStored());
        for (int i = 0; i < inputSideConfiguration.length; i++) {
            for (int j = 0; j < inputSideConfiguration[i].length; j++) {
                tag.putBoolean("manufactory.input_side_configuration_" + i + j, inputSideConfiguration[i][j]);
            }
        }
        for (int i = 0; i < outputSideConfiguration.length; i++) {
            for (int j = 0; j < outputSideConfiguration[i].length; j++) {
                tag.putBoolean("manufactory.output_side_configuration_" + i + j, outputSideConfiguration[i][j]);
            }
        }
    }

    @Override
    protected void loadAdditional(@NotNull CompoundTag tag, HolderLookup.@NotNull Provider registries) {
        super.loadAdditional(tag, registries);
        inventory.deserializeNBT(registries, tag.getCompound("inventory"));
        progress = tag.getInt("manufactory.progress");
        maxProgress = tag.getInt("manufactory.max_progress");
        energy.setEnergy(tag.getInt("manufactory.energy"));
        energy.setMaxEnergy(tag.getInt("manufactory.capacity"));
        for (int i = 0; i < inputSideConfiguration.length; i++) {
            for (int j = 0; j < inputSideConfiguration[i].length; j++) {
                inputSideConfiguration[i][j] = tag.getBoolean("manufactory.input_side_configuration_" + i + j);
            }
        }
        for (int i = 0; i < outputSideConfiguration.length; i++) {
            for (int j = 0; j < outputSideConfiguration[i].length; j++) {
                outputSideConfiguration[i][j] = tag.getBoolean("manufactory.output_side_configuration_" + i + j);
            }
        }
    }

    public IItemHandler getInventory(Direction side) {
        if (side == null) return inventory;
        if (side == Direction.UP) {
            if (inputSideConfiguration[Direction.UP.get3DDataValue()][0]) {
                if (outputSideConfiguration[Direction.UP.get3DDataValue()][0]) return input1_output1;
                else return input1;
            } else {
                if (outputSideConfiguration[Direction.UP.get3DDataValue()][0]) return output1;
                else return disabled;
            }
        }
        if (side == Direction.DOWN) {
            if (inputSideConfiguration[Direction.DOWN.get3DDataValue()][0]) {
                if (outputSideConfiguration[Direction.DOWN.get3DDataValue()][0]) return input1_output1;
                else return input1;
            } else {
                if (outputSideConfiguration[Direction.DOWN.get3DDataValue()][0]) return output1;
                else return disabled;
            }
        }
        if (side == Direction.EAST) {
            if (inputSideConfiguration[Direction.EAST.get3DDataValue()][0]) {
                if (outputSideConfiguration[Direction.EAST.get3DDataValue()][0]) return input1_output1;
                else return input1;
            } else {
                if (outputSideConfiguration[Direction.EAST.get3DDataValue()][0]) return output1;
                else return disabled;
            }
        }
        if (side == Direction.SOUTH) {
            if (inputSideConfiguration[Direction.SOUTH.get3DDataValue()][0]) {
                if (outputSideConfiguration[Direction.SOUTH.get3DDataValue()][0]) return input1_output1;
                else return input1;
            } else {
                if (outputSideConfiguration[Direction.SOUTH.get3DDataValue()][0]) return output1;
                else return disabled;
            }
        }
        if (side == Direction.WEST) {
            if (inputSideConfiguration[Direction.WEST.get3DDataValue()][0]) {
                if (outputSideConfiguration[Direction.WEST.get3DDataValue()][0]) return input1_output1;
                else return input1;
            } else {
                if (outputSideConfiguration[Direction.WEST.get3DDataValue()][0]) return output1;
                else return disabled;
            }
        }
        if (side == Direction.NORTH) {
            if (inputSideConfiguration[Direction.NORTH.get3DDataValue()][0]) {
                if (outputSideConfiguration[Direction.NORTH.get3DDataValue()][0]) return input1_output1;
                else return input1;
            } else {
                if (outputSideConfiguration[Direction.NORTH.get3DDataValue()][0]) return output1;
                else return disabled;
            }
        }
        return disabled;
    }

    public IEnergyStorage getEnergyStorage() {
        return energy;
    }

    public void tick(Level level, BlockPos blockPos, BlockState blockState) {
        currentMaxEnergy = 24000 * (inventory.getStackInSlot(0).getCount() + 1) / Math.min(inventory.getStackInSlot(0).getCount() + 1, inventory.getStackInSlot(1).getCount() + 1);
        energy.setMaxEnergy(currentMaxEnergy);
        if (energy.getEnergyStored() > currentMaxEnergy) {
            energy.setEnergy(currentMaxEnergy);
        }
        if (hasRecipe()) {
            setWorkingState(true);
            progress();
            setChanged(level, blockPos, blockState);
            if (isRecipeDone()) {
                doRecipe();
                reset();
            }
        } else {
            setWorkingState(false);
            reset();
        }
        for (var side : Direction.values()) {
            if (outputSideConfiguration[side.get3DDataValue()][0]) push(side);
        }
    }

    @Nullable
    @Override
    public Packet<ClientGamePacketListener> getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    @Override
    public @NotNull CompoundTag getUpdateTag(HolderLookup.@NotNull Provider registries) {
        return saveWithoutMetadata(registries);
    }

    @Override
    public @NotNull Component getDisplayName() {
        return Component.translatable("title.nrreborn.manufactory");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int i, @NotNull Inventory inventory, @NotNull Player player) {
        return new ManufactoryMenu(i, inventory, this, data);
    }

    private boolean hasRecipe() {
        assert level != null;
        var recipe = level.getRecipeManager().getRecipeFor(
                NRRRecipes.MANUFACTORY_TYPE.get(),
                new ManufactoryRecipeInput(inventory.getStackInSlot(2)),
                level);
        if (recipe.isEmpty() || energy.getEnergyStored()
                < recipe.get().value().baseProcessPower()
                        * BigDecimal.valueOf(
                        (double) ((inventory.getStackInSlot(0).getCount() + 1)
                                * (inventory.getStackInSlot(0).getCount() + 1))
                                / Math.min(inventory.getStackInSlot(0).getCount() + 1,
                                inventory.getStackInSlot(1).getCount() + 1)).doubleValue())
            return false;
        var outputStack = recipe.get().value().output();
        return canDoRecipe(outputStack, outputStack.getCount());
    }

    private boolean canDoRecipe(ItemStack outputItemStack, int outputCount) {
        assert level != null;
        var recipe = level.getRecipeManager().getRecipeFor(NRRRecipes.MANUFACTORY_TYPE.get(), new ManufactoryRecipeInput(inventory.getStackInSlot(2)), level);
        int outputStackableCount = inventory.getStackInSlot(3).isEmpty() ? 64 : inventory.getStackInSlot(3).getMaxStackSize();
        int currentOutputCount = inventory.getStackInSlot(3).getCount();
        int extractCount = recipe.get().value().inputCount();
        int currentInputCount = inventory.getStackInSlot(2).getCount();
        boolean canOutput1 = inventory.getStackInSlot(3).isEmpty() || inventory.getStackInSlot(3).getItem() == outputItemStack.getItem();
        boolean canOutput2 = outputStackableCount >= currentOutputCount + outputCount;
        boolean canExtract = extractCount <= currentInputCount;
        return canOutput1 && canOutput2 && canExtract;
    }

    private void progress() {
        assert level != null;
        var recipe = level.getRecipeManager().getRecipeFor(NRRRecipes.MANUFACTORY_TYPE.get(), new ManufactoryRecipeInput(inventory.getStackInSlot(2)), level);
        energy.extractEnergy(recipe.get().value().baseProcessPower() * (inventory.getStackInSlot(0).getCount() + 1) * (inventory.getStackInSlot(0).getCount() + 1) / (inventory.getStackInSlot(1).getCount() + 1), false);
        progress += (maxProgress / recipe.get().value().baseProcessTime()) * (inventory.getStackInSlot(0).getCount() + 1);
    }

    private boolean isRecipeDone() {
        return progress >= maxProgress;
    }

    private void doRecipe() {
        assert level != null;
        var recipe = level.getRecipeManager().getRecipeFor(NRRRecipes.MANUFACTORY_TYPE.get(), new ManufactoryRecipeInput(inventory.getStackInSlot(2)), level);
        var outputStack = recipe.get().value().output();
        inventory.setStackInSlot(3, new ItemStack(outputStack.getItem(), inventory.getStackInSlot(3).getCount() + outputStack.getCount()));
        inventory.extractItem(2, recipe.get().value().inputCount(), false);
    }

    private void reset() {
        progress = 0;
        maxProgress = 4000;
    }

    private void setWorkingState(boolean state) {
        assert level != null;
        level.setBlock(worldPosition, getBlockState().setValue(ManufactoryBlock.WORKING, state), Block.UPDATE_CLIENTS);
    }

    private void push(Direction side) {
        IItemHandler targetItemHandler = level.getCapability(Capabilities.ItemHandler.BLOCK,
                getBlockPos().relative(side), null);
        if (targetItemHandler != null) {
            var extraction = inventory.extractItem(3, 1, true);
            if (extraction.isEmpty()) return;
            var remainder = ItemHandlerHelper.insertItem(targetItemHandler, extraction, true);
            if (remainder.getCount() < extraction.getCount()) {
                ItemHandlerHelper.insertItem(targetItemHandler, inventory.extractItem(3, 1, false), false);
            }
        }
    }
}
