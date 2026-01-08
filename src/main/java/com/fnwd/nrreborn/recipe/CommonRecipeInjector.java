package com.fnwd.nrreborn.recipe;

import com.fnwd.nrreborn.recipe.manufactory.ManufactoryRecipeInjector;
import com.fnwd.nrreborn.util.pack.NRRPackResources;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.google.gson.JsonElement;
import com.mojang.serialization.JsonOps;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagEntry;
import net.minecraft.tags.TagFile;
import net.minecraft.world.item.Item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.fnwd.nrreborn.NuclearRelativisticsReborn.LOGGER;

public final class CommonRecipeInjector {
    public static final Map<ResourceLocation, JsonElement> JSON = new HashMap<>();
    public static final Multimap<ResourceLocation, TagEntry> TAGS = HashMultimap.create();

    private CommonRecipeInjector() {}

    public static void inject(NRRPackResources resources) {
        for (var item : BuiltInRegistries.ITEM) {
            ManufactoryRecipeInjector.inject(item);
        }
        LOGGER.info("Injected {} recipes in total", JSON.size());
        JSON.forEach(resources::put);
        for (var tagEntry : TAGS.asMap().entrySet()) {
            var tagFile = new TagFile(new ArrayList<>(tagEntry.getValue()), false, List.of());
            resources.put(tagEntry.getKey().withPrefix("tags/item/"),
                    TagFile.CODEC.encodeStart(JsonOps.INSTANCE, tagFile).result().orElseThrow());
        }
        JSON.clear();
        TAGS.clear();
    }

    public static void logFoundRecipe(Item input, Item output) {
        LOGGER.info("Recipe found: {} -> {}", input, output);
    }
}
