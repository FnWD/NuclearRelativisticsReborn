package com.fnwd.nrreborn.block_entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class NRRWrappedMachineBlockEntity extends BlockEntity {
    public boolean[][] inputSideConfiguration = new boolean[6][4];
    public boolean[][] outputSideConfiguration = new boolean[6][4];

    public NRRWrappedMachineBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState blockState) {
        super(type, pos, blockState);
    }
}
