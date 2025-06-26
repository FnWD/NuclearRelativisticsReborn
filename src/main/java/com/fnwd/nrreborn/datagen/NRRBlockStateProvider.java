package com.fnwd.nrreborn.datagen;

import com.fnwd.nrreborn.NuclearRelativisticsReborn;
import com.fnwd.nrreborn.block.NRRBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class NRRBlockStateProvider extends BlockStateProvider {
    public NRRBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, NuclearRelativisticsReborn.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simple(NRRBlocks.TIN_ORE);
        simple(NRRBlocks.DEEPSLATE_TIN_ORE);
        simple(NRRBlocks.LEAD_ORE);
        simple(NRRBlocks.DEEPSLATE_LEAD_ORE);
        simple(NRRBlocks.MAGNESIUM_ORE);
        simple(NRRBlocks.DEEPSLATE_MAGNESIUM_ORE);
        simple(NRRBlocks.LITHIUM_ORE);
        simple(NRRBlocks.DEEPSLATE_LITHIUM_ORE);
        simple(NRRBlocks.BORON_ORE);
        simple(NRRBlocks.DEEPSLATE_BORON_ORE);
        simple(NRRBlocks.THORIUM_ORE);
        simple(NRRBlocks.DEEPSLATE_THORIUM_ORE);
        simple(NRRBlocks.URANIUM_ORE);
        simple(NRRBlocks.DEEPSLATE_URANIUM_ORE);
    }

    private void simple(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
