package com.fnwd.nrreborn.block.entity;

import com.fnwd.nrreborn.block.custom.ManufactoryBlock;
import com.fnwd.nrreborn.item.NRRItems;
import com.fnwd.nrreborn.recipe.ManufactoryRecipe;
import com.fnwd.nrreborn.recipe.ManufactoryRecipeInput;
import com.fnwd.nrreborn.recipe.NRRRecipes;
import com.fnwd.nrreborn.screen.custom.ManufactoryMenu;
import com.fnwd.nrreborn.util.CTags;
import com.fnwd.nrreborn.util.NRREnergyStorage;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.Containers;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.energy.IEnergyStorage;
import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;

public class ManufactoryBlockEntity extends BlockEntity implements MenuProvider {
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
        SimpleContainer inventory = new SimpleContainer(this.inventory.getSlots());
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
    }

    @Override
    protected void loadAdditional(@NotNull CompoundTag tag, HolderLookup.@NotNull Provider registries) {
        super.loadAdditional(tag, registries);
        inventory.deserializeNBT(registries, tag.getCompound("inventory"));
        progress = tag.getInt("manufactory.progress");
        maxProgress = tag.getInt("manufactory.max_progress");
        energy.setEnergy(tag.getInt("manufactory.energy"));
        energy.setMaxEnergy(tag.getInt("manufactory.capacity"));
    }

    public IItemHandler getInventory() {
        return inventory;
    }

    public IEnergyStorage getEnergyStorage() {
        return energy;
    }

    // Explanation of recipeSource
    // 0 -> Read from recipe JSON files
    // 1 -> Hardcoded all (ingots to dusts) recipes (for the sake of mod compatibility)
    // 2 -> Hardcoded all (ores to double dusts) recipes (for...)
    // 3 -> Hardcoded all (raw_materials to double dusts) recipes (for...)
    // 4 -> Hardcoded all (gems to dusts) recipes (for...)
    public void tick(Level level, BlockPos blockPos, BlockState blockState) {
        currentMaxEnergy = 24000 * (inventory.getStackInSlot(0).getCount() + 1) / Math.min(inventory.getStackInSlot(0).getCount() + 1, inventory.getStackInSlot(1).getCount() + 1);
        energy.setMaxEnergy(currentMaxEnergy);
        if (energy.getEnergyStored() > currentMaxEnergy) {
            energy.setEnergy(currentMaxEnergy);
        }
        if (hasRecipe(0)) {
            setWorkingState(true);
            progress(0);
            setChanged(level, blockPos, blockState);
            if (isRecipeDone()) {
                doRecipe(0);
                reset();
            }
        } else if (hasRecipe(1)) {
            setWorkingState(true);
            progress(1);
            setChanged(level, blockPos, blockState);
            if (isRecipeDone()) {
                doRecipe(1);
                reset();
            }
        } else if (hasRecipe(2)) {
            setWorkingState(true);
            progress(2);
            setChanged(level, blockPos, blockState);
            if (isRecipeDone()) {
                doRecipe(2);
                reset();
            }
        } else if (hasRecipe(3)) {
            setWorkingState(true);
            progress(3);
            setChanged(level, blockPos, blockState);
            if (isRecipeDone()) {
                doRecipe(3);
                reset();
            }
        } else if (hasRecipe(4)) {
            setWorkingState(true);
            progress(4);
            setChanged(level, blockPos, blockState);
            if (isRecipeDone()) {
                doRecipe(4);
                reset();
            }
        } else {
            setWorkingState(false);
            reset();
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

    private boolean hasRecipe(int recipeSource) {
        assert level != null;
        Optional<RecipeHolder<ManufactoryRecipe>> recipe = level.getRecipeManager().getRecipeFor(NRRRecipes.MANUFACTORY_TYPE.get(), new ManufactoryRecipeInput(inventory.getStackInSlot(2)), level);
        if (recipeSource == 0) {
            if (recipe.isEmpty() || energy.getEnergyStored() < recipe.get().value().baseProcessPower() * BigDecimal.valueOf((double) ((inventory.getStackInSlot(0).getCount() + 1) * (inventory.getStackInSlot(0).getCount() + 1)) / Math.min(inventory.getStackInSlot(0).getCount() + 1, inventory.getStackInSlot(1).getCount() + 1)).doubleValue()) {
                return false;
            }
            ItemStack output = recipe.get().value().output();
            return canDoRecipe(output, output.getCount(), 0);
        } else if (recipeSource == 1) {
            if (!inventory.getStackInSlot(2).is(CTags.Items.INGOTS) || energy.getEnergyStored() < 20 * BigDecimal.valueOf((double) ((inventory.getStackInSlot(0).getCount() + 1) * (inventory.getStackInSlot(0).getCount() + 1)) / Math.min(inventory.getStackInSlot(0).getCount() + 1, inventory.getStackInSlot(1).getCount() + 1)).doubleValue()) {
                return false;
            }
            return canDoRecipe(lookForDustOf(getIngotType(inventory.getStackInSlot(2)), 1), 1, 1);
        } else if (recipeSource == 2) {
            if (!inventory.getStackInSlot(2).is(CTags.Items.ORES) || energy.getEnergyStored() < 20 * BigDecimal.valueOf((double) ((inventory.getStackInSlot(0).getCount() + 1) * (inventory.getStackInSlot(0).getCount() + 1)) / Math.min(inventory.getStackInSlot(0).getCount() + 1, inventory.getStackInSlot(1).getCount() + 1)).doubleValue()) {
                return false;
            }
            return canDoRecipe(lookForDustOf(getOreType(inventory.getStackInSlot(2)), 2), 2, 2);
        } else if (recipeSource == 3) {
            if (!inventory.getStackInSlot(2).is(CTags.Items.RAW_MATERIALS) || energy.getEnergyStored() < 20 * BigDecimal.valueOf((double) ((inventory.getStackInSlot(0).getCount() + 1) * (inventory.getStackInSlot(0).getCount() + 1)) / Math.min(inventory.getStackInSlot(0).getCount() + 1, inventory.getStackInSlot(1).getCount() + 1)).doubleValue()) {
                return false;
            }
            return canDoRecipe(lookForDustOf(getRawMaterialType(inventory.getStackInSlot(2)), 2), 2, 3);
        } else if (recipeSource == 4) {
            if (!inventory.getStackInSlot(2).is(CTags.Items.GEMS) || energy.getEnergyStored() < 30 * BigDecimal.valueOf((double) ((inventory.getStackInSlot(0).getCount() + 1) * (inventory.getStackInSlot(0).getCount() + 1)) / Math.min(inventory.getStackInSlot(0).getCount() + 1, inventory.getStackInSlot(1).getCount() + 1)).doubleValue()) {
                return false;
            }
            return canDoRecipe(lookForDustOf(getGemType(inventory.getStackInSlot(2)), 1), 1, 4);
        } else {
            return false;
        }
    }

    private boolean canDoRecipe(ItemStack outputItemStack, int outputCount, int recipeSource) {
        assert level != null;
        Optional<RecipeHolder<ManufactoryRecipe>> recipe = level.getRecipeManager().getRecipeFor(NRRRecipes.MANUFACTORY_TYPE.get(), new ManufactoryRecipeInput(inventory.getStackInSlot(2)), level);
        int outputStackableCount = inventory.getStackInSlot(3).isEmpty() ? 64 : inventory.getStackInSlot(3).getMaxStackSize();
        int currentOutputCount = inventory.getStackInSlot(3).getCount();
        int extractCount = switch (recipeSource) {
            case 0 -> recipe.get().value().inputCount();
            case 1, 2, 3, 4 -> 1;
            default -> 0;
        };
        int currentInputCount = inventory.getStackInSlot(2).getCount();
        boolean hasRecipePair = switch (recipeSource) {
            case 0 -> true;
            case 1 -> !lookForDustOf(getIngotType(inventory.getStackInSlot(2)), 1).isEmpty();
            case 2 -> !lookForDustOf(getOreType(inventory.getStackInSlot(2)), 1).isEmpty();
            case 3 -> !lookForDustOf(getRawMaterialType(inventory.getStackInSlot(2)), 1).isEmpty();
            case 4 -> !lookForDustOf(getGemType(inventory.getStackInSlot(2)), 1).isEmpty();
            default -> false;
        };
        boolean canOutput1 = inventory.getStackInSlot(3).isEmpty() || inventory.getStackInSlot(3).getItem() == outputItemStack.getItem();
        boolean canOutput2 = outputStackableCount >= currentOutputCount + outputCount;
        boolean canExtract = extractCount <= currentInputCount;
        return canOutput1 && canOutput2 && canExtract && hasRecipePair;
    }

    private void progress(int recipeSource) {
        assert level != null;
        Optional<RecipeHolder<ManufactoryRecipe>> recipe = level.getRecipeManager().getRecipeFor(NRRRecipes.MANUFACTORY_TYPE.get(), new ManufactoryRecipeInput(inventory.getStackInSlot(2)), level);
        switch (recipeSource) {
            case 0:
                energy.extractEnergy(recipe.get().value().baseProcessPower() * (inventory.getStackInSlot(0).getCount() + 1) * (inventory.getStackInSlot(0).getCount() + 1) / (inventory.getStackInSlot(1).getCount() + 1), false);
                progress += (maxProgress / recipe.get().value().baseProcessTime()) * (inventory.getStackInSlot(0).getCount() + 1);
                break;
            case 1:
                energy.extractEnergy(20 * (inventory.getStackInSlot(0).getCount() + 1) * (inventory.getStackInSlot(0).getCount() + 1) / (inventory.getStackInSlot(1).getCount() + 1), false);
                progress += (maxProgress / 400) * (inventory.getStackInSlot(0).getCount() + 1);
                break;
            case 2, 3:
                energy.extractEnergy(20 * (inventory.getStackInSlot(0).getCount() + 1) * (inventory.getStackInSlot(0).getCount() + 1) / (inventory.getStackInSlot(1).getCount() + 1), false);
                progress += (maxProgress / 500) * (inventory.getStackInSlot(0).getCount() + 1);
                break;
            case 4:
                energy.extractEnergy(30 * (inventory.getStackInSlot(0).getCount() + 1) * (inventory.getStackInSlot(0).getCount() + 1) / (inventory.getStackInSlot(1).getCount() + 1), false);
                progress += (maxProgress / 600) * (inventory.getStackInSlot(0).getCount() + 1);
                break;
            default:
                break;
        }
    }

    private boolean isRecipeDone() {
        return progress >= maxProgress;
    }

    private void doRecipe(int recipeSource) {
        assert level != null;
        Optional<RecipeHolder<ManufactoryRecipe>> recipe = level.getRecipeManager().getRecipeFor(NRRRecipes.MANUFACTORY_TYPE.get(), new ManufactoryRecipeInput(inventory.getStackInSlot(2)), level);
        switch (recipeSource) {
            case 0:
                ItemStack output = recipe.get().value().output();
                inventory.setStackInSlot(3, new ItemStack(output.getItem(), inventory.getStackInSlot(3).getCount() + output.getCount()));
                inventory.extractItem(2, recipe.get().value().inputCount(), false);
                break;
            case 1:
                inventory.setStackInSlot(3, lookForDustOf(getIngotType(inventory.getStackInSlot(2)), inventory.getStackInSlot(3).getCount() + 1));
                inventory.extractItem(2, 1, false);
                break;
            case 2:
                inventory.setStackInSlot(3, lookForDustOf(getOreType(inventory.getStackInSlot(2)), inventory.getStackInSlot(3).getCount() + 2));
                inventory.extractItem(2, 1, false);
                break;
            case 3:
                inventory.setStackInSlot(3, lookForDustOf(getRawMaterialType(inventory.getStackInSlot(2)), inventory.getStackInSlot(3).getCount() + 2));
                inventory.extractItem(2, 1, false);
                break;
            case 4:
                inventory.setStackInSlot(3, lookForDustOf(getGemType(inventory.getStackInSlot(2)), inventory.getStackInSlot(3).getCount() + 1));
                inventory.extractItem(2, 1, false);
                break;
            default:
                break;
        }
    }

    private void reset() {
        progress = 0;
        maxProgress = 4000;
    }

    private void setWorkingState(boolean state) {
        assert level != null;
        level.setBlock(worldPosition, getBlockState().setValue(ManufactoryBlock.WORKING, state), Block.UPDATE_CLIENTS);
    }

    private String getIngotType(ItemStack stack) {
        if (stack.isEmpty()) {
            return null;
        }
        List<TagKey<Item>> list = stack.getTags().toList();
        List<TagKey<Item>> result = new ArrayList<>();
        for (TagKey<Item> tag : list) {
            if (tag.location().toString().startsWith("c:ingots/")) {
                result.add(tag);
            }
        }
        if (result.isEmpty()) {
            return null;
        }
        return result.getFirst().location().toString().substring("c:ingots/".length());
    }

    private String getOreType(ItemStack stack) {
        if (stack.isEmpty()) {
            return null;
        }
        List<TagKey<Item>> list = stack.getTags().toList();
        List<TagKey<Item>> result = new ArrayList<>();
        for (TagKey<Item> tag : list) {
            if (tag.location().toString().startsWith("c:ores/")) {
                result.add(tag);
            }
        }
        if (result.isEmpty()) {
            return null;
        }
        return result.getFirst().location().toString().substring("c:ores/".length());
    }

    private String getRawMaterialType(ItemStack stack) {
        if (stack.isEmpty()) {
            return null;
        }
        List<TagKey<Item>> list = stack.getTags().toList();
        List<TagKey<Item>> result = new ArrayList<>();
        for (TagKey<Item> tag : list) {
            if (tag.location().toString().startsWith("c:raw_materials/")) {
                result.add(tag);
            }
        }
        if (result.isEmpty()) {
            return null;
        }
        return result.getFirst().location().toString().substring("c:raw_materials/".length());
    }

    private String getGemType(ItemStack stack) {
        if (stack.isEmpty()) {
            return null;
        }
        List<TagKey<Item>> list = stack.getTags().toList();
        List<TagKey<Item>> result = new ArrayList<>();
        for (TagKey<Item> tag : list) {
            if (tag.location().toString().startsWith("c:gems/")) {
                result.add(tag);
            }
        }
        if (result.isEmpty()) {
            return null;
        }
        return result.getFirst().location().toString().substring("c:gems/".length());
    }

    private ItemStack lookForDustOf(String type, int count) {
        Iterable<Holder<Item>> holder = BuiltInRegistries.ITEM.getTagOrEmpty(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts/" + type)));
        List<Item> list = StreamSupport.stream(holder.spliterator(), false)
                .map(Holder::value)
                .toList();
        if (list.isEmpty()) {
            return ItemStack.EMPTY;
        }
        for (Item item : list) {
            if (BuiltInRegistries.ITEM.getKey(item).getNamespace().equals("nrreborn")) {
                return new ItemStack(item, count);
            }
        }
        list = list.stream()
                .sorted(Comparator.comparing(item -> BuiltInRegistries.ITEM.getKey(item).getNamespace()))
                .toList();
        return new ItemStack(list.getFirst(), count);
    }
}
