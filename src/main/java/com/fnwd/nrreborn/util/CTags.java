package com.fnwd.nrreborn.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public final class CTags {
    private CTags() {}

    public static class Items {
        public static final TagKey<Item> INGOTS = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ingots"));
        public static final TagKey<Item> GEMS = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "gems"));
        public static final TagKey<Item> DUSTS = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "dusts"));
        public static final TagKey<Item> RAW_MATERIALS = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "raw_materials"));
        public static final TagKey<Item> ORES = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ores"));
        public static final TagKey<Item> INGOTS_TIN = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ingots/tin"));
        public static final TagKey<Item> INGOTS_ALUMINUM = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ingots/aluminum"));
        public static final TagKey<Item> INGOTS_SILVER = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ingots/silver"));
        public static final TagKey<Item> INGOTS_LEAD = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ingots/lead"));
        public static final TagKey<Item> INGOTS_MAGNESIUM = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ingots/magnesium"));
        public static final TagKey<Item> INGOTS_LITHIUM = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ingots/lithium"));
        public static final TagKey<Item> INGOTS_BORON = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ingots/boron"));
        public static final TagKey<Item> INGOTS_BERYLLIUM = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ingots/beryllium"));
        public static final TagKey<Item> INGOTS_ZIRCONIUM = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ingots/zirconium"));
        public static final TagKey<Item> INGOTS_THORIUM = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ingots/thorium"));
        public static final TagKey<Item> INGOTS_URANIUM = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ingots/uranium"));
        public static final TagKey<Item> INGOTS_THORIUM_OXIDE = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ingots/thorium_oxide"));
        public static final TagKey<Item> INGOTS_URANIUM_OXIDE = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ingots/uranium_oxide"));
        public static final TagKey<Item> INGOTS_MANGANESE = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ingots/manganese"));
        public static final TagKey<Item> INGOTS_MANGANESE_OXIDE = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ingots/manganese_oxide"));
        public static final TagKey<Item> INGOTS_MANGANESE_DIOXIDE = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ingots/manganese_dioxide"));
        public static final TagKey<Item> INGOTS_GRAPHITE = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ingots/graphite"));
        public static final TagKey<Item> INGOTS_BRONZE = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ingots/bronze"));
        public static final TagKey<Item> INGOTS_STEEL = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ingots/steel"));
        public static final TagKey<Item> INGOTS_FERROBORON_ALLOY = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ingots/ferroboron_alloy"));
        public static final TagKey<Item> INGOTS_TOUGH_ALLOY = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ingots/tough_alloy"));
        public static final TagKey<Item> INGOTS_EXTREME_ALLOY = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ingots/extreme_alloy"));
        public static final TagKey<Item> INGOTS_THERMOCONDUCTING_ALLOY = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ingots/thermoconducting_alloy"));
        public static final TagKey<Item> INGOTS_HARD_CARBON_ALLOY = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ingots/hard_carbon_alloy"));
        public static final TagKey<Item> INGOTS_SHIBUICHI_ALLOY = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ingots/shibuichi_alloy"));
        public static final TagKey<Item> INGOTS_TIN_SILVER_ALLOY = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ingots/tin_silver_alloy"));
        public static final TagKey<Item> INGOTS_LEAD_PLATINUM_ALLOY = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ingots/lead_platinum_alloy"));
        public static final TagKey<Item> INGOTS_ZIRCALOY = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ingots/zircaloy"));
        public static final TagKey<Item> INGOTS_HSLA_STEEL = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ingots/hsla_steel"));
        public static final TagKey<Item> INGOTS_MAGNESIUM_DIBORIDE_ALLOY = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ingots/magnesium_diboride_alloy"));
        public static final TagKey<Item> INGOTS_LITHIUM_MANGANESE_DIOXIDE_ALLOY = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ingots/lithium_manganese_dioxide_alloy"));
        public static final TagKey<Item> INGOTS_SILICON_CARBIDE = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ingots/silicon_carbide"));
        public static final TagKey<Item> INGOTS_SIC_SIC_CERAMIC_MATRIX_COMPOSITE = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ingots/sic_sic_ceramic_matrix_composite"));
        public static final TagKey<Item> GEMS_RHODOCHROSITE = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "gems/rhodochrosite"));
        public static final TagKey<Item> GEMS_CUBIC_BORON_NITRIDE = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "gems/cubic_boron_nitride"));
        public static final TagKey<Item> GEMS_FLUORITE = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "gems/fluorite"));
        public static final TagKey<Item> GEMS_VILLIAUMITE = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "gems/villiaumite"));
        public static final TagKey<Item> GEMS_CAROBBIITE = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "gems/carobbiite"));
        public static final TagKey<Item> GEMS_BORON_ARSENIDE = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "gems/boron_arsenide"));
        public static final TagKey<Item> SILICON = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "silicon"));
        public static final TagKey<Item> DUSTS_COAL = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "dusts/coal"));
        public static final TagKey<Item> DUSTS_DIAMOND = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "dusts/diamond"));
        public static final TagKey<Item> DUSTS_QUARTZ = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "dusts/quartz"));
        public static final TagKey<Item> DUSTS_OBSIDIAN = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "dusts/obsidian"));
        public static final TagKey<Item> DUSTS_END_STONE = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "dusts/end_stone"));
        public static final TagKey<Item> DUSTS_SULFUR = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "dusts/sulfur"));
        public static final TagKey<Item> DUSTS_TIN = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "dusts/tin"));
        public static final TagKey<Item> DUSTS_ALUMINUM = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "dusts/aluminum"));
        public static final TagKey<Item> DUSTS_SILVER = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "dusts/silver"));
        public static final TagKey<Item> DUSTS_LEAD = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "dusts/lead"));
        public static final TagKey<Item> DUSTS_MAGNESIUM = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "dusts/magnesium"));
        public static final TagKey<Item> DUSTS_LITHIUM = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "dusts/lithium"));
        public static final TagKey<Item> DUSTS_BORON = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "dusts/boron"));
        public static final TagKey<Item> DUSTS_BERYLLIUM = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "dusts/beryllium"));
        public static final TagKey<Item> DUSTS_ZIRCONIUM = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "dusts/zirconium"));
        public static final TagKey<Item> DUSTS_THORIUM = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "dusts/thorium"));
        public static final TagKey<Item> DUSTS_URANIUM = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "dusts/uranium"));
        public static final TagKey<Item> DUSTS_THORIUM_OXIDE = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "dusts/thorium_oxide"));
        public static final TagKey<Item> DUSTS_URANIUM_OXIDE = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "dusts/uranium_oxide"));
        public static final TagKey<Item> DUSTS_MANGANESE = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "dusts/manganese"));
        public static final TagKey<Item> DUSTS_MANGANESE_OXIDE = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "dusts/manganese_oxide"));
        public static final TagKey<Item> DUSTS_MANGANESE_DIOXIDE = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "dusts/manganese_dioxide"));
        public static final TagKey<Item> DUSTS_GRAPHITE = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "dusts/graphite"));
        public static final TagKey<Item> DUSTS_RHODOCHROSITE = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "dusts/rhodochrosite"));
        public static final TagKey<Item> DUSTS_HEXAGONAL_BORON_NITRIDE = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "dusts/hexagonal_boron_nitride"));
        public static final TagKey<Item> DUSTS_FLUORITE = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "dusts/fluorite"));
        public static final TagKey<Item> DUSTS_VILLIAUMITE = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "dusts/villiaumite"));
        public static final TagKey<Item> DUSTS_CAROBBIITE = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "dusts/carobbiite"));
        public static final TagKey<Item> DUSTS_ARSENIC = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "dusts/arsenic"));
        public static final TagKey<Item> DUSTS_ALUGENTUM = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "dusts/alugentum"));
        public static final TagKey<Item> DUSTS_BORAX = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "dusts/borax"));
        public static final TagKey<Item> DUSTS_CALCIUM_SULFATE = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "dusts/calcium_sulfate"));
        public static final TagKey<Item> DUSTS_SODIUM_FLUORIDE = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "dusts/sodium_fluoride"));
        public static final TagKey<Item> DUSTS_POTASSIUM_FLUORIDE = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "dusts/potassium_fluoride"));
        public static final TagKey<Item> DUSTS_SODIUM_HYDROXIDE = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "dusts/sodium_hydroxide"));
        public static final TagKey<Item> DUSTS_POTASSIUM_HYDROXIDE = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "dusts/potassium_hydroxide"));
        public static final TagKey<Item> RAW_MATERIALS_TIN = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "raw_materials/tin"));
        public static final TagKey<Item> RAW_MATERIALS_LEAD = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "raw_materials/lead"));
        public static final TagKey<Item> RAW_MATERIALS_MAGNESIUM = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "raw_materials/magnesium"));
        public static final TagKey<Item> RAW_MATERIALS_LITHIUM = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "raw_materials/lithium"));
        public static final TagKey<Item> RAW_MATERIALS_BORON = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "raw_materials/boron"));
        public static final TagKey<Item> RAW_MATERIALS_THORIUM = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "raw_materials/thorium"));
        public static final TagKey<Item> RAW_MATERIALS_URANIUM = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "raw_materials/uranium"));
        public static final TagKey<Item> ORES_TIN = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ores/tin"));
        public static final TagKey<Item> ORES_LEAD = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ores/lead"));
        public static final TagKey<Item> ORES_MAGNESIUM = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ores/magnesium"));
        public static final TagKey<Item> ORES_LITHIUM = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ores/lithium"));
        public static final TagKey<Item> ORES_BORON = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ores/boron"));
        public static final TagKey<Item> ORES_THORIUM = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ores/thorium"));
        public static final TagKey<Item> ORES_URANIUM = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ores/uranium"));
    }

    public static class Blocks {
        public static final TagKey<Block> ORES = BlockTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ores"));
        public static final TagKey<Block> ORES_TIN = BlockTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ores/tin"));
        public static final TagKey<Block> ORES_LEAD = BlockTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ores/lead"));
        public static final TagKey<Block> ORES_MAGNESIUM = BlockTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ores/magnesium"));
        public static final TagKey<Block> ORES_LITHIUM = BlockTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ores/lithium"));
        public static final TagKey<Block> ORES_BORON = BlockTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ores/boron"));
        public static final TagKey<Block> ORES_THORIUM = BlockTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ores/thorium"));
        public static final TagKey<Block> ORES_URANIUM = BlockTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ores/uranium"));
    }
}
