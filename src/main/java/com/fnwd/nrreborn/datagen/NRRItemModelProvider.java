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
    }
}
