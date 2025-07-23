package com.fnwd.nrreborn.util.jei;

import com.fnwd.nrreborn.NuclearRelativisticsReborn;
import com.fnwd.nrreborn.block.NRRBlocks;
import com.fnwd.nrreborn.recipe.ManufactoryRecipe;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.ingredient.IRecipeSlotsView;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManufactoryRecipeCategory implements IRecipeCategory<ManufactoryRecipe> {
    public static final ResourceLocation UID = ResourceLocation.fromNamespaceAndPath(NuclearRelativisticsReborn.MODID, "manufactory");
    public static final ResourceLocation TEXTURE = ResourceLocation.fromNamespaceAndPath(NuclearRelativisticsReborn.MODID, "textures/gui/manufactory_gui.png");
    public static final RecipeType<ManufactoryRecipe> MANUFACTORY_RECIPE_TYPE = new RecipeType<>(UID, ManufactoryRecipe.class);

    private final IDrawable BG;
    private final IDrawable ICON;

    public ManufactoryRecipeCategory(IGuiHelper helper) {
        BG = helper.createDrawable(TEXTURE, 51, 35, 74, 18);
        ICON = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(NRRBlocks.MANUFACTORY));
    }

    @Override
    public RecipeType<ManufactoryRecipe> getRecipeType() {
        return MANUFACTORY_RECIPE_TYPE;
    }

    @Override
    public Component getTitle() {
        return Component.translatable("title.nrreborn.manufactory");
    }

    @Override
    public @Nullable IDrawable getIcon() {
        return ICON;
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, ManufactoryRecipe recipe, IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT, 1, 1).addIngredients(Ingredient.of(Arrays.stream(recipe.input().getItems())
                .map(stack -> stack.copyWithCount(recipe.inputCount()))));
        builder.addSlot(RecipeIngredientRole.OUTPUT, 57, 1).addItemStack(recipe.getResultItem(null));
    }

    @Override
    public @Nullable IDrawable getBackground() {
        return BG;
    }

    @Override
    public List<Component> getTooltipStrings(ManufactoryRecipe recipe, IRecipeSlotsView recipeSlotsView, double mouseX, double mouseY) {
        if (mouseX < 26 || mouseX > 47) {
            return List.of();
        }
        List<Component> tooltip = new ArrayList<>();
        tooltip.add(Component.translatable("jei.nrreborn.base_process_power").withColor(16733695).append(Component.literal(recipe.baseProcessPower() + " FE/t").withColor(16777215)));
        tooltip.add(Component.translatable("jei.nrreborn.base_process_time").withColor(5635925).append(Component.literal(recipe.baseProcessTime() + " t").withColor(16777215)));
        return tooltip;
    }

    @Override
    public void draw(ManufactoryRecipe recipe, IRecipeSlotsView recipeSlotsView, GuiGraphics guiGraphics, double mouseX, double mouseY) {
        int progressJEIShown = (int) ((System.currentTimeMillis() / 10) % recipe.baseProcessTime());
        int arrowWidth = progressJEIShown * 22 / recipe.baseProcessTime();
        guiGraphics.blit(TEXTURE, 26, 1, 189, 0, arrowWidth, 17);
    }
}
