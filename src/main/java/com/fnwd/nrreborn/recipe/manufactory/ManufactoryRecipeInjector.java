package com.fnwd.nrreborn.recipe.manufactory;

import com.fnwd.nrreborn.util.tag.CTags;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.Tags;

import java.util.*;
import java.util.stream.StreamSupport;

import static com.fnwd.nrreborn.recipe.CommonRecipeInjector.logFoundRecipe;

public final class ManufactoryRecipeInjector {
    private ManufactoryRecipeInjector() {}

    public static final Set<TagKey<Item>> INGOT_TO_DUST_SET = new HashSet<>();
    public static final Set<TagKey<Item>> GEM_TO_DUST_SET = new HashSet<>();
    public static final Set<TagKey<Item>> ORE_TO_DUST_SET = new HashSet<>();
    public static final Set<TagKey<Item>> RAW_MATERIAL_TO_DUST_SET = new HashSet<>();
    public static final Set<TagKey<Item>> STORAGE_BLOCK_TO_DUST_SET = new HashSet<>();

    public static void inject(Item item) {
        injectLogToPlanksRecipeOf(item);
        injectIngotToDustRecipeOf(item);
        injectGemToDustRecipeOf(item);
        injectOreToDustRecipeOf(item);
        injectRawMaterialToDustRecipeOf(item);
        injectStorageBlockToDustRecipeOf(item);
    }

    public static void injectLogToPlanksRecipeOf(Item item) {
        if (!item.getDefaultInstance().getTags().toList().contains(ItemTags.LOGS)) return;
        var descriptionId = item.getDescriptionId();
        var formattedDescriptionIdContainer = new LinkedList<>(
                Arrays.asList(descriptionId.split("\\.")));
        formattedDescriptionIdContainer.removeFirst();
        var namespace = formattedDescriptionIdContainer.getFirst();
        var registryName = formattedDescriptionIdContainer.getLast();
        var formattedRegistryNameContainer = new LinkedList<>(
                Arrays.asList(registryName.split("_")));
        var headRemovalSet = new HashSet<>(
                Arrays.asList("stripped", "log", "wood", "stem", "hyphae"));
        for (;;) {
            var first = formattedRegistryNameContainer.getFirst();
            if (headRemovalSet.contains(first)) {
                formattedRegistryNameContainer.removeFirst();
                headRemovalSet.remove(first);
            } else break;
        }
        var tailRemovalSet = new HashSet<>(
                Arrays.asList("stripped", "log", "wood", "stem", "hyphae"));
        for (;;) {
            var last = formattedRegistryNameContainer.getLast();
            if (tailRemovalSet.contains(last)) {
                formattedRegistryNameContainer.removeLast();
                tailRemovalSet.remove(last);
            } else break;
        }
        var builder = new StringBuilder();
        for (var registryNameToken : formattedRegistryNameContainer) {
            builder.append(registryNameToken).append("_");
        }
        var logType = builder.toString();
        logType = logType.substring(0, logType.length() - 1);
        var planksRegistryName1 = ResourceLocation.fromNamespaceAndPath(namespace, logType + "_planks");
        var planksRegistryName2 = ResourceLocation.fromNamespaceAndPath(namespace, "planks_" + logType);
        if (!BuiltInRegistries.ITEM.get(planksRegistryName1).getDefaultInstance().is(Items.AIR)) {
            ManufactoryRecipeBuilder.builder()
                    .input(Ingredient.of(item), 1)
                    .baseProcessPower(10)
                    .baseProcessTime(200)
                    .output(new ItemStack(BuiltInRegistries.ITEM.get(planksRegistryName1), 6))
                    .addToInjectorJson();
            logFoundRecipe(item, BuiltInRegistries.ITEM.get(planksRegistryName1));
        } else if (!BuiltInRegistries.ITEM.get(planksRegistryName2).getDefaultInstance().is(Items.AIR)) {
            ManufactoryRecipeBuilder.builder()
                    .input(Ingredient.of(item), 1)
                    .baseProcessPower(10)
                    .baseProcessTime(200)
                    .output(new ItemStack(BuiltInRegistries.ITEM.get(planksRegistryName2), 6))
                    .addToInjectorJson();
            logFoundRecipe(item, BuiltInRegistries.ITEM.get(planksRegistryName2));
        }
    }

