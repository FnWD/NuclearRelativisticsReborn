package com.fnwd.nrreborn.worldgen;

import com.fnwd.nrreborn.NuclearRelativisticsReborn;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class NRRPlacedFeatures {
    public static final ResourceKey<PlacedFeature> TIN_ORE_PLACED_KEY = registerKey("tin_ore_placed");
    public static final ResourceKey<PlacedFeature> LEAD_ORE_PLACED_KEY = registerKey("lead_ore_placed");
    public static final ResourceKey<PlacedFeature> MAGNESIUM_ORE_PLACED_KEY = registerKey("magnesium_ore_placed");
    public static final ResourceKey<PlacedFeature> LITHIUM_ORE_PLACED_KEY = registerKey("lithium_ore_placed");
    public static final ResourceKey<PlacedFeature> BORON_ORE_PLACED_KEY = registerKey("boron_ore_placed");
    public static final ResourceKey<PlacedFeature> THORIUM_ORE_PLACED_KEY = registerKey("thorium_ore_placed");
    public static final ResourceKey<PlacedFeature> URANIUM_ORE_PLACED_KEY = registerKey("uranium_ore_placed");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, TIN_ORE_PLACED_KEY,
                configuredFeatures.getOrThrow(NRRConfiguredFeatures.TIN_ORE_KEY),
                NRROrePlacement.commonOrePlacement(12, HeightRangePlacement.triangle(VerticalAnchor.absolute(32), VerticalAnchor.absolute(112))));
        register(context, LEAD_ORE_PLACED_KEY,
                configuredFeatures.getOrThrow(NRRConfiguredFeatures.LEAD_ORE_KEY),
                NRROrePlacement.commonOrePlacement(12, HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(32))));
        register(context, MAGNESIUM_ORE_PLACED_KEY,
                configuredFeatures.getOrThrow(NRRConfiguredFeatures.MAGNESIUM_ORE_KEY),
                NRROrePlacement.commonOrePlacement(8, HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(32))));
        register(context, LITHIUM_ORE_PLACED_KEY,
                configuredFeatures.getOrThrow(NRRConfiguredFeatures.LITHIUM_ORE_KEY),
                NRROrePlacement.commonOrePlacement(8, HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(32))));
        register(context, BORON_ORE_PLACED_KEY,
                configuredFeatures.getOrThrow(NRRConfiguredFeatures.BORON_ORE_KEY),
                NRROrePlacement.commonOrePlacement(8, HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(32))));
        register(context, THORIUM_ORE_PLACED_KEY,
                configuredFeatures.getOrThrow(NRRConfiguredFeatures.THORIUM_ORE_KEY),
                NRROrePlacement.commonOrePlacement(10, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(0))));
        register(context, URANIUM_ORE_PLACED_KEY,
                configuredFeatures.getOrThrow(NRRConfiguredFeatures.URANIUM_ORE_KEY),
                NRROrePlacement.commonOrePlacement(10, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(0))));
    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(NuclearRelativisticsReborn.MODID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
