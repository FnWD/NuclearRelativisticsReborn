package com.fnwd.nrreborn;

import com.fnwd.nrreborn.block.NRRBlocks;
import com.fnwd.nrreborn.block_entity.NRRBlockEntities;
import com.fnwd.nrreborn.block_entity.manufactory.ManufactoryBlockEntity;
import com.fnwd.nrreborn.client.screen.NRRMenuTypes;
import com.fnwd.nrreborn.client.screen.manufactory.ManufactoryScreen;
import com.fnwd.nrreborn.data_component.NRRDataComponents;
import com.fnwd.nrreborn.fluid.NRRFluids;
import com.fnwd.nrreborn.item.NRRCreativeModeTabs;
import com.fnwd.nrreborn.item.NRRItems;
import com.fnwd.nrreborn.particle.NRRParticles;
import com.fnwd.nrreborn.recipe.CommonRecipeInjector;
import com.fnwd.nrreborn.recipe.NRRRecipes;
import com.fnwd.nrreborn.recipe.manufactory.ManufactoryRecipeInput;
import com.fnwd.nrreborn.util.NRRCommands;
import com.fnwd.nrreborn.util.pack.NRRPackResources;
import com.fnwd.nrreborn.util.pack.NRRRepositorySource;
import com.fnwd.nrreborn.util.tag.NRRTags;
import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mojang.logging.LogUtils;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.level.Level;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.AddPackFindersEvent;
import net.neoforged.neoforge.event.RegisterCommandsEvent;
import net.neoforged.neoforge.event.TagsUpdatedEvent;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.neoforge.event.server.ServerStartedEvent;
import net.neoforged.neoforge.event.tick.EntityTickEvent;
import net.neoforged.neoforge.registries.NewRegistryEvent;
import net.neoforged.neoforge.registries.RegistryBuilder;
import net.neoforged.neoforge.resource.ResourcePackLoader;
import net.neoforged.neoforge.server.ServerLifecycleHooks;
import org.slf4j.Logger;

@Mod(NuclearRelativisticsReborn.MODID)
public class NuclearRelativisticsReborn {
    public static final String MODID = "nrreborn";
    public static final Logger LOGGER = LogUtils.getLogger();
    public static final Gson GSON = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
    public static final Component DEBUG_HEAD = Component.literal("[").withColor(16733525)
            .append(Component.literal("NRR Debug").withColor(16755200))
            .append(Component.literal("] ").withColor(16733525));
    private static final NRRPackResources PACK_RESOURCES = new NRRPackResources("nrreborn:dynamic_data", PackType.SERVER_DATA);
    private static AddPackFindersEvent addPackFindersEventCopy;

