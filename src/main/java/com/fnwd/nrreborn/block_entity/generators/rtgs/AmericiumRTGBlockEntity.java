package com.fnwd.nrreborn.block_entity.generators.rtgs;

import com.fnwd.nrreborn.block_entity.NRRBlockEntities;
import com.fnwd.nrreborn.block_entity.generators.AbstractGeneratorBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class AmericiumRTGBlockEntity extends AbstractGeneratorBlockEntity {
    public AmericiumRTGBlockEntity(BlockPos pos, BlockState blockState) {
        super(NRRBlockEntities.AMERICIUM_RTG_BLOCK_ENTITY.get(), pos, blockState, 30000);
    }

    @Override
    protected void generate() {
        energy.receiveEnergy(50, false);
    }
}
