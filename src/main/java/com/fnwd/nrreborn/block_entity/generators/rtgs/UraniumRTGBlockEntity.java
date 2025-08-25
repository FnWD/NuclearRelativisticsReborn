package com.fnwd.nrreborn.block_entity.generators.rtgs;

import com.fnwd.nrreborn.block_entity.NRRBlockEntities;
import com.fnwd.nrreborn.block_entity.generators.AbstractGeneratorBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class UraniumRTGBlockEntity extends AbstractGeneratorBlockEntity {
    public UraniumRTGBlockEntity(BlockPos pos, BlockState blockState) {
        super(NRRBlockEntities.URANIUM_RTG_BLOCK_ENTITY.get(), pos, blockState, 2400);
    }

    @Override
    protected void generate() {
        energy.receiveEnergy(4, false);
    }
}
