package com.fnwd.nrreborn.item.item_categories;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class BasicItem extends Item {
    private final String translatableKey;

    public BasicItem(Properties properties) {
        super(properties);
        this.translatableKey = null;
    }

    public BasicItem(Properties properties, String translatableKey) {
        super(properties);
        this.translatableKey = translatableKey;
    }

    @Override
    public void appendHoverText(@NotNull ItemStack stack, @NotNull TooltipContext context, @NotNull List<Component> tooltipComponents, @NotNull TooltipFlag tooltipFlag) {
        if (translatableKey != null)
            tooltipComponents.add(Component.translatable(translatableKey).withColor(5636095));
        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
    }
}