    public NuclearRelativisticsReborn(IEventBus modEventBus, ModContainer modContainer) {
        NeoForge.EVENT_BUS.register(this);
        modContainer.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
        modContainer.registerConfig(ModConfig.Type.COMMON, NRRConfig.SPEC);
        modEventBus.addListener(this::registerCapabilities);
        modEventBus.addListener(this::addPackFinders);
        modEventBus.addListener(this::onNewRegistry);
        NRRCreativeModeTabs.register(modEventBus);
        NRRItems.register(modEventBus);
        NRRBlocks.register(modEventBus);
        NRRBlockEntities.register(modEventBus);
        NRRFluids.register(modEventBus);
        NRRMenuTypes.register(modEventBus);
        NRRRecipes.register(modEventBus);
        NRRDataComponents.register(modEventBus);
        NRRParticles.register(modEventBus);
        LOGGER.info("Loaded NRR mod successfully");
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

    private void addPackFinders(AddPackFindersEvent event) {
        if (event.getPackType() == PackType.SERVER_DATA) {
            if (addPackFindersEventCopy == null || addPackFindersEventCopy != event)
                addPackFindersEventCopy = event;
        }
    }

    private void onNewRegistry(NewRegistryEvent event) {
        event.create(new RegistryBuilder<>(NRRParticles.KEY).sync(true));
    }

    @SubscribeEvent
    public void onItemEntityTick(EntityTickEvent.Post event) {
        var entity = event.getEntity();
        if (!(entity instanceof ItemEntity itemEntity)) return;
        var stack = itemEntity.getItem();
        if (!stack.is(NRRTags.Items.EXPLOSIVE_INGREDIENTS)) return;
        if (!itemEntity.isInWaterRainOrBubble()) return;
        var level = itemEntity.level();
        if (level.isClientSide()) return;
        level.explode(
                null,
                itemEntity.getX(),
                itemEntity.getY(),
                itemEntity.getZ(),
                5.0F,
                Level.ExplosionInteraction.TNT);
        itemEntity.discard();
    }

    @SubscribeEvent
    public void onTagsUpdated(TagsUpdatedEvent event) {
        CommonRecipeInjector.inject(PACK_RESOURCES);
        addPackFindersEventCopy.addRepositorySource(new NRRRepositorySource("nrreborn:dynamic_data",
                PackType.SERVER_DATA, Pack.Position.TOP, PACK_RESOURCES));
    }

    @SuppressWarnings("UnstableApiUsage")
    @SubscribeEvent
    public void reloadDatapack(ServerStartedEvent event) {
        var server = ServerLifecycleHooks.getCurrentServer();
        var packRepository = server.getPackRepository();
        var worldData = server.getWorldData();
        var oldPackIds = packRepository.getSelectedIds();
        var packIds = Lists.newArrayList(oldPackIds);
        var disabledPackIds = worldData.getDataConfiguration().dataPacks().getDisabled();
        packRepository.reload();
        for (var id : packRepository.getAvailableIds()) {
            if (!packIds.contains(id) && !disabledPackIds.contains(id))
                packIds.add(id);
        }
        ResourcePackLoader.reorderNewlyDiscoveredPacks(packIds, oldPackIds, packRepository);
        LOGGER.info("Reload preparation done! Starting reload process...");
        server.reloadResources(packIds).exceptionally(exception -> {
            LOGGER.error("Failed to reload datapacks! This will probably cause most of the NRR recipes not to be loaded properly!", exception);
            return null;
        });
        LOGGER.info("Reloaded datapacks successfully");
    }

    @SubscribeEvent
    public void reloadDatapackRetry(PlayerEvent.PlayerLoggedInEvent event) {
        var level = event.getEntity().level();
        var testRecipe = level.getRecipeManager().getRecipeFor(
                NRRRecipes.MANUFACTORY_TYPE.get(),
                new ManufactoryRecipeInput(NRRItems.TIN_INGOT.toStack()),
                level);
        if (testRecipe.isEmpty()) {
            LOGGER.warn("Dynamic data is not properly loaded. Retrying reload process...");
            reloadDatapack(null);
        } else {
            LOGGER.info("Dynamic data is properly loaded.");
        }
    }

    @SubscribeEvent
    public void registerCommands(RegisterCommandsEvent event) {
        var dispatcher = event.getDispatcher();
        dispatcher.register(Commands.literal("nrreborn").requires(requirement -> true)
                .then(Commands.literal("debug")
                        .then(Commands.literal("displayBlankDraggableScreen")
                                .requires(stack -> stack.hasPermission(4))
                                .executes(NRRCommands::displayBlankDraggableScreen))
                        .then(Commands.literal("sendDebugMessage")
                                .requires(stack -> stack.hasPermission(4))
                                .executes(NRRCommands::sendDebugMessage))
                        .then(Commands.literal("sendDatapackListToLog")
                                .requires(stack -> stack.hasPermission(4))
                                .executes(NRRCommands::sendDatapackListToLog))));
    }

    @EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            NRRFluids.setRenderLayer();
        }

        @SubscribeEvent
        public static void registerScreens(RegisterMenuScreensEvent event) {
            event.register(NRRMenuTypes.MANUFACTORY_MENU.get(), ManufactoryScreen::new);
        }
    }

    public static String getPath(PackType type, ResourceLocation location) {
        return "%s/%s/%s".formatted(
                type.getDirectory(),
                location.getNamespace(),
                location.getPath());
    }
}
