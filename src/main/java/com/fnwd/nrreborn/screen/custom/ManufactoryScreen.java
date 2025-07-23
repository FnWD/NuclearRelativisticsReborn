package com.fnwd.nrreborn.screen.custom;

import com.fnwd.nrreborn.NuclearRelativisticsReborn;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import org.jetbrains.annotations.NotNull;

public class ManufactoryScreen extends AbstractContainerScreen<ManufactoryMenu> {
    private static final ResourceLocation GUI_TEXTURE = ResourceLocation.fromNamespaceAndPath(NuclearRelativisticsReborn.MODID, "textures/gui/manufactory_gui.png");

    public ManufactoryScreen(ManufactoryMenu menu, Inventory playerInventory, Component title) {
        super(menu, playerInventory, title);
        imageHeight = 174;
    }

    @Override
    protected void renderBg(@NotNull GuiGraphics guiGraphics, float v, int i, int i1) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, GUI_TEXTURE);
        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;
        guiGraphics.blit(GUI_TEXTURE, x, y, 0, 0, imageWidth, imageHeight);
        renderArrow(guiGraphics, x, y);
    }

    @Override
    public void render(@NotNull GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTick) {
        super.render(guiGraphics, mouseX, mouseY, partialTick);
        this.renderTooltip(guiGraphics, mouseX, mouseY);
    }

    @Override
    protected void renderLabels(@NotNull GuiGraphics guiGraphics, int mouseX, int mouseY) {
        Component title = this.title;
        int titleWidth = this.font.width(title);
        int x = (imageWidth - titleWidth) / 2;
        guiGraphics.drawString(this.font, title, x, 6, 4210752, false);
        guiGraphics.drawString(this.font, this.playerInventoryTitle, this.inventoryLabelX, this.inventoryLabelY + 8, 4210752, false);
    }

    private void renderArrow(GuiGraphics guiGraphics, int x, int y) {
        if (menu.isCrafting()) {
            guiGraphics.blit(GUI_TEXTURE, x + 77, y + 36, 189, 0, menu.getScaledArrowProgress(), 17);
        }
    }
}
