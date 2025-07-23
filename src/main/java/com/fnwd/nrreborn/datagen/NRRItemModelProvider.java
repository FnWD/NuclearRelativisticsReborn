package com.fnwd.nrreborn.datagen;

import com.fnwd.nrreborn.NuclearRelativisticsReborn;
import com.fnwd.nrreborn.item.NRRItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class NRRItemModelProvider extends ItemModelProvider {
    public NRRItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, NuclearRelativisticsReborn.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(NRRItems.TIN_INGOT.get());
        basicItem(NRRItems.ALUMINUM_INGOT.get());
        basicItem(NRRItems.SILVER_INGOT.get());
        basicItem(NRRItems.LEAD_INGOT.get());
        basicItem(NRRItems.MAGNESIUM_INGOT.get());
        basicItem(NRRItems.LITHIUM_INGOT.get());
        basicItem(NRRItems.BORON_INGOT.get());
        basicItem(NRRItems.BERYLLIUM_INGOT.get());
        basicItem(NRRItems.ZIRCONIUM_INGOT.get());
        basicItem(NRRItems.THORIUM_INGOT.get());
        basicItem(NRRItems.URANIUM_INGOT.get());
        basicItem(NRRItems.THORIUM_OXIDE_INGOT.get());
        basicItem(NRRItems.URANIUM_OXIDE_INGOT.get());
        basicItem(NRRItems.MANGANESE_INGOT.get());
        basicItem(NRRItems.MANGANESE_OXIDE_INGOT.get());
        basicItem(NRRItems.MANGANESE_DIOXIDE_INGOT.get());
        /*basicItem(NRRItems.GRAPHITE_INGOT.get());
        basicItem(NRRItems.BRONZE_INGOT.get());
        basicItem(NRRItems.STEEL_INGOT.get());
        basicItem(NRRItems.FERROBORON_ALLOY_INGOT.get());
        basicItem(NRRItems.TOUGH_ALLOY_INGOT.get());
        basicItem(NRRItems.EXTREME_ALLOY_INGOT.get());
        basicItem(NRRItems.THERMOCONDUCTING_ALLOY_INGOT.get());
        basicItem(NRRItems.HARD_CARBON_ALLOY_INGOT.get());
        basicItem(NRRItems.SHIBUICHI_ALLOY_INGOT.get());
        basicItem(NRRItems.TIN_SILVER_ALLOY_INGOT.get());
        basicItem(NRRItems.LEAD_PLATINUM_ALLOY_INGOT.get());
        basicItem(NRRItems.ZIRCALOY_INGOT.get());
        basicItem(NRRItems.HSLA_STEEL_INGOT.get());
        basicItem(NRRItems.MAGNESIUM_DIBORIDE_ALLOY_INGOT.get());
        basicItem(NRRItems.LITHIUM_MANGANESE_DIOXIDE_ALLOY_INGOT.get());
        basicItem(NRRItems.SILICON_CARBIDE_INGOT.get());
        basicItem(NRRItems.SIC_SIC_CERAMIC_MATRIX_COMPOSITE.get());
        basicItem(NRRItems.RHODOCHROSITE.get());
        basicItem(NRRItems.CUBIC_BORON_NITRIDE.get());
        basicItem(NRRItems.FLUORITE.get());
        basicItem(NRRItems.VILLIAUMITE.get());
        basicItem(NRRItems.CAROBBIITE.get());
        basicItem(NRRItems.BORON_ARSENIDE.get());
        basicItem(NRRItems.SILICON.get());
        basicItem(NRRItems.TIN_DUST.get());
        basicItem(NRRItems.ALUMINUM_DUST.get());
        basicItem(NRRItems.SILVER_DUST.get());
        basicItem(NRRItems.LEAD_DUST.get());
        basicItem(NRRItems.MAGNESIUM_DUST.get());
        basicItem(NRRItems.LITHIUM_DUST.get());
        basicItem(NRRItems.BORON_DUST.get());
        basicItem(NRRItems.BERYLLIUM_DUST.get());
        basicItem(NRRItems.ZIRCONIUM_DUST.get());
        basicItem(NRRItems.THORIUM_DUST.get());
        basicItem(NRRItems.URANIUM_DUST.get());
        basicItem(NRRItems.THORIUM_OXIDE_DUST.get());
        basicItem(NRRItems.URANIUM_OXIDE_DUST.get());
        basicItem(NRRItems.MANGANESE_DUST.get());
        basicItem(NRRItems.MANGANESE_OXIDE_DUST.get());
        basicItem(NRRItems.MANGANESE_DIOXIDE_DUST.get());
        basicItem(NRRItems.GRAPHITE_DUST.get());
        basicItem(NRRItems.COAL_DUST.get());
        basicItem(NRRItems.DIAMOND_DUST.get());
        basicItem(NRRItems.QUARTZ_DUST.get());
        basicItem(NRRItems.OBSIDIAN_DUST.get());
        basicItem(NRRItems.END_STONE_DUST.get());
        basicItem(NRRItems.SULFUR_DUST.get());
        basicItem(NRRItems.RHODOCHROSITE_DUST.get());
        basicItem(NRRItems.HEXAGONAL_BORON_NITRIDE.get());
        basicItem(NRRItems.FLUORITE_DUST.get());
        basicItem(NRRItems.VILLIAUMITE_DUST.get());
        basicItem(NRRItems.CAROBBIITE_DUST.get());
        basicItem(NRRItems.ARSENIC_DUST.get());
        basicItem(NRRItems.ENERGETIC_BLEND.get());
        basicItem(NRRItems.DIMENSIONAL_BLEND.get());
        basicItem(NRRItems.CARBON_MANGANESE_BLEND.get());
        basicItem(NRRItems.CRYSTAL_BINDER.get());
        basicItem(NRRItems.ALUGENTUM_DUST.get());
        basicItem(NRRItems.BORAX.get());
        basicItem(NRRItems.CALCIUM_SULFATE.get());
        basicItem(NRRItems.SODIUM_FLUORIDE.get());
        basicItem(NRRItems.POTASSIUM_FLUORIDE.get());
        basicItem(NRRItems.SODIUM_HYDROXIDE.get());
        basicItem(NRRItems.POTASSIUM_HYDROXIDE.get());*/
        basicItem(NRRItems.RAW_TIN.get());
        basicItem(NRRItems.RAW_LEAD.get());
        basicItem(NRRItems.RAW_MAGNESIUM.get());
        basicItem(NRRItems.RAW_LITHIUM.get());
        basicItem(NRRItems.RAW_BORON.get());
        basicItem(NRRItems.RAW_THORIUM.get());
        basicItem(NRRItems.RAW_URANIUM.get());
        /*basicItem(NRRItems.BASIC_PLATING.get());
        basicItem(NRRItems.ADVANCED_PLATING.get());
        basicItem(NRRItems.DEPLETED_URANIUM_PLATING.get());
        basicItem(NRRItems.ELITE_PLATING.get());
        basicItem(NRRItems.COPPER_SOLENOID.get());
        basicItem(NRRItems.MAGNESIUM_DIBORIDE_SOLENOID.get());
        basicItem(NRRItems.SERVOMECHANISM.get());
        basicItem(NRRItems.ELECTRIC_MOTOR.get());
        basicItem(NRRItems.LINEAR_ACTUATOR.get());
        basicItem(NRRItems.BIOPLASTIC.get());
        basicItem(NRRItems.GELATIN.get());*/
        basicItem(NRRItems.SPEED_UPGRADE.get());
        basicItem(NRRItems.ENERGY_UPGRADE.get());
        /*basicItem(NRRItems.IO_CONFIGURATOR.get());*/
    }
}
