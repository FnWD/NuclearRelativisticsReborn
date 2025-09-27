package com.fnwd.nrreborn.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public final class NRRTags {
    private NRRTags() {}

    public static class Items {
        public static final TagKey<Item> EXPLOSIVE_INGREDIENTS = ItemTags.create(
                ResourceLocation.fromNamespaceAndPath("nrreborn", "explosive_ingredients"));
    }

    public static class Blocks {
        public static final TagKey<Block> FISSION_REACTOR_CASINGS = BlockTags.create(
                ResourceLocation.fromNamespaceAndPath("nrreborn", "fission_reactor_casings"));
    }
}
