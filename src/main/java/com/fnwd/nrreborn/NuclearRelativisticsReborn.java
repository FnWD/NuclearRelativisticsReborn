package com.fnwd.nrreborn;

import com.fnwd.nrreborn.block.NRRBlocks;
import com.fnwd.nrreborn.block.entity.NRRBlockEntities;
import com.fnwd.nrreborn.item.NRRCreativeModeTabs;
import com.fnwd.nrreborn.item.NRRItems;
import com.fnwd.nrreborn.recipe.NRRRecipes;
import com.fnwd.nrreborn.screen.NRRMenuTypes;
import com.fnwd.nrreborn.screen.custom.ManufactoryScreen;
import com.mojang.logging.LogUtils;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;

@Mod(NuclearRelativisticsReborn.MODID)
public class NuclearRelativisticsReborn {
    public static final String MODID = "nrreborn";
    public static final Logger LOGGER = LogUtils.getLogger();

    public NuclearRelativisticsReborn(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);
        NeoForge.EVENT_BUS.register(this);
        NRRCreativeModeTabs.register(modEventBus);
        NRRItems.register(modEventBus);
        NRRBlocks.register(modEventBus);
        NRRBlockEntities.register(modEventBus);
        NRRMenuTypes.register(modEventBus);
        NRRRecipes.register(modEventBus);
        modEventBus.addListener(this::registerCapabilities);
        LOGGER.info("Loaded NRR mod successfully");
    }

    private void commonSetup(FMLCommonSetupEvent event) {

    }

    private void registerCapabilities(RegisterCapabilitiesEvent event) {
        event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, NRRBlockEntities.MANUFACTORY_BLOCK_ENTITY.get(),
                (blockEntity, direction) -> blockEntity.getInventory());
        event.registerBlockEntity(Capabilities.EnergyStorage.BLOCK, NRRBlockEntities.MANUFACTORY_BLOCK_ENTITY.get(),
                (blockEntity, direction) -> blockEntity.getEnergyStorage());
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    @EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }

        @SubscribeEvent
        public static void registerScreens(RegisterMenuScreensEvent event) {
            event.register(NRRMenuTypes.MANUFACTORY_MENU.get(), ManufactoryScreen::new);
        }
    }
}
