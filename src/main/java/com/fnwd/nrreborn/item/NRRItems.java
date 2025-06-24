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

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
