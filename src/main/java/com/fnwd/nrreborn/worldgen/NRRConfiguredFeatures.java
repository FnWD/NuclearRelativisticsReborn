package com.fnwd.nrreborn.worldgen;

import com.fnwd.nrreborn.NuclearRelativisticsReborn;
import com.fnwd.nrreborn.block.NRRBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class NRRConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> TIN_ORE_KEY = registerKey("tin_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LEAD_ORE_KEY = registerKey("lead_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MAGNESIUM_ORE_KEY = registerKey("magnesium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LITHIUM_ORE_KEY = registerKey("lithium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BORON_ORE_KEY = registerKey("boron_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> THORIUM_ORE_KEY = registerKey("thorium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> URANIUM_ORE_KEY = registerKey("uranium_ore");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreConfiguration.TargetBlockState> tinOres = List.of(
                OreConfiguration.target(stoneReplaceables, NRRBlocks.TIN_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, NRRBlocks.DEEPSLATE_TIN_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> leadOres = List.of(
                OreConfiguration.target(stoneReplaceables, NRRBlocks.LEAD_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, NRRBlocks.DEEPSLATE_LEAD_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> magnesiumOres = List.of(
                OreConfiguration.target(stoneReplaceables, NRRBlocks.MAGNESIUM_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, NRRBlocks.DEEPSLATE_MAGNESIUM_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> lithiumOres = List.of(
                OreConfiguration.target(stoneReplaceables, NRRBlocks.LITHIUM_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, NRRBlocks.DEEPSLATE_LITHIUM_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> boronOres = List.of(
                OreConfiguration.target(stoneReplaceables, NRRBlocks.BORON_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, NRRBlocks.DEEPSLATE_BORON_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> thoriumOres = List.of(
                OreConfiguration.target(stoneReplaceables, NRRBlocks.THORIUM_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, NRRBlocks.DEEPSLATE_THORIUM_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> uraniumOres = List.of(
                OreConfiguration.target(stoneReplaceables, NRRBlocks.URANIUM_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, NRRBlocks.DEEPSLATE_URANIUM_ORE.get().defaultBlockState()));

        register(context, TIN_ORE_KEY, Feature.ORE, new OreConfiguration(tinOres, 8));
        register(context, LEAD_ORE_KEY, Feature.ORE, new OreConfiguration(leadOres, 8));
        register(context, MAGNESIUM_ORE_KEY, Feature.ORE, new OreConfiguration(magnesiumOres, 8));
        register(context, LITHIUM_ORE_KEY, Feature.ORE, new OreConfiguration(lithiumOres, 8));
        register(context, BORON_ORE_KEY, Feature.ORE, new OreConfiguration(boronOres, 8));
        register(context, THORIUM_ORE_KEY, Feature.ORE, new OreConfiguration(thoriumOres, 8));
        register(context, URANIUM_ORE_KEY, Feature.ORE, new OreConfiguration(uraniumOres, 8));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(NuclearRelativisticsReborn.MODID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC featureConfiguration) {
        context.register(key, new ConfiguredFeature<>(feature, featureConfiguration));
    }
}
