package com.fnwd.nrreborn.recipe.manufactory;

import com.fnwd.nrreborn.NuclearRelativisticsReborn;
import com.fnwd.nrreborn.recipe.CommonRecipeInjector;
import com.mojang.serialization.JsonOps;
import net.minecraft.advancements.Criterion;
import net.minecraft.data.recipes.RecipeBuilder;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.neoforged.neoforge.common.conditions.WithConditions;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.Optional;

import static com.fnwd.nrreborn.NuclearRelativisticsReborn.LOGGER;

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
        var recipe = new ManufactoryRecipe(input, inputCount, baseProcessPower, baseProcessTime, output);
        recipeOutput.accept(resourceLocation, recipe, null);
    }

    @Override
    public void save(RecipeOutput recipeOutput, String id) {
        save(recipeOutput, ResourceLocation.fromNamespaceAndPath(NuclearRelativisticsReborn.MODID, "manufactory/" + id));
    }

    public ManufactoryRecipe build() {
        return new ManufactoryRecipe(input, inputCount, baseProcessPower, baseProcessTime, output);
    }

    public void addToInjectorJson() {
        var recipe = build();
        var recipeId = ResourceLocation.fromNamespaceAndPath(NuclearRelativisticsReborn.MODID,
                "manufactory/generated/%s/%s".formatted(
                        Arrays.toString(Arrays.stream(input.getItems())
                                .map(ItemStack::getItem)
                                .map(Item::getDescriptionId)
                                .map(id -> id.replace('.', '/'))
                                .toArray())
                                .replaceAll("[\\s\\[\\]]+", "")
                                .replace(',', '/'),
                        output.getItem().getDescriptionId().replace('.', '/')));
        var serializedElement = Recipe.CONDITIONAL_CODEC
                .encodeStart(JsonOps.INSTANCE, Optional.of(new WithConditions<>(recipe)))
                .result();
        serializedElement.ifPresent(_recipe -> {
            CommonRecipeInjector.JSON.put(recipeId.withPrefix("recipe/"), _recipe);
            LOGGER.debug("Injected recipe with Recipe ID {} and content {}, now there are {} injected recipes by far",
                    recipeId, _recipe, CommonRecipeInjector.JSON.size());
        });
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
