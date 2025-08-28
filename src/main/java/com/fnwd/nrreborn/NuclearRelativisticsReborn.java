package com.fnwd.nrreborn;

import com.fnwd.nrreborn.block.NRRBlocks;
import com.fnwd.nrreborn.block_entity.NRRBlockEntities;
import com.fnwd.nrreborn.block_entity.manufactory.ManufactoryBlockEntity;
import com.fnwd.nrreborn.data_component.NRRDataComponents;
import com.fnwd.nrreborn.item.NRRCreativeModeTabs;
import com.fnwd.nrreborn.item.NRRItems;
import com.fnwd.nrreborn.recipe.NRRRecipes;
import com.fnwd.nrreborn.screen.NRRMenuTypes;
import com.fnwd.nrreborn.screen.manufactory.ManufactoryScreen;
import com.fnwd.nrreborn.util.CTags;
import com.mojang.logging.LogUtils;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
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
import net.neoforged.neoforge.event.tick.EntityTickEvent;
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
        NRRDataComponents.register(modEventBus);
        modEventBus.addListener(this::registerCapabilities);
        LOGGER.info("Loaded NRR mod successfully");
    }

    private void commonSetup(FMLCommonSetupEvent event) {

    }

    private void registerCapabilities(RegisterCapabilitiesEvent event) {
        event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, NRRBlockEntities.MANUFACTORY_BLOCK_ENTITY.get(),
                ManufactoryBlockEntity::getInventory);
        event.registerBlockEntity(Capabilities.EnergyStorage.BLOCK, NRRBlockEntities.MANUFACTORY_BLOCK_ENTITY.get(),
                (blockEntity, direction) -> blockEntity.getEnergyStorage());
        event.registerBlockEntity(Capabilities.EnergyStorage.BLOCK, NRRBlockEntities.BASIC_SOLAR_PANEL_BLOCK_ENTITY.get(),
                (blockEntity, direction) -> blockEntity.getEnergyStorage());
        event.registerBlockEntity(Capabilities.EnergyStorage.BLOCK, NRRBlockEntities.ADVANCED_SOLAR_PANEL_BLOCK_ENTITY.get(),
                (blockEntity, direction) -> blockEntity.getEnergyStorage());
        event.registerBlockEntity(Capabilities.EnergyStorage.BLOCK, NRRBlockEntities.DEPLETED_URANIUM_SOLAR_PANEL_BLOCK_ENTITY.get(),
                (blockEntity, direction) -> blockEntity.getEnergyStorage());
        event.registerBlockEntity(Capabilities.EnergyStorage.BLOCK, NRRBlockEntities.ELITE_SOLAR_PANEL_BLOCK_ENTITY.get(),
                (blockEntity, direction) -> blockEntity.getEnergyStorage());
        event.registerBlockEntity(Capabilities.EnergyStorage.BLOCK, NRRBlockEntities.URANIUM_RTG_BLOCK_ENTITY.get(),
                (blockEntity, direction) -> blockEntity.getEnergyStorage());
        event.registerBlockEntity(Capabilities.EnergyStorage.BLOCK, NRRBlockEntities.PLUTONIUM_RTG_BLOCK_ENTITY.get(),
                (blockEntity, direction) -> blockEntity.getEnergyStorage());
        event.registerBlockEntity(Capabilities.EnergyStorage.BLOCK, NRRBlockEntities.AMERICIUM_RTG_BLOCK_ENTITY.get(),
                (blockEntity, direction) -> blockEntity.getEnergyStorage());
        event.registerBlockEntity(Capabilities.EnergyStorage.BLOCK, NRRBlockEntities.CALIFORNIUM_RTG_BLOCK_ENTITY.get(),
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

    @SubscribeEvent
    public void onItemEntityTick(EntityTickEvent.Post event) {
        Entity entity = event.getEntity();
        if (entity instanceof ItemEntity itemEntity) {
            ItemStack stack = itemEntity.getItem();
            if (stack.is(CTags.Items.INGOTS_LITHIUM) || stack.is(CTags.Items.DUSTS_LITHIUM)) {
                if (itemEntity.isInWaterRainOrBubble()) {
                    Level level = itemEntity.level();
                    if (!level.isClientSide()) {
                        level.explode(
                                null,
                                itemEntity.getX(),
                                itemEntity.getY(),
                                itemEntity.getZ(),
                                5.0F,
                                Level.ExplosionInteraction.TNT);
                        itemEntity.discard();
                    }
                }
            }
        }
    }
}
