package com.fnwd.nrreborn.item;

import com.fnwd.nrreborn.NRRConfig;
import com.fnwd.nrreborn.NuclearRelativisticsReborn;
import com.fnwd.nrreborn.block_entity.NRRWrappedMachineBlockEntity;
import com.fnwd.nrreborn.data_component.NRRDataComponents;
import com.fnwd.nrreborn.fluid.NRRFluids;
import com.fnwd.nrreborn.item.item_categories.BasicItem;
import com.fnwd.nrreborn.item.item_categories.FissionFuelItem;
import com.fnwd.nrreborn.util.ConfigurationTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraft.world.item.*;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.HitResult;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;

public class NRRItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(NuclearRelativisticsReborn.MODID);

    public static final DeferredItem<Item> TIN_INGOT = ITEMS.register(
            "tin_ingot", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> TIN_OXIDE_INGOT = ITEMS.register(
            "tin_oxide_ingot", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> ALUMINUM_INGOT = ITEMS.register(
            "aluminum_ingot", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> SILVER_INGOT = ITEMS.register(
            "silver_ingot", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> LEAD_INGOT = ITEMS.register(
            "lead_ingot", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> MAGNESIUM_INGOT = ITEMS.register(
            "magnesium_ingot", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> LITHIUM_INGOT = ITEMS.register(
            "lithium_ingot", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> BORON_INGOT = ITEMS.register(
            "boron_ingot", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> BERYLLIUM_INGOT = ITEMS.register(
            "beryllium_ingot", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> ZIRCONIUM_INGOT = ITEMS.register(
            "zirconium_ingot", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> ZIRCONIA_INGOT = ITEMS.register(
            "zirconia_ingot", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> THORIUM_INGOT = ITEMS.register(
            "thorium_ingot", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> URANIUM_INGOT = ITEMS.register(
            "uranium_ingot", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> THORIUM_OXIDE_INGOT = ITEMS.register(
            "thorium_oxide_ingot", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> URANIUM_OXIDE_INGOT = ITEMS.register(
            "uranium_oxide_ingot", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> MANGANESE_INGOT = ITEMS.register(
            "manganese_ingot", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> MANGANESE_OXIDE_INGOT = ITEMS.register(
            "manganese_oxide_ingot", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> MANGANESE_DIOXIDE_INGOT = ITEMS.register(
            "manganese_dioxide_ingot", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> NICKEL_INGOT = ITEMS.register(
            "nickel_ingot", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> NICKEL_OXIDE_INGOT = ITEMS.register(
            "nickel_oxide_ingot", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> COBALT_INGOT = ITEMS.register(
            "cobalt_ingot", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> COBALT_OXIDE_INGOT = ITEMS.register(
            "cobalt_oxide_ingot", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> CHROMIUM_INGOT = ITEMS.register(
            "chromium_ingot", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> TITANIUM_INGOT = ITEMS.register(
            "titanium_ingot", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> ZINC_INGOT = ITEMS.register(
            "zinc_ingot", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> TUNGSTEN_INGOT = ITEMS.register(
            "tungsten_ingot", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> HAFNIUM_INGOT = ITEMS.register(
            "hafnium_ingot", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> NIOBIUM_INGOT = ITEMS.register(
            "niobium_ingot", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> YTTRIUM_INGOT = ITEMS.register(
            "yttrium_ingot", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> NEODYMIUM_INGOT = ITEMS.register(
            "neodymium_ingot", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> PALLADIUM_INGOT = ITEMS.register(
            "palladium_ingot", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> PLATINUM_INGOT = ITEMS.register(
            "platinum_ingot", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> IRIDIUM_INGOT = ITEMS.register(
            "iridium_ingot", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> IRIDIUM_OXIDE_INGOT = ITEMS.register(
            "iridium_oxide_ingot", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> RUTHENIUM_OXIDE_INGOT = ITEMS.register(
            "ruthenium_oxide_ingot", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> OSMIUM_INGOT = ITEMS.register(
            "osmium_ingot", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> SODIUM_INGOT = ITEMS.register(
            "sodium_ingot", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> POTASSIUM_INGOT = ITEMS.register(
            "potassium_ingot", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> CALCIUM_INGOT = ITEMS.register(
            "calcium_ingot", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> STRONTIUM_INGOT = ITEMS.register(
            "strontium_ingot", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> BARIUM_INGOT = ITEMS.register(
            "barium_ingot", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> GRAPHITE_INGOT = ITEMS.register(
            "graphite_ingot", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> BRONZE_INGOT = ITEMS.register(
            "bronze_ingot", () -> new BasicItem(new Item.Properties(), "tooltip.nrreborn.bronze_ingot"));
    public static final DeferredItem<Item> STEEL_INGOT = ITEMS.register(
            "steel_ingot", () -> new BasicItem(new Item.Properties(), "tooltip.nrreborn.steel_ingot"));
    public static final DeferredItem<Item> FERROBORON_ALLOY_INGOT = ITEMS.register(
            "ferroboron_alloy_ingot", () -> new BasicItem(new Item.Properties(), "tooltip.nrreborn.ferroboron_alloy_ingot"));
    public static final DeferredItem<Item> TOUGH_ALLOY_INGOT = ITEMS.register(
            "tough_alloy_ingot", () -> new BasicItem(new Item.Properties(), "tooltip.nrreborn.tough_alloy_ingot"));
    public static final DeferredItem<Item> EXTREME_ALLOY_INGOT = ITEMS.register(
            "extreme_alloy_ingot", () -> new BasicItem(new Item.Properties(), "tooltip.nrreborn.extreme_alloy_ingot"));
    public static final DeferredItem<Item> THERMOCONDUCTING_ALLOY_INGOT = ITEMS.register(
            "thermoconducting_alloy_ingot", () -> new BasicItem(new Item.Properties(), "tooltip.nrreborn.thermoconducting_alloy_ingot"));
    public static final DeferredItem<Item> HARD_CARBON_ALLOY_INGOT = ITEMS.register(
            "hard_carbon_alloy_ingot", () -> new BasicItem(new Item.Properties(), "tooltip.nrreborn.hard_carbon_alloy_ingot"));
    public static final DeferredItem<Item> SHIBUICHI_ALLOY_INGOT = ITEMS.register(
            "shibuichi_alloy_ingot", () -> new BasicItem(new Item.Properties(), "tooltip.nrreborn.shibuichi_alloy_ingot"));
    public static final DeferredItem<Item> TIN_SILVER_ALLOY_INGOT = ITEMS.register(
            "tin_silver_alloy_ingot", () -> new BasicItem(new Item.Properties(), "tooltip.nrreborn.tin_silver_alloy_ingot"));
    public static final DeferredItem<Item> LEAD_PLATINUM_ALLOY_INGOT = ITEMS.register(
            "lead_platinum_alloy_ingot", () -> new BasicItem(new Item.Properties(), "tooltip.nrreborn.lead_platinum_alloy_ingot"));
    public static final DeferredItem<Item> ZIRCONIUM_MOLYBDENUM_ALLOY_INGOT = ITEMS.register(
            "zirconium_molybdenum_alloy_ingot", () -> new BasicItem(new Item.Properties(), "tooltip.nrreborn.zirconium_molybdenum_alloy_ingot"));
    public static final DeferredItem<Item> NIOBIUM_TIN_ALLOY_INGOT = ITEMS.register(
            "niobium_tin_alloy_ingot", () -> new BasicItem(new Item.Properties(), "tooltip.nrreborn.niobium_tin_alloy_ingot"));
    public static final DeferredItem<Item> NIOBIUM_TITANIUM_ALLOY_INGOT = ITEMS.register(
            "niobium_titanium_alloy_ingot", () -> new BasicItem(new Item.Properties(), "tooltip.nrreborn.niobium_titanium_alloy_ingot"));
    public static final DeferredItem<Item> OSMIRIDIUM_ALLOY_INGOT = ITEMS.register(
            "osmiridium_alloy_ingot", () -> new BasicItem(new Item.Properties(), "tooltip.nrreborn.osmiridium_alloy_ingot"));
    public static final DeferredItem<Item> NICHROME_ALLOY_INGOT = ITEMS.register(
            "nichrome_alloy_ingot", () -> new BasicItem(new Item.Properties(), "tooltip.nrreborn.nichrome_alloy_ingot"));
    public static final DeferredItem<Item> SUPER_ALLOY_INGOT = ITEMS.register(
            "super_alloy_ingot", () -> new BasicItem(new Item.Properties(), "tooltip.nrreborn.super_alloy_ingot"));
    public static final DeferredItem<Item> ZIRCALOY_INGOT = ITEMS.register(
            "zircaloy_ingot", () -> new BasicItem(new Item.Properties(), "tooltip.nrreborn.zircaloy_ingot"));
    public static final DeferredItem<Item> HASTELLOY_INGOT = ITEMS.register(
            "hastelloy_ingot", () -> new BasicItem(new Item.Properties(), "tooltip.nrreborn.hastelloy_ingot"));
    public static final DeferredItem<Item> STAINLESS_STEEL_INGOT = ITEMS.register(
            "stainless_steel_ingot", () -> new BasicItem(new Item.Properties(), "tooltip.nrreborn.stainless_steel_ingot"));
    public static final DeferredItem<Item> HSLA_STEEL_INGOT = ITEMS.register(
            "hsla_steel_ingot", () -> new BasicItem(new Item.Properties(), "tooltip.nrreborn.hsla_steel_ingot"));
    public static final DeferredItem<Item> MAGNESIUM_DIBORIDE_ALLOY_INGOT = ITEMS.register(
            "magnesium_diboride_alloy_ingot", () -> new BasicItem(new Item.Properties(), "tooltip.nrreborn.magnesium_diboride_alloy_ingot"));
    public static final DeferredItem<Item> LITHIUM_MANGANESE_DIOXIDE_ALLOY_INGOT = ITEMS.register(
            "lithium_manganese_dioxide_alloy_ingot", () -> new BasicItem(new Item.Properties(), "tooltip.nrreborn.lithium_manganese_dioxide_alloy_ingot"));
    public static final DeferredItem<Item> TUNGSTEN_CARBIDE_INGOT = ITEMS.register(
            "tungsten_carbide_ingot", () -> new BasicItem(new Item.Properties(), "tooltip.nrreborn.tungsten_carbide_ingot"));
    public static final DeferredItem<Item> SILICON_CARBIDE_INGOT = ITEMS.register(
            "silicon_carbide_ingot", () -> new BasicItem(new Item.Properties(), "tooltip.nrreborn.silicon_carbide_ingot"));
    public static final DeferredItem<Item> SIC_SIC_CERAMIC_MATRIX_COMPOSITE = ITEMS.register(
            "sic_sic_ceramic_matrix_composite", () -> new BasicItem(new Item.Properties(), "tooltip.nrreborn.sic_sic_ceramic_matrix_composite"));
    public static final DeferredItem<Item> RHODOCHROSITE = ITEMS.register(
            "rhodochrosite", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> CUBIC_BORON_NITRIDE = ITEMS.register(
            "cubic_boron_nitride", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> FLUORITE = ITEMS.register(
            "fluorite", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> VILLIAUMITE = ITEMS.register(
            "villiaumite", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> CAROBBIITE = ITEMS.register(
            "carobbiite", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> BORON_ARSENIDE = ITEMS.register(
            "boron_arsenide", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> SILICON = ITEMS.register(
            "silicon", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> TIN_DUST = ITEMS.register(
            "tin_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> TIN_OXIDE_DUST = ITEMS.register(
            "tin_oxide_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> COPPER_OXIDE_DUST = ITEMS.register(
            "copper_oxide_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> ALUMINUM_DUST = ITEMS.register(
            "aluminum_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> SILVER_DUST = ITEMS.register(
            "silver_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> LEAD_DUST = ITEMS.register(
            "lead_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> MAGNESIUM_DUST = ITEMS.register(
            "magnesium_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> LITHIUM_DUST = ITEMS.register(
            "lithium_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> BORON_DUST = ITEMS.register(
            "boron_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> BERYLLIUM_DUST = ITEMS.register(
            "beryllium_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> ZIRCONIUM_DUST = ITEMS.register(
            "zirconium_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> ZIRCONIA_DUST = ITEMS.register(
            "zirconia_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> THORIUM_DUST = ITEMS.register(
            "thorium_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> URANIUM_DUST = ITEMS.register(
            "uranium_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> THORIUM_OXIDE_DUST = ITEMS.register(
            "thorium_oxide_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> URANIUM_OXIDE_DUST = ITEMS.register(
            "uranium_oxide_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> POLONIUM_DUST = ITEMS.register(
            "polonium_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> PROTACTINIUM_ENRICHED_THORIUM_DUST = ITEMS.register(
            "protactinium_enriched_thorium_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> RADIUM_DUST = ITEMS.register(
            "radium_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> MANGANESE_DUST = ITEMS.register(
            "manganese_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> MANGANESE_OXIDE_DUST = ITEMS.register(
            "manganese_oxide_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> MANGANESE_DIOXIDE_DUST = ITEMS.register(
            "manganese_dioxide_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> NICKEL_DUST = ITEMS.register(
            "nickel_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> NICKEL_OXIDE_DUST = ITEMS.register(
            "nickel_oxide_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> COBALT_DUST = ITEMS.register(
            "cobalt_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> COBALT_OXIDE_DUST = ITEMS.register(
            "cobalt_oxide_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> CHROMIUM_DUST = ITEMS.register(
            "chromium_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> TITANIUM_DUST = ITEMS.register(
            "titanium_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> ZINC_DUST = ITEMS.register(
            "zinc_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> TUNGSTEN_DUST = ITEMS.register(
            "tungsten_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> TUNGSTEN_OXIDE_DUST = ITEMS.register(
            "tungsten_oxide_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> HAFNIUM_DUST = ITEMS.register(
            "hafnium_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> HAFNIUM_OXIDE_DUST = ITEMS.register(
            "hafnium_oxide_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> GERMANIUM_DUST = ITEMS.register(
            "germanium_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> NIOBIUM_DUST = ITEMS.register(
            "niobium_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> YTTRIUM_DUST = ITEMS.register(
            "yttrium_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> MOLYBDENUM_DUST = ITEMS.register(
            "molybdenum_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> NEODYMIUM_DUST = ITEMS.register(
            "neodymium_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> SAMARIUM_DUST = ITEMS.register(
            "samarium_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> TERBIUM_DUST = ITEMS.register(
            "terbium_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> ERBIUM_DUST = ITEMS.register(
            "erbium_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> YTTERBIUM_DUST = ITEMS.register(
            "ytterbium_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> BISMUTH_DUST = ITEMS.register(
            "bismuth_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> PALLADIUM_DUST = ITEMS.register(
            "palladium_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> PLATINUM_DUST = ITEMS.register(
            "platinum_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> IRIDIUM_DUST = ITEMS.register(
            "iridium_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> IRIDIUM_OXIDE_DUST = ITEMS.register(
            "iridium_oxide_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> RUTHENIUM_OXIDE_DUST = ITEMS.register(
            "ruthenium_oxide_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> OSMIUM_DUST = ITEMS.register(
            "osmium_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> SODIUM_DUST = ITEMS.register(
            "sodium_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> POTASSIUM_DUST = ITEMS.register(
            "potassium_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> CALCIUM_DUST = ITEMS.register(
            "calcium_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> STRONTIUM_DUST = ITEMS.register(
            "strontium_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> BARIUM_DUST = ITEMS.register(
            "barium_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> IODINE_DUST = ITEMS.register(
            "iodine_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> BSCCO_DUST = ITEMS.register(
            "bscco_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> SSFAF_DUST = ITEMS.register(
            "ssfaf_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> YBCO_DUST = ITEMS.register(
            "ybco_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> GRAPHITE_DUST = ITEMS.register(
            "graphite_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> COAL_DUST = ITEMS.register(
            "coal_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DIAMOND_DUST = ITEMS.register(
            "diamond_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> QUARTZ_DUST = ITEMS.register(
            "quartz_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> OBSIDIAN_DUST = ITEMS.register(
            "obsidian_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> END_STONE_DUST = ITEMS.register(
            "end_stone_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> SULFUR_DUST = ITEMS.register(
            "sulfur_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> RHODOCHROSITE_DUST = ITEMS.register(
            "rhodochrosite_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> HEXAGONAL_BORON_NITRIDE = ITEMS.register(
            "hexagonal_boron_nitride", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> FLUORITE_DUST = ITEMS.register(
            "fluorite_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> VILLIAUMITE_DUST = ITEMS.register(
            "villiaumite_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> CAROBBIITE_DUST = ITEMS.register(
            "carobbiite_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> ARSENIC_DUST = ITEMS.register(
            "arsenic_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> ENERGETIC_BLEND = ITEMS.register(
            "energetic_blend", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DIMENSIONAL_BLEND = ITEMS.register(
            "dimensional_blend", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> CARBON_MANGANESE_BLEND = ITEMS.register(
            "carbon_manganese_blend", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> CRYSTAL_BINDER = ITEMS.register(
            "crystal_binder", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> ALUGENTUM_DUST = ITEMS.register(
            "alugentum_dust", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> BORAX = ITEMS.register(
            "borax", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> CALCIUM_SULFATE = ITEMS.register(
            "calcium_sulfate", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> SODIUM_FLUORIDE = ITEMS.register(
            "sodium_fluoride", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> POTASSIUM_FLUORIDE = ITEMS.register(
            "potassium_fluoride", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> SODIUM_HYDROXIDE = ITEMS.register(
            "sodium_hydroxide", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> POTASSIUM_HYDROXIDE = ITEMS.register(
            "potassium_hydroxide", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> IRON_FLUORIDE = ITEMS.register(
            "iron_fluoride", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> SODIUM_CHLORIDE = ITEMS.register(
            "sodium_chloride", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> SODIUM_NITRATE = ITEMS.register(
            "sodium_nitrate", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> STRONTIUM_CHLORIDE = ITEMS.register(
            "strontium_chloride", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> ZINC_SULFIDE = ITEMS.register(
            "zinc_sulfide", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> RAW_TIN = ITEMS.register(
            "raw_tin", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> RAW_LEAD = ITEMS.register(
            "raw_lead", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> RAW_MAGNESIUM = ITEMS.register(
            "raw_magnesium", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> RAW_LITHIUM = ITEMS.register(
            "raw_lithium", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> RAW_BORON = ITEMS.register(
            "raw_boron", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> RAW_THORIUM = ITEMS.register(
            "raw_thorium", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> RAW_URANIUM = ITEMS.register(
            "raw_uranium", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> LITHIUM_6 = ITEMS.register(
            "lithium_6", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> LITHIUM_7 = ITEMS.register(
            "lithium_7", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> BERYLLIUM_7 = ITEMS.register(
            "beryllium_7", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> BORON_10 = ITEMS.register(
            "boron_10", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> BORON_11 = ITEMS.register(
            "boron_11", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> SODIUM_22 = ITEMS.register(
            "sodium_22", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> MAGNESIUM_24 = ITEMS.register(
            "magnesium_24", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> MAGNESIUM_26 = ITEMS.register(
            "magnesium_26", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> CALCIUM_48 = ITEMS.register(
            "calcium_48", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> COBALT_60 = ITEMS.register(
            "cobalt_60", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> STRONTIUM_90 = ITEMS.register(
            "strontium_90", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> RUTHENIUM_106 = ITEMS.register(
            "ruthenium_106", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> CAESIUM_137 = ITEMS.register(
            "caesium_137", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> PROMETHIUM_147 = ITEMS.register(
            "promethium_147", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> EUROPIUM_155 = ITEMS.register(
            "europium_155", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> IRIDIUM_192 = ITEMS.register(
            "iridium_192", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> THORIUM_230 = ITEMS.register(
            "thorium_230", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> THORIUM_232 = ITEMS.register(
            "thorium_232", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> PROTACTINIUM_231 = ITEMS.register(
            "protactinium_231", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> PROTACTINIUM_233 = ITEMS.register(
            "protactinium_233", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> URANIUM_233 = ITEMS.register(
            "uranium_233", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> URANIUM_234 = ITEMS.register(
            "uranium_234", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> URANIUM_235 = ITEMS.register(
            "uranium_235", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> URANIUM_238 = ITEMS.register(
            "uranium_238", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> NEPTUNIUM_236 = ITEMS.register(
            "neptunium_236", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> NEPTUNIUM_237 = ITEMS.register(
            "neptunium_237", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> PLUTONIUM_238 = ITEMS.register(
            "plutonium_238", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> PLUTONIUM_239 = ITEMS.register(
            "plutonium_239", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> PLUTONIUM_241 = ITEMS.register(
            "plutonium_241", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> PLUTONIUM_242 = ITEMS.register(
            "plutonium_242", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> AMERICIUM_241 = ITEMS.register(
            "americium_241", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> AMERICIUM_242 = ITEMS.register(
            "americium_242", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> AMERICIUM_243 = ITEMS.register(
            "americium_243", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> CURIUM_243 = ITEMS.register(
            "curium_243", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> CURIUM_245 = ITEMS.register(
            "curium_245", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> CURIUM_246 = ITEMS.register(
            "curium_246", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> CURIUM_247 = ITEMS.register(
            "curium_247", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> BERKELIUM_247 = ITEMS.register(
            "berkelium_247", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> BERKELIUM_248 = ITEMS.register(
            "berkelium_248", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> CALIFORNIUM_249 = ITEMS.register(
            "californium_249", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> CALIFORNIUM_250 = ITEMS.register(
            "californium_250", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> CALIFORNIUM_251 = ITEMS.register(
            "californium_251", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> CALIFORNIUM_252 = ITEMS.register(
            "californium_252", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> EINSTEINIUM_252 = ITEMS.register(
            "einsteinium_252", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> EINSTEINIUM_253 = ITEMS.register(
            "einsteinium_253", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> EINSTEINIUM_254 = ITEMS.register(
            "einsteinium_254", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> EINSTEINIUM_255 = ITEMS.register(
            "einsteinium_255", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> FERMIUM_253 = ITEMS.register(
            "fermium_253", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> FERMIUM_257 = ITEMS.register(
            "fermium_257", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> COPERNICIUM_291 = ITEMS.register(
            "copernicium_291", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> BASIC_PLATING = ITEMS.register(
            "basic_plating", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> ADVANCED_PLATING = ITEMS.register(
            "advanced_plating", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_URANIUM_PLATING = ITEMS.register(
            "depleted_uranium_plating", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> ELITE_PLATING = ITEMS.register(
            "elite_plating", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> COPPER_SOLENOID = ITEMS.register(
            "copper_solenoid", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> MAGNESIUM_DIBORIDE_SOLENOID = ITEMS.register(
            "magnesium_diboride_solenoid", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> SERVOMECHANISM = ITEMS.register(
            "servomechanism", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> ELECTRIC_MOTOR = ITEMS.register(
            "electric_motor", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> LINEAR_ACTUATOR = ITEMS.register(
            "linear_actuator", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> BIOPLASTIC = ITEMS.register(
            "bioplastic", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> GELATIN = ITEMS.register(
            "gelatin", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> NITROGEN_BUCKET = ITEMS.register(
            "nitrogen_bucket", () -> new BucketItem(NRRFluids.NITROGEN_SOURCE.get(), new Item.Properties()
                    .craftRemainder(Items.BUCKET)
                    .stacksTo(1)));
    public static final DeferredItem<Item> OXYGEN_BUCKET = ITEMS.register(
            "oxygen_bucket", () -> new BucketItem(NRRFluids.OXYGEN_SOURCE.get(), new Item.Properties()
                    .craftRemainder(Items.BUCKET)
                    .stacksTo(1)));
    public static final DeferredItem<Item> FLUORINE_BUCKET = ITEMS.register(
            "fluorine_bucket", () -> new BucketItem(NRRFluids.FLUORINE_SOURCE.get(), new Item.Properties()
                    .craftRemainder(Items.BUCKET)
                    .stacksTo(1)));
    public static final DeferredItem<Item> HYDROGEN_BUCKET = ITEMS.register(
            "hydrogen_bucket", () -> new BucketItem(NRRFluids.HYDROGEN_SOURCE.get(), new Item.Properties()
                    .craftRemainder(Items.BUCKET)
                    .stacksTo(1)));
    public static final DeferredItem<Item> DEUTERIUM_BUCKET = ITEMS.register(
            "deuterium_bucket", () -> new BucketItem(NRRFluids.DEUTERIUM_SOURCE.get(), new Item.Properties()
                    .craftRemainder(Items.BUCKET)
                    .stacksTo(1)));
    public static final DeferredItem<Item> TRITIUM_BUCKET = ITEMS.register(
            "tritium_bucket", () -> new BucketItem(NRRFluids.TRITIUM_SOURCE.get(), new Item.Properties()
                    .craftRemainder(Items.BUCKET)
                    .stacksTo(1)));
    public static final DeferredItem<Item> HELIUM_BUCKET = ITEMS.register(
            "helium_bucket", () -> new BucketItem(NRRFluids.HELIUM_SOURCE.get(), new Item.Properties()
                    .craftRemainder(Items.BUCKET)
                    .stacksTo(1)));
    public static final DeferredItem<Item> HELIUM_3_BUCKET = ITEMS.register(
            "helium_3_bucket", () -> new BucketItem(NRRFluids.HELIUM_3_SOURCE.get(), new Item.Properties()
                    .craftRemainder(Items.BUCKET)
                    .stacksTo(1)));
    public static final DeferredItem<Item> CARBON_DIOXIDE_BUCKET = ITEMS.register(
            "carbon_dioxide_bucket", () -> new BucketItem(NRRFluids.CARBON_DIOXIDE_SOURCE.get(), new Item.Properties()
                    .craftRemainder(Items.BUCKET)
                    .stacksTo(1)));
    public static final DeferredItem<Item> CARBON_MONOXIDE_BUCKET = ITEMS.register(
            "carbon_monoxide_bucket", () -> new BucketItem(NRRFluids.CARBON_MONOXIDE_SOURCE.get(), new Item.Properties()
                    .craftRemainder(Items.BUCKET)
                    .stacksTo(1)));
    public static final DeferredItem<Item> AMMONIA_BUCKET = ITEMS.register(
            "ammonia_bucket", () -> new BucketItem(NRRFluids.AMMONIA_SOURCE.get(), new Item.Properties()
                    .craftRemainder(Items.BUCKET)
                    .stacksTo(1)));
    public static final DeferredItem<Item> SULFUR_DIOXIDE_BUCKET = ITEMS.register(
            "sulfur_dioxide_bucket", () -> new BucketItem(NRRFluids.SULFUR_DIOXIDE_SOURCE.get(), new Item.Properties()
                    .craftRemainder(Items.BUCKET)
                    .stacksTo(1)));
    public static final DeferredItem<Item> SULFUR_TRIOXIDE_BUCKET = ITEMS.register(
            "sulfur_trioxide_bucket", () -> new BucketItem(NRRFluids.SULFUR_TRIOXIDE_SOURCE.get(), new Item.Properties()
                    .craftRemainder(Items.BUCKET)
                    .stacksTo(1)));
    public static final DeferredItem<Item> ETHYLENE_BUCKET = ITEMS.register(
            "ethylene_bucket", () -> new BucketItem(NRRFluids.ETHYLENE_SOURCE.get(), new Item.Properties()
                    .craftRemainder(Items.BUCKET)
                    .stacksTo(1)));
    public static final DeferredItem<Item> DIBORANE_BUCKET = ITEMS.register(
            "diborane_bucket", () -> new BucketItem(NRRFluids.DIBORANE_SOURCE.get(), new Item.Properties()
                    .craftRemainder(Items.BUCKET)
                    .stacksTo(1)));
    public static final DeferredItem<Item> OXYGEN_DIFLUORIDE_BUCKET = ITEMS.register(
            "oxygen_difluoride_bucket", () -> new BucketItem(NRRFluids.OXYGEN_DIFLUORIDE_SOURCE.get(), new Item.Properties()
                    .craftRemainder(Items.BUCKET)
                    .stacksTo(1)));
    public static final DeferredItem<Item> FLUOROMETHANE_BUCKET = ITEMS.register(
            "fluoromethane_bucket", () -> new BucketItem(NRRFluids.FLUOROMETHANE_SOURCE.get(), new Item.Properties()
                    .craftRemainder(Items.BUCKET)
                    .stacksTo(1)));
    public static final DeferredItem<Item> LIQUID_NITROGEN_BUCKET = ITEMS.register(
            "liquid_nitrogen_bucket", () -> new BucketItem(NRRFluids.LIQUID_NITROGEN_SOURCE.get(), new Item.Properties()
                    .craftRemainder(Items.BUCKET)
                    .stacksTo(1)));
    public static final DeferredItem<Item> LIQUID_HELIUM_BUCKET = ITEMS.register(
            "liquid_helium_bucket", () -> new BucketItem(NRRFluids.LIQUID_HELIUM_SOURCE.get(), new Item.Properties()
                    .craftRemainder(Items.BUCKET)
                    .stacksTo(1)));
    public static final DeferredItem<Item> METHANOL_BUCKET = ITEMS.register(
            "methanol_bucket", () -> new BucketItem(NRRFluids.METHANOL_SOURCE.get(), new Item.Properties()
                    .craftRemainder(Items.BUCKET)
                    .stacksTo(1)));
    public static final DeferredItem<Item> ETHANOL_BUCKET = ITEMS.register(
            "ethanol_bucket", () -> new BucketItem(NRRFluids.ETHANOL_SOURCE.get(), new Item.Properties()
                    .craftRemainder(Items.BUCKET)
                    .stacksTo(1)));
    public static final DeferredItem<Item> SULFURIC_ACID_BUCKET = ITEMS.register(
            "sulfuric_acid_bucket", () -> new BucketItem(NRRFluids.SULFURIC_ACID_SOURCE.get(), new Item.Properties()
                    .craftRemainder(Items.BUCKET)
                    .stacksTo(1)));
    public static final DeferredItem<Item> BORIC_ACID_BUCKET = ITEMS.register(
            "boric_acid_bucket", () -> new BucketItem(NRRFluids.BORIC_ACID_SOURCE.get(), new Item.Properties()
                    .craftRemainder(Items.BUCKET)
                    .stacksTo(1)));
    public static final DeferredItem<Item> BORAX_SOLUTION_BUCKET = ITEMS.register(
            "borax_solution_bucket", () -> new BucketItem(NRRFluids.BORAX_SOLUTION_SOURCE.get(), new Item.Properties()
                    .craftRemainder(Items.BUCKET)
                    .stacksTo(1)));
    public static final DeferredItem<Item> CALCIUM_SULFATE_SOLUTION_BUCKET = ITEMS.register(
            "calcium_sulfate_solution_bucket", () -> new BucketItem(NRRFluids.CALCIUM_SULFATE_SOLUTION_SOURCE.get(), new Item.Properties()
                    .craftRemainder(Items.BUCKET)
                    .stacksTo(1)));
    public static final DeferredItem<Item> SODIUM_FLUORIDE_SOLUTION_BUCKET = ITEMS.register(
            "sodium_fluoride_solution_bucket", () -> new BucketItem(NRRFluids.SODIUM_FLUORIDE_SOLUTION_SOURCE.get(), new Item.Properties()
                    .craftRemainder(Items.BUCKET)
                    .stacksTo(1)));
    public static final DeferredItem<Item> POTASSIUM_FLUORIDE_SOLUTION_BUCKET = ITEMS.register(
            "potassium_fluoride_solution_bucket", () -> new BucketItem(NRRFluids.POTASSIUM_FLUORIDE_SOLUTION_SOURCE.get(), new Item.Properties()
                    .craftRemainder(Items.BUCKET)
                    .stacksTo(1)));
    public static final DeferredItem<Item> SODIUM_HYDROXIDE_SOLUTION_BUCKET = ITEMS.register(
            "sodium_hydroxide_solution_bucket", () -> new BucketItem(NRRFluids.SODIUM_HYDROXIDE_SOLUTION_SOURCE.get(), new Item.Properties()
                    .craftRemainder(Items.BUCKET)
                    .stacksTo(1)));
    public static final DeferredItem<Item> POTASSIUM_HYDROXIDE_SOLUTION_BUCKET = ITEMS.register(
            "potassium_hydroxide_solution_bucket", () -> new BucketItem(NRRFluids.POTASSIUM_HYDROXIDE_SOLUTION_SOURCE.get(), new Item.Properties()
                    .craftRemainder(Items.BUCKET)
                    .stacksTo(1)));
    public static final DeferredItem<Item> FLUORITE_WATER_BUCKET = ITEMS.register(
            "fluorite_water_bucket", () -> new BucketItem(NRRFluids.FLUORITE_WATER_SOURCE.get(), new Item.Properties()
                    .craftRemainder(Items.BUCKET)
                    .stacksTo(1)));
    public static final DeferredItem<Item> BORON_NITRIDE_SOLUTION_BUCKET = ITEMS.register(
            "boron_nitride_solution_bucket", () -> new BucketItem(NRRFluids.BORON_NITRIDE_SOLUTION_SOURCE.get(), new Item.Properties()
                    .craftRemainder(Items.BUCKET)
                    .stacksTo(1)));
    public static final DeferredItem<Item> SPEED_UPGRADE = ITEMS.register(
            "speed_upgrade", () -> new BasicItem(new Item.Properties(), "tooltip.nrreborn.speed_upgrade"));
    public static final DeferredItem<Item> ENERGY_UPGRADE = ITEMS.register(
            "energy_upgrade", () -> new BasicItem(new Item.Properties(), "tooltip.nrreborn.energy_upgrade"));
    public static final DeferredItem<Item> TBU_FUEL = ITEMS.register(
            "tbu_fuel", () -> new FissionFuelItem(new Item.Properties(), 144000, NRRConfig.CONFIG.TBU_GENERATION_RATE::get, 18.0D));
    public static final DeferredItem<Item> TBU_OXIDE_FUEL = ITEMS.register(
            "tbu_oxide_fuel", () -> new FissionFuelItem(new Item.Properties(), 144000, NRRConfig.CONFIG.TBU_OXIDE_GENERATION_RATE::get, 22.5D));
    public static final DeferredItem<Item> TBU_TRISO_FUEL = ITEMS.register(
            "tbu_triso_fuel", () -> new FissionFuelItem(new Item.Properties(), 144000, NRRConfig.CONFIG.TBU_TRISO_GENERATION_RATE::get, 18.0D));
    public static final DeferredItem<Item> LEN_236_FUEL = ITEMS.register(
            "len_236_fuel", () -> new FissionFuelItem(new Item.Properties(), 102000, NRRConfig.CONFIG.LEN_236_GENERATION_RATE::get, 36.0D));
    public static final DeferredItem<Item> LEN_236_OXIDE_FUEL = ITEMS.register(
            "len_236_oxide_fuel", () -> new FissionFuelItem(new Item.Properties(), 102000, NRRConfig.CONFIG.LEN_236_OXIDE_GENERATION_RATE::get, 45.0D));
    public static final DeferredItem<Item> LEN_236_TRISO_FUEL = ITEMS.register(
            "len_236_triso_fuel", () -> new FissionFuelItem(new Item.Properties(), 102000, NRRConfig.CONFIG.LEN_236_TRISO_GENERATION_RATE::get, 36.0D));
    public static final DeferredItem<Item> LEP_239_FUEL = ITEMS.register(
            "lep_239_fuel", () -> new FissionFuelItem(new Item.Properties(), 92000, NRRConfig.CONFIG.LEP_239_GENERATION_RATE::get, 40.0D));
    public static final DeferredItem<Item> LEP_239_OXIDE_FUEL = ITEMS.register(
            "lep_239_oxide_fuel", () -> new FissionFuelItem(new Item.Properties(), 92000, NRRConfig.CONFIG.LEP_239_OXIDE_GENERATION_RATE::get, 50.0D));
    public static final DeferredItem<Item> LEP_239_TRISO_FUEL = ITEMS.register(
            "lep_239_triso_fuel", () -> new FissionFuelItem(new Item.Properties(), 92000, NRRConfig.CONFIG.LEP_239_TRISO_GENERATION_RATE::get, 40.0D));
    public static final DeferredItem<Item> LEU_235_FUEL = ITEMS.register(
            "leu_235_fuel", () -> new FissionFuelItem(new Item.Properties(), 72000, NRRConfig.CONFIG.LEU_235_GENERATION_RATE::get, 50.0D));
    public static final DeferredItem<Item> LEU_235_OXIDE_FUEL = ITEMS.register(
            "leu_235_oxide_fuel", () -> new FissionFuelItem(new Item.Properties(), 72000, NRRConfig.CONFIG.LEU_235_OXIDE_GENERATION_RATE::get, 62.5D));
    public static final DeferredItem<Item> LEU_235_TRISO_FUEL = ITEMS.register(
            "leu_235_triso_fuel", () -> new FissionFuelItem(new Item.Properties(), 72000, NRRConfig.CONFIG.LEU_235_TRISO_GENERATION_RATE::get, 50.0D));
    public static final DeferredItem<Item> LEU_233_FUEL = ITEMS.register(
            "leu_233_fuel", () -> new FissionFuelItem(new Item.Properties(), 64000, NRRConfig.CONFIG.LEU_233_GENERATION_RATE::get, 60.0D));
    public static final DeferredItem<Item> LEU_233_OXIDE_FUEL = ITEMS.register(
            "leu_233_oxide_fuel", () -> new FissionFuelItem(new Item.Properties(), 64000, NRRConfig.CONFIG.LEU_233_OXIDE_GENERATION_RATE::get, 75.0D));
    public static final DeferredItem<Item> LEU_233_TRISO_FUEL = ITEMS.register(
            "leu_233_triso_fuel", () -> new FissionFuelItem(new Item.Properties(), 64000, NRRConfig.CONFIG.LEU_233_TRISO_GENERATION_RATE::get, 60.0D));
    public static final DeferredItem<Item> LEP_241_FUEL = ITEMS.register(
            "lep_241_fuel", () -> new FissionFuelItem(new Item.Properties(), 92000, NRRConfig.CONFIG.LEP_241_GENERATION_RATE::get, 70.0D));
    public static final DeferredItem<Item> LEP_241_OXIDE_FUEL = ITEMS.register(
            "lep_241_oxide_fuel", () -> new FissionFuelItem(new Item.Properties(), 92000, NRRConfig.CONFIG.LEP_241_OXIDE_GENERATION_RATE::get, 87.5D));
    public static final DeferredItem<Item> LEP_241_TRISO_FUEL = ITEMS.register(
            "lep_241_triso_fuel", () -> new FissionFuelItem(new Item.Properties(), 92000, NRRConfig.CONFIG.LEP_241_TRISO_GENERATION_RATE::get, 70.0D));
    public static final DeferredItem<Item> LEB_248_FUEL = ITEMS.register(
            "leb_248_fuel", () -> new FissionFuelItem(new Item.Properties(), 86000, NRRConfig.CONFIG.LEB_248_GENERATION_RATE::get, 52.0D));
    public static final DeferredItem<Item> LEB_248_OXIDE_FUEL = ITEMS.register(
            "leb_248_oxide_fuel", () -> new FissionFuelItem(new Item.Properties(), 86000, NRRConfig.CONFIG.LEB_248_OXIDE_GENERATION_RATE::get, 65.0D));
    public static final DeferredItem<Item> LEB_248_TRISO_FUEL = ITEMS.register(
            "leb_248_triso_fuel", () -> new FissionFuelItem(new Item.Properties(), 86000, NRRConfig.CONFIG.LEB_248_TRISO_GENERATION_RATE::get, 52.0D));
    public static final DeferredItem<Item> LECM_247_FUEL = ITEMS.register(
            "lecm_247_fuel", () -> new FissionFuelItem(new Item.Properties(), 78000, NRRConfig.CONFIG.LECM_247_GENERATION_RATE::get, 54.0D));
    public static final DeferredItem<Item> LECM_247_OXIDE_FUEL = ITEMS.register(
            "lecm_247_oxide_fuel", () -> new FissionFuelItem(new Item.Properties(), 78000, NRRConfig.CONFIG.LECM_247_OXIDE_GENERATION_RATE::get, 67.5D));
    public static final DeferredItem<Item> LECM_247_TRISO_FUEL = ITEMS.register(
            "lecm_247_triso_fuel", () -> new FissionFuelItem(new Item.Properties(), 78000, NRRConfig.CONFIG.LECM_247_TRISO_GENERATION_RATE::get, 54.0D));
    public static final DeferredItem<Item> LECM_245_FUEL = ITEMS.register(
            "lecm_245_fuel", () -> new FissionFuelItem(new Item.Properties(), 68000, NRRConfig.CONFIG.LECM_245_GENERATION_RATE::get, 68.0D));
    public static final DeferredItem<Item> LECM_245_OXIDE_FUEL = ITEMS.register(
            "lecm_245_oxide_fuel", () -> new FissionFuelItem(new Item.Properties(), 68000, NRRConfig.CONFIG.LECM_245_OXIDE_GENERATION_RATE::get, 85.0D));
    public static final DeferredItem<Item> LECM_245_TRISO_FUEL = ITEMS.register(
            "lecm_245_triso_fuel", () -> new FissionFuelItem(new Item.Properties(), 68000, NRRConfig.CONFIG.LECM_245_TRISO_GENERATION_RATE::get, 68.0D));
    public static final DeferredItem<Item> LECM_243_FUEL = ITEMS.register(
            "lecm_243_fuel", () -> new FissionFuelItem(new Item.Properties(), 52000, NRRConfig.CONFIG.LECM_243_GENERATION_RATE::get, 112.0D));
    public static final DeferredItem<Item> LECM_243_OXIDE_FUEL = ITEMS.register(
            "lecm_243_oxide_fuel", () -> new FissionFuelItem(new Item.Properties(), 52000, NRRConfig.CONFIG.LECM_243_OXIDE_GENERATION_RATE::get, 140.0D));
    public static final DeferredItem<Item> LECM_243_TRISO_FUEL = ITEMS.register(
            "lecm_243_triso_fuel", () -> new FissionFuelItem(new Item.Properties(), 52000, NRRConfig.CONFIG.LECM_243_TRISO_GENERATION_RATE::get, 112.0D));
    public static final DeferredItem<Item> LEA_242_FUEL = ITEMS.register(
            "lea_242_fuel", () -> new FissionFuelItem(new Item.Properties(), 54000, NRRConfig.CONFIG.LEA_242_GENERATION_RATE::get, 94.0D));
    public static final DeferredItem<Item> LEA_242_OXIDE_FUEL = ITEMS.register(
            "lea_242_oxide_fuel", () -> new FissionFuelItem(new Item.Properties(), 54000, NRRConfig.CONFIG.LEA_242_OXIDE_GENERATION_RATE::get, 117.5D));
    public static final DeferredItem<Item> LEA_242_TRISO_FUEL = ITEMS.register(
            "lea_242_triso_fuel", () -> new FissionFuelItem(new Item.Properties(), 54000, NRRConfig.CONFIG.LEA_242_TRISO_GENERATION_RATE::get, 94.0D));
    public static final DeferredItem<Item> LECF_249_FUEL = ITEMS.register(
            "lecf_249_fuel", () -> new FissionFuelItem(new Item.Properties(), 60000, NRRConfig.CONFIG.LECF_249_GENERATION_RATE::get, 116.0D));
    public static final DeferredItem<Item> LECF_249_OXIDE_FUEL = ITEMS.register(
            "lecf_249_oxide_fuel", () -> new FissionFuelItem(new Item.Properties(), 60000, NRRConfig.CONFIG.LECF_249_OXIDE_GENERATION_RATE::get, 145.0D));
    public static final DeferredItem<Item> LECF_249_TRISO_FUEL = ITEMS.register(
            "lecf_249_triso_fuel", () -> new FissionFuelItem(new Item.Properties(), 60000, NRRConfig.CONFIG.LECF_249_TRISO_GENERATION_RATE::get, 116.0D));
    public static final DeferredItem<Item> LECF_251_FUEL = ITEMS.register(
            "lecf_251_fuel", () -> new FissionFuelItem(new Item.Properties(), 58000, NRRConfig.CONFIG.LECF_251_GENERATION_RATE::get, 120.0D));
    public static final DeferredItem<Item> LECF_251_OXIDE_FUEL = ITEMS.register(
            "lecf_251_oxide_fuel", () -> new FissionFuelItem(new Item.Properties(), 58000, NRRConfig.CONFIG.LECF_251_OXIDE_GENERATION_RATE::get, 150.0D));
    public static final DeferredItem<Item> LECF_251_TRISO_FUEL = ITEMS.register(
            "lecf_251_triso_fuel", () -> new FissionFuelItem(new Item.Properties(), 58000, NRRConfig.CONFIG.LECF_251_TRISO_GENERATION_RATE::get, 120.0D));
    public static final DeferredItem<Item> MOX_239_FUEL = ITEMS.register(
            "mox_239_fuel", () -> new FissionFuelItem(new Item.Properties(), 84000, NRRConfig.CONFIG.MOX_239_GENERATION_RATE::get, 57.5D));
    public static final DeferredItem<Item> MOX_239_OXIDE_FUEL = ITEMS.register(
            "mox_239_oxide_fuel", () -> new FissionFuelItem(new Item.Properties(), 84000, NRRConfig.CONFIG.MOX_239_OXIDE_GENERATION_RATE::get, 71.9D));
    public static final DeferredItem<Item> MOX_239_TRISO_FUEL = ITEMS.register(
            "mox_239_triso_fuel", () -> new FissionFuelItem(new Item.Properties(), 84000, NRRConfig.CONFIG.MOX_239_TRISO_GENERATION_RATE::get, 57.5D));
    public static final DeferredItem<Item> MOX_241_FUEL = ITEMS.register(
            "mox_241_fuel", () -> new FissionFuelItem(new Item.Properties(), 56000, NRRConfig.CONFIG.MOX_241_GENERATION_RATE::get, 97.5D));
    public static final DeferredItem<Item> MOX_241_OXIDE_FUEL = ITEMS.register(
            "mox_241_oxide_fuel", () -> new FissionFuelItem(new Item.Properties(), 56000, NRRConfig.CONFIG.MOX_241_OXIDE_GENERATION_RATE::get, 121.9D));
    public static final DeferredItem<Item> MOX_241_TRISO_FUEL = ITEMS.register(
            "mox_241_triso_fuel", () -> new FissionFuelItem(new Item.Properties(), 56000, NRRConfig.CONFIG.MOX_241_TRISO_GENERATION_RATE::get, 97.5D));
    public static final DeferredItem<Item> HEN_236_FUEL = ITEMS.register(
            "hen_236_fuel", () -> new FissionFuelItem(new Item.Properties(), 102000, NRRConfig.CONFIG.HEN_236_GENERATION_RATE::get, 216.0D));
    public static final DeferredItem<Item> HEN_236_OXIDE_FUEL = ITEMS.register(
            "hen_236_oxide_fuel", () -> new FissionFuelItem(new Item.Properties(), 102000, NRRConfig.CONFIG.HEN_236_OXIDE_GENERATION_RATE::get, 270.0D));
    public static final DeferredItem<Item> HEN_236_TRISO_FUEL = ITEMS.register(
            "hen_236_triso_fuel", () -> new FissionFuelItem(new Item.Properties(), 102000, NRRConfig.CONFIG.HEN_236_TRISO_GENERATION_RATE::get, 216.0D));
    public static final DeferredItem<Item> HEP_239_FUEL = ITEMS.register(
            "hep_239_fuel", () -> new FissionFuelItem(new Item.Properties(), 92000, NRRConfig.CONFIG.HEP_239_GENERATION_RATE::get, 240.0D));
    public static final DeferredItem<Item> HEP_239_OXIDE_FUEL = ITEMS.register(
            "hep_239_oxide_fuel", () -> new FissionFuelItem(new Item.Properties(), 92000, NRRConfig.CONFIG.HEP_239_OXIDE_GENERATION_RATE::get, 300.0D));
    public static final DeferredItem<Item> HEP_239_TRISO_FUEL = ITEMS.register(
            "hep_239_triso_fuel", () -> new FissionFuelItem(new Item.Properties(), 92000, NRRConfig.CONFIG.HEP_239_TRISO_GENERATION_RATE::get, 240.0D));
    public static final DeferredItem<Item> HEU_235_FUEL = ITEMS.register(
            "heu_235_fuel", () -> new FissionFuelItem(new Item.Properties(), 72000, NRRConfig.CONFIG.HEU_235_GENERATION_RATE::get, 300.0D));
    public static final DeferredItem<Item> HEU_235_OXIDE_FUEL = ITEMS.register(
            "heu_235_oxide_fuel", () -> new FissionFuelItem(new Item.Properties(), 72000, NRRConfig.CONFIG.HEU_235_OXIDE_GENERATION_RATE::get, 375.0D));
    public static final DeferredItem<Item> HEU_235_TRISO_FUEL = ITEMS.register(
            "heu_235_triso_fuel", () -> new FissionFuelItem(new Item.Properties(), 72000, NRRConfig.CONFIG.HEU_235_TRISO_GENERATION_RATE::get, 300.0D));
    public static final DeferredItem<Item> HEU_233_FUEL = ITEMS.register(
            "heu_233_fuel", () -> new FissionFuelItem(new Item.Properties(), 64000, NRRConfig.CONFIG.HEU_233_GENERATION_RATE::get, 360.0D));
    public static final DeferredItem<Item> HEU_233_OXIDE_FUEL = ITEMS.register(
            "heu_233_oxide_fuel", () -> new FissionFuelItem(new Item.Properties(), 64000, NRRConfig.CONFIG.HEU_233_OXIDE_GENERATION_RATE::get, 450.0D));
    public static final DeferredItem<Item> HEU_233_TRISO_FUEL = ITEMS.register(
            "heu_233_triso_fuel", () -> new FissionFuelItem(new Item.Properties(), 64000, NRRConfig.CONFIG.HEU_233_TRISO_GENERATION_RATE::get, 360.0D));
    public static final DeferredItem<Item> HEP_241_FUEL = ITEMS.register(
            "hep_241_fuel", () -> new FissionFuelItem(new Item.Properties(), 92000, NRRConfig.CONFIG.HEP_241_GENERATION_RATE::get, 420.0D));
    public static final DeferredItem<Item> HEP_241_OXIDE_FUEL = ITEMS.register(
            "hep_241_oxide_fuel", () -> new FissionFuelItem(new Item.Properties(), 92000, NRRConfig.CONFIG.HEP_241_OXIDE_GENERATION_RATE::get, 525.0D));
    public static final DeferredItem<Item> HEP_241_TRISO_FUEL = ITEMS.register(
            "hep_241_triso_fuel", () -> new FissionFuelItem(new Item.Properties(), 92000, NRRConfig.CONFIG.HEP_241_TRISO_GENERATION_RATE::get, 420.0D));
    public static final DeferredItem<Item> HEA_242_FUEL = ITEMS.register(
            "hea_242_fuel", () -> new FissionFuelItem(new Item.Properties(), 54000, NRRConfig.CONFIG.HEA_242_GENERATION_RATE::get, 564.0D));
    public static final DeferredItem<Item> HEA_242_OXIDE_FUEL = ITEMS.register(
            "hea_242_oxide_fuel", () -> new FissionFuelItem(new Item.Properties(), 54000, NRRConfig.CONFIG.HEA_242_OXIDE_GENERATION_RATE::get, 705.0D));
    public static final DeferredItem<Item> HEA_242_TRISO_FUEL = ITEMS.register(
            "hea_242_triso_fuel", () -> new FissionFuelItem(new Item.Properties(), 54000, NRRConfig.CONFIG.HEA_242_TRISO_GENERATION_RATE::get, 564.0D));
    public static final DeferredItem<Item> HECM_247_FUEL = ITEMS.register(
            "hecm_247_fuel", () -> new FissionFuelItem(new Item.Properties(), 78000, NRRConfig.CONFIG.HECM_247_GENERATION_RATE::get, 324.0D));
    public static final DeferredItem<Item> HECM_247_OXIDE_FUEL = ITEMS.register(
            "hecm_247_oxide_fuel", () -> new FissionFuelItem(new Item.Properties(), 78000, NRRConfig.CONFIG.HECM_247_OXIDE_GENERATION_RATE::get, 405.0D));
    public static final DeferredItem<Item> HECM_247_TRISO_FUEL = ITEMS.register(
            "hecm_247_triso_fuel", () -> new FissionFuelItem(new Item.Properties(), 78000, NRRConfig.CONFIG.HECM_247_TRISO_GENERATION_RATE::get, 324.0D));
    public static final DeferredItem<Item> HECM_245_FUEL = ITEMS.register(
            "hecm_245_fuel", () -> new FissionFuelItem(new Item.Properties(), 68000, NRRConfig.CONFIG.HECM_245_GENERATION_RATE::get, 408.0D));
    public static final DeferredItem<Item> HECM_245_OXIDE_FUEL = ITEMS.register(
            "hecm_245_oxide_fuel", () -> new FissionFuelItem(new Item.Properties(), 68000, NRRConfig.CONFIG.HECM_245_OXIDE_GENERATION_RATE::get, 510.0D));
    public static final DeferredItem<Item> HECM_245_TRISO_FUEL = ITEMS.register(
            "hecm_245_triso_fuel", () -> new FissionFuelItem(new Item.Properties(), 68000, NRRConfig.CONFIG.HECM_245_TRISO_GENERATION_RATE::get, 408.0D));
    public static final DeferredItem<Item> HECM_243_FUEL = ITEMS.register(
            "hecm_243_fuel", () -> new FissionFuelItem(new Item.Properties(), 52000, NRRConfig.CONFIG.HECM_243_GENERATION_RATE::get, 672.0D));
    public static final DeferredItem<Item> HECM_243_OXIDE_FUEL = ITEMS.register(
            "hecm_243_oxide_fuel", () -> new FissionFuelItem(new Item.Properties(), 52000, NRRConfig.CONFIG.HECM_243_OXIDE_GENERATION_RATE::get, 840.0D));
    public static final DeferredItem<Item> HECM_243_TRISO_FUEL = ITEMS.register(
            "hecm_243_triso_fuel", () -> new FissionFuelItem(new Item.Properties(), 52000, NRRConfig.CONFIG.HECM_243_TRISO_GENERATION_RATE::get, 672.0D));
    public static final DeferredItem<Item> HEB_248_FUEL = ITEMS.register(
            "heb_248_fuel", () -> new FissionFuelItem(new Item.Properties(), 86000, NRRConfig.CONFIG.HEB_248_GENERATION_RATE::get, 312.0D));
    public static final DeferredItem<Item> HEB_248_OXIDE_FUEL = ITEMS.register(
            "heb_248_oxide_fuel", () -> new FissionFuelItem(new Item.Properties(), 86000, NRRConfig.CONFIG.HEB_248_OXIDE_GENERATION_RATE::get, 390.0D));
    public static final DeferredItem<Item> HEB_248_TRISO_FUEL = ITEMS.register(
            "heb_248_triso_fuel", () -> new FissionFuelItem(new Item.Properties(), 86000, NRRConfig.CONFIG.HEB_248_TRISO_GENERATION_RATE::get, 312.0D));
    public static final DeferredItem<Item> HECF_249_FUEL = ITEMS.register(
            "hecf_249_fuel", () -> new FissionFuelItem(new Item.Properties(), 60000, NRRConfig.CONFIG.HECF_249_GENERATION_RATE::get, 696.0D));
    public static final DeferredItem<Item> HECF_249_OXIDE_FUEL = ITEMS.register(
            "hecf_249_oxide_fuel", () -> new FissionFuelItem(new Item.Properties(), 60000, NRRConfig.CONFIG.HECF_249_OXIDE_GENERATION_RATE::get, 870.0D));
    public static final DeferredItem<Item> HECF_249_TRISO_FUEL = ITEMS.register(
            "hecf_249_triso_fuel", () -> new FissionFuelItem(new Item.Properties(), 60000, NRRConfig.CONFIG.HECF_249_TRISO_GENERATION_RATE::get, 696.0D));
    public static final DeferredItem<Item> HECF_251_FUEL = ITEMS.register(
            "hecf_251_fuel", () -> new FissionFuelItem(new Item.Properties(), 58000, NRRConfig.CONFIG.HECF_251_GENERATION_RATE::get, 720.0D));
    public static final DeferredItem<Item> HECF_251_OXIDE_FUEL = ITEMS.register(
            "hecf_251_oxide_fuel", () -> new FissionFuelItem(new Item.Properties(), 58000, NRRConfig.CONFIG.HECF_251_OXIDE_GENERATION_RATE::get, 900.0D));
    public static final DeferredItem<Item> HECF_251_TRISO_FUEL = ITEMS.register(
            "hecf_251_triso_fuel", () -> new FissionFuelItem(new Item.Properties(), 58000, NRRConfig.CONFIG.HECF_251_TRISO_GENERATION_RATE::get, 720.0D));
    public static final DeferredItem<Item> DEPLETED_TBU_FUEL = ITEMS.register(
            "depleted_tbu_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_TBU_OXIDE_FUEL = ITEMS.register(
            "depleted_tbu_oxide_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_TBU_TRISO_FUEL = ITEMS.register(
            "depleted_tbu_triso_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_LEN_236_FUEL = ITEMS.register(
            "depleted_len_236_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_LEN_236_OXIDE_FUEL = ITEMS.register(
            "depleted_len_236_oxide_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_LEN_236_TRISO_FUEL = ITEMS.register(
            "depleted_len_236_triso_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_LEP_239_FUEL = ITEMS.register(
            "depleted_lep_239_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_LEP_239_OXIDE_FUEL = ITEMS.register(
            "depleted_lep_239_oxide_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_LEP_239_TRISO_FUEL = ITEMS.register(
            "depleted_lep_239_triso_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_LEU_235_FUEL = ITEMS.register(
            "depleted_leu_235_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_LEU_235_OXIDE_FUEL = ITEMS.register(
            "depleted_leu_235_oxide_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_LEU_235_TRISO_FUEL = ITEMS.register(
            "depleted_leu_235_triso_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_LEU_233_FUEL = ITEMS.register(
            "depleted_leu_233_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_LEU_233_OXIDE_FUEL = ITEMS.register(
            "depleted_leu_233_oxide_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_LEU_233_TRISO_FUEL = ITEMS.register(
            "depleted_leu_233_triso_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_LEP_241_FUEL = ITEMS.register(
            "depleted_lep_241_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_LEP_241_OXIDE_FUEL = ITEMS.register(
            "depleted_lep_241_oxide_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_LEP_241_TRISO_FUEL = ITEMS.register(
            "depleted_lep_241_triso_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_LEB_248_FUEL = ITEMS.register(
            "depleted_leb_248_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_LEB_248_OXIDE_FUEL = ITEMS.register(
            "depleted_leb_248_oxide_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_LEB_248_TRISO_FUEL = ITEMS.register(
            "depleted_leb_248_triso_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_LECM_247_FUEL = ITEMS.register(
            "depleted_lecm_247_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_LECM_247_OXIDE_FUEL = ITEMS.register(
            "depleted_lecm_247_oxide_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_LECM_247_TRISO_FUEL = ITEMS.register(
            "depleted_lecm_247_triso_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_LECM_245_FUEL = ITEMS.register(
            "depleted_lecm_245_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_LECM_245_OXIDE_FUEL = ITEMS.register(
            "depleted_lecm_245_oxide_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_LECM_245_TRISO_FUEL = ITEMS.register(
            "depleted_lecm_245_triso_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_LECM_243_FUEL = ITEMS.register(
            "depleted_lecm_243_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_LECM_243_OXIDE_FUEL = ITEMS.register(
            "depleted_lecm_243_oxide_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_LECM_243_TRISO_FUEL = ITEMS.register(
            "depleted_lecm_243_triso_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_LEA_242_FUEL = ITEMS.register(
            "depleted_lea_242_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_LEA_242_OXIDE_FUEL = ITEMS.register(
            "depleted_lea_242_oxide_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_LEA_242_TRISO_FUEL = ITEMS.register(
            "depleted_lea_242_triso_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_LECF_249_FUEL = ITEMS.register(
            "depleted_lecf_249_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_LECF_249_OXIDE_FUEL = ITEMS.register(
            "depleted_lecf_249_oxide_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_LECF_249_TRISO_FUEL = ITEMS.register(
            "depleted_lecf_249_triso_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_LECF_251_FUEL = ITEMS.register(
            "depleted_lecf_251_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_LECF_251_OXIDE_FUEL = ITEMS.register(
            "depleted_lecf_251_oxide_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_LECF_251_TRISO_FUEL = ITEMS.register(
            "depleted_lecf_251_triso_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_MOX_239_FUEL = ITEMS.register(
            "depleted_mox_239_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_MOX_239_OXIDE_FUEL = ITEMS.register(
            "depleted_mox_239_oxide_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_MOX_239_TRISO_FUEL = ITEMS.register(
            "depleted_mox_239_triso_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_MOX_241_FUEL = ITEMS.register(
            "depleted_mox_241_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_MOX_241_OXIDE_FUEL = ITEMS.register(
            "depleted_mox_241_oxide_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_MOX_241_TRISO_FUEL = ITEMS.register(
            "depleted_mox_241_triso_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_HEN_236_FUEL = ITEMS.register(
            "depleted_hen_236_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_HEN_236_OXIDE_FUEL = ITEMS.register(
            "depleted_hen_236_oxide_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_HEN_236_TRISO_FUEL = ITEMS.register(
            "depleted_hen_236_triso_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_HEP_239_FUEL = ITEMS.register(
            "depleted_hep_239_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_HEP_239_OXIDE_FUEL = ITEMS.register(
            "depleted_hep_239_oxide_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_HEP_239_TRISO_FUEL = ITEMS.register(
            "depleted_hep_239_triso_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_HEU_235_FUEL = ITEMS.register(
            "depleted_heu_235_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_HEU_235_OXIDE_FUEL = ITEMS.register(
            "depleted_heu_235_oxide_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_HEU_235_TRISO_FUEL = ITEMS.register(
            "depleted_heu_235_triso_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_HEU_233_FUEL = ITEMS.register(
            "depleted_heu_233_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_HEU_233_OXIDE_FUEL = ITEMS.register(
            "depleted_heu_233_oxide_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_HEU_233_TRISO_FUEL = ITEMS.register(
            "depleted_heu_233_triso_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_HEP_241_FUEL = ITEMS.register(
            "depleted_hep_241_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_HEP_241_OXIDE_FUEL = ITEMS.register(
            "depleted_hep_241_oxide_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_HEP_241_TRISO_FUEL = ITEMS.register(
            "depleted_hep_241_triso_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_HEA_242_FUEL = ITEMS.register(
            "depleted_hea_242_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_HEA_242_OXIDE_FUEL = ITEMS.register(
            "depleted_hea_242_oxide_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_HEA_242_TRISO_FUEL = ITEMS.register(
            "depleted_hea_242_triso_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_HECM_247_FUEL = ITEMS.register(
            "depleted_hecm_247_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_HECM_247_OXIDE_FUEL = ITEMS.register(
            "depleted_hecm_247_oxide_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_HECM_247_TRISO_FUEL = ITEMS.register(
            "depleted_hecm_247_triso_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_HECM_245_FUEL = ITEMS.register(
            "depleted_hecm_245_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_HECM_245_OXIDE_FUEL = ITEMS.register(
            "depleted_hecm_245_oxide_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_HECM_245_TRISO_FUEL = ITEMS.register(
            "depleted_hecm_245_triso_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_HECM_243_FUEL = ITEMS.register(
            "depleted_hecm_243_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_HECM_243_OXIDE_FUEL = ITEMS.register(
            "depleted_hecm_243_oxide_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_HECM_243_TRISO_FUEL = ITEMS.register(
            "depleted_hecm_243_triso_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_HEB_248_FUEL = ITEMS.register(
            "depleted_heb_248_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_HEB_248_OXIDE_FUEL = ITEMS.register(
            "depleted_heb_248_oxide_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_HEB_248_TRISO_FUEL = ITEMS.register(
            "depleted_heb_248_triso_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_HECF_249_FUEL = ITEMS.register(
            "depleted_hecf_249_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_HECF_249_OXIDE_FUEL = ITEMS.register(
            "depleted_hecf_249_oxide_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_HECF_249_TRISO_FUEL = ITEMS.register(
            "depleted_hecf_249_triso_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_HECF_251_FUEL = ITEMS.register(
            "depleted_hecf_251_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_HECF_251_OXIDE_FUEL = ITEMS.register(
            "depleted_hecf_251_oxide_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_HECF_251_TRISO_FUEL = ITEMS.register(
            "depleted_hecf_251_triso_fuel", () -> new BasicItem(new Item.Properties()));
    public static final DeferredItem<Item> MARSHMALLOW = ITEMS.register(
            "marshmallow", () -> new BasicItem(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(1)
                    .saturationModifier(0.4F)
                    .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 300, 0), 1.0F)
                    .build())));
    public static final DeferredItem<Item> GRAHAM_CRACKER = ITEMS.register(
            "graham_cracker", () -> new BasicItem(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(1)
                    .saturationModifier(0.2F)
                    .build())));
    public static final DeferredItem<Item> GROUND_COCOA_NIBS = ITEMS.register(
            "ground_cocoa_nibs", () -> new BasicItem(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(1)
                    .saturationModifier(0.2F)
                    .build())));
    public static final DeferredItem<Item> SOLIDIFIED_COCOA_BUTTER = ITEMS.register(
            "solidified_cocoa_butter", () -> new BasicItem(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(2)
                    .saturationModifier(0.1F)
                    .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 300, 0), 1.0F)
                    .build())));
    public static final DeferredItem<Item> UNSWEETENED_CHOCOLATE = ITEMS.register(
            "unsweetened_chocolate", () -> new BasicItem(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(2)
                    .saturationModifier(0.1F)
                    .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 300, 0), 1.0F)
                    .build())));
    public static final DeferredItem<Item> DARK_CHOCOLATE = ITEMS.register(
            "dark_chocolate", () -> new BasicItem(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(3)
                    .saturationModifier(0.8F)
                    .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 300, 0), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 300, 0), 1.0F)
                    .build())));
    public static final DeferredItem<Item> MILK_CHOCOLATE = ITEMS.register(
            "milk_chocolate", () -> new BasicItem(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(4)
                    .saturationModifier(0.8F)
                    .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 300, 0), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 300, 0), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 300, 0), 1.0F)
                    .build())));
    public static final DeferredItem<Item> SMORE = ITEMS.register(
            "smore", () -> new BasicItem(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(8)
                    .saturationModifier(1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 300, 1), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 300, 1), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 300, 1), 1.0F)
                    .build())));
    public static final DeferredItem<Item> SMORE_DOUBLE = ITEMS.register(
            "smore_double", () -> new BasicItem(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(20)
                    .saturationModifier(4.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 600, 1), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 1), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 600, 1), 1.0F)
                    .build())));
    public static final DeferredItem<Item> SMORE_QUADRUPLE = ITEMS.register(
            "smore_quadruple", () -> new BasicItem(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(44)
                    .saturationModifier(16.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 1200, 1), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 1), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 1200, 1), 1.0F)
                    .build())));
    public static final DeferredItem<Item> SMORE_OCTUPLE = ITEMS.register(
            "smore_octuple", () -> new BasicItem(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(92)
                    .saturationModifier(64.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 1200, 2), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 2), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 1200, 2), 1.0F)
                    .build())));
    public static final DeferredItem<Item> SMORE_SEXDECUPLE = ITEMS.register(
            "smore_sexdecuple", () -> new BasicItem(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(188)
                    .saturationModifier(256.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 2400, 2), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2400, 2), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 2400, 2), 1.0F)
                    .build())));
    public static final DeferredItem<Item> SMORE_DUOTRIGINTUPLE = ITEMS.register(
            "smore_duotrigintuple", () -> new BasicItem(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(380)
                    .saturationModifier(1024.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 4800, 2), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 4800, 2), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 4800, 2), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 4800, 2), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 4800, 0), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.WATER_BREATHING, 4800, 0), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.LUCK, 4800, 2), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.SATURATION, Integer.MAX_VALUE, 0), 1.0F)
                    .build())));
    public static final DeferredItem<Item> IO_CONFIGURATOR = ITEMS.register(
            "io_configurator", () -> new BasicItem(new Item.Properties().stacksTo(1).component(NRRDataComponents.CONFIGURATION_TYPE, ConfigurationTypes.DISABLE_ALL)) {
                @Override
                public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand usedHand) {
                    var stack = player.getItemInHand(usedHand);
                    if (!level.isClientSide()) {
                        if (player.isCrouching() && player.pick(5.0D, 1.0F, false).getType() == HitResult.Type.MISS) {
                            stack.set(NRRDataComponents.CONFIGURATION_TYPE, ConfigurationTypes.getNext(stack.getComponents().get(NRRDataComponents.CONFIGURATION_TYPE.get())));
                            player.sendSystemMessage(Component.translatable("message.nrreborn.io_configurator_switch_configuration_mode").append(switch (stack.getComponents().get(NRRDataComponents.CONFIGURATION_TYPE.get())) {
                                case ConfigurationTypes.INPUT_ITEM_SLOT_1 -> Component.translatable("tooltip.nrreborn.io_configurator_configure_input_item_slot_1").withColor(5636095);
                                case ConfigurationTypes.INPUT_ITEM_SLOT_2 -> Component.translatable("tooltip.nrreborn.io_configurator_configure_input_item_slot_2").withColor(5636095);
                                case ConfigurationTypes.INPUT_ITEM_SLOT_3 -> Component.translatable("tooltip.nrreborn.io_configurator_configure_input_item_slot_3").withColor(5636095);
                                case ConfigurationTypes.INPUT_ITEM_SLOT_4 -> Component.translatable("tooltip.nrreborn.io_configurator_configure_input_item_slot_4").withColor(5636095);
                                case ConfigurationTypes.OUTPUT_ITEM_SLOT_1 -> Component.translatable("tooltip.nrreborn.io_configurator_configure_output_item_slot_1").withColor(16755200);
                                case ConfigurationTypes.OUTPUT_ITEM_SLOT_2 -> Component.translatable("tooltip.nrreborn.io_configurator_configure_output_item_slot_2").withColor(16755200);
                                case ConfigurationTypes.OUTPUT_ITEM_SLOT_3 -> Component.translatable("tooltip.nrreborn.io_configurator_configure_output_item_slot_3").withColor(16755200);
                                case ConfigurationTypes.OUTPUT_ITEM_SLOT_4 -> Component.translatable("tooltip.nrreborn.io_configurator_configure_output_item_slot_4").withColor(16755200);
                                default -> Component.translatable("tooltip.nrreborn.io_configurator_disable_all").withColor(16733525);
                            }));
                        }
                    }
                    return InteractionResultHolder.success(stack);
                }

                @Override
                public void appendHoverText(@NotNull ItemStack stack, @NotNull TooltipContext context, @NotNull List<Component> tooltipComponents, @NotNull TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.io_configurator_current_mode").withColor(11184810).append(switch (stack.getComponents().get(NRRDataComponents.CONFIGURATION_TYPE.get())) {
                        case ConfigurationTypes.INPUT_ITEM_SLOT_1 -> Component.translatable("tooltip.nrreborn.io_configurator_configure_input_item_slot_1").withColor(5636095);
                        case ConfigurationTypes.INPUT_ITEM_SLOT_2 -> Component.translatable("tooltip.nrreborn.io_configurator_configure_input_item_slot_2").withColor(5636095);
                        case ConfigurationTypes.INPUT_ITEM_SLOT_3 -> Component.translatable("tooltip.nrreborn.io_configurator_configure_input_item_slot_3").withColor(5636095);
                        case ConfigurationTypes.INPUT_ITEM_SLOT_4 -> Component.translatable("tooltip.nrreborn.io_configurator_configure_input_item_slot_4").withColor(5636095);
                        case ConfigurationTypes.OUTPUT_ITEM_SLOT_1 -> Component.translatable("tooltip.nrreborn.io_configurator_configure_output_item_slot_1").withColor(16755200);
                        case ConfigurationTypes.OUTPUT_ITEM_SLOT_2 -> Component.translatable("tooltip.nrreborn.io_configurator_configure_output_item_slot_2").withColor(16755200);
                        case ConfigurationTypes.OUTPUT_ITEM_SLOT_3 -> Component.translatable("tooltip.nrreborn.io_configurator_configure_output_item_slot_3").withColor(16755200);
                        case ConfigurationTypes.OUTPUT_ITEM_SLOT_4 -> Component.translatable("tooltip.nrreborn.io_configurator_configure_output_item_slot_4").withColor(16755200);
                        default -> Component.translatable("tooltip.nrreborn.io_configurator_disable_all").withColor(16733525);
                    }));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }

                @Override
                public InteractionResult useOn(UseOnContext context) {
                    if (!context.getLevel().isClientSide()) {
                        if (context.getLevel().getBlockEntity(context.getClickedPos()) instanceof NRRWrappedMachineBlockEntity blockEntity) {
                            context.getLevel().invalidateCapabilities(context.getClickedPos());
                            blockEntity.setChanged();
                            if (!context.getPlayer().isCrouching()) {
                                if (context.getItemInHand().getComponents().get(NRRDataComponents.CONFIGURATION_TYPE.get()) == ConfigurationTypes.DISABLE_ALL) {
                                    for (int i = 0; i < blockEntity.inputSideConfiguration.length; i++) {
                                        Arrays.fill(blockEntity.inputSideConfiguration[i], false);
                                    }
                                    for (int i = 0; i < blockEntity.outputSideConfiguration.length; i++) {
                                        Arrays.fill(blockEntity.outputSideConfiguration[i], false);
                                    }
                                    context.getPlayer().sendSystemMessage(Component.translatable("message.nrreborn.block_disable_all_sides"));
                                } else if (context.getItemInHand().getComponents().get(NRRDataComponents.CONFIGURATION_TYPE.get()) >= ConfigurationTypes.INPUT_ITEM_SLOT_1 &&
                                        context.getItemInHand().getComponents().get(NRRDataComponents.CONFIGURATION_TYPE.get()) <= ConfigurationTypes.INPUT_ITEM_SLOT_4) {
                                    blockEntity.inputSideConfiguration[context.getClickedFace().get3DDataValue()][context.getItemInHand().getComponents().get(NRRDataComponents.CONFIGURATION_TYPE.get()) - 1] =
                                            !blockEntity.inputSideConfiguration[context.getClickedFace().get3DDataValue()][context.getItemInHand().getComponents().get(NRRDataComponents.CONFIGURATION_TYPE.get()) - 1];
                                } else {
                                    blockEntity.outputSideConfiguration[context.getClickedFace().get3DDataValue()][context.getItemInHand().getComponents().get(NRRDataComponents.CONFIGURATION_TYPE.get()) - 5] =
                                            !blockEntity.outputSideConfiguration[context.getClickedFace().get3DDataValue()][context.getItemInHand().getComponents().get(NRRDataComponents.CONFIGURATION_TYPE.get()) - 5];
                                }
                            } else {
                                if (context.getItemInHand().getComponents().get(NRRDataComponents.CONFIGURATION_TYPE.get()) == ConfigurationTypes.DISABLE_ALL) {
                                    for (int i = 0; i < blockEntity.inputSideConfiguration.length; i++) {
                                        Arrays.fill(blockEntity.inputSideConfiguration[i], false);
                                    }
                                    for (int i = 0; i < blockEntity.outputSideConfiguration.length; i++) {
                                        Arrays.fill(blockEntity.outputSideConfiguration[i], false);
                                    }
                                    context.getPlayer().sendSystemMessage(Component.translatable("message.nrreborn.block_disable_all_sides"));
                                } else if (context.getItemInHand().getComponents().get(NRRDataComponents.CONFIGURATION_TYPE.get()) >= ConfigurationTypes.INPUT_ITEM_SLOT_1 &&
                                        context.getItemInHand().getComponents().get(NRRDataComponents.CONFIGURATION_TYPE.get()) <= ConfigurationTypes.INPUT_ITEM_SLOT_4) {
                                    blockEntity.inputSideConfiguration[context.getClickedFace().getOpposite().get3DDataValue()][context.getItemInHand().getComponents().get(NRRDataComponents.CONFIGURATION_TYPE.get()) - 1] =
                                            !blockEntity.inputSideConfiguration[context.getClickedFace().getOpposite().get3DDataValue()][context.getItemInHand().getComponents().get(NRRDataComponents.CONFIGURATION_TYPE.get()) - 1];
                                } else {
                                    blockEntity.outputSideConfiguration[context.getClickedFace().getOpposite().get3DDataValue()][context.getItemInHand().getComponents().get(NRRDataComponents.CONFIGURATION_TYPE.get()) - 5] =
                                            !blockEntity.outputSideConfiguration[context.getClickedFace().getOpposite().get3DDataValue()][context.getItemInHand().getComponents().get(NRRDataComponents.CONFIGURATION_TYPE.get()) - 5];
                                }
                            }
                        }
                    }
                    return InteractionResult.SUCCESS;
                }
            });
    public static final DeferredItem<Item> PORTABLE_COBBLESTONE_GENERATOR = ITEMS.register(
            "portable_cobblestone_generator", () -> new BasicItem(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> PORTABLE_ENDER_CHEST = ITEMS.register(
            "portable_ender_chest", () -> new BasicItem(new Item.Properties().stacksTo(1)) {
                @Override
                public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand usedHand) {
                    var stack = player.getItemInHand(usedHand);
                    var enderChestInventory = player.getEnderChestInventory();
                    if (!level.isClientSide()) {
                        player.openMenu(new SimpleMenuProvider((id, playerInventory, inventory) -> ChestMenu.threeRows(id, playerInventory, enderChestInventory),
                                Component.translatable("container.enderchest")));
                        player.awardStat(Stats.OPEN_ENDERCHEST);
                    }
                    return InteractionResultHolder.success(stack);
                }
            });

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
