package com.fnwd.nrreborn.util.jei;

import com.fnwd.nrreborn.NuclearRelativisticsReborn;
import com.fnwd.nrreborn.block.NRRBlocks;
import com.fnwd.nrreborn.recipe.ManufactoryRecipe;
import com.fnwd.nrreborn.recipe.NRRRecipes;
import com.fnwd.nrreborn.screen.custom.ManufactoryScreen;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.crafting.RecipeManager;

import java.util.Comparator;
import java.util.List;
import java.util.stream.StreamSupport;

@JeiPlugin
public class JEIPlugin implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return ResourceLocation.fromNamespaceAndPath(NuclearRelativisticsReborn.MODID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new ManufactoryRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        /*RecipeManager manager = Minecraft.getInstance().getSingleplayerServer().getRecipeManager();
        List<ManufactoryRecipe> manufactoryRecipesFromCode = new ArrayList<>();
        *//*List<TagKey<Item>> manufactoryAvailableIngots = BuiltInRegistries.ITEM.getTagNames()
                .filter(tag -> tag.location().toString().startsWith("c:ingots/"))
                .toList();
        List<TagKey<Item>> manufactoryAvailableOres = BuiltInRegistries.ITEM.getTagNames()
                .filter(tag -> tag.location().toString().startsWith("c:ores/"))
                .toList();
        List<TagKey<Item>> manufactoryAvailableRawMaterials = BuiltInRegistries.ITEM.getTagNames()
                .filter(tag -> tag.location().toString().startsWith("c:raw_materials/"))
                .toList();
        for (TagKey<Item> ingot : manufactoryAvailableIngots) {
            if (lookForDustOf(ingot.location().toString().substring("c:ingots/".length()), 1).isEmpty()) {
                continue;
            }
            manufactoryRecipes.add(new ManufactoryRecipe(
                    Ingredient.of(ingot),
                    1,
                    20,
                    400,
                    lookForDustOf(ingot.location().toString().substring("c:ingots/".length()), 1)));
        }
        for (TagKey<Item> ore : manufactoryAvailableOres) {
            if (lookForDustOf(ore.location().toString().substring("c:ores/".length()), 1).isEmpty()) {
                continue;
            }
            manufactoryRecipes.add(new ManufactoryRecipe(
                    Ingredient.of(ore),
                    1,
                    20,
                    500,
                    lookForDustOf(ore.location().toString().substring("c:ores/".length()), 2)));
        }
        for (TagKey<Item> rawMaterial : manufactoryAvailableRawMaterials) {
            if (lookForDustOf(rawMaterial.location().toString().substring("c:raw_materials/".length()), 1).isEmpty()) {
                continue;
            }
            manufactoryRecipes.add(new ManufactoryRecipe(
                    Ingredient.of(rawMaterial),
                    1,
                    20,
                    500,
                    lookForDustOf(rawMaterial.location().toString().substring("c:raw_materials/".length()), 2)));
        }*//*
        Stream.of("c:ingots/", "c:ores/", "c:raw_materials/", "c:gems/")
                        .forEach(form -> BuiltInRegistries.ITEM.getTagNames()
                                .filter(tag -> tag.location().toString().startsWith(form))
                                .forEach(tag -> {
                                    String type = tag.location().toString().substring(form.length());
                                    int outputCount = switch (form) {
                                        case "c:ingots/", "c:gems/" -> 1;
                                        case "c:ores/", "c:raw_materials/" -> 2;
                                        default -> 0;
                                    };
                                    int processTime = switch (form) {
                                        case "c:ingots/" -> 400;
                                        case "c:ores/", "c:raw_materials/" -> 500;
                                        case "c:gems/" -> 600;
                                        default -> 0;
                                    };
                                    int processPower = form.equals("c:gems/") ? 30 : 20;
                                    ItemStack result = lookForDustOf(type, outputCount);
                                    if (!result.isEmpty()) {
                                        manufactoryRecipesFromCode.add(new ManufactoryRecipe(
                                                Ingredient.of(tag),
                                                1,
                                                processPower,
                                                processTime,
                                                result));
                                    }
                                }));*/
        RecipeManager manager = Minecraft.getInstance().level.getRecipeManager();
        List<ManufactoryRecipe> manufactoryRecipes = manager.getAllRecipesFor(NRRRecipes.MANUFACTORY_TYPE.get()).stream()
                .map(RecipeHolder::value)
                .toList();
        registration.addRecipes(ManufactoryRecipeCategory.MANUFACTORY_RECIPE_TYPE, manufactoryRecipes);
    }

    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration) {
        registration.addRecipeClickArea(ManufactoryScreen.class, 77, 37, 22, 15, ManufactoryRecipeCategory.MANUFACTORY_RECIPE_TYPE);
    }

    @Override
    public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
        registration.addRecipeCatalyst(new ItemStack(NRRBlocks.MANUFACTORY.asItem()), ManufactoryRecipeCategory.MANUFACTORY_RECIPE_TYPE);
    }

    private ItemStack lookForDustOf(String type, int count) {
        Iterable<Holder<Item>> holder = BuiltInRegistries.ITEM.getTagOrEmpty(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts/" + type)));
        List<Item> list = StreamSupport.stream(holder.spliterator(), false)
                .map(Holder::value)
                .toList();
        if (list.isEmpty()) {
            return ItemStack.EMPTY;
        }
        for (Item item : list) {
            if (BuiltInRegistries.ITEM.getKey(item).getNamespace().equals("nrreborn")) {
                return new ItemStack(item, count);
            }
        }
        list = list.stream()
                .sorted(Comparator.comparing(item -> BuiltInRegistries.ITEM.getKey(item).getNamespace()))
                .toList();
        return new ItemStack(list.getFirst(), count);
    }
}