    public static void injectIngotToDustRecipeOf(Item item) {
        try {
            var ingotTag = item.getDefaultInstance().getTags()
                    .filter(tagKey -> tagKey.location().toString().startsWith("c:ingots/"))
                    .filter(tagKey -> tagKey.location().toString().length() > 9)
                    .filter(tagKey -> !tagKey.equals(CTags.Items.INGOTS_BIOSTEEL))
                    .toList()
                    .getFirst();
            if (INGOT_TO_DUST_SET.add(ingotTag)) {
                var ingotType = ingotTag.location().toString().substring("c:ingots/".length());
                var candidateItems = StreamSupport.stream(BuiltInRegistries.ITEM.getTagOrEmpty(ItemTags.create(
                                ResourceLocation.fromNamespaceAndPath("c", "dusts/" + ingotType))).spliterator(), false)
                        .map(Holder::value)
                        .filter(_item -> !_item.getDefaultInstance().is(ItemTags.create(
                                ResourceLocation.fromNamespaceAndPath("almostunified", "hide"))))
                        .toList();
                if (candidateItems.isEmpty()) return;
                for (var _item : candidateItems) {
                    if (BuiltInRegistries.ITEM.getKey(_item).getNamespace().equals("nrreborn")) {
                        ManufactoryRecipeBuilder.builder()
                                .input(Ingredient.of(ingotTag), 1)
                                .baseProcessPower(20)
                                .baseProcessTime(400)
                                .output(new ItemStack(_item, 1))
                                .addToInjectorJson();
                        logFoundRecipe(item, _item);
                        return;
                    }
                }
                ManufactoryRecipeBuilder.builder()
                        .input(Ingredient.of(ingotTag), 1)
                        .baseProcessPower(20)
                        .baseProcessTime(400)
                        .output(new ItemStack(candidateItems.getFirst(), 1))
                        .addToInjectorJson();
                logFoundRecipe(item, candidateItems.getFirst());
            }
        } catch (NoSuchElementException ignore) {}
    }

    public static void injectGemToDustRecipeOf(Item item) {
        try {
            var gemTag = item.getDefaultInstance().getTags()
                    .filter(tagKey -> tagKey.location().toString().startsWith("c:gems/"))
                    .filter(tagKey -> tagKey.location().toString().length() > 7)
                    .toList()
                    .getFirst();
            if (GEM_TO_DUST_SET.add(gemTag)) {
                var gemType = gemTag.location().toString().substring("c:gems/".length());
                var candidateItems = StreamSupport.stream(BuiltInRegistries.ITEM.getTagOrEmpty(ItemTags.create(
                                ResourceLocation.fromNamespaceAndPath("c", "dusts/" + gemType))).spliterator(), false)
                        .map(Holder::value)
                        .filter(_item -> !_item.getDefaultInstance().is(ItemTags.create(
                                ResourceLocation.fromNamespaceAndPath("almostunified", "hide"))))
                        .toList();
                if (candidateItems.isEmpty()) return;
                for (var _item : candidateItems) {
                    if (BuiltInRegistries.ITEM.getKey(_item).getNamespace().equals("nrreborn")) {
                        ManufactoryRecipeBuilder.builder()
                                .input(Ingredient.of(gemTag), 1)
                                .baseProcessPower(30)
                                .baseProcessTime(600)
                                .output(new ItemStack(_item, 1))
                                .addToInjectorJson();
                        logFoundRecipe(item, _item);
                        return;
                    }
                }
                ManufactoryRecipeBuilder.builder()
                        .input(Ingredient.of(gemTag), 1)
                        .baseProcessPower(30)
                        .baseProcessTime(600)
                        .output(new ItemStack(candidateItems.getFirst(), 1))
                        .addToInjectorJson();
                logFoundRecipe(item, candidateItems.getFirst());
            }
        } catch (NoSuchElementException ignore) {}
    }

    public static void injectOreToDustRecipeOf(Item item) {
        try {
            var oreTag = item.getDefaultInstance().getTags()
                    .filter(tagKey -> tagKey.location().toString().startsWith("c:ores/"))
                    .filter(tagKey -> tagKey.location().toString().length() > 7)
                    .toList()
                    .getFirst();
            if (ORE_TO_DUST_SET.add(oreTag)) {
                var oreType = oreTag.location().toString().substring("c:ores/".length());
                var candidateItems = StreamSupport.stream(BuiltInRegistries.ITEM.getTagOrEmpty(ItemTags.create(
                                ResourceLocation.fromNamespaceAndPath("c", "dusts/" + oreType))).spliterator(), false)
                        .map(Holder::value)
                        .filter(_item -> !_item.getDefaultInstance().is(ItemTags.create(
                                ResourceLocation.fromNamespaceAndPath("almostunified", "hide"))))
                        .toList();
                if (candidateItems.isEmpty()) return;
                int outputCount;
                if (item.getDefaultInstance().is(Tags.Items.ORES_REDSTONE))
                    outputCount = 12;
                else if (item.getDefaultInstance().is(Tags.Items.ORES_LAPIS))
                    outputCount = 16;
                else outputCount = 2;
                for (var _item : candidateItems) {
                    if (BuiltInRegistries.ITEM.getKey(_item).getNamespace().equals("nrreborn")) {
                        ManufactoryRecipeBuilder.builder()
                                .input(Ingredient.of(oreTag), 1)
                                .baseProcessPower(20)
                                .baseProcessTime(500)
                                .output(new ItemStack(_item, outputCount))
                                .addToInjectorJson();
                        logFoundRecipe(item, _item);
                        return;
                    }
                }
                ManufactoryRecipeBuilder.builder()
                        .input(Ingredient.of(oreTag), 1)
                        .baseProcessPower(20)
                        .baseProcessTime(500)
                        .output(new ItemStack(candidateItems.getFirst(), outputCount))
                        .addToInjectorJson();
                logFoundRecipe(item, candidateItems.getFirst());
            }
        } catch (NoSuchElementException ignore) {}
    }

