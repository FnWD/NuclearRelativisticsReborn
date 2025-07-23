package com.fnwd.nrreborn.datagen;

import com.fnwd.nrreborn.item.NRRItems;
import com.fnwd.nrreborn.recipe.builder.ManufactoryRecipeBuilder;
import com.fnwd.nrreborn.util.CTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class NRRRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public NRRRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput) {
        ManufactoryRecipeBuilder.builder()
                .input(Ingredient.of(ItemTags.PLANKS), 1)
                .baseProcessPower(10)
                .baseProcessTime(100)
                .output(new ItemStack(Items.STICK, 4))
                .save(recipeOutput, "stick");
        ManufactoryRecipeBuilder.builder()
                .input(Ingredient.of(Items.PRISMARINE_SHARD), 1)
                .baseProcessPower(20)
                .baseProcessTime(400)
                .output(new ItemStack(Items.PRISMARINE_CRYSTALS, 1))
                .save(recipeOutput, "prismarine_crystals");
        ManufactoryRecipeBuilder.builder()
                .input(Ingredient.of(Tags.Items.COBBLESTONES), 1)
                .baseProcessPower(20)
                .baseProcessTime(400)
                .output(new ItemStack(Items.SAND, 1))
                .save(recipeOutput, "sand");
        ManufactoryRecipeBuilder.builder()
                .input(Ingredient.of(Tags.Items.GRAVELS), 1)
                .baseProcessPower(20)
                .baseProcessTime(400)
                .output(new ItemStack(Items.FLINT, 1))
                .save(recipeOutput, "flint");
        ManufactoryRecipeBuilder.builder()
                .input(Ingredient.of(Tags.Items.RODS_BLAZE), 1)
                .baseProcessPower(20)
                .baseProcessTime(400)
                .output(new ItemStack(Items.BLAZE_POWDER, 4))
                .save(recipeOutput, "blaze_powder");
        ManufactoryRecipeBuilder.builder()
                .input(Ingredient.of(Items.ROTTEN_FLESH), 4)
                .baseProcessPower(20)
                .baseProcessTime(200)
                .output(new ItemStack(Items.LEATHER, 1))
                .save(recipeOutput, "leather");
        ManufactoryRecipeBuilder.builder()
                .input(Ingredient.of(Tags.Items.BONES), 1)
                .baseProcessPower(20)
                .baseProcessTime(200)
                .output(new ItemStack(Items.BONE_MEAL, 6))
                .save(recipeOutput, "bone_meal");
        ManufactoryRecipeBuilder.builder()
                .input(Ingredient.of(Items.SUGAR_CANE), 2)
                .baseProcessPower(10)
                .baseProcessTime(400)
                .output(new ItemStack(NRRItems.BIOPLASTIC.get(), 1))
                .save(recipeOutput, "bioplastic");
        ManufactoryRecipeBuilder.builder()
                .input(Ingredient.of(Items.PORKCHOP), 1)
                .baseProcessPower(10)
                .baseProcessTime(200)
                .output(new ItemStack(NRRItems.GELATIN.get(), 8))
                .save(recipeOutput, "gelatin_1");
        ManufactoryRecipeBuilder.builder()
                .input(Ingredient.of(Tags.Items.FOODS_RAW_FISH), 1)
                .baseProcessPower(10)
                .baseProcessTime(200)
                .output(new ItemStack(NRRItems.GELATIN.get(), 4))
                .save(recipeOutput, "gelatin_2");
        ManufactoryRecipeBuilder.builder()
                .input(Ingredient.of(Tags.Items.SANDS), 1)
                .baseProcessPower(20)
                .baseProcessTime(400)
                .output(new ItemStack(NRRItems.SILICON.get(), 1))
                .save(recipeOutput, "silicon");
        ManufactoryRecipeBuilder.builder()
                .input(Ingredient.of(Tags.Items.OBSIDIANS), 1)
                .baseProcessPower(20)
                .baseProcessTime(800)
                .output(new ItemStack(NRRItems.OBSIDIAN_DUST.get(), 4))
                .save(recipeOutput, "obsidian_dust");
        ManufactoryRecipeBuilder.builder()
                .input(Ingredient.of(Tags.Items.END_STONES), 1)
                .baseProcessPower(20)
                .baseProcessTime(400)
                .output(new ItemStack(NRRItems.END_STONE_DUST.get(), 1))
                .save(recipeOutput, "end_stone_dust");
        ManufactoryRecipeBuilder.builder()
                .input(Ingredient.of(ItemTags.COALS), 1)
                .baseProcessPower(20)
                .baseProcessTime(200)
                .output(new ItemStack(NRRItems.COAL_DUST.get(), 1))
                .save(recipeOutput, "coal_dust");
        ManufactoryRecipeBuilder.builder()
                .input(Ingredient.of(CTags.Items.DUSTS_COAL), 1)
                .baseProcessPower(10)
                .baseProcessTime(100)
                .output(new ItemStack(NRRItems.GRAPHITE_DUST.get(), 1))
                .save(recipeOutput, "graphite_dust");
        ManufactoryRecipeBuilder.builder()
                .input(Ingredient.of(CTags.Items.DUSTS_VILLIAUMITE), 1)
                .baseProcessPower(20)
                .baseProcessTime(400)
                .output(new ItemStack(NRRItems.SODIUM_FLUORIDE.get(), 1))
                .save(recipeOutput, "sodium_fluoride");
        ManufactoryRecipeBuilder.builder()
                .input(Ingredient.of(CTags.Items.DUSTS_CAROBBIITE), 1)
                .baseProcessPower(20)
                .baseProcessTime(400)
                .output(new ItemStack(NRRItems.POTASSIUM_FLUORIDE.get(), 1))
                .save(recipeOutput, "potassium_fluoride");
    }
}
