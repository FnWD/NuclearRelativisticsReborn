package com.fnwd.nrreborn.recipe.builder;

import com.fnwd.nrreborn.NuclearRelativisticsReborn;
import com.fnwd.nrreborn.recipe.ManufactoryRecipe;
import net.minecraft.advancements.Criterion;
import net.minecraft.data.recipes.RecipeBuilder;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.Nullable;

public final class ManufactoryRecipeBuilder implements RecipeBuilder {
    private Ingredient input;
    private int inputCount;
    private int baseProcessPower;
    private int baseProcessTime;
    private ItemStack output;

    private ManufactoryRecipeBuilder() {}

    @Override
    public RecipeBuilder unlockedBy(String s, Criterion<?> criterion) {
        return this;
    }

    @Override
    public RecipeBuilder group(@Nullable String s) {
        return this;
    }

    @Override
    public Item getResult() {
        return output.getItem();
    }

    @Override
    public void save(RecipeOutput recipeOutput, ResourceLocation resourceLocation) {
        ManufactoryRecipe recipe = new ManufactoryRecipe(input, inputCount, baseProcessPower, baseProcessTime, output);
        recipeOutput.accept(resourceLocation, recipe, null);
    }

    @Override
    public void save(RecipeOutput recipeOutput, String id) {
        save(recipeOutput, ResourceLocation.fromNamespaceAndPath(NuclearRelativisticsReborn.MODID, "manufactory/" + id));
    }

    public static ManufactoryRecipeBuilder builder() {
        return new ManufactoryRecipeBuilder();
    }

    public ManufactoryRecipeBuilder input(Ingredient input, int inputCount) {
        this.input = input;
        this.inputCount = inputCount;
        return this;
    }

    public ManufactoryRecipeBuilder baseProcessPower(int baseProcessPower) {
        this.baseProcessPower = baseProcessPower;
        return this;
    }

    public ManufactoryRecipeBuilder baseProcessTime(int baseProcessTime) {
        this.baseProcessTime = baseProcessTime;
        return this;
    }

    public ManufactoryRecipeBuilder output(ItemStack output) {
        this.output = output;
        return this;
    }
}
