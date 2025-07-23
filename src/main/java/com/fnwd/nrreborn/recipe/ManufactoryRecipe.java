package com.fnwd.nrreborn.recipe;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.NonNullList;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public record ManufactoryRecipe(Ingredient input, int inputCount, int baseProcessPower, int baseProcessTime, ItemStack output) implements Recipe<ManufactoryRecipeInput> {
    @Override
    public @NotNull NonNullList<Ingredient> getIngredients() {
        NonNullList<Ingredient> list = NonNullList.create();
        list.add(input);
        return list;
    }

    public @NotNull ItemStack getInputStack() {
        return new ItemStack(input.getItems()[0].getItem(), inputCount);
    }

    @Override
    public boolean matches(@NotNull ManufactoryRecipeInput manufactoryRecipeInput, @NotNull Level level) {
        if (level.isClientSide()) {
            return false;
        }
        return input.test(manufactoryRecipeInput.getItem(0));
    }

    @Override
    public @NotNull ItemStack assemble(@NotNull ManufactoryRecipeInput manufactoryRecipeInput, HolderLookup.@NotNull Provider provider) {
        return output.copy();
    }

    @Override
    public boolean canCraftInDimensions(int i, int i1) {
        return true;
    }

    @Override
    public @NotNull ItemStack getResultItem(HolderLookup.@NotNull Provider provider) {
        return output;
    }

    @Override
    public @NotNull RecipeSerializer<?> getSerializer() {
        return NRRRecipes.MANUFACTORY_SERIALIZER.get();
    }

    @Override
    public @NotNull RecipeType<?> getType() {
        return NRRRecipes.MANUFACTORY_TYPE.get();
    }

    public static class Serializer implements RecipeSerializer<ManufactoryRecipe> {
        public static final MapCodec<ManufactoryRecipe> CODEC = RecordCodecBuilder.mapCodec(instance -> instance.group(
                Ingredient.CODEC_NONEMPTY.fieldOf("input").forGetter(ManufactoryRecipe::input),
                Codec.INT.fieldOf("input_count").forGetter(ManufactoryRecipe::inputCount),
                Codec.INT.fieldOf("base_process_power").forGetter(ManufactoryRecipe::baseProcessPower),
                Codec.INT.fieldOf("base_process_time").forGetter(ManufactoryRecipe::baseProcessTime),
                ItemStack.CODEC.fieldOf("output").forGetter(ManufactoryRecipe::output)
        ).apply(instance, ManufactoryRecipe::new));
        public static final StreamCodec<RegistryFriendlyByteBuf, ManufactoryRecipe> STREAM_CODEC = StreamCodec.composite(
                Ingredient.CONTENTS_STREAM_CODEC, ManufactoryRecipe::input,
                ByteBufCodecs.INT, ManufactoryRecipe::inputCount,
                ByteBufCodecs.INT, ManufactoryRecipe::baseProcessPower,
                ByteBufCodecs.INT, ManufactoryRecipe::baseProcessTime,
                ItemStack.STREAM_CODEC, ManufactoryRecipe::output,
                ManufactoryRecipe::new);

        @Override
        public @NotNull MapCodec<ManufactoryRecipe> codec() {
            return CODEC;
        }

        @Override
        public @NotNull StreamCodec<RegistryFriendlyByteBuf, ManufactoryRecipe> streamCodec() {
            return STREAM_CODEC;
        }
    }
}
