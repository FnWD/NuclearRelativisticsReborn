package com.fnwd.nrreborn.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class NRRTags {
    public static class Items {
        public static final TagKey<Item> INGOTS = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ingots"));
        public static final TagKey<Item> INGOTS_TIN = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ingots/tin"));
        public static final TagKey<Item> INGOTS_ALUMINUM = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ingots/aluminum"));
        public static final TagKey<Item> INGOTS_SILVER = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ingots/silver"));
        public static final TagKey<Item> INGOTS_LEAD = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ingots/lead"));
    }

    public static class Blocks {

    }
}