    public static void injectRawMaterialToDustRecipeOf(Item item) {
        try {
            var rawMaterialTag = item.getDefaultInstance().getTags()
                    .filter(tagKey -> tagKey.location().toString().startsWith("c:raw_materials/"))
                    .filter(tagKey -> tagKey.location().toString().length() > 16)
                    .toList()
                    .getFirst();
            if (RAW_MATERIAL_TO_DUST_SET.add(rawMaterialTag)) {
                var rawMaterialType = rawMaterialTag.location().toString().substring("c:raw_materials/".length());
                var candidateItems = StreamSupport.stream(BuiltInRegistries.ITEM.getTagOrEmpty(ItemTags.create(
                                ResourceLocation.fromNamespaceAndPath("c", "dusts/" + rawMaterialType))).spliterator(), false)
                        .map(Holder::value)
                        .filter(_item -> !_item.getDefaultInstance().is(ItemTags.create(
                                ResourceLocation.fromNamespaceAndPath("almostunified", "hide"))))
                        .toList();
                if (candidateItems.isEmpty()) return;
                int outputCount;
                if (item.getDefaultInstance().is(Tags.Items.ORES_REDSTONE))
                    outputCount = 12;
                else if (item.getDefaultInstance().is(Tags.Items.ORES_LAPIS))
                    outputCount = 16;
                else outputCount = 2;
                for (var _item : candidateItems) {
                    if (BuiltInRegistries.ITEM.getKey(_item).getNamespace().equals("nrreborn")) {
                        ManufactoryRecipeBuilder.builder()
                                .input(Ingredient.of(rawMaterialTag), 1)
                                .baseProcessPower(20)
                                .baseProcessTime(500)
                                .output(new ItemStack(_item, outputCount))
                                .addToInjectorJson();
                        logFoundRecipe(item, _item);
                        return;
                    }
                }
                ManufactoryRecipeBuilder.builder()
                        .input(Ingredient.of(rawMaterialTag), 1)
                        .baseProcessPower(20)
                        .baseProcessTime(500)
                        .output(new ItemStack(candidateItems.getFirst(), outputCount))
                        .addToInjectorJson();
                logFoundRecipe(item, candidateItems.getFirst());
            }
        } catch (NoSuchElementException ignore) {}
    }

    public static void injectStorageBlockToDustRecipeOf(Item item) {
        try {
            var storageBlockTag = item.getDefaultInstance().getTags()
                    .filter(tagKey -> tagKey.location().toString().startsWith("c:storage_blocks/"))
                    .filter(tagKey -> tagKey.location().toString().length() > 17)
                    .filter(tagKey -> !tagKey.equals(CTags.Items.STORAGE_BLOCKS_BIOSTEEL))
                    .toList()
                    .getFirst();
            if (STORAGE_BLOCK_TO_DUST_SET.add(storageBlockTag)) {
                var storageBlockType = storageBlockTag.location().toString().substring("c:storage_blocks/".length());
                var candidateItems = StreamSupport.stream(BuiltInRegistries.ITEM.getTagOrEmpty(ItemTags.create(
                                ResourceLocation.fromNamespaceAndPath("c", "dusts/" + storageBlockType))).spliterator(), false)
                        .map(Holder::value)
                        .filter(_item -> !_item.getDefaultInstance().is(ItemTags.create(
                                ResourceLocation.fromNamespaceAndPath("almostunified", "hide"))))
                        .toList();
                if (candidateItems.isEmpty()) return;
                int outputCount;
                if (item.getDefaultInstance().is(CTags.Items.STORAGE_BLOCKS_QUARTZ))
                    outputCount = 4;
                else outputCount = 9;
                for (var _item : candidateItems) {
                    if (BuiltInRegistries.ITEM.getKey(_item).getNamespace().equals("nrreborn")) {
                        ManufactoryRecipeBuilder.builder()
                                .input(Ingredient.of(storageBlockTag), 1)
                                .baseProcessPower(20)
                                .baseProcessTime(3600)
                                .output(new ItemStack(_item, outputCount))
                                .addToInjectorJson();
                        logFoundRecipe(item, _item);
                        return;
                    }
                }
                ManufactoryRecipeBuilder.builder()
                        .input(Ingredient.of(storageBlockTag), 1)
                        .baseProcessPower(20)
                        .baseProcessTime(3600)
                        .output(new ItemStack(candidateItems.getFirst(), outputCount))
                        .addToInjectorJson();
                logFoundRecipe(item, candidateItems.getFirst());
            }
        } catch (NoSuchElementException ignore) {}
    }
}
