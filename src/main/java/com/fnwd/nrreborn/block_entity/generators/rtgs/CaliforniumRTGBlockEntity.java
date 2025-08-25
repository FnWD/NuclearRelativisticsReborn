package com.fnwd.nrreborn.block_entity.generators.rtgs;

import com.fnwd.nrreborn.block_entity.NRRBlockEntities;
import com.fnwd.nrreborn.block_entity.generators.AbstractGeneratorBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class CaliforniumRTGBlockEntity extends AbstractGeneratorBlockEntity {
    public CaliforniumRTGBlockEntity(BlockPos pos, BlockState blockState) {
        super(NRRBlockEntities.CALIFORNIUM_RTG_BLOCK_ENTITY.get(), pos, blockState, 240000);
    }

    @Override
    protected void generate() {
        energy.receiveEnergy(400, false);
    }
}
