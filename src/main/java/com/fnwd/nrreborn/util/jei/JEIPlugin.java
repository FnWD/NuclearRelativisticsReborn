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
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.crafting.RecipeManager;

import java.util.ArrayList;
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
        List<TagKey<Item>> manufactoryAvailableIngots = BuiltInRegistries.ITEM.getTagNames()
                .filter(tag -> tag.location().toString().startsWith("c:ingots/"))
                .toList();
        List<TagKey<Item>> manufactoryAvailableOres = BuiltInRegistries.ITEM.getTagNames()
                .filter(tag -> tag.location().toString().startsWith("c:ores/"))
                .toList();
        List<TagKey<Item>> manufactoryAvailableRawMaterials = BuiltInRegistries.ITEM.getTagNames()
                .filter(tag -> tag.location().toString().startsWith("c:raw_materials/"))
                .toList();
        List<TagKey<Item>> manufactoryAvailableGems = BuiltInRegistries.ITEM.getTagNames()
                .filter(tag -> tag.location().toString().startsWith("c:gems/"))
                .toList();
        List<ManufactoryRecipe> manufactoryRecipesComplement = new ArrayList<>();
        for (var tag : manufactoryAvailableIngots) {
            if (getDustOf(tag.location().toString().substring("c:ingots/".length()), 1).isEmpty()) {
                continue;
            }
            manufactoryRecipesComplement.add(new ManufactoryRecipe(Ingredient.of(tag), 1, 20, 400, getDustOf(tag.location().toString().substring("c:ingots/".length()), 1)));
        }
        for (var tag : manufactoryAvailableOres) {
            if (getDustOf(tag.location().toString().substring("c:ores/".length()), 1).isEmpty()) {
                continue;
            }
            manufactoryRecipesComplement.add(new ManufactoryRecipe(Ingredient.of(tag), 1, 20, 500, getDustOf(tag.location().toString().substring("c:ores/".length()), 2)));
        }
        for (var tag : manufactoryAvailableRawMaterials) {
            if (getDustOf(tag.location().toString().substring("c:raw_materials/".length()), 1).isEmpty()) {
                continue;
            }
            manufactoryRecipesComplement.add(new ManufactoryRecipe(Ingredient.of(tag), 1, 20, 500, getDustOf(tag.location().toString().substring("c:raw_materials/".length()), 2)));
        }
        for (var tag : manufactoryAvailableGems) {
            if (getDustOf(tag.location().toString().substring("c:gems/".length()), 1).isEmpty()) {
                continue;
            }
            manufactoryRecipesComplement.add(new ManufactoryRecipe(Ingredient.of(tag), 1, 30, 600, getDustOf(tag.location().toString().substring("c:gems/".length()), 1)));
        }
        registration.addRecipes(ManufactoryRecipeCategory.MANUFACTORY_RECIPE_TYPE, manufactoryRecipesComplement);
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

    private ItemStack getDustOf(String type, int count) {
        Iterable<Holder<Item>> holder = BuiltInRegistries.ITEM.getTagOrEmpty(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts/" + type)));
        List<Item> list = StreamSupport.stream(holder.spliterator(), false)
                .map(Holder::value)
                .filter(item -> !item.getDefaultInstance().is(ItemTags.create(ResourceLocation.fromNamespaceAndPath("almostunified", "hide"))))
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
