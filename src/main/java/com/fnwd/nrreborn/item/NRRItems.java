package com.fnwd.nrreborn.item;

import com.fnwd.nrreborn.NuclearRelativisticsReborn;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class NRRItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(NuclearRelativisticsReborn.MODID);

    public static final DeferredItem<Item> TIN_INGOT = ITEMS.register(
            "tin_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ALUMINUM_INGOT = ITEMS.register(
            "aluminum_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILVER_INGOT = ITEMS.register(
            "silver_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LEAD_INGOT = ITEMS.register(
            "lead_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MAGNESIUM_INGOT = ITEMS.register(
            "magnesium_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LITHIUM_INGOT = ITEMS.register(
            "lithium_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BORON_INGOT = ITEMS.register(
            "boron_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BERYLLIUM_INGOT = ITEMS.register(
            "beryllium_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ZIRCONIUM_INGOT = ITEMS.register(
            "zirconium_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> THORIUM_INGOT = ITEMS.register(
            "thorium_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> URANIUM_INGOT = ITEMS.register(
            "uranium_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> THORIUM_OXIDE_INGOT = ITEMS.register(
            "thorium_oxide_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> URANIUM_OXIDE_INGOT = ITEMS.register(
            "uranium_oxide_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MANGANESE_INGOT = ITEMS.register(
            "manganese_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MANGANESE_OXIDE_INGOT = ITEMS.register(
            "manganese_oxide_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MANGANESE_DIOXIDE_INGOT = ITEMS.register(
            "manganese_dioxide_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_TIN = ITEMS.register(
            "raw_tin", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_LEAD = ITEMS.register(
            "raw_lead", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_MAGNESIUM = ITEMS.register(
            "raw_magnesium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_LITHIUM = ITEMS.register(
            "raw_lithium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_BORON = ITEMS.register(
            "raw_boron", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_THORIUM = ITEMS.register(
            "raw_thorium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_URANIUM = ITEMS.register(
            "raw_uranium", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
