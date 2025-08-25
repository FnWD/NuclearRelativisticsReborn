package com.fnwd.nrreborn.util;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.StreamSupport;

public final class RecipeOutputSupplier {
    private RecipeOutputSupplier() {}

    public static String getIngotType(ItemStack stack) {
        if (stack.isEmpty()) return null;
        List<TagKey<Item>> tags = stack.getTags().toList();
        List<TagKey<Item>> candidateResultTags = new ArrayList<>();
        for (var tag : tags) {
            if (tag.location().toString().startsWith("c:ingots/")) candidateResultTags.add(tag);
        }
        if (candidateResultTags.isEmpty()) return null;
        // Compatibility
        if (candidateResultTags.contains(CTags.Items.INGOTS_BIOSTEEL)) return "biosteel";
        return candidateResultTags.getFirst().location().toString().substring("c:ingots/".length());
    }

    public static String getOreType(ItemStack stack) {
        if (stack.isEmpty()) return null;
        List<TagKey<Item>> tags = stack.getTags().toList();
        List<TagKey<Item>> candidateResultTags = new ArrayList<>();
        for (var tag : tags) {
            if (tag.location().toString().startsWith("c:ores/")) candidateResultTags.add(tag);
        }
        if (candidateResultTags.isEmpty()) return null;
        return candidateResultTags.getFirst().location().toString().substring("c:ores/".length());
    }

    public static String getRawMaterialType(ItemStack stack) {
        if (stack.isEmpty()) return null;
        List<TagKey<Item>> tags = stack.getTags().toList();
        List<TagKey<Item>> candidateResultTags = new ArrayList<>();
        for (var tag : tags) {
            if (tag.location().toString().startsWith("c:raw_materials/")) candidateResultTags.add(tag);
        }
        if (candidateResultTags.isEmpty()) return null;
        return candidateResultTags.getFirst().location().toString().substring("c:raw_materials/".length());
    }

    public static String getGemType(ItemStack stack) {
        if (stack.isEmpty()) return null;
        List<TagKey<Item>> tags = stack.getTags().toList();
        List<TagKey<Item>> candidateResultTags = new ArrayList<>();
        for (var tag : tags) {
            if (tag.location().toString().startsWith("c:gems/")) candidateResultTags.add(tag);
        }
        if (candidateResultTags.isEmpty()) return null;
        return candidateResultTags.getFirst().location().toString().substring("c:gems/".length());
    }

    public static class Manufactory {
        public static ItemStack getDustOf(String type, int count) {
            var holder = BuiltInRegistries.ITEM.getTagOrEmpty(ItemTags.create(
                    ResourceLocation.fromNamespaceAndPath("c", "dusts/" + type)));
            var candidateResultItemList = StreamSupport.stream(holder.spliterator(), false)
                    .map(Holder::value)
                    .filter(item -> !item.getDefaultInstance().is(ItemTags.create(
                            ResourceLocation.fromNamespaceAndPath("almostunified", "hide"))))
                    .toList();
            if (candidateResultItemList.isEmpty()) return ItemStack.EMPTY;
            for (var item : candidateResultItemList) {
                if (BuiltInRegistries.ITEM.getKey(item).getNamespace().equals("nrreborn")) return new ItemStack(item, count);
            }
            candidateResultItemList = candidateResultItemList.stream()
                    .sorted(Comparator.comparing(item -> BuiltInRegistries.ITEM.getKey(item).getNamespace()))
                    .toList();
            return new ItemStack(candidateResultItemList.getFirst(), count);
        }
    }
}
