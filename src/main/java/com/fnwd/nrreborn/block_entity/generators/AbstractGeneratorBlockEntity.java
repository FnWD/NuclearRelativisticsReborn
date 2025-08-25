package com.fnwd.nrreborn.block_entity.generators;

import com.fnwd.nrreborn.util.NRREnergyStorage;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.neoforge.energy.IEnergyStorage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class AbstractGeneratorBlockEntity extends BlockEntity {
    public final NRREnergyStorage energy;

    public AbstractGeneratorBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState blockState, int capacity) {
        super(type, pos, blockState);
        energy = new NRREnergyStorage(capacity, Integer.MAX_VALUE, Integer.MAX_VALUE) {
            @Override
            public void onEnergyChanged() {
                setChanged();
            }
        };
    }

    public IEnergyStorage getEnergyStorage() {
        return energy;
    }

    @Nullable
    @Override
    public Packet<ClientGamePacketListener> getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    @Override
    public CompoundTag getUpdateTag(HolderLookup.@NotNull Provider registries) {
        return saveWithoutMetadata(registries);
    }

    @Override
    protected void saveAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.saveAdditional(tag, registries);
        tag.putInt("generator.energy", energy.getEnergyStored());
        tag.putInt("generator.capacity", energy.getMaxEnergyStored());
    }

    @Override
    protected void loadAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.loadAdditional(tag, registries);
        energy.setEnergy(tag.getInt("generator.energy"));
        energy.setMaxEnergy(tag.getInt("generator.capacity"));
    }

    public void tick(Level level, BlockPos blockPos, BlockState blockState) {
        generate();
        distribute();
    }

    protected abstract void generate();

    private void distribute() {
        for (var side : Direction.values()) {
            if (energy.getEnergyStored() <= 0) return;
            if (level.getBlockEntity(getBlockPos().relative(side)) instanceof AbstractGeneratorBlockEntity) continue;
            IEnergyStorage targetEnergy = level.getCapability(Capabilities.EnergyStorage.BLOCK,
                    getBlockPos().relative(side), null);
            if (targetEnergy != null && targetEnergy.canReceive()) {
                energy.extractEnergy(targetEnergy.receiveEnergy(
                        Math.min(energy.getEnergyStored(), Integer.MAX_VALUE),
                        false), false);
            }
        }
    }
}
