package com.fnwd.nrreborn.block_entity.generators.rtgs;

import com.fnwd.nrreborn.block_entity.NRRBlockEntities;
import com.fnwd.nrreborn.block_entity.generators.AbstractGeneratorBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class PlutoniumRTGBlockEntity extends AbstractGeneratorBlockEntity {
    public PlutoniumRTGBlockEntity(BlockPos pos, BlockState blockState) {
        super(NRRBlockEntities.PLUTONIUM_RTG_BLOCK_ENTITY.get(), pos, blockState, 60000);
    }

    @Override
    protected void generate() {
        energy.receiveEnergy(100, false);
    }
}
