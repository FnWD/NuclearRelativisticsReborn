package com.fnwd.nrreborn.recipe;

import com.fnwd.nrreborn.NuclearRelativisticsReborn;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class NRRRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS = DeferredRegister.create(Registries.RECIPE_SERIALIZER, NuclearRelativisticsReborn.MODID);
    public static final DeferredRegister<RecipeType<?>> TYPES = DeferredRegister.create(Registries.RECIPE_TYPE, NuclearRelativisticsReborn.MODID);

    public static final DeferredHolder<RecipeSerializer<?>, RecipeSerializer<ManufactoryRecipe>> MANUFACTORY_SERIALIZER = SERIALIZERS.register(
            "manufactory", ManufactoryRecipe.Serializer::new);
    public static final DeferredHolder<RecipeType<?>, RecipeType<ManufactoryRecipe>> MANUFACTORY_TYPE = TYPES.register(
            "manufactory", () -> new RecipeType<>() {
                @Override
                public String toString() {
                    return "manufactory";
                }
            });

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
        TYPES.register(eventBus);
    }
}
