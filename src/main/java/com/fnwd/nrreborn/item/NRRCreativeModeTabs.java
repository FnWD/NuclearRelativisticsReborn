package com.fnwd.nrreborn.item;

import com.fnwd.nrreborn.NuclearRelativisticsReborn;
import com.fnwd.nrreborn.block.NRRBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class NRRCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(
            Registries.CREATIVE_MODE_TAB, NuclearRelativisticsReborn.MODID);

    public static final Supplier<CreativeModeTab> NRR_INGREDIENTS = CREATIVE_MODE_TAB.register(
            "nrr_ingredients", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(NRRItems.URANIUM_INGOT.get()))
                    .title(Component.translatable("creativemodetab.nrreborn.nrr_ingredients"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(NRRItems.TIN_INGOT);
                        output.accept(NRRItems.ALUMINUM_INGOT);
                        output.accept(NRRItems.SILVER_INGOT);
                        output.accept(NRRItems.LEAD_INGOT);
                        output.accept(NRRItems.MAGNESIUM_INGOT);
                        output.accept(NRRItems.LITHIUM_INGOT);
                        output.accept(NRRItems.BORON_INGOT);
                        output.accept(NRRItems.BERYLLIUM_INGOT);
                        output.accept(NRRItems.ZIRCONIUM_INGOT);
                        output.accept(NRRItems.THORIUM_INGOT);
                        output.accept(NRRItems.URANIUM_INGOT);
                        output.accept(NRRItems.THORIUM_OXIDE_INGOT);
                        output.accept(NRRItems.URANIUM_OXIDE_INGOT);
                        output.accept(NRRItems.MANGANESE_INGOT);
                        output.accept(NRRItems.MANGANESE_OXIDE_INGOT);
                        output.accept(NRRItems.MANGANESE_DIOXIDE_INGOT);
                        output.accept(NRRItems.RAW_TIN);
                        output.accept(NRRItems.RAW_LEAD);
                        output.accept(NRRItems.RAW_MAGNESIUM);
                        output.accept(NRRItems.RAW_LITHIUM);
                        output.accept(NRRItems.RAW_BORON);
                        output.accept(NRRItems.RAW_THORIUM);
                        output.accept(NRRItems.RAW_URANIUM);
                        output.accept(NRRBlocks.TIN_ORE);
                        output.accept(NRRBlocks.DEEPSLATE_TIN_ORE);
                        output.accept(NRRBlocks.LEAD_ORE);
                        output.accept(NRRBlocks.DEEPSLATE_LEAD_ORE);
                        output.accept(NRRBlocks.MAGNESIUM_ORE);
                        output.accept(NRRBlocks.DEEPSLATE_MAGNESIUM_ORE);
                        output.accept(NRRBlocks.LITHIUM_ORE);
                        output.accept(NRRBlocks.DEEPSLATE_LITHIUM_ORE);
                        output.accept(NRRBlocks.BORON_ORE);
                        output.accept(NRRBlocks.DEEPSLATE_BORON_ORE);
                        output.accept(NRRBlocks.THORIUM_ORE);
                        output.accept(NRRBlocks.DEEPSLATE_THORIUM_ORE);
                        output.accept(NRRBlocks.URANIUM_ORE);
                        output.accept(NRRBlocks.DEEPSLATE_URANIUM_ORE);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
