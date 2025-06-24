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
        public static final TagKey<Item> INGOTS_MAGNESIUM = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ingots/magnesium"));
        public static final TagKey<Item> INGOTS_LITHIUM = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ingots/lithium"));
        public static final TagKey<Item> INGOTS_BORON = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ingots/boron"));
        public static final TagKey<Item> INGOTS_BERYLLIUM = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ingots/beryllium"));
        public static final TagKey<Item> INGOTS_ZIRCONIUM = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ingots/zirconium"));
        public static final TagKey<Item> INGOTS_THORIUM = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ingots/thorium"));
        public static final TagKey<Item> INGOTS_URANIUM = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("c", "ingots/uranium"));
    }

    public static class Blocks {

    }
}
