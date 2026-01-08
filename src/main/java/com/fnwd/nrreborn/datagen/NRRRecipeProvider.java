package com.fnwd.nrreborn.datagen;

import com.fnwd.nrreborn.block.NRRBlocks;
import com.fnwd.nrreborn.item.NRRItems;
import com.fnwd.nrreborn.recipe.manufactory.ManufactoryRecipeBuilder;
import com.fnwd.nrreborn.util.tag.CTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class NRRRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public NRRRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput) {
        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC, NRRItems.ENERGETIC_BLEND.get(), 2)
                .requires(Items.REDSTONE)
                .requires(Items.GLOWSTONE_DUST)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput);
        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC, NRRItems.DIMENSIONAL_BLEND.get(), 2)
                .requires(CTags.Items.DUSTS_OBSIDIAN)
                .requires(CTags.Items.DUSTS_OBSIDIAN)
                .requires(CTags.Items.DUSTS_OBSIDIAN)
                .requires(CTags.Items.DUSTS_OBSIDIAN)
                .requires(CTags.Items.DUSTS_END_STONE)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput);
        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC, NRRItems.CARBON_MANGANESE_BLEND.get(), 2)
                .requires(CTags.Items.DUSTS_GRAPHITE)
                .requires(CTags.Items.DUSTS_MANGANESE)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput);
        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC, NRRItems.CRYSTAL_BINDER.get(), 2)
                .requires(CTags.Items.DUSTS_RHODOCHROSITE)
                .requires(CTags.Items.DUSTS_OBSIDIAN)
                .requires(CTags.Items.DUSTS_MAGNESIUM)
                .requires(NRRItems.CALCIUM_SULFATE.get())
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput);
        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC, NRRItems.TBU_FUEL.get(), 1)
                .requires(CTags.Items.INGOTS_THORIUM_232)
                .requires(CTags.Items.INGOTS_THORIUM_232)
                .requires(CTags.Items.INGOTS_THORIUM_232)
                .requires(CTags.Items.INGOTS_THORIUM_232)
                .requires(CTags.Items.INGOTS_THORIUM_232)
                .requires(CTags.Items.INGOTS_THORIUM_232)
                .requires(CTags.Items.INGOTS_THORIUM_232)
                .requires(CTags.Items.INGOTS_THORIUM_232)
                .requires(CTags.Items.INGOTS_THORIUM_232)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput);
        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC, NRRItems.LEU_233_FUEL.get(), 1)
                .requires(CTags.Items.INGOTS_URANIUM_233)
                .requires(CTags.Items.INGOTS_URANIUM_238)
                .requires(CTags.Items.INGOTS_URANIUM_238)
                .requires(CTags.Items.INGOTS_URANIUM_238)
                .requires(CTags.Items.INGOTS_URANIUM_238)
                .requires(CTags.Items.INGOTS_URANIUM_238)
                .requires(CTags.Items.INGOTS_URANIUM_238)
                .requires(CTags.Items.INGOTS_URANIUM_238)
                .requires(CTags.Items.INGOTS_URANIUM_238)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput);
        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC, NRRItems.LEU_235_FUEL.get(), 1)
                .requires(CTags.Items.INGOTS_URANIUM_235)
                .requires(CTags.Items.INGOTS_URANIUM_238)
                .requires(CTags.Items.INGOTS_URANIUM_238)
                .requires(CTags.Items.INGOTS_URANIUM_238)
                .requires(CTags.Items.INGOTS_URANIUM_238)
                .requires(CTags.Items.INGOTS_URANIUM_238)
                .requires(CTags.Items.INGOTS_URANIUM_238)
                .requires(CTags.Items.INGOTS_URANIUM_238)
                .requires(CTags.Items.INGOTS_URANIUM_238)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput);
        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC, NRRItems.LEN_236_FUEL.get(), 1)
                .requires(CTags.Items.INGOTS_NEPTUNIUM_236)
                .requires(CTags.Items.INGOTS_NEPTUNIUM_237)
                .requires(CTags.Items.INGOTS_NEPTUNIUM_237)
                .requires(CTags.Items.INGOTS_NEPTUNIUM_237)
                .requires(CTags.Items.INGOTS_NEPTUNIUM_237)
                .requires(CTags.Items.INGOTS_NEPTUNIUM_237)
                .requires(CTags.Items.INGOTS_NEPTUNIUM_237)
                .requires(CTags.Items.INGOTS_NEPTUNIUM_237)
                .requires(CTags.Items.INGOTS_NEPTUNIUM_237)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput);
        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC, NRRItems.LEP_239_FUEL.get(), 1)
                .requires(CTags.Items.INGOTS_PLUTONIUM_239)
                .requires(CTags.Items.INGOTS_PLUTONIUM_242)
                .requires(CTags.Items.INGOTS_PLUTONIUM_242)
                .requires(CTags.Items.INGOTS_PLUTONIUM_242)
                .requires(CTags.Items.INGOTS_PLUTONIUM_242)
                .requires(CTags.Items.INGOTS_PLUTONIUM_242)
                .requires(CTags.Items.INGOTS_PLUTONIUM_242)
                .requires(CTags.Items.INGOTS_PLUTONIUM_242)
                .requires(CTags.Items.INGOTS_PLUTONIUM_242)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput);
        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC, NRRItems.LEP_241_FUEL.get(), 1)
                .requires(CTags.Items.INGOTS_PLUTONIUM_241)
                .requires(CTags.Items.INGOTS_PLUTONIUM_242)
                .requires(CTags.Items.INGOTS_PLUTONIUM_242)
                .requires(CTags.Items.INGOTS_PLUTONIUM_242)
                .requires(CTags.Items.INGOTS_PLUTONIUM_242)
                .requires(CTags.Items.INGOTS_PLUTONIUM_242)
                .requires(CTags.Items.INGOTS_PLUTONIUM_242)
                .requires(CTags.Items.INGOTS_PLUTONIUM_242)
                .requires(CTags.Items.INGOTS_PLUTONIUM_242)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput);
        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC, NRRItems.MOX_239_FUEL.get(), 1)
                .requires(CTags.Items.INGOTS_PLUTONIUM_239)
                .requires(CTags.Items.INGOTS_URANIUM_238)
                .requires(CTags.Items.INGOTS_URANIUM_238)
                .requires(CTags.Items.INGOTS_URANIUM_238)
                .requires(CTags.Items.INGOTS_URANIUM_238)
                .requires(CTags.Items.INGOTS_URANIUM_238)
                .requires(CTags.Items.INGOTS_URANIUM_238)
                .requires(CTags.Items.INGOTS_URANIUM_238)
                .requires(CTags.Items.INGOTS_URANIUM_238)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput);
        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC, NRRItems.MOX_241_FUEL.get(), 1)
                .requires(CTags.Items.INGOTS_PLUTONIUM_241)
                .requires(CTags.Items.INGOTS_URANIUM_238)
                .requires(CTags.Items.INGOTS_URANIUM_238)
                .requires(CTags.Items.INGOTS_URANIUM_238)
                .requires(CTags.Items.INGOTS_URANIUM_238)
                .requires(CTags.Items.INGOTS_URANIUM_238)
                .requires(CTags.Items.INGOTS_URANIUM_238)
                .requires(CTags.Items.INGOTS_URANIUM_238)
                .requires(CTags.Items.INGOTS_URANIUM_238)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput);
        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC, NRRItems.LEA_242_FUEL.get(), 1)
                .requires(CTags.Items.INGOTS_AMERICIUM_242)
                .requires(CTags.Items.INGOTS_AMERICIUM_243)
                .requires(CTags.Items.INGOTS_AMERICIUM_243)
                .requires(CTags.Items.INGOTS_AMERICIUM_243)
                .requires(CTags.Items.INGOTS_AMERICIUM_243)
                .requires(CTags.Items.INGOTS_AMERICIUM_243)
                .requires(CTags.Items.INGOTS_AMERICIUM_243)
                .requires(CTags.Items.INGOTS_AMERICIUM_243)
                .requires(CTags.Items.INGOTS_AMERICIUM_243)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput);
        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC, NRRItems.LECM_243_FUEL.get(), 1)
                .requires(CTags.Items.INGOTS_CURIUM_243)
                .requires(CTags.Items.INGOTS_CURIUM_246)
                .requires(CTags.Items.INGOTS_CURIUM_246)
                .requires(CTags.Items.INGOTS_CURIUM_246)
                .requires(CTags.Items.INGOTS_CURIUM_246)
                .requires(CTags.Items.INGOTS_CURIUM_246)
                .requires(CTags.Items.INGOTS_CURIUM_246)
                .requires(CTags.Items.INGOTS_CURIUM_246)
                .requires(CTags.Items.INGOTS_CURIUM_246)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput);
        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC, NRRItems.LECM_245_FUEL.get(), 1)
                .requires(CTags.Items.INGOTS_CURIUM_245)
                .requires(CTags.Items.INGOTS_CURIUM_246)
                .requires(CTags.Items.INGOTS_CURIUM_246)
                .requires(CTags.Items.INGOTS_CURIUM_246)
                .requires(CTags.Items.INGOTS_CURIUM_246)
                .requires(CTags.Items.INGOTS_CURIUM_246)
                .requires(CTags.Items.INGOTS_CURIUM_246)
                .requires(CTags.Items.INGOTS_CURIUM_246)
                .requires(CTags.Items.INGOTS_CURIUM_246)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput);
        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC, NRRItems.LECM_247_FUEL.get(), 1)
                .requires(CTags.Items.INGOTS_CURIUM_247)
                .requires(CTags.Items.INGOTS_CURIUM_246)
                .requires(CTags.Items.INGOTS_CURIUM_246)
                .requires(CTags.Items.INGOTS_CURIUM_246)
                .requires(CTags.Items.INGOTS_CURIUM_246)
                .requires(CTags.Items.INGOTS_CURIUM_246)
                .requires(CTags.Items.INGOTS_CURIUM_246)
                .requires(CTags.Items.INGOTS_CURIUM_246)
                .requires(CTags.Items.INGOTS_CURIUM_246)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput);
        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC, NRRItems.LEB_248_FUEL.get(), 1)
                .requires(CTags.Items.INGOTS_BERKELIUM_248)
                .requires(CTags.Items.INGOTS_BERKELIUM_247)
                .requires(CTags.Items.INGOTS_BERKELIUM_247)
                .requires(CTags.Items.INGOTS_BERKELIUM_247)
                .requires(CTags.Items.INGOTS_BERKELIUM_247)
                .requires(CTags.Items.INGOTS_BERKELIUM_247)
                .requires(CTags.Items.INGOTS_BERKELIUM_247)
                .requires(CTags.Items.INGOTS_BERKELIUM_247)
                .requires(CTags.Items.INGOTS_BERKELIUM_247)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput);
        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC, NRRItems.LECF_249_FUEL.get(), 1)
                .requires(CTags.Items.INGOTS_CALIFORNIUM_249)
                .requires(CTags.Items.INGOTS_CALIFORNIUM_252)
                .requires(CTags.Items.INGOTS_CALIFORNIUM_252)
                .requires(CTags.Items.INGOTS_CALIFORNIUM_252)
                .requires(CTags.Items.INGOTS_CALIFORNIUM_252)
                .requires(CTags.Items.INGOTS_CALIFORNIUM_252)
                .requires(CTags.Items.INGOTS_CALIFORNIUM_252)
                .requires(CTags.Items.INGOTS_CALIFORNIUM_252)
                .requires(CTags.Items.INGOTS_CALIFORNIUM_252)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput);
        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC, NRRItems.LECF_251_FUEL.get(), 1)
                .requires(CTags.Items.INGOTS_CALIFORNIUM_251)
                .requires(CTags.Items.INGOTS_CALIFORNIUM_252)
                .requires(CTags.Items.INGOTS_CALIFORNIUM_252)
                .requires(CTags.Items.INGOTS_CALIFORNIUM_252)
                .requires(CTags.Items.INGOTS_CALIFORNIUM_252)
                .requires(CTags.Items.INGOTS_CALIFORNIUM_252)
                .requires(CTags.Items.INGOTS_CALIFORNIUM_252)
                .requires(CTags.Items.INGOTS_CALIFORNIUM_252)
                .requires(CTags.Items.INGOTS_CALIFORNIUM_252)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput);
        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC, NRRItems.HEU_233_FUEL.get(), 1)
                .requires(CTags.Items.INGOTS_URANIUM_233)
                .requires(CTags.Items.INGOTS_URANIUM_233)
                .requires(CTags.Items.INGOTS_URANIUM_233)
                .requires(CTags.Items.INGOTS_URANIUM_233)
                .requires(CTags.Items.INGOTS_URANIUM_238)
                .requires(CTags.Items.INGOTS_URANIUM_238)
                .requires(CTags.Items.INGOTS_URANIUM_238)
                .requires(CTags.Items.INGOTS_URANIUM_238)
                .requires(CTags.Items.INGOTS_URANIUM_238)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput);
        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC, NRRItems.HEU_235_FUEL.get(), 1)
                .requires(CTags.Items.INGOTS_URANIUM_235)
                .requires(CTags.Items.INGOTS_URANIUM_235)
                .requires(CTags.Items.INGOTS_URANIUM_235)
                .requires(CTags.Items.INGOTS_URANIUM_235)
                .requires(CTags.Items.INGOTS_URANIUM_238)
                .requires(CTags.Items.INGOTS_URANIUM_238)
                .requires(CTags.Items.INGOTS_URANIUM_238)
                .requires(CTags.Items.INGOTS_URANIUM_238)
                .requires(CTags.Items.INGOTS_URANIUM_238)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput);
        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC, NRRItems.HEN_236_FUEL.get(), 1)
                .requires(CTags.Items.INGOTS_NEPTUNIUM_236)
                .requires(CTags.Items.INGOTS_NEPTUNIUM_236)
                .requires(CTags.Items.INGOTS_NEPTUNIUM_236)
                .requires(CTags.Items.INGOTS_NEPTUNIUM_236)
                .requires(CTags.Items.INGOTS_NEPTUNIUM_237)
                .requires(CTags.Items.INGOTS_NEPTUNIUM_237)
                .requires(CTags.Items.INGOTS_NEPTUNIUM_237)
                .requires(CTags.Items.INGOTS_NEPTUNIUM_237)
                .requires(CTags.Items.INGOTS_NEPTUNIUM_237)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput);
        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC, NRRItems.HEP_239_FUEL.get(), 1)
                .requires(CTags.Items.INGOTS_PLUTONIUM_239)
                .requires(CTags.Items.INGOTS_PLUTONIUM_239)
                .requires(CTags.Items.INGOTS_PLUTONIUM_239)
                .requires(CTags.Items.INGOTS_PLUTONIUM_239)
                .requires(CTags.Items.INGOTS_PLUTONIUM_242)
                .requires(CTags.Items.INGOTS_PLUTONIUM_242)
                .requires(CTags.Items.INGOTS_PLUTONIUM_242)
                .requires(CTags.Items.INGOTS_PLUTONIUM_242)
                .requires(CTags.Items.INGOTS_PLUTONIUM_242)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput);
        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC, NRRItems.HEP_241_FUEL.get(), 1)
                .requires(CTags.Items.INGOTS_PLUTONIUM_241)
                .requires(CTags.Items.INGOTS_PLUTONIUM_241)
                .requires(CTags.Items.INGOTS_PLUTONIUM_241)
                .requires(CTags.Items.INGOTS_PLUTONIUM_241)
                .requires(CTags.Items.INGOTS_PLUTONIUM_242)
                .requires(CTags.Items.INGOTS_PLUTONIUM_242)
                .requires(CTags.Items.INGOTS_PLUTONIUM_242)
                .requires(CTags.Items.INGOTS_PLUTONIUM_242)
                .requires(CTags.Items.INGOTS_PLUTONIUM_242)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput);
        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC, NRRItems.HEA_242_FUEL.get(), 1)
                .requires(CTags.Items.INGOTS_AMERICIUM_242)
                .requires(CTags.Items.INGOTS_AMERICIUM_242)
                .requires(CTags.Items.INGOTS_AMERICIUM_242)
                .requires(CTags.Items.INGOTS_AMERICIUM_242)
                .requires(CTags.Items.INGOTS_AMERICIUM_243)
                .requires(CTags.Items.INGOTS_AMERICIUM_243)
                .requires(CTags.Items.INGOTS_AMERICIUM_243)
                .requires(CTags.Items.INGOTS_AMERICIUM_243)
                .requires(CTags.Items.INGOTS_AMERICIUM_243)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput);
        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC, NRRItems.HECM_243_FUEL.get(), 1)
                .requires(CTags.Items.INGOTS_CURIUM_243)
                .requires(CTags.Items.INGOTS_CURIUM_243)
                .requires(CTags.Items.INGOTS_CURIUM_243)
                .requires(CTags.Items.INGOTS_CURIUM_243)
                .requires(CTags.Items.INGOTS_CURIUM_246)
                .requires(CTags.Items.INGOTS_CURIUM_246)
                .requires(CTags.Items.INGOTS_CURIUM_246)
                .requires(CTags.Items.INGOTS_CURIUM_246)
                .requires(CTags.Items.INGOTS_CURIUM_246)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput);
        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC, NRRItems.HECM_245_FUEL.get(), 1)
                .requires(CTags.Items.INGOTS_CURIUM_245)
                .requires(CTags.Items.INGOTS_CURIUM_245)
                .requires(CTags.Items.INGOTS_CURIUM_245)
                .requires(CTags.Items.INGOTS_CURIUM_245)
                .requires(CTags.Items.INGOTS_CURIUM_246)
                .requires(CTags.Items.INGOTS_CURIUM_246)
                .requires(CTags.Items.INGOTS_CURIUM_246)
                .requires(CTags.Items.INGOTS_CURIUM_246)
                .requires(CTags.Items.INGOTS_CURIUM_246)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput);
        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC, NRRItems.HECM_247_FUEL.get(), 1)
                .requires(CTags.Items.INGOTS_CURIUM_247)
                .requires(CTags.Items.INGOTS_CURIUM_247)
                .requires(CTags.Items.INGOTS_CURIUM_247)
                .requires(CTags.Items.INGOTS_CURIUM_247)
                .requires(CTags.Items.INGOTS_CURIUM_246)
                .requires(CTags.Items.INGOTS_CURIUM_246)
                .requires(CTags.Items.INGOTS_CURIUM_246)
                .requires(CTags.Items.INGOTS_CURIUM_246)
                .requires(CTags.Items.INGOTS_CURIUM_246)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput);
        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC, NRRItems.HEB_248_FUEL.get(), 1)
                .requires(CTags.Items.INGOTS_BERKELIUM_248)
                .requires(CTags.Items.INGOTS_BERKELIUM_248)
                .requires(CTags.Items.INGOTS_BERKELIUM_248)
                .requires(CTags.Items.INGOTS_BERKELIUM_248)
                .requires(CTags.Items.INGOTS_BERKELIUM_247)
                .requires(CTags.Items.INGOTS_BERKELIUM_247)
                .requires(CTags.Items.INGOTS_BERKELIUM_247)
                .requires(CTags.Items.INGOTS_BERKELIUM_247)
                .requires(CTags.Items.INGOTS_BERKELIUM_247)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput);
        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC, NRRItems.HECF_249_FUEL.get(), 1)
                .requires(CTags.Items.INGOTS_CALIFORNIUM_249)
                .requires(CTags.Items.INGOTS_CALIFORNIUM_249)
                .requires(CTags.Items.INGOTS_CALIFORNIUM_249)
                .requires(CTags.Items.INGOTS_CALIFORNIUM_249)
                .requires(CTags.Items.INGOTS_CALIFORNIUM_252)
                .requires(CTags.Items.INGOTS_CALIFORNIUM_252)
                .requires(CTags.Items.INGOTS_CALIFORNIUM_252)
                .requires(CTags.Items.INGOTS_CALIFORNIUM_252)
                .requires(CTags.Items.INGOTS_CALIFORNIUM_252)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput);
        ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC, NRRItems.HECF_251_FUEL.get(), 1)
                .requires(CTags.Items.INGOTS_CALIFORNIUM_251)
                .requires(CTags.Items.INGOTS_CALIFORNIUM_251)
                .requires(CTags.Items.INGOTS_CALIFORNIUM_251)
                .requires(CTags.Items.INGOTS_CALIFORNIUM_251)
                .requires(CTags.Items.INGOTS_CALIFORNIUM_252)
                .requires(CTags.Items.INGOTS_CALIFORNIUM_252)
                .requires(CTags.Items.INGOTS_CALIFORNIUM_252)
                .requires(CTags.Items.INGOTS_CALIFORNIUM_252)
                .requires(CTags.Items.INGOTS_CALIFORNIUM_252)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput);
        ShapedRecipeBuilder
                .shaped(RecipeCategory.MISC, NRRItems.BASIC_PLATING.get(), 2)
                .pattern("AB")
                .pattern("BA")
                .define('A', CTags.Items.INGOTS_LEAD)
                .define('B', CTags.Items.DUSTS_GRAPHITE)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "basic_plating_1");
        ShapedRecipeBuilder
                .shaped(RecipeCategory.MISC, NRRItems.BASIC_PLATING.get(), 2)
                .pattern("AB")
                .pattern("BA")
                .define('A', CTags.Items.DUSTS_GRAPHITE)
                .define('B', CTags.Items.INGOTS_LEAD)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "basic_plating_2");
        ShapedRecipeBuilder
                .shaped(RecipeCategory.MISC, NRRItems.ADVANCED_PLATING.get())
                .pattern("ABA")
                .pattern("BCB")
                .pattern("ABA")
                .define('A', Items.REDSTONE)
                .define('B', CTags.Items.INGOTS_TOUGH_ALLOY)
                .define('C', NRRItems.BASIC_PLATING.get())
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput);
        ShapedRecipeBuilder
                .shaped(RecipeCategory.MISC, NRRItems.DEPLETED_URANIUM_PLATING.get())
                .pattern("ABA")
                .pattern("BCB")
                .pattern("ABA")
                .define('A', CTags.Items.DUSTS_SULFUR)
                .define('B', CTags.Items.INGOTS_URANIUM_238)
                .define('C', NRRItems.ADVANCED_PLATING.get())
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput);
        ShapedRecipeBuilder
                .shaped(RecipeCategory.MISC, NRRItems.ELITE_PLATING.get())
                .pattern("ABA")
                .pattern("BCB")
                .pattern("ABA")
                .define('A', NRRItems.CRYSTAL_BINDER.get())
                .define('B', CTags.Items.INGOTS_BORON)
                .define('C', NRRItems.DEPLETED_URANIUM_PLATING.get())
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput);
        ShapedRecipeBuilder
                .shaped(RecipeCategory.MISC, NRRItems.COPPER_SOLENOID.get(), 2)
                .pattern("AA")
                .pattern("BB")
                .pattern("AA")
                .define('A', Items.COPPER_INGOT)
                .define('B', Items.IRON_INGOT)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput);
        ShapedRecipeBuilder
                .shaped(RecipeCategory.MISC, NRRItems.MAGNESIUM_DIBORIDE_SOLENOID.get(), 2)
                .pattern("AA")
                .pattern("BB")
                .pattern("AA")
                .define('A', CTags.Items.INGOTS_MAGNESIUM_DIBORIDE_ALLOY)
                .define('B', CTags.Items.INGOTS_TOUGH_ALLOY)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput);
        ShapedRecipeBuilder
                .shaped(RecipeCategory.MISC, NRRItems.SERVOMECHANISM.get())
                .pattern("A A")
                .pattern("BCB")
                .pattern("CDC")
                .define('A', CTags.Items.INGOTS_FERROBORON_ALLOY)
                .define('B', Items.REDSTONE)
                .define('C', CTags.Items.INGOTS_STEEL)
                .define('D', Items.COPPER_INGOT)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput);
        ShapedRecipeBuilder
                .shaped(RecipeCategory.MISC, NRRItems.ELECTRIC_MOTOR.get())
                .pattern("AAB")
                .pattern("CCD")
                .pattern("AAB")
                .define('A', CTags.Items.INGOTS_STEEL)
                .define('B', Items.GOLD_NUGGET)
                .define('C', NRRItems.COPPER_SOLENOID)
                .define('D', Items.IRON_INGOT)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput);
        ShapedRecipeBuilder
                .shaped(RecipeCategory.MISC, NRRItems.LINEAR_ACTUATOR.get())
                .pattern("  A")
                .pattern("BC ")
                .pattern("DB ")
                .define('A', CTags.Items.INGOTS_STEEL)
                .define('B', CTags.Items.INGOTS_FERROBORON_ALLOY)
                .define('C', Items.PISTON)
                .define('D', Items.COPPER_INGOT)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput);
        ShapedRecipeBuilder
                .shaped(RecipeCategory.MISC, NRRItems.SPEED_UPGRADE.get())
                .pattern("ABA")
                .pattern("BCB")
                .pattern("ABA")
                .define('A', Items.LAPIS_LAZULI)
                .define('B', Items.REDSTONE)
                .define('C', Items.HEAVY_WEIGHTED_PRESSURE_PLATE)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput);
        ShapedRecipeBuilder
                .shaped(RecipeCategory.MISC, NRRItems.ENERGY_UPGRADE.get())
                .pattern("ABA")
                .pattern("BCB")
                .pattern("ABA")
                .define('A', CTags.Items.DUSTS_OBSIDIAN)
                .define('B', CTags.Items.DUSTS_QUARTZ)
                .define('C', Items.LIGHT_WEIGHTED_PRESSURE_PLATE)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput);
        ShapedRecipeBuilder
                .shaped(RecipeCategory.MISC, NRRItems.PORTABLE_ENDER_CHEST.get())
                .pattern(" A ")
                .pattern("BCB")
                .pattern("DBD")
                .define('A', Tags.Items.STRINGS)
                .define('B', Items.PURPLE_WOOL)
                .define('C', Items.ENDER_CHEST)
                .define('D', CTags.Items.INGOTS_TOUGH_ALLOY)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "portable_ender_chest_1");
        ShapedRecipeBuilder
                .shaped(RecipeCategory.MISC, NRRItems.PORTABLE_ENDER_CHEST.get())
                .pattern(" A ")
                .pattern("BCB")
                .pattern("DBD")
                .define('A', Tags.Items.STRINGS)
                .define('B', Items.BLACK_WOOL)
                .define('C', Items.ENDER_CHEST)
                .define('D', CTags.Items.INGOTS_TOUGH_ALLOY)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "portable_ender_chest_2");
        ShapedRecipeBuilder
                .shaped(RecipeCategory.MISC, NRRBlocks.MANUFACTORY.asItem())
                .pattern("ABA")
                .pattern("CDC")
                .pattern("AEA")
                .define('A', CTags.Items.INGOTS_LEAD)
                .define('B', Items.REDSTONE)
                .define('C', Items.FLINT)
                .define('D', Items.PISTON)
                .define('E', NRRItems.COPPER_SOLENOID.get())
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput);
        ShapedRecipeBuilder
                .shaped(RecipeCategory.MISC, NRRBlocks.BASIC_SOLAR_PANEL.asItem())
                .pattern("ABA")
                .pattern("CDC")
                .pattern("ECE")
                .define('A', CTags.Items.DUSTS_GRAPHITE)
                .define('B', CTags.Items.DUSTS_QUARTZ)
                .define('C', Items.HEAVY_WEIGHTED_PRESSURE_PLATE)
                .define('D', Items.LAPIS_LAZULI)
                .define('E', NRRItems.COPPER_SOLENOID.get())
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput);
        ShapedRecipeBuilder
                .shaped(RecipeCategory.MISC, NRRBlocks.ADVANCED_SOLAR_PANEL.asItem())
                .pattern("ABA")
                .pattern("CCC")
                .pattern("ADA")
                .define('A', NRRItems.ADVANCED_PLATING.get())
                .define('B', CTags.Items.DUSTS_GRAPHITE)
                .define('C', NRRBlocks.BASIC_SOLAR_PANEL.asItem())
                .define('D', NRRItems.COPPER_SOLENOID.get())
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput);
        ShapedRecipeBuilder
                .shaped(RecipeCategory.MISC, NRRBlocks.DEPLETED_URANIUM_SOLAR_PANEL.asItem())
                .pattern("ABA")
                .pattern("CCC")
                .pattern("ADA")
                .define('A', NRRItems.DEPLETED_URANIUM_PLATING.get())
                .define('B', CTags.Items.DUSTS_GRAPHITE)
                .define('C', NRRBlocks.ADVANCED_SOLAR_PANEL.asItem())
                .define('D', NRRItems.MAGNESIUM_DIBORIDE_SOLENOID.get())
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput);
        ShapedRecipeBuilder
                .shaped(RecipeCategory.MISC, NRRBlocks.ELITE_SOLAR_PANEL.asItem())
                .pattern("ABA")
                .pattern("CCC")
                .pattern("ADA")
                .define('A', NRRItems.ELITE_PLATING.get())
                .define('B', CTags.Items.GEMS_BORON_ARSENIDE)
                .define('C', NRRBlocks.DEPLETED_URANIUM_SOLAR_PANEL.asItem())
                .define('D', NRRItems.MAGNESIUM_DIBORIDE_SOLENOID.get())
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput);
        ShapedRecipeBuilder
                .shaped(RecipeCategory.MISC, NRRBlocks.PLUTONIUM_RTG.asItem())
                .pattern("ABA")
                .pattern("BCB")
                .pattern("ABA")
                .define('A', NRRItems.ADVANCED_PLATING.get())
                .define('B', CTags.Items.INGOTS_GRAPHITE)
                .define('C', CTags.Items.INGOTS_PLUTONIUM_238)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput);
        ShapedRecipeBuilder
                .shaped(RecipeCategory.MISC, NRRBlocks.AMERICIUM_RTG.asItem())
                .pattern("ABA")
                .pattern("BCB")
                .pattern("ABA")
                .define('A', NRRItems.ADVANCED_PLATING.get())
                .define('B', CTags.Items.INGOTS_GRAPHITE)
                .define('C', CTags.Items.INGOTS_AMERICIUM_241)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput);
        ShapedRecipeBuilder
                .shaped(RecipeCategory.MISC, NRRBlocks.CALIFORNIUM_RTG.asItem())
                .pattern("ABA")
                .pattern("BCB")
                .pattern("ABA")
                .define('A', NRRItems.ADVANCED_PLATING.get())
                .define('B', CTags.Items.INGOTS_GRAPHITE)
                .define('C', CTags.Items.INGOTS_CALIFORNIUM_250)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput);
        oreSmelting(recipeOutput, List.of(NRRBlocks.TIN_ORE, NRRBlocks.DEEPSLATE_TIN_ORE), RecipeCategory.MISC, NRRItems.TIN_INGOT.get(), 0.7F, 200, "tin_ingot");
        oreBlasting(recipeOutput, List.of(NRRBlocks.TIN_ORE, NRRBlocks.DEEPSLATE_TIN_ORE), RecipeCategory.MISC, NRRItems.TIN_INGOT.get(), 0.7F, 100, "tin_ingot");
        oreSmelting(recipeOutput, List.of(NRRBlocks.LEAD_ORE, NRRBlocks.DEEPSLATE_LEAD_ORE), RecipeCategory.MISC, NRRItems.LEAD_INGOT.get(), 0.7F, 200, "lead_ingot");
        oreBlasting(recipeOutput, List.of(NRRBlocks.LEAD_ORE, NRRBlocks.DEEPSLATE_LEAD_ORE), RecipeCategory.MISC, NRRItems.LEAD_INGOT.get(), 0.7F, 100, "lead_ingot");
        oreSmelting(recipeOutput, List.of(NRRBlocks.MAGNESIUM_ORE, NRRBlocks.DEEPSLATE_MAGNESIUM_ORE), RecipeCategory.MISC, NRRItems.MAGNESIUM_INGOT.get(), 0.7F, 200, "magnesium_ingot");
        oreBlasting(recipeOutput, List.of(NRRBlocks.MAGNESIUM_ORE, NRRBlocks.DEEPSLATE_MAGNESIUM_ORE), RecipeCategory.MISC, NRRItems.MAGNESIUM_INGOT.get(), 0.7F, 100, "magnesium_ingot");
        oreSmelting(recipeOutput, List.of(NRRBlocks.LITHIUM_ORE, NRRBlocks.DEEPSLATE_LITHIUM_ORE), RecipeCategory.MISC, NRRItems.LITHIUM_INGOT.get(), 0.7F, 200, "lithium_ingot");
        oreBlasting(recipeOutput, List.of(NRRBlocks.LITHIUM_ORE, NRRBlocks.DEEPSLATE_LITHIUM_ORE), RecipeCategory.MISC, NRRItems.LITHIUM_INGOT.get(), 0.7F, 100, "lithium_ingot");
        oreSmelting(recipeOutput, List.of(NRRBlocks.BORON_ORE, NRRBlocks.DEEPSLATE_BORON_ORE), RecipeCategory.MISC, NRRItems.BORON_INGOT.get(), 0.7F, 200, "boron_ingot");
        oreBlasting(recipeOutput, List.of(NRRBlocks.BORON_ORE, NRRBlocks.DEEPSLATE_BORON_ORE), RecipeCategory.MISC, NRRItems.BORON_INGOT.get(), 0.7F, 100, "boron_ingot");
        oreSmelting(recipeOutput, List.of(NRRBlocks.THORIUM_ORE, NRRBlocks.DEEPSLATE_THORIUM_ORE), RecipeCategory.MISC, NRRItems.THORIUM_INGOT.get(), 0.7F, 200, "thorium_ingot");
        oreBlasting(recipeOutput, List.of(NRRBlocks.THORIUM_ORE, NRRBlocks.DEEPSLATE_THORIUM_ORE), RecipeCategory.MISC, NRRItems.THORIUM_INGOT.get(), 0.7F, 100, "thorium_ingot");
        oreSmelting(recipeOutput, List.of(NRRBlocks.URANIUM_ORE, NRRBlocks.DEEPSLATE_URANIUM_ORE), RecipeCategory.MISC, NRRItems.URANIUM_INGOT.get(), 0.7F, 200, "uranium_ingot");
        oreBlasting(recipeOutput, List.of(NRRBlocks.URANIUM_ORE, NRRBlocks.DEEPSLATE_URANIUM_ORE), RecipeCategory.MISC, NRRItems.URANIUM_INGOT.get(), 0.7F, 100, "uranium_ingot");
        oreSmelting(recipeOutput, List.of(NRRItems.RAW_TIN), RecipeCategory.MISC, NRRItems.TIN_INGOT.get(), 0.7F, 200, "tin_ingot");
        oreBlasting(recipeOutput, List.of(NRRItems.RAW_TIN), RecipeCategory.MISC, NRRItems.TIN_INGOT.get(), 0.7F, 100, "tin_ingot");
        oreSmelting(recipeOutput, List.of(NRRItems.RAW_LEAD), RecipeCategory.MISC, NRRItems.LEAD_INGOT.get(), 0.7F, 200, "lead_ingot");
        oreBlasting(recipeOutput, List.of(NRRItems.RAW_LEAD), RecipeCategory.MISC, NRRItems.LEAD_INGOT.get(), 0.7F, 100, "lead_ingot");
        oreSmelting(recipeOutput, List.of(NRRItems.RAW_MAGNESIUM), RecipeCategory.MISC, NRRItems.MAGNESIUM_INGOT.get(), 0.7F, 200, "magnesium_ingot");
        oreBlasting(recipeOutput, List.of(NRRItems.RAW_MAGNESIUM), RecipeCategory.MISC, NRRItems.MAGNESIUM_INGOT.get(), 0.7F, 100, "magnesium_ingot");
        oreSmelting(recipeOutput, List.of(NRRItems.RAW_LITHIUM), RecipeCategory.MISC, NRRItems.LITHIUM_INGOT.get(), 0.7F, 200, "lithium_ingot");
        oreBlasting(recipeOutput, List.of(NRRItems.RAW_LITHIUM), RecipeCategory.MISC, NRRItems.LITHIUM_INGOT.get(), 0.7F, 100, "lithium_ingot");
        oreSmelting(recipeOutput, List.of(NRRItems.RAW_BORON), RecipeCategory.MISC, NRRItems.BORON_INGOT.get(), 0.7F, 200, "boron_ingot");
        oreBlasting(recipeOutput, List.of(NRRItems.RAW_BORON), RecipeCategory.MISC, NRRItems.BORON_INGOT.get(), 0.7F, 100, "boron_ingot");
        oreSmelting(recipeOutput, List.of(NRRItems.RAW_THORIUM), RecipeCategory.MISC, NRRItems.THORIUM_INGOT.get(), 0.7F, 200, "thorium_ingot");
        oreBlasting(recipeOutput, List.of(NRRItems.RAW_THORIUM), RecipeCategory.MISC, NRRItems.THORIUM_INGOT.get(), 0.7F, 100, "thorium_ingot");
        oreSmelting(recipeOutput, List.of(NRRItems.RAW_URANIUM), RecipeCategory.MISC, NRRItems.URANIUM_INGOT.get(), 0.7F, 200, "uranium_ingot");
        oreBlasting(recipeOutput, List.of(NRRItems.RAW_URANIUM), RecipeCategory.MISC, NRRItems.URANIUM_INGOT.get(), 0.7F, 100, "uranium_ingot");
        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(CTags.Items.DUSTS_TIN), RecipeCategory.MISC, NRRItems.TIN_INGOT.get(), 0.3F, 200)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "tin_ingot_1");
        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(CTags.Items.DUSTS_TIN), RecipeCategory.MISC, NRRItems.TIN_INGOT.get(), 0.3F, 100)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "tin_ingot_2");
        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(CTags.Items.INGOTS_TIN_OXIDE), RecipeCategory.MISC, NRRItems.TIN_INGOT.get(), 0.3F, 200)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "tin_ingot_3");
        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(CTags.Items.INGOTS_TIN_OXIDE), RecipeCategory.MISC, NRRItems.TIN_INGOT.get(), 0.3F, 100)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "tin_ingot_4");
        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(CTags.Items.DUSTS_TIN_OXIDE), RecipeCategory.MISC, NRRItems.TIN_OXIDE_INGOT.get(), 0.3F, 200)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "tin_oxide_ingot_1");
        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(CTags.Items.DUSTS_TIN_OXIDE), RecipeCategory.MISC, NRRItems.TIN_OXIDE_INGOT.get(), 0.3F, 100)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "tin_oxide_ingot_2");
        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(CTags.Items.DUSTS_ALUMINUM), RecipeCategory.MISC, NRRItems.ALUMINUM_INGOT.get(), 0.3F, 200)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "aluminum_ingot_1");
        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(CTags.Items.DUSTS_ALUMINUM), RecipeCategory.MISC, NRRItems.ALUMINUM_INGOT.get(), 0.3F, 100)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "aluminum_ingot_2");
        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(CTags.Items.DUSTS_SILVER), RecipeCategory.MISC, NRRItems.SILVER_INGOT.get(), 0.3F, 200)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "silver_ingot_1");
        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(CTags.Items.DUSTS_SILVER), RecipeCategory.MISC, NRRItems.SILVER_INGOT.get(), 0.3F, 100)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "silver_ingot_2");
        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(CTags.Items.DUSTS_LEAD), RecipeCategory.MISC, NRRItems.LEAD_INGOT.get(), 0.3F, 200)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "lead_ingot_1");
        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(CTags.Items.DUSTS_LEAD), RecipeCategory.MISC, NRRItems.LEAD_INGOT.get(), 0.3F, 100)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "lead_ingot_2");
        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(CTags.Items.DUSTS_MAGNESIUM), RecipeCategory.MISC, NRRItems.MAGNESIUM_INGOT.get(), 0.3F, 200)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "magnesium_ingot_1");
        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(CTags.Items.DUSTS_MAGNESIUM), RecipeCategory.MISC, NRRItems.MAGNESIUM_INGOT.get(), 0.3F, 100)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "magnesium_ingot_2");
        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(CTags.Items.DUSTS_LITHIUM), RecipeCategory.MISC, NRRItems.LITHIUM_INGOT.get(), 0.3F, 200)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "lithium_ingot_1");
        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(CTags.Items.DUSTS_LITHIUM), RecipeCategory.MISC, NRRItems.LITHIUM_INGOT.get(), 0.3F, 100)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "lithium_ingot_2");
        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(CTags.Items.DUSTS_BORON), RecipeCategory.MISC, NRRItems.BORON_INGOT.get(), 0.3F, 200)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "boron_ingot_1");
        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(CTags.Items.DUSTS_BORON), RecipeCategory.MISC, NRRItems.BORON_INGOT.get(), 0.3F, 100)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "boron_ingot_2");
        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(CTags.Items.DUSTS_BERYLLIUM), RecipeCategory.MISC, NRRItems.BERYLLIUM_INGOT.get(), 0.3F, 200)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "beryllium_ingot_1");
        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(CTags.Items.DUSTS_BERYLLIUM), RecipeCategory.MISC, NRRItems.BERYLLIUM_INGOT.get(), 0.3F, 100)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "beryllium_ingot_2");
        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(CTags.Items.DUSTS_ZIRCONIUM), RecipeCategory.MISC, NRRItems.ZIRCONIUM_INGOT.get(), 0.3F, 200)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "zirconium_ingot_1");
        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(CTags.Items.DUSTS_ZIRCONIUM), RecipeCategory.MISC, NRRItems.ZIRCONIUM_INGOT.get(), 0.3F, 100)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "zirconium_ingot_2");
        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(CTags.Items.INGOTS_ZIRCONIA), RecipeCategory.MISC, NRRItems.ZIRCONIUM_INGOT.get(), 0.3F, 200)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "zirconium_ingot_3");
        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(CTags.Items.INGOTS_ZIRCONIA), RecipeCategory.MISC, NRRItems.ZIRCONIUM_INGOT.get(), 0.3F, 100)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "zirconium_ingot_4");
        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(CTags.Items.DUSTS_ZIRCONIA), RecipeCategory.MISC, NRRItems.ZIRCONIA_INGOT.get(), 0.3F, 200)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "zirconia_ingot_1");
        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(CTags.Items.DUSTS_ZIRCONIA), RecipeCategory.MISC, NRRItems.ZIRCONIA_INGOT.get(), 0.3F, 100)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "zirconia_ingot_2");
        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(CTags.Items.DUSTS_THORIUM), RecipeCategory.MISC, NRRItems.THORIUM_INGOT.get(), 0.3F, 200)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "thorium_ingot_1");
        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(CTags.Items.DUSTS_THORIUM), RecipeCategory.MISC, NRRItems.THORIUM_INGOT.get(), 0.3F, 100)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "thorium_ingot_2");
        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(CTags.Items.INGOTS_THORIUM_OXIDE), RecipeCategory.MISC, NRRItems.THORIUM_INGOT.get(), 0.3F, 200)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "thorium_ingot_3");
        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(CTags.Items.INGOTS_THORIUM_OXIDE), RecipeCategory.MISC, NRRItems.THORIUM_INGOT.get(), 0.3F, 100)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "thorium_ingot_4");
        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(CTags.Items.DUSTS_URANIUM), RecipeCategory.MISC, NRRItems.URANIUM_INGOT.get(), 0.3F, 200)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "uranium_ingot_1");
        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(CTags.Items.DUSTS_URANIUM), RecipeCategory.MISC, NRRItems.URANIUM_INGOT.get(), 0.3F, 100)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "uranium_ingot_2");
        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(CTags.Items.INGOTS_URANIUM_OXIDE), RecipeCategory.MISC, NRRItems.URANIUM_INGOT.get(), 0.3F, 200)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "uranium_ingot_3");
        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(CTags.Items.INGOTS_URANIUM_OXIDE), RecipeCategory.MISC, NRRItems.URANIUM_INGOT.get(), 0.3F, 100)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "uranium_ingot_4");
        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(CTags.Items.DUSTS_THORIUM_OXIDE), RecipeCategory.MISC, NRRItems.THORIUM_OXIDE_INGOT.get(), 0.3F, 200)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "thorium_oxide_ingot_1");
        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(CTags.Items.DUSTS_THORIUM_OXIDE), RecipeCategory.MISC, NRRItems.THORIUM_OXIDE_INGOT.get(), 0.3F, 100)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "thorium_oxide_ingot_2");
        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(CTags.Items.DUSTS_URANIUM_OXIDE), RecipeCategory.MISC, NRRItems.URANIUM_OXIDE_INGOT.get(), 0.3F, 200)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "uranium_oxide_ingot_1");
        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(CTags.Items.DUSTS_URANIUM_OXIDE), RecipeCategory.MISC, NRRItems.URANIUM_OXIDE_INGOT.get(), 0.3F, 100)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "uranium_oxide_ingot_2");
        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(CTags.Items.DUSTS_MANGANESE), RecipeCategory.MISC, NRRItems.MANGANESE_INGOT.get(), 0.3F, 200)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "manganese_ingot_1");
        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(CTags.Items.DUSTS_MANGANESE), RecipeCategory.MISC, NRRItems.MANGANESE_INGOT.get(), 0.3F, 100)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "manganese_ingot_2");
        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(CTags.Items.INGOTS_MANGANESE_OXIDE), RecipeCategory.MISC, NRRItems.MANGANESE_INGOT.get(), 0.3F, 200)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "manganese_ingot_3");
        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(CTags.Items.INGOTS_MANGANESE_OXIDE), RecipeCategory.MISC, NRRItems.MANGANESE_INGOT.get(), 0.3F, 100)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "manganese_ingot_4");
        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(CTags.Items.DUSTS_MANGANESE_OXIDE), RecipeCategory.MISC, NRRItems.MANGANESE_OXIDE_INGOT.get(), 0.3F, 200)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "manganese_oxide_ingot_1");
        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(CTags.Items.DUSTS_MANGANESE_OXIDE), RecipeCategory.MISC, NRRItems.MANGANESE_OXIDE_INGOT.get(), 0.3F, 100)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "manganese_oxide_ingot_2");
        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(CTags.Items.INGOTS_MANGANESE_DIOXIDE), RecipeCategory.MISC, NRRItems.MANGANESE_OXIDE_INGOT.get(), 0.3F, 200)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "manganese_oxide_ingot_3");
        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(CTags.Items.INGOTS_MANGANESE_DIOXIDE), RecipeCategory.MISC, NRRItems.MANGANESE_OXIDE_INGOT.get(), 0.3F, 100)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "manganese_oxide_ingot_4");
        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(CTags.Items.DUSTS_MANGANESE_DIOXIDE), RecipeCategory.MISC, NRRItems.MANGANESE_DIOXIDE_INGOT.get(), 0.3F, 200)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "manganese_dioxide_ingot_1");
        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(CTags.Items.DUSTS_MANGANESE_DIOXIDE), RecipeCategory.MISC, NRRItems.MANGANESE_DIOXIDE_INGOT.get(), 0.3F, 100)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "manganese_dioxide_ingot_2");
        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(CTags.Items.DUSTS_GRAPHITE), RecipeCategory.MISC, NRRItems.GRAPHITE_INGOT.get(), 0.3F, 200)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "graphite_ingot_1");
        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(CTags.Items.DUSTS_GRAPHITE), RecipeCategory.MISC, NRRItems.GRAPHITE_INGOT.get(), 0.3F, 100)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "graphite_ingot_2");
        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(CTags.Items.DUSTS_NICKEL), RecipeCategory.MISC, NRRItems.NICKEL_INGOT.get(), 0.3F, 200)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "nickel_ingot_1");
        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(CTags.Items.DUSTS_NICKEL), RecipeCategory.MISC, NRRItems.NICKEL_INGOT.get(), 0.3F, 100)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "nickel_ingot_2");
        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(CTags.Items.INGOTS_NICKEL_OXIDE), RecipeCategory.MISC, NRRItems.NICKEL_INGOT.get(), 0.3F, 200)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "nickel_ingot_3");
        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(CTags.Items.INGOTS_NICKEL_OXIDE), RecipeCategory.MISC, NRRItems.NICKEL_INGOT.get(), 0.3F, 100)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "nickel_ingot_4");
        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(CTags.Items.DUSTS_NICKEL_OXIDE), RecipeCategory.MISC, NRRItems.NICKEL_OXIDE_INGOT.get(), 0.3F, 200)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "nickel_oxide_ingot_1");
        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(CTags.Items.DUSTS_NICKEL_OXIDE), RecipeCategory.MISC, NRRItems.NICKEL_OXIDE_INGOT.get(), 0.3F, 100)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "nickel_oxide_ingot_2");
        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(CTags.Items.DUSTS_COBALT), RecipeCategory.MISC, NRRItems.COBALT_INGOT.get(), 0.3F, 200)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "cobalt_ingot_1");
        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(CTags.Items.DUSTS_COBALT), RecipeCategory.MISC, NRRItems.COBALT_INGOT.get(), 0.3F, 100)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "cobalt_ingot_2");
        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(CTags.Items.INGOTS_COBALT_OXIDE), RecipeCategory.MISC, NRRItems.COBALT_INGOT.get(), 0.3F, 200)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "cobalt_ingot_3");
        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(CTags.Items.INGOTS_COBALT_OXIDE), RecipeCategory.MISC, NRRItems.COBALT_INGOT.get(), 0.3F, 100)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "cobalt_ingot_4");
        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(CTags.Items.DUSTS_COBALT_OXIDE), RecipeCategory.MISC, NRRItems.COBALT_OXIDE_INGOT.get(), 0.3F, 200)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "cobalt_oxide_ingot_1");
        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(CTags.Items.DUSTS_COBALT_OXIDE), RecipeCategory.MISC, NRRItems.COBALT_OXIDE_INGOT.get(), 0.3F, 100)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "cobalt_oxide_ingot_2");
        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(CTags.Items.DUSTS_CHROMIUM), RecipeCategory.MISC, NRRItems.CHROMIUM_INGOT.get(), 0.3F, 200)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "chromium_ingot_1");
        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(CTags.Items.DUSTS_CHROMIUM), RecipeCategory.MISC, NRRItems.CHROMIUM_INGOT.get(), 0.3F, 100)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "chromium_ingot_2");
        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(CTags.Items.DUSTS_TITANIUM), RecipeCategory.MISC, NRRItems.TITANIUM_INGOT.get(), 0.3F, 200)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "titanium_ingot_1");
        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(CTags.Items.DUSTS_TITANIUM), RecipeCategory.MISC, NRRItems.TITANIUM_INGOT.get(), 0.3F, 100)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "titanium_ingot_2");
        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(CTags.Items.DUSTS_ZINC), RecipeCategory.MISC, NRRItems.ZINC_INGOT.get(), 0.3F, 200)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "zinc_ingot_1");
        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(CTags.Items.DUSTS_ZINC), RecipeCategory.MISC, NRRItems.ZINC_INGOT.get(), 0.3F, 100)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "zinc_ingot_2");
        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(CTags.Items.DUSTS_TUNGSTEN), RecipeCategory.MISC, NRRItems.TUNGSTEN_INGOT.get(), 0.3F, 200)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "tungsten_ingot_1");
        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(CTags.Items.DUSTS_TUNGSTEN), RecipeCategory.MISC, NRRItems.TUNGSTEN_INGOT.get(), 0.3F, 100)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "tungsten_ingot_2");
        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(CTags.Items.DUSTS_HAFNIUM), RecipeCategory.MISC, NRRItems.HAFNIUM_INGOT.get(), 0.3F, 200)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "hafnium_ingot_1");
        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(CTags.Items.DUSTS_HAFNIUM), RecipeCategory.MISC, NRRItems.HAFNIUM_INGOT.get(), 0.3F, 100)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "hafnium_ingot_2");
        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(CTags.Items.DUSTS_NIOBIUM), RecipeCategory.MISC, NRRItems.NIOBIUM_INGOT.get(), 0.3F, 200)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "niobium_ingot_1");
        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(CTags.Items.DUSTS_NIOBIUM), RecipeCategory.MISC, NRRItems.NIOBIUM_INGOT.get(), 0.3F, 100)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "niobium_ingot_2");
        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(CTags.Items.DUSTS_YTTRIUM), RecipeCategory.MISC, NRRItems.YTTRIUM_INGOT.get(), 0.3F, 200)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "yttrium_ingot_1");
        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(CTags.Items.DUSTS_YTTRIUM), RecipeCategory.MISC, NRRItems.YTTRIUM_INGOT.get(), 0.3F, 100)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "yttrium_ingot_2");
        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(CTags.Items.DUSTS_NEODYMIUM), RecipeCategory.MISC, NRRItems.NEODYMIUM_INGOT.get(), 0.3F, 200)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "neodymium_ingot_1");
        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(CTags.Items.DUSTS_NEODYMIUM), RecipeCategory.MISC, NRRItems.NEODYMIUM_INGOT.get(), 0.3F, 100)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "neodymium_ingot_2");
        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(CTags.Items.DUSTS_PALLADIUM), RecipeCategory.MISC, NRRItems.PALLADIUM_INGOT.get(), 0.3F, 200)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "palladium_ingot_1");
        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(CTags.Items.DUSTS_PALLADIUM), RecipeCategory.MISC, NRRItems.PALLADIUM_INGOT.get(), 0.3F, 100)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "palladium_ingot_2");
        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(CTags.Items.DUSTS_PLATINUM), RecipeCategory.MISC, NRRItems.PLATINUM_INGOT.get(), 0.3F, 200)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "platinum_ingot_1");
        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(CTags.Items.DUSTS_PLATINUM), RecipeCategory.MISC, NRRItems.PLATINUM_INGOT.get(), 0.3F, 100)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "platinum_ingot_2");
        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(CTags.Items.DUSTS_IRIDIUM), RecipeCategory.MISC, NRRItems.IRIDIUM_INGOT.get(), 0.3F, 200)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "iridium_ingot_1");
        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(CTags.Items.DUSTS_IRIDIUM), RecipeCategory.MISC, NRRItems.IRIDIUM_INGOT.get(), 0.3F, 100)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "iridium_ingot_2");
        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(CTags.Items.INGOTS_IRIDIUM_OXIDE), RecipeCategory.MISC, NRRItems.IRIDIUM_INGOT.get(), 0.3F, 200)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "iridium_ingot_3");
        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(CTags.Items.INGOTS_IRIDIUM_OXIDE), RecipeCategory.MISC, NRRItems.IRIDIUM_INGOT.get(), 0.3F, 100)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "iridium_ingot_4");
        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(CTags.Items.DUSTS_IRIDIUM_OXIDE), RecipeCategory.MISC, NRRItems.IRIDIUM_OXIDE_INGOT.get(), 0.3F, 200)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "iridium_oxide_ingot_1");
        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(CTags.Items.DUSTS_IRIDIUM_OXIDE), RecipeCategory.MISC, NRRItems.IRIDIUM_OXIDE_INGOT.get(), 0.3F, 100)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "iridium_oxide_ingot_2");
        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(CTags.Items.DUSTS_RUTHENIUM_OXIDE), RecipeCategory.MISC, NRRItems.RUTHENIUM_OXIDE_INGOT.get(), 0.3F, 200)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "ruthenium_oxide_ingot_1");
        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(CTags.Items.DUSTS_RUTHENIUM_OXIDE), RecipeCategory.MISC, NRRItems.RUTHENIUM_OXIDE_INGOT.get(), 0.3F, 100)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "ruthenium_oxide_ingot_2");
        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(CTags.Items.DUSTS_OSMIUM), RecipeCategory.MISC, NRRItems.OSMIUM_INGOT.get(), 0.3F, 200)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "osmium_ingot_1");
        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(CTags.Items.DUSTS_OSMIUM), RecipeCategory.MISC, NRRItems.OSMIUM_INGOT.get(), 0.3F, 100)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "osmium_ingot_2");
        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(CTags.Items.DUSTS_SODIUM), RecipeCategory.MISC, NRRItems.SODIUM_INGOT.get(), 0.3F, 200)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "sodium_ingot_1");
        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(CTags.Items.DUSTS_SODIUM), RecipeCategory.MISC, NRRItems.SODIUM_INGOT.get(), 0.3F, 100)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "sodium_ingot_2");
        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(CTags.Items.DUSTS_POTASSIUM), RecipeCategory.MISC, NRRItems.POTASSIUM_INGOT.get(), 0.3F, 200)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "potassium_ingot_1");
        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(CTags.Items.DUSTS_POTASSIUM), RecipeCategory.MISC, NRRItems.POTASSIUM_INGOT.get(), 0.3F, 100)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "potassium_ingot_2");
        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(CTags.Items.DUSTS_CALCIUM), RecipeCategory.MISC, NRRItems.CALCIUM_INGOT.get(), 0.3F, 200)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "calcium_ingot_1");
        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(CTags.Items.DUSTS_CALCIUM), RecipeCategory.MISC, NRRItems.CALCIUM_INGOT.get(), 0.3F, 100)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "calcium_ingot_2");
        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(CTags.Items.DUSTS_STRONTIUM), RecipeCategory.MISC, NRRItems.STRONTIUM_INGOT.get(), 0.3F, 200)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "strontium_ingot_1");
        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(CTags.Items.DUSTS_STRONTIUM), RecipeCategory.MISC, NRRItems.STRONTIUM_INGOT.get(), 0.3F, 100)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "strontium_ingot_2");
        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(CTags.Items.DUSTS_BARIUM), RecipeCategory.MISC, NRRItems.BARIUM_INGOT.get(), 0.3F, 200)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "barium_ingot_1");
        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(CTags.Items.DUSTS_BARIUM), RecipeCategory.MISC, NRRItems.BARIUM_INGOT.get(), 0.3F, 100)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "barium_ingot_2");
        SimpleCookingRecipeBuilder
                .smelting(Ingredient.of(CTags.Items.DUSTS_RHODOCHROSITE), RecipeCategory.MISC, NRRItems.MANGANESE_OXIDE_DUST.get(), 0.3F, 200)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "manganese_oxide_dust_1");
        SimpleCookingRecipeBuilder
                .blasting(Ingredient.of(CTags.Items.DUSTS_RHODOCHROSITE), RecipeCategory.MISC, NRRItems.MANGANESE_OXIDE_DUST.get(), 0.3F, 100)
                .unlockedBy("default", has(ItemTags.LOGS))
                .save(recipeOutput, "manganese_oxide_dust_2");
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
                .save(recipeOutput, "prismarine_crystals_1");
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
                .input(Ingredient.of(Tags.Items.RODS_BREEZE), 1)
                .baseProcessPower(20)
                .baseProcessTime(400)
                .output(new ItemStack(Items.WIND_CHARGE, 8))
                .save(recipeOutput, "wind_charge");
        ManufactoryRecipeBuilder.builder()
                .input(Ingredient.of(Items.HONEYCOMB_BLOCK), 1)
                .baseProcessPower(10)
                .baseProcessTime(200)
                .output(new ItemStack(Items.HONEYCOMB, 4))
                .save(recipeOutput, "honeycomb");
        ManufactoryRecipeBuilder.builder()
                .input(Ingredient.of(Items.NETHER_WART_BLOCK), 1)
                .baseProcessPower(20)
                .baseProcessTime(200)
                .output(new ItemStack(Items.NETHER_WART, 9))
                .save(recipeOutput, "nether_wart");
        ManufactoryRecipeBuilder.builder()
                .input(Ingredient.of(Items.WARPED_WART_BLOCK), 1)
                .baseProcessPower(20)
                .baseProcessTime(200)
                .output(new ItemStack(Items.WARPED_FUNGUS, 9))
                .save(recipeOutput, "warped_fungus");
        ManufactoryRecipeBuilder.builder()
                .input(Ingredient.of(Items.GILDED_BLACKSTONE), 1)
                .baseProcessPower(20)
                .baseProcessTime(400)
                .output(new ItemStack(Items.GOLD_NUGGET, 6))
                .save(recipeOutput, "gold_nugget");
        ManufactoryRecipeBuilder.builder()
                .input(Ingredient.of(Items.SEA_LANTERN), 1)
                .baseProcessPower(20)
                .baseProcessTime(400)
                .output(new ItemStack(Items.PRISMARINE_CRYSTALS, 9))
                .save(recipeOutput, "prismarine_crystals_2");
        ManufactoryRecipeBuilder.builder()
                .input(Ingredient.of(Items.MAGMA_BLOCK), 1)
                .baseProcessPower(20)
                .baseProcessTime(200)
                .output(new ItemStack(Items.MAGMA_CREAM, 4))
                .save(recipeOutput, "magma_cream");
        ManufactoryRecipeBuilder.builder()
                .input(Ingredient.of(Items.AMETHYST_BLOCK), 1)
                .baseProcessPower(20)
                .baseProcessTime(400)
                .output(new ItemStack(Items.AMETHYST_SHARD, 4))
                .save(recipeOutput, "amethyst_shard");
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
                .input(Ingredient.of(Items.COAL), 1)
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
