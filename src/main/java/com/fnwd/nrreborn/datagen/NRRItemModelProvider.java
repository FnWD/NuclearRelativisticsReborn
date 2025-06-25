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
    }
}
