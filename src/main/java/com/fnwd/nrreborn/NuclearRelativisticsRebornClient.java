package com.fnwd.nrreborn;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

@Mod(value = NuclearRelativisticsReborn.MODID, dist = Dist.CLIENT)
public class NuclearRelativisticsRebornClient {
    public NuclearRelativisticsRebornClient(ModContainer container) {
        container.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
        container.registerConfig(ModConfig.Type.COMMON, NRRConfig.SPEC);
    }
}
