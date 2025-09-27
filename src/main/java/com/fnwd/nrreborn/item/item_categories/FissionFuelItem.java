package com.fnwd.nrreborn.item.item_categories;

import com.fnwd.nrreborn.util.GUIUtils;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.function.DoubleSupplier;

public class FissionFuelItem extends Item {
    private final int baseProcessTime;
    private final DoubleSupplier baseGenerationRate;
    private final double baseHeatGeneration;

    public FissionFuelItem(Properties properties, int baseProcessTime, DoubleSupplier baseGenerationRate, double baseHeatGeneration) {
        super(properties);
        this.baseProcessTime = baseProcessTime;
        this.baseGenerationRate = baseGenerationRate;
        this.baseHeatGeneration = baseHeatGeneration;
    }

    @Override
    public void appendHoverText(@NotNull ItemStack stack, @NotNull TooltipContext context, @NotNull List<Component> tooltipComponents, @NotNull TooltipFlag tooltipFlag) {
        tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time").withColor(11184810)
                .append(baseProcessTime + " t"));
        tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate").withColor(11184810)
                .append(GUIUtils.formatNumber(baseGenerationRate.getAsDouble(), 1) + " FE/t"));
        tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation").withColor(11184810)
                .append(GUIUtils.formatNumber(baseHeatGeneration, 1) + " H/t"));
        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
    }
}
