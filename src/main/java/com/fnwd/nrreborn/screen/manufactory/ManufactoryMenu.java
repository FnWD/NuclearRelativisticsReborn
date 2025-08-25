package com.fnwd.nrreborn.screen.manufactory;

import com.fnwd.nrreborn.block.NRRBlocks;
import com.fnwd.nrreborn.block_entity.manufactory.ManufactoryBlockEntity;
import com.fnwd.nrreborn.screen.NRRMenuTypes;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.*;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.neoforged.neoforge.items.SlotItemHandler;
import org.jetbrains.annotations.NotNull;

public class ManufactoryMenu extends AbstractContainerMenu {
    public final ManufactoryBlockEntity blockEntity;
    private final Level level;
    private final ContainerData data;
    private int energy;
    private int capacity;

    public ManufactoryMenu(int containerId, Inventory inventory, FriendlyByteBuf extraData) {
        this(containerId, inventory, inventory.player.level().getBlockEntity(extraData.readBlockPos()), new SimpleContainerData(2));
    }

    public ManufactoryMenu(int containerId, Inventory inventory, BlockEntity blockEntity, ContainerData data) {
        super(NRRMenuTypes.MANUFACTORY_MENU.get(), containerId);
        this.blockEntity = (ManufactoryBlockEntity) blockEntity;
        this.level = inventory.player.level();
        this.data = data;
        addPlayerInventory(inventory);
        addPlayerHotbar(inventory);
        addSlot(new SlotItemHandler(this.blockEntity.inventory, 0, 29, 60));
        addSlot(new SlotItemHandler(this.blockEntity.inventory, 1, 49, 60));
        addSlot(new SlotItemHandler(this.blockEntity.inventory, 2, 52, 36));
        addSlot(new SlotItemHandler(this.blockEntity.inventory, 3, 108, 36));
        addDataSlot(new DataSlot() {
            @Override
            public int get() {
                return ((ManufactoryBlockEntity) blockEntity).energy.getEnergyStored() & 0xFFFF;
            }

            @Override
            public void set(int i) {
                ManufactoryMenu.this.energy = (ManufactoryMenu.this.energy & 0xFFFF0000) | (i & 0xFFFF);
            }
        });
        addDataSlot(new DataSlot() {
            @Override
            public int get() {
                return (((ManufactoryBlockEntity) blockEntity).energy.getEnergyStored() >> 16) & 0xFFFF;
            }

            @Override
            public void set(int i) {
                ManufactoryMenu.this.energy = (ManufactoryMenu.this.energy & 0xFFFF) | ((i & 0xFFFF) << 16);
            }
        });
        addDataSlot(new DataSlot() {
            @Override
            public int get() {
                return ((ManufactoryBlockEntity) blockEntity).energy.getMaxEnergyStored() & 0xFFFF;
            }

            @Override
            public void set(int i) {
                ManufactoryMenu.this.capacity = (ManufactoryMenu.this.capacity & 0xFFFF0000) | (i & 0xFFFF);
            }
        });
        addDataSlot(new DataSlot() {
            @Override
            public int get() {
                return (((ManufactoryBlockEntity) blockEntity).energy.getMaxEnergyStored() >> 16) & 0xFFFF;
            }

            @Override
            public void set(int i) {
                ManufactoryMenu.this.capacity = (ManufactoryMenu.this.capacity & 0xFFFF) | ((i & 0xFFFF) << 16);
            }
        });
        addDataSlots(data);
    }

    public int getEnergy() {
        return energy;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public @NotNull ItemStack quickMoveStack(@NotNull Player player, int i) {
        Slot sourceSlot = slots.get(i);
        ItemStack sourceStack = sourceSlot.getItem();
        ItemStack copyOfSourceStack = sourceStack.copy();
        if (!sourceSlot.hasItem()) {
            return ItemStack.EMPTY;
        }
        if (i < 36) {
            if (!moveItemStackTo(sourceStack, 36, 40, false)) {
                return ItemStack.EMPTY;
            }
        } else if (i < 40) {
            if (!moveItemStackTo(sourceStack, 0, 36, false)) {
                return ItemStack.EMPTY;
            }
        } else {
            return ItemStack.EMPTY;
        }
        if (sourceStack.getCount() == 0) {
            sourceSlot.set(ItemStack.EMPTY);
        } else {
            sourceSlot.setChanged();
        }
        sourceSlot.onTake(player, sourceStack);
        return copyOfSourceStack;
    }

    @Override
    public boolean stillValid(@NotNull Player player) {
        return stillValid(ContainerLevelAccess.create(level, blockEntity.getBlockPos()), player, NRRBlocks.MANUFACTORY.get());
    }

    private void addPlayerInventory(Inventory inventory) {
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.addSlot(new Slot(inventory, i * 9 + j + 9, j * 18 + 8, i * 18 + 92));
            }
        }
    }

    private void addPlayerHotbar(Inventory inventory) {
        for (int i = 0; i < 9; ++i) {
            this.addSlot(new Slot(inventory, i, i * 18 + 8, 150));
        }
    }

    public boolean isCrafting() {
        return data.get(0) > 0;
    }

    public int getScaledArrowProgress() {
        int progress = data.get(0);
        int maxProgress = data.get(1);
        int arrowPixelSize = 22;
        return progress != 0 && maxProgress != 0 ? progress * arrowPixelSize / maxProgress : 0;
    }

    public int getScaledEnergyBar() {
        int energyBarPixelSize = 64;
        return energy != 0 ? energy * energyBarPixelSize / capacity : 0;
    }
}
