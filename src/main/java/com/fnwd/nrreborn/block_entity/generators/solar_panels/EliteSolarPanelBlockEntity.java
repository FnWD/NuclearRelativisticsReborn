package com.fnwd.nrreborn.block_entity.generators.solar_panels;

import com.fnwd.nrreborn.block_entity.NRRBlockEntities;
import com.fnwd.nrreborn.block_entity.generators.AbstractGeneratorBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class EliteSolarPanelBlockEntity extends AbstractGeneratorBlockEntity {
    public EliteSolarPanelBlockEntity(BlockPos pos, BlockState blockState) {
        super(NRRBlockEntities.ELITE_SOLAR_PANEL_BLOCK_ENTITY.get(), pos, blockState, 192000);
    }

    @Override
    protected void generate() {
        assert level != null;
        long time = level.getDayTime() % 24000;
        if (time < 1000 || time > 11000) return;
        if (!level.isDay() || level.isRaining() || level.isThundering()) return;
        if (!level.canSeeSky(getBlockPos().above())) return;
        energy.receiveEnergy(320, false);
    }
}
