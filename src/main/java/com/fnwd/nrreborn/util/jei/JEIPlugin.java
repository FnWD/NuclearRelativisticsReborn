package com.fnwd.nrreborn.util.jei;

import com.fnwd.nrreborn.NuclearRelativisticsReborn;
import com.fnwd.nrreborn.block.NRRBlocks;
import com.fnwd.nrreborn.client.screen.manufactory.ManufactoryScreen;
import com.fnwd.nrreborn.particle.NRRParticles;
import com.fnwd.nrreborn.particle.Particle;
import com.fnwd.nrreborn.particle.ParticleStack;
import com.fnwd.nrreborn.recipe.NRRRecipes;
import com.fnwd.nrreborn.util.MathUtils;
import com.fnwd.nrreborn.util.jei.recipe_categories.ManufactoryRecipeCategory;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.ingredients.IIngredientHelper;
import mezz.jei.api.ingredients.IIngredientRenderer;
import mezz.jei.api.ingredients.IIngredientType;
import mezz.jei.api.ingredients.subtypes.UidContext;
import mezz.jei.api.registration.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.core.Registry;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.RecipeHolder;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

import static com.fnwd.nrreborn.util.jei.ParticleStackType.PARTICLE_STACK_TYPE;

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
        var manager = Minecraft.getInstance().level.getRecipeManager();
        var manufactoryRecipes = manager.getAllRecipesFor(NRRRecipes.MANUFACTORY_TYPE.get()).stream()
                .map(RecipeHolder::value)
                .toList();
        registration.addRecipes(ManufactoryRecipeCategory.MANUFACTORY_RECIPE_TYPE, manufactoryRecipes);
        addParticleInfo(registration);
    }

    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration) {
        registration.addRecipeClickArea(ManufactoryScreen.class, 77, 37, 22, 15, ManufactoryRecipeCategory.MANUFACTORY_RECIPE_TYPE);
    }

    @Override
    public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
        registration.addRecipeCatalyst(new ItemStack(NRRBlocks.MANUFACTORY.asItem()), ManufactoryRecipeCategory.MANUFACTORY_RECIPE_TYPE);
    }

    @Override
    public void registerIngredients(IModIngredientRegistration registration) {
        var registry = Minecraft.getInstance().level
                .registryAccess()
                .registryOrThrow(NRRParticles.KEY);
        var ingredients = registry.entrySet().stream()
                .map(entry -> new ParticleStack(entry.getValue()))
                .toList();
        registration.register(PARTICLE_STACK_TYPE, ingredients, new IIngredientHelper<>() {
            @Override
            public IIngredientType<ParticleStack> getIngredientType() {
                return PARTICLE_STACK_TYPE;
            }

            @Override
            public String getDisplayName(ParticleStack ingredient) {
                return ingredient.getParticle().toString();
            }

            @Override
            public String getUniqueId(ParticleStack ingredient, UidContext context) {
                return "particle:" + ingredient.getParticle().getName();
            }

            @Override
            public ResourceLocation getResourceLocation(ParticleStack ingredient) {
                return ingredient.getParticle().getTexture();
            }

            @Override
            public ParticleStack copyIngredient(ParticleStack ingredient) {
                return new ParticleStack(ingredient.getParticle(), ingredient.getCount(), ingredient.getEnergy(), ingredient.getFocus());
            }

            @Override
            public String getErrorInfo(@Nullable ParticleStack ingredient) {
                if (ingredient == null) return "null";
                return null;
            }
        }, new IIngredientRenderer<>() {
            @Override
            public void render(GuiGraphics guiGraphics, ParticleStack ingredient) {
                render(guiGraphics, ingredient, 0, 0);
            }

            @Override
            public void render(GuiGraphics guiGraphics, ParticleStack ingredient, int posX, int posY) {
                if (ingredient.isEmpty()) return;
                var texture = ingredient.getParticle().getTexture();
                guiGraphics.blit(texture, posX, posY, 0, 0, 16, 16, 16, 16);
            }

            @Override
            public List<Component> getTooltip(ParticleStack ingredient, TooltipFlag tooltipFlag) {
                List<Component> tooltip = new ArrayList<>();
                tooltip.add(Component.translatable(ingredient.getParticle().toString()));
                return tooltip;
            }
        });
    }

    @Override
    public void registerItemSubtypes(ISubtypeRegistration registration) {
        IModPlugin.super.registerItemSubtypes(registration);
    }

    private static void addParticleInfo(IRecipeRegistration registration) {
        Registry<Particle> registry = Minecraft.getInstance().level
                .registryAccess()
                .registryOrThrow(NRRParticles.KEY);
        List<ParticleStack> ingredients = registry.entrySet().stream()
                .map(entry -> new ParticleStack(entry.getValue()))
                .toList();
        for (var ingredient : ingredients) {
            var particle = ingredient.getParticle();
            registration.addIngredientInfo(ingredient, PARTICLE_STACK_TYPE, Component.translatable(particle.toString()).append("\n")
                    .append(Component.translatable("jei.nrreborn.mass").append(MathUtils.formatParticleMass(particle.getMass())).append("\n")
                    .append(Component.translatable("jei.nrreborn.charge").append(MathUtils.formatFractal(particle.getChargeNumerator(), particle.getChargeDenominator())).append("\n")
                    .append(Component.translatable("jei.nrreborn.spin").append(MathUtils.formatFractal(particle.getSpinNumerator(), particle.getSpinDenominator())).append("\n")
                    .append(Component.translatable("jei.nrreborn.strong_interaction").append(String.valueOf(particle.hasStrongInteraction())).append("\n")
                    .append(Component.translatable("jei.nrreborn.weak_interaction").append(String.valueOf(particle.hasWeakInteraction())).append("\n")))))));
        }
    }
}
