package com.fnwd.nrreborn.block_entity;

import com.fnwd.nrreborn.NuclearRelativisticsReborn;
import com.fnwd.nrreborn.block.NRRBlocks;
import com.fnwd.nrreborn.block_entity.generators.rtgs.AmericiumRTGBlockEntity;
import com.fnwd.nrreborn.block_entity.generators.rtgs.CaliforniumRTGBlockEntity;
import com.fnwd.nrreborn.block_entity.generators.rtgs.PlutoniumRTGBlockEntity;
import com.fnwd.nrreborn.block_entity.generators.rtgs.UraniumRTGBlockEntity;
import com.fnwd.nrreborn.block_entity.generators.solar_panels.AdvancedSolarPanelBlockEntity;
import com.fnwd.nrreborn.block_entity.generators.solar_panels.BasicSolarPanelBlockEntity;
import com.fnwd.nrreborn.block_entity.generators.solar_panels.DepletedUraniumSolarPanelBlockEntity;
import com.fnwd.nrreborn.block_entity.generators.solar_panels.EliteSolarPanelBlockEntity;
import com.fnwd.nrreborn.block_entity.manufactory.ManufactoryBlockEntity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class NRRBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, NuclearRelativisticsReborn.MODID);

    public static final Supplier<BlockEntityType<ManufactoryBlockEntity>> MANUFACTORY_BLOCK_ENTITY = BLOCK_ENTITIES.register(
            "manufactory_block_entity", () -> BlockEntityType.Builder.of(
                    ManufactoryBlockEntity::new, NRRBlocks.MANUFACTORY.get()).build(null));
    public static final Supplier<BlockEntityType<BasicSolarPanelBlockEntity>> BASIC_SOLAR_PANEL_BLOCK_ENTITY = BLOCK_ENTITIES.register(
            "basic_solar_panel_block_entity", () -> BlockEntityType.Builder.of(
                    BasicSolarPanelBlockEntity::new, NRRBlocks.BASIC_SOLAR_PANEL.get()).build(null));
    public static final Supplier<BlockEntityType<AdvancedSolarPanelBlockEntity>> ADVANCED_SOLAR_PANEL_BLOCK_ENTITY = BLOCK_ENTITIES.register(
            "advanced_solar_panel_block_entity", () -> BlockEntityType.Builder.of(
                    AdvancedSolarPanelBlockEntity::new, NRRBlocks.ADVANCED_SOLAR_PANEL.get()).build(null));
    public static final Supplier<BlockEntityType<DepletedUraniumSolarPanelBlockEntity>> DEPLETED_URANIUM_SOLAR_PANEL_BLOCK_ENTITY = BLOCK_ENTITIES.register(
            "depleted_uranium_solar_panel_block_entity", () -> BlockEntityType.Builder.of(
                    DepletedUraniumSolarPanelBlockEntity::new, NRRBlocks.DEPLETED_URANIUM_SOLAR_PANEL.get()).build(null));
    public static final Supplier<BlockEntityType<EliteSolarPanelBlockEntity>> ELITE_SOLAR_PANEL_BLOCK_ENTITY = BLOCK_ENTITIES.register(
            "elite_solar_panel_block_entity", () -> BlockEntityType.Builder.of(
                    EliteSolarPanelBlockEntity::new, NRRBlocks.ELITE_SOLAR_PANEL.get()).build(null));
    public static final Supplier<BlockEntityType<UraniumRTGBlockEntity>> URANIUM_RTG_BLOCK_ENTITY = BLOCK_ENTITIES.register(
            "uranium_rtg_block_entity", () -> BlockEntityType.Builder.of(
                    UraniumRTGBlockEntity::new, NRRBlocks.URANIUM_RTG.get()).build(null));
    public static final Supplier<BlockEntityType<PlutoniumRTGBlockEntity>> PLUTONIUM_RTG_BLOCK_ENTITY = BLOCK_ENTITIES.register(
            "plutonium_rtg_block_entity", () -> BlockEntityType.Builder.of(
                    PlutoniumRTGBlockEntity::new, NRRBlocks.PLUTONIUM_RTG.get()).build(null));
    public static final Supplier<BlockEntityType<AmericiumRTGBlockEntity>> AMERICIUM_RTG_BLOCK_ENTITY = BLOCK_ENTITIES.register(
            "americium_rtg_block_entity", () -> BlockEntityType.Builder.of(
                    AmericiumRTGBlockEntity::new, NRRBlocks.AMERICIUM_RTG.get()).build(null));
    public static final Supplier<BlockEntityType<CaliforniumRTGBlockEntity>> CALIFORNIUM_RTG_BLOCK_ENTITY = BLOCK_ENTITIES.register(
            "californium_rtg_block_entity", () -> BlockEntityType.Builder.of(
                    CaliforniumRTGBlockEntity::new, NRRBlocks.CALIFORNIUM_RTG.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
