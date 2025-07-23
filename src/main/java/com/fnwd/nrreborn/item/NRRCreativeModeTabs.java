package com.fnwd.nrreborn.item;

import com.fnwd.nrreborn.NuclearRelativisticsReborn;
import com.fnwd.nrreborn.block.NRRBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class NRRCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(
            Registries.CREATIVE_MODE_TAB, NuclearRelativisticsReborn.MODID);

    public static final Supplier<CreativeModeTab> NRR_INGREDIENTS = CREATIVE_MODE_TAB.register(
            "nrr_ingredients", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(NRRItems.URANIUM_INGOT.get()))
                    .title(Component.translatable("creativemodetab.nrreborn.nrr_ingredients"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(NRRItems.TIN_INGOT);
                        output.accept(NRRItems.ALUMINUM_INGOT);
                        output.accept(NRRItems.SILVER_INGOT);
                        output.accept(NRRItems.LEAD_INGOT);
                        output.accept(NRRItems.MAGNESIUM_INGOT);
                        output.accept(NRRItems.LITHIUM_INGOT);
                        output.accept(NRRItems.BORON_INGOT);
                        output.accept(NRRItems.BERYLLIUM_INGOT);
                        output.accept(NRRItems.ZIRCONIUM_INGOT);
                        output.accept(NRRItems.THORIUM_INGOT);
                        output.accept(NRRItems.URANIUM_INGOT);
                        output.accept(NRRItems.THORIUM_OXIDE_INGOT);
                        output.accept(NRRItems.URANIUM_OXIDE_INGOT);
                        output.accept(NRRItems.MANGANESE_INGOT);
                        output.accept(NRRItems.MANGANESE_OXIDE_INGOT);
                        output.accept(NRRItems.MANGANESE_DIOXIDE_INGOT);
                        output.accept(NRRItems.GRAPHITE_INGOT);
                        output.accept(NRRItems.BRONZE_INGOT);
                        output.accept(NRRItems.STEEL_INGOT);
                        output.accept(NRRItems.FERROBORON_ALLOY_INGOT);
                        output.accept(NRRItems.TOUGH_ALLOY_INGOT);
                        output.accept(NRRItems.EXTREME_ALLOY_INGOT);
                        output.accept(NRRItems.THERMOCONDUCTING_ALLOY_INGOT);
                        output.accept(NRRItems.HARD_CARBON_ALLOY_INGOT);
                        output.accept(NRRItems.SHIBUICHI_ALLOY_INGOT);
                        output.accept(NRRItems.TIN_SILVER_ALLOY_INGOT);
                        output.accept(NRRItems.LEAD_PLATINUM_ALLOY_INGOT);
                        output.accept(NRRItems.ZIRCALOY_INGOT);
                        output.accept(NRRItems.HSLA_STEEL_INGOT);
                        output.accept(NRRItems.MAGNESIUM_DIBORIDE_ALLOY_INGOT);
                        output.accept(NRRItems.LITHIUM_MANGANESE_DIOXIDE_ALLOY_INGOT);
                        output.accept(NRRItems.SILICON_CARBIDE_INGOT);
                        output.accept(NRRItems.SIC_SIC_CERAMIC_MATRIX_COMPOSITE);
                        output.accept(NRRItems.RHODOCHROSITE);
                        output.accept(NRRItems.CUBIC_BORON_NITRIDE);
                        output.accept(NRRItems.FLUORITE);
                        output.accept(NRRItems.VILLIAUMITE);
                        output.accept(NRRItems.CAROBBIITE);
                        output.accept(NRRItems.BORON_ARSENIDE);
                        output.accept(NRRItems.SILICON);
                        output.accept(NRRItems.TIN_DUST);
                        output.accept(NRRItems.ALUMINUM_DUST);
                        output.accept(NRRItems.SILVER_DUST);
                        output.accept(NRRItems.LEAD_DUST);
                        output.accept(NRRItems.MAGNESIUM_DUST);
                        output.accept(NRRItems.LITHIUM_DUST);
                        output.accept(NRRItems.BORON_DUST);
                        output.accept(NRRItems.BERYLLIUM_DUST);
                        output.accept(NRRItems.ZIRCONIUM_DUST);
                        output.accept(NRRItems.THORIUM_DUST);
                        output.accept(NRRItems.URANIUM_DUST);
                        output.accept(NRRItems.THORIUM_OXIDE_DUST);
                        output.accept(NRRItems.URANIUM_OXIDE_DUST);
                        output.accept(NRRItems.MANGANESE_DUST);
                        output.accept(NRRItems.MANGANESE_OXIDE_DUST);
                        output.accept(NRRItems.MANGANESE_DIOXIDE_DUST);
                        output.accept(NRRItems.GRAPHITE_DUST);
                        output.accept(NRRItems.COAL_DUST);
                        output.accept(NRRItems.DIAMOND_DUST);
                        output.accept(NRRItems.QUARTZ_DUST);
                        output.accept(NRRItems.OBSIDIAN_DUST);
                        output.accept(NRRItems.END_STONE_DUST);
                        output.accept(NRRItems.SULFUR_DUST);
                        output.accept(NRRItems.RHODOCHROSITE_DUST);
                        output.accept(NRRItems.HEXAGONAL_BORON_NITRIDE);
                        output.accept(NRRItems.FLUORITE_DUST);
                        output.accept(NRRItems.VILLIAUMITE_DUST);
                        output.accept(NRRItems.CAROBBIITE_DUST);
                        output.accept(NRRItems.ARSENIC_DUST);
                        output.accept(NRRItems.ENERGETIC_BLEND);
                        output.accept(NRRItems.DIMENSIONAL_BLEND);
                        output.accept(NRRItems.CARBON_MANGANESE_BLEND);
                        output.accept(NRRItems.CRYSTAL_BINDER);
                        output.accept(NRRItems.ALUGENTUM_DUST);
                        output.accept(NRRItems.BORAX);
                        output.accept(NRRItems.CALCIUM_SULFATE);
                        output.accept(NRRItems.SODIUM_FLUORIDE);
                        output.accept(NRRItems.POTASSIUM_FLUORIDE);
                        output.accept(NRRItems.SODIUM_HYDROXIDE);
                        output.accept(NRRItems.POTASSIUM_HYDROXIDE);
                        output.accept(NRRItems.RAW_TIN);
                        output.accept(NRRItems.RAW_LEAD);
                        output.accept(NRRItems.RAW_MAGNESIUM);
                        output.accept(NRRItems.RAW_LITHIUM);
                        output.accept(NRRItems.RAW_BORON);
                        output.accept(NRRItems.RAW_THORIUM);
                        output.accept(NRRItems.RAW_URANIUM);
                        output.accept(NRRItems.BASIC_PLATING);
                        output.accept(NRRItems.ADVANCED_PLATING);
                        output.accept(NRRItems.DEPLETED_URANIUM_PLATING);
                        output.accept(NRRItems.ELITE_PLATING);
                        output.accept(NRRItems.COPPER_SOLENOID);
                        output.accept(NRRItems.MAGNESIUM_DIBORIDE_SOLENOID);
                        output.accept(NRRItems.SERVOMECHANISM);
                        output.accept(NRRItems.ELECTRIC_MOTOR);
                        output.accept(NRRItems.LINEAR_ACTUATOR);
                        output.accept(NRRItems.BIOPLASTIC);
                        output.accept(NRRItems.GELATIN);
                        output.accept(NRRItems.SPEED_UPGRADE);
                        output.accept(NRRItems.ENERGY_UPGRADE);
                        output.accept(NRRBlocks.TIN_ORE);
                        output.accept(NRRBlocks.DEEPSLATE_TIN_ORE);
                        output.accept(NRRBlocks.LEAD_ORE);
                        output.accept(NRRBlocks.DEEPSLATE_LEAD_ORE);
                        output.accept(NRRBlocks.MAGNESIUM_ORE);
                        output.accept(NRRBlocks.DEEPSLATE_MAGNESIUM_ORE);
                        output.accept(NRRBlocks.LITHIUM_ORE);
                        output.accept(NRRBlocks.DEEPSLATE_LITHIUM_ORE);
                        output.accept(NRRBlocks.BORON_ORE);
                        output.accept(NRRBlocks.DEEPSLATE_BORON_ORE);
                        output.accept(NRRBlocks.THORIUM_ORE);
                        output.accept(NRRBlocks.DEEPSLATE_THORIUM_ORE);
                        output.accept(NRRBlocks.URANIUM_ORE);
                        output.accept(NRRBlocks.DEEPSLATE_URANIUM_ORE);
                    }).build());
    public static final Supplier<CreativeModeTab> NRR_MACHINES = CREATIVE_MODE_TAB.register(
            "nrr_machines", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(NRRBlocks.MANUFACTORY))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(NuclearRelativisticsReborn.MODID, "nrr_ingredients"))
                    .title(Component.translatable("creativemodetab.nrreborn.nrr_machines"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(NRRBlocks.MANUFACTORY);
                    }).build());
    public static final Supplier<CreativeModeTab> NRR_TOOLS_AND_WEAPONS = CREATIVE_MODE_TAB.register(
            "nrr_tools_and_weapons", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(NRRItems.IO_CONFIGURATOR.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(NuclearRelativisticsReborn.MODID, "nrr_machines"))
                    .title(Component.translatable("creativemodetab.nrreborn.nrr_tools_and_weapons"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(NRRItems.IO_CONFIGURATOR);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
