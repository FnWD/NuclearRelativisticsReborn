package com.fnwd.nrreborn.datagen;

import com.fnwd.nrreborn.NuclearRelativisticsReborn;
import com.fnwd.nrreborn.block.NRRBlocks;
import com.fnwd.nrreborn.block.manufactory.ManufactoryBlock;
import net.minecraft.core.Direction;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
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
        /*simple(NRRBlocks.BASIC_SOLAR_PANEL);
        simple(NRRBlocks.ADVANCED_SOLAR_PANEL);
        simple(NRRBlocks.DEPLETED_URANIUM_SOLAR_PANEL);
        simple(NRRBlocks.ELITE_SOLAR_PANEL);
        simple(NRRBlocks.URANIUM_RTG);
        simple(NRRBlocks.PLUTONIUM_RTG);
        simple(NRRBlocks.AMERICIUM_RTG);
        simple(NRRBlocks.CALIFORNIUM_RTG);*/
        getVariantBuilder(NRRBlocks.MANUFACTORY.get()).forAllStates(state -> {
            Direction facing = state.getValue(ManufactoryBlock.FACING);
            boolean working = state.getValue(ManufactoryBlock.WORKING);
            int yRotation = switch (facing) {
                case EAST -> 90;
                case SOUTH -> 180;
                case WEST -> 270;
                default -> 0;
            };
            return ConfiguredModel.builder()
                    .modelFile(working ? models().orientable(
                            "manufactory_on",
                            ResourceLocation.fromNamespaceAndPath(NuclearRelativisticsReborn.MODID, "block/casing"),
                            ResourceLocation.fromNamespaceAndPath(NuclearRelativisticsReborn.MODID, "block/manufactory_front_on"),
                            ResourceLocation.fromNamespaceAndPath(NuclearRelativisticsReborn.MODID, "block/casing")) : models().orientable(
                            "manufactory_off",
                            ResourceLocation.fromNamespaceAndPath(NuclearRelativisticsReborn.MODID, "block/casing"),
                            ResourceLocation.fromNamespaceAndPath(NuclearRelativisticsReborn.MODID, "block/manufactory_front_off"),
                            ResourceLocation.fromNamespaceAndPath(NuclearRelativisticsReborn.MODID, "block/casing")))
                    .rotationY(yRotation)
                    .build();
        });
        itemModels().withExistingParent(NRRBlocks.MANUFACTORY.getRegisteredName(), ResourceLocation.fromNamespaceAndPath(NuclearRelativisticsReborn.MODID, "block/manufactory_off"));
    }

    private void simple(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
