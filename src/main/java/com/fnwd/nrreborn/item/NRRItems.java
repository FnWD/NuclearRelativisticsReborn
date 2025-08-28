package com.fnwd.nrreborn.item;

import com.fnwd.nrreborn.NRRConfig;
import com.fnwd.nrreborn.NuclearRelativisticsReborn;
import com.fnwd.nrreborn.block_entity.NRRWrappedMachineBlockEntity;
import com.fnwd.nrreborn.data_component.NRRDataComponents;
import com.fnwd.nrreborn.util.ConfigurationTypes;
import com.fnwd.nrreborn.util.GUIUtils;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.HitResult;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;

public class NRRItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(NuclearRelativisticsReborn.MODID);

    public static final DeferredItem<Item> TIN_INGOT = ITEMS.register(
            "tin_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ALUMINUM_INGOT = ITEMS.register(
            "aluminum_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILVER_INGOT = ITEMS.register(
            "silver_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LEAD_INGOT = ITEMS.register(
            "lead_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MAGNESIUM_INGOT = ITEMS.register(
            "magnesium_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LITHIUM_INGOT = ITEMS.register(
            "lithium_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BORON_INGOT = ITEMS.register(
            "boron_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BERYLLIUM_INGOT = ITEMS.register(
            "beryllium_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ZIRCONIUM_INGOT = ITEMS.register(
            "zirconium_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> THORIUM_INGOT = ITEMS.register(
            "thorium_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> URANIUM_INGOT = ITEMS.register(
            "uranium_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> THORIUM_OXIDE_INGOT = ITEMS.register(
            "thorium_oxide_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> URANIUM_OXIDE_INGOT = ITEMS.register(
            "uranium_oxide_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MANGANESE_INGOT = ITEMS.register(
            "manganese_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MANGANESE_OXIDE_INGOT = ITEMS.register(
            "manganese_oxide_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MANGANESE_DIOXIDE_INGOT = ITEMS.register(
            "manganese_dioxide_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GRAPHITE_INGOT = ITEMS.register(
            "graphite_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRONZE_INGOT = ITEMS.register(
            "bronze_ingot", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(@NotNull ItemStack stack, @NotNull TooltipContext context, @NotNull List<Component> tooltipComponents, @NotNull TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.bronze_ingot").withColor(5636095));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> STEEL_INGOT = ITEMS.register(
            "steel_ingot", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(@NotNull ItemStack stack, @NotNull TooltipContext context, @NotNull List<Component> tooltipComponents, @NotNull TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.steel_ingot").withColor(5636095));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> FERROBORON_ALLOY_INGOT = ITEMS.register(
            "ferroboron_alloy_ingot", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(@NotNull ItemStack stack, @NotNull TooltipContext context, @NotNull List<Component> tooltipComponents, @NotNull TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.ferroboron_alloy_ingot").withColor(5636095));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> TOUGH_ALLOY_INGOT = ITEMS.register(
            "tough_alloy_ingot", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(@NotNull ItemStack stack, @NotNull TooltipContext context, @NotNull List<Component> tooltipComponents, @NotNull TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.tough_alloy_ingot").withColor(5636095));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> EXTREME_ALLOY_INGOT = ITEMS.register(
            "extreme_alloy_ingot", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(@NotNull ItemStack stack, @NotNull TooltipContext context, @NotNull List<Component> tooltipComponents, @NotNull TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.extreme_alloy_ingot").withColor(5636095));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> THERMOCONDUCTING_ALLOY_INGOT = ITEMS.register(
            "thermoconducting_alloy_ingot", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(@NotNull ItemStack stack, @NotNull TooltipContext context, @NotNull List<Component> tooltipComponents, @NotNull TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.thermoconducting_alloy_ingot").withColor(5636095));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> HARD_CARBON_ALLOY_INGOT = ITEMS.register(
            "hard_carbon_alloy_ingot", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(@NotNull ItemStack stack, @NotNull TooltipContext context, @NotNull List<Component> tooltipComponents, @NotNull TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.hard_carbon_alloy_ingot").withColor(5636095));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> SHIBUICHI_ALLOY_INGOT = ITEMS.register(
            "shibuichi_alloy_ingot", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(@NotNull ItemStack stack, @NotNull TooltipContext context, @NotNull List<Component> tooltipComponents, @NotNull TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.shibuichi_alloy_ingot").withColor(5636095));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> TIN_SILVER_ALLOY_INGOT = ITEMS.register(
            "tin_silver_alloy_ingot", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(@NotNull ItemStack stack, @NotNull TooltipContext context, @NotNull List<Component> tooltipComponents, @NotNull TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.tin_silver_alloy_ingot").withColor(5636095));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> LEAD_PLATINUM_ALLOY_INGOT = ITEMS.register(
            "lead_platinum_alloy_ingot", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(@NotNull ItemStack stack, @NotNull TooltipContext context, @NotNull List<Component> tooltipComponents, @NotNull TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.lead_platinum_alloy_ingot").withColor(5636095));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> ZIRCALOY_INGOT = ITEMS.register(
            "zircaloy_ingot", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(@NotNull ItemStack stack, @NotNull TooltipContext context, @NotNull List<Component> tooltipComponents, @NotNull TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.zircaloy_ingot").withColor(5636095));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> HSLA_STEEL_INGOT = ITEMS.register(
            "hsla_steel_ingot", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(@NotNull ItemStack stack, @NotNull TooltipContext context, @NotNull List<Component> tooltipComponents, @NotNull TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.hsla_steel_ingot").withColor(5636095));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> MAGNESIUM_DIBORIDE_ALLOY_INGOT = ITEMS.register(
            "magnesium_diboride_alloy_ingot", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(@NotNull ItemStack stack, @NotNull TooltipContext context, @NotNull List<Component> tooltipComponents, @NotNull TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.magnesium_diboride_alloy_ingot").withColor(5636095));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> LITHIUM_MANGANESE_DIOXIDE_ALLOY_INGOT = ITEMS.register(
            "lithium_manganese_dioxide_alloy_ingot", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(@NotNull ItemStack stack, @NotNull TooltipContext context, @NotNull List<Component> tooltipComponents, @NotNull TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.lithium_manganese_dioxide_alloy_ingot").withColor(5636095));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> SILICON_CARBIDE_INGOT = ITEMS.register(
            "silicon_carbide_ingot", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(@NotNull ItemStack stack, @NotNull TooltipContext context, @NotNull List<Component> tooltipComponents, @NotNull TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.silicon_carbide_ingot").withColor(5636095));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> SIC_SIC_CERAMIC_MATRIX_COMPOSITE = ITEMS.register(
            "sic_sic_ceramic_matrix_composite", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(@NotNull ItemStack stack, @NotNull TooltipContext context, @NotNull List<Component> tooltipComponents, @NotNull TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.sic_sic_ceramic_matrix_composite").withColor(5636095));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> RHODOCHROSITE = ITEMS.register(
            "rhodochrosite", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CUBIC_BORON_NITRIDE = ITEMS.register(
            "cubic_boron_nitride", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FLUORITE = ITEMS.register(
            "fluorite", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> VILLIAUMITE = ITEMS.register(
            "villiaumite", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CAROBBIITE = ITEMS.register(
            "carobbiite", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BORON_ARSENIDE = ITEMS.register(
            "boron_arsenide", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILICON = ITEMS.register(
            "silicon", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TIN_DUST = ITEMS.register(
            "tin_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ALUMINUM_DUST = ITEMS.register(
            "aluminum_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILVER_DUST = ITEMS.register(
            "silver_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LEAD_DUST = ITEMS.register(
            "lead_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MAGNESIUM_DUST = ITEMS.register(
            "magnesium_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LITHIUM_DUST = ITEMS.register(
            "lithium_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BORON_DUST = ITEMS.register(
            "boron_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BERYLLIUM_DUST = ITEMS.register(
            "beryllium_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ZIRCONIUM_DUST = ITEMS.register(
            "zirconium_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> THORIUM_DUST = ITEMS.register(
            "thorium_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> URANIUM_DUST = ITEMS.register(
            "uranium_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> THORIUM_OXIDE_DUST = ITEMS.register(
            "thorium_oxide_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> URANIUM_OXIDE_DUST = ITEMS.register(
            "uranium_oxide_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MANGANESE_DUST = ITEMS.register(
            "manganese_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MANGANESE_OXIDE_DUST = ITEMS.register(
            "manganese_oxide_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MANGANESE_DIOXIDE_DUST = ITEMS.register(
            "manganese_dioxide_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GRAPHITE_DUST = ITEMS.register(
            "graphite_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COAL_DUST = ITEMS.register(
            "coal_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DIAMOND_DUST = ITEMS.register(
            "diamond_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> QUARTZ_DUST = ITEMS.register(
            "quartz_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> OBSIDIAN_DUST = ITEMS.register(
            "obsidian_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> END_STONE_DUST = ITEMS.register(
            "end_stone_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SULFUR_DUST = ITEMS.register(
            "sulfur_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RHODOCHROSITE_DUST = ITEMS.register(
            "rhodochrosite_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HEXAGONAL_BORON_NITRIDE = ITEMS.register(
            "hexagonal_boron_nitride", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FLUORITE_DUST = ITEMS.register(
            "fluorite_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> VILLIAUMITE_DUST = ITEMS.register(
            "villiaumite_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CAROBBIITE_DUST = ITEMS.register(
            "carobbiite_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ARSENIC_DUST = ITEMS.register(
            "arsenic_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ENERGETIC_BLEND = ITEMS.register(
            "energetic_blend", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DIMENSIONAL_BLEND = ITEMS.register(
            "dimensional_blend", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CARBON_MANGANESE_BLEND = ITEMS.register(
            "carbon_manganese_blend", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CRYSTAL_BINDER = ITEMS.register(
            "crystal_binder", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ALUGENTUM_DUST = ITEMS.register(
            "alugentum_dust", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BORAX = ITEMS.register(
            "borax", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CALCIUM_SULFATE = ITEMS.register(
            "calcium_sulfate", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SODIUM_FLUORIDE = ITEMS.register(
            "sodium_fluoride", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> POTASSIUM_FLUORIDE = ITEMS.register(
            "potassium_fluoride", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SODIUM_HYDROXIDE = ITEMS.register(
            "sodium_hydroxide", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> POTASSIUM_HYDROXIDE = ITEMS.register(
            "potassium_hydroxide", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_TIN = ITEMS.register(
            "raw_tin", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_LEAD = ITEMS.register(
            "raw_lead", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_MAGNESIUM = ITEMS.register(
            "raw_magnesium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_LITHIUM = ITEMS.register(
            "raw_lithium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_BORON = ITEMS.register(
            "raw_boron", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_THORIUM = ITEMS.register(
            "raw_thorium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_URANIUM = ITEMS.register(
            "raw_uranium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LITHIUM_6 = ITEMS.register(
            "lithium_6", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LITHIUM_7 = ITEMS.register(
            "lithium_7", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BERYLLIUM_7 = ITEMS.register(
            "beryllium_7", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BORON_10 = ITEMS.register(
            "boron_10", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BORON_11 = ITEMS.register(
            "boron_11", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SODIUM_22 = ITEMS.register(
            "sodium_22", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MAGNESIUM_24 = ITEMS.register(
            "magnesium_24", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MAGNESIUM_26 = ITEMS.register(
            "magnesium_26", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CALCIUM_48 = ITEMS.register(
            "calcium_48", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COBALT_60 = ITEMS.register(
            "cobalt_60", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STRONTIUM_90 = ITEMS.register(
            "strontium_90", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RUTHENIUM_106 = ITEMS.register(
            "ruthenium_106", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CAESIUM_137 = ITEMS.register(
            "caesium_137", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PROMETHIUM_147 = ITEMS.register(
            "promethium_147", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> EUROPIUM_155 = ITEMS.register(
            "europium_155", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> IRIDIUM_192 = ITEMS.register(
            "iridium_192", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> THORIUM_230 = ITEMS.register(
            "thorium_230", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> THORIUM_232 = ITEMS.register(
            "thorium_232", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PROTACTINIUM_231 = ITEMS.register(
            "protactinium_231", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PROTACTINIUM_233 = ITEMS.register(
            "protactinium_233", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> URANIUM_233 = ITEMS.register(
            "uranium_233", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> URANIUM_234 = ITEMS.register(
            "uranium_234", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> URANIUM_235 = ITEMS.register(
            "uranium_235", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> URANIUM_238 = ITEMS.register(
            "uranium_238", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NEPTUNIUM_236 = ITEMS.register(
            "neptunium_236", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NEPTUNIUM_237 = ITEMS.register(
            "neptunium_237", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLUTONIUM_238 = ITEMS.register(
            "plutonium_238", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLUTONIUM_239 = ITEMS.register(
            "plutonium_239", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLUTONIUM_241 = ITEMS.register(
            "plutonium_241", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLUTONIUM_242 = ITEMS.register(
            "plutonium_242", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> AMERICIUM_241 = ITEMS.register(
            "americium_241", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> AMERICIUM_242 = ITEMS.register(
            "americium_242", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> AMERICIUM_243 = ITEMS.register(
            "americium_243", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CURIUM_243 = ITEMS.register(
            "curium_243", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CURIUM_245 = ITEMS.register(
            "curium_245", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CURIUM_246 = ITEMS.register(
            "curium_246", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CURIUM_247 = ITEMS.register(
            "curium_247", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BERKELIUM_247 = ITEMS.register(
            "berkelium_247", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BERKELIUM_248 = ITEMS.register(
            "berkelium_248", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CALIFORNIUM_249 = ITEMS.register(
            "californium_249", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CALIFORNIUM_250 = ITEMS.register(
            "californium_250", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CALIFORNIUM_251 = ITEMS.register(
            "californium_251", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CALIFORNIUM_252 = ITEMS.register(
            "californium_252", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> EINSTEINIUM_252 = ITEMS.register(
            "einsteinium_252", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> EINSTEINIUM_253 = ITEMS.register(
            "einsteinium_253", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> EINSTEINIUM_254 = ITEMS.register(
            "einsteinium_254", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> EINSTEINIUM_255 = ITEMS.register(
            "einsteinium_255", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FERMIUM_253 = ITEMS.register(
            "fermium_253", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FERMIUM_257 = ITEMS.register(
            "fermium_257", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COPERNICIUM_291 = ITEMS.register(
            "copernicium_291", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BASIC_PLATING = ITEMS.register(
            "basic_plating", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ADVANCED_PLATING = ITEMS.register(
            "advanced_plating", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_URANIUM_PLATING = ITEMS.register(
            "depleted_uranium_plating", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ELITE_PLATING = ITEMS.register(
            "elite_plating", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COPPER_SOLENOID = ITEMS.register(
            "copper_solenoid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MAGNESIUM_DIBORIDE_SOLENOID = ITEMS.register(
            "magnesium_diboride_solenoid", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SERVOMECHANISM = ITEMS.register(
            "servomechanism", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ELECTRIC_MOTOR = ITEMS.register(
            "electric_motor", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LINEAR_ACTUATOR = ITEMS.register(
            "linear_actuator", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BIOPLASTIC = ITEMS.register(
            "bioplastic", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GELATIN = ITEMS.register(
            "gelatin", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SPEED_UPGRADE = ITEMS.register(
            "speed_upgrade", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(@NotNull ItemStack stack, @NotNull TooltipContext context, @NotNull List<Component> tooltipComponents, @NotNull TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.speed_upgrade").withColor(5636095));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> ENERGY_UPGRADE = ITEMS.register(
            "energy_upgrade", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(@NotNull ItemStack stack, @NotNull TooltipContext context, @NotNull List<Component> tooltipComponents, @NotNull TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.energy_upgrade").withColor(5636095));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> TBU_FUEL = ITEMS.register(
            "tbu_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time").withColor(11184810)
                            .append("144000 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate").withColor(11184810)
                            .append(GUIUtils.formatNumber(NRRConfig.CONFIG.TBU_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation").withColor(11184810)
                            .append("18 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> TBU_OXIDE_FUEL = ITEMS.register(
            "tbu_oxide_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("144000 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.TBU_OXIDE_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("22.5 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> TBU_TRISO_FUEL = ITEMS.register(
            "tbu_triso_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("144000 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.TBU_TRISO_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("18 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> LEN_236_FUEL = ITEMS.register(
            "len_236_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("102000 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.LEN_236_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("36 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> LEN_236_OXIDE_FUEL = ITEMS.register(
            "len_236_oxide_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("102000 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.LEN_236_OXIDE_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("45 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> LEN_236_TRISO_FUEL = ITEMS.register(
            "len_236_triso_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("102000 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.LEN_236_TRISO_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("36 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> LEP_239_FUEL = ITEMS.register(
            "lep_239_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("91920 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.LEP_239_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("40 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> LEP_239_OXIDE_FUEL = ITEMS.register(
            "lep_239_oxide_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("91920 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.LEP_239_OXIDE_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("50 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> LEP_239_TRISO_FUEL = ITEMS.register(
            "lep_239_triso_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("91920 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.LEP_239_TRISO_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("40 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> LEU_235_FUEL = ITEMS.register(
            "leu_235_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("72000 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.LEU_235_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("50 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> LEU_235_OXIDE_FUEL = ITEMS.register(
            "leu_235_oxide_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("72000 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.LEU_235_OXIDE_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("62.5 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> LEU_235_TRISO_FUEL = ITEMS.register(
            "leu_235_triso_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("72000 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.LEU_235_TRISO_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("50 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> LEU_233_FUEL = ITEMS.register(
            "leu_233_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("63960 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.LEU_233_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("60 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> LEU_233_OXIDE_FUEL = ITEMS.register(
            "leu_233_oxide_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("63960 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.LEU_233_OXIDE_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("75 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> LEU_233_TRISO_FUEL = ITEMS.register(
            "leu_233_triso_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("63960 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.LEU_233_TRISO_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("60 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> LEP_241_FUEL = ITEMS.register(
            "lep_241_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("91920 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.LEP_241_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("70 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> LEP_241_OXIDE_FUEL = ITEMS.register(
            "lep_241_oxide_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("91920 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.LEP_241_OXIDE_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("87.5 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> LEP_241_TRISO_FUEL = ITEMS.register(
            "lep_241_triso_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("91920 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.LEP_241_TRISO_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("70 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> LEB_248_FUEL = ITEMS.register(
            "leb_248_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("86040 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.LEB_248_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("52 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> LEB_248_OXIDE_FUEL = ITEMS.register(
            "leb_248_oxide_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("86040 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.LEB_248_OXIDE_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("65 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> LEB_248_TRISO_FUEL = ITEMS.register(
            "leb_248_triso_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("86040 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.LEB_248_TRISO_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("52 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> LECM_247_FUEL = ITEMS.register(
            "lecm_247_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("78000 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.LECM_247_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("54 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> LECM_247_OXIDE_FUEL = ITEMS.register(
            "lecm_247_oxide_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("78000 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.LECM_247_OXIDE_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("67.5 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> LECM_247_TRISO_FUEL = ITEMS.register(
            "lecm_247_triso_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("78000 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.LECM_247_TRISO_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("54 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> LECM_245_FUEL = ITEMS.register(
            "lecm_245_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("67920 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.LECM_245_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("68 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> LECM_245_OXIDE_FUEL = ITEMS.register(
            "lecm_245_oxide_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("67920 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.LECM_245_OXIDE_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("85 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> LECM_245_TRISO_FUEL = ITEMS.register(
            "lecm_245_triso_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("67920 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.LECM_245_TRISO_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("68 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> LECM_243_FUEL = ITEMS.register(
            "lecm_243_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("51960 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.LECM_243_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("112 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> LECM_243_OXIDE_FUEL = ITEMS.register(
            "lecm_243_oxide_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("51960 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.LECM_243_OXIDE_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("140 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> LECM_243_TRISO_FUEL = ITEMS.register(
            "lecm_243_triso_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("51960 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.LECM_243_TRISO_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("112 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> LEA_242_FUEL = ITEMS.register(
            "lea_242_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("54000 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.LEA_242_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("94 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> LEA_242_OXIDE_FUEL = ITEMS.register(
            "lea_242_oxide_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("54000 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.LEA_242_OXIDE_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("117.5 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> LEA_242_TRISO_FUEL = ITEMS.register(
            "lea_242_triso_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("54000 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.LEA_242_TRISO_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("94 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> LECF_249_FUEL = ITEMS.register(
            "lecf_249_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("60000 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.LECF_249_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("116 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> LECF_249_OXIDE_FUEL = ITEMS.register(
            "lecf_249_oxide_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("60000 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.LECF_249_OXIDE_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("145 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> LECF_249_TRISO_FUEL = ITEMS.register(
            "lecf_249_triso_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("60000 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.LECF_249_TRISO_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("116 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> LECF_251_FUEL = ITEMS.register(
            "lecf_251_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("57960 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.LECF_251_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("120 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> LECF_251_OXIDE_FUEL = ITEMS.register(
            "lecf_251_oxide_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("57960 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.LECF_251_OXIDE_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("150 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> LECF_251_TRISO_FUEL = ITEMS.register(
            "lecf_251_triso_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("57960 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.LECF_251_TRISO_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("120 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> MOX_239_FUEL = ITEMS.register(
            "mox_239_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("84000 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.MOX_239_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("57.5 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> MOX_239_OXIDE_FUEL = ITEMS.register(
            "mox_239_oxide_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("84000 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.MOX_239_OXIDE_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("71.9 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> MOX_239_TRISO_FUEL = ITEMS.register(
            "mox_239_triso_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("84000 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.MOX_239_TRISO_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("57.5 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> MOX_241_FUEL = ITEMS.register(
            "mox_241_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("55920 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.MOX_241_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("97.5 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> MOX_241_OXIDE_FUEL = ITEMS.register(
            "mox_241_oxide_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("55920 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.MOX_241_OXIDE_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("121.9 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> MOX_241_TRISO_FUEL = ITEMS.register(
            "mox_241_triso_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("55920 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.MOX_241_TRISO_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("97.5 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> HEN_236_FUEL = ITEMS.register(
            "hen_236_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("102000 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.HEN_236_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("216 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> HEN_236_OXIDE_FUEL = ITEMS.register(
            "hen_236_oxide_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("102000 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.HEN_236_OXIDE_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("270 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> HEN_236_TRISO_FUEL = ITEMS.register(
            "hen_236_triso_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("102000 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.HEN_236_TRISO_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("216 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> HEP_239_FUEL = ITEMS.register(
            "hep_239_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("91920 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.HEP_239_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("240 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> HEP_239_OXIDE_FUEL = ITEMS.register(
            "hep_239_oxide_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("91920 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.HEP_239_OXIDE_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("300 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> HEP_239_TRISO_FUEL = ITEMS.register(
            "hep_239_triso_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("91920 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.HEP_239_TRISO_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("240 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> HEU_235_FUEL = ITEMS.register(
            "heu_235_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("72000 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.HEU_235_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("300 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> HEU_235_OXIDE_FUEL = ITEMS.register(
            "heu_235_oxide_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("72000 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.HEU_235_OXIDE_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("375 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> HEU_235_TRISO_FUEL = ITEMS.register(
            "heu_235_triso_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("72000 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.HEU_235_TRISO_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("300 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> HEU_233_FUEL = ITEMS.register(
            "heu_233_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("63960 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.HEU_233_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("360 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> HEU_233_OXIDE_FUEL = ITEMS.register(
            "heu_233_oxide_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("63960 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.HEU_233_OXIDE_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("450 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> HEU_233_TRISO_FUEL = ITEMS.register(
            "heu_233_triso_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("63960 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.HEU_233_TRISO_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("360 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> HEP_241_FUEL = ITEMS.register(
            "hep_241_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("91920 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.HEP_241_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("420 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> HEP_241_OXIDE_FUEL = ITEMS.register(
            "hep_241_oxide_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("91920 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.HEP_241_OXIDE_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("525 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> HEP_241_TRISO_FUEL = ITEMS.register(
            "hep_241_triso_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("91920 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.HEP_241_TRISO_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("420 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> HEA_242_FUEL = ITEMS.register(
            "hea_242_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("54000 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.HEA_242_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("564 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> HEA_242_OXIDE_FUEL = ITEMS.register(
            "hea_242_oxide_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("54000 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.HEA_242_OXIDE_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("705 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> HEA_242_TRISO_FUEL = ITEMS.register(
            "hea_242_triso_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("54000 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.HEA_242_TRISO_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("564 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> HECM_247_FUEL = ITEMS.register(
            "hecm_247_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("78000 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.HECM_247_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("324 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> HECM_247_OXIDE_FUEL = ITEMS.register(
            "hecm_247_oxide_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("78000 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.HECM_247_OXIDE_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("405 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> HECM_247_TRISO_FUEL = ITEMS.register(
            "hecm_247_triso_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("78000 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.HECM_247_TRISO_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("324 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> HECM_245_FUEL = ITEMS.register(
            "hecm_245_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("67920 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.HECM_245_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("408 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> HECM_245_OXIDE_FUEL = ITEMS.register(
            "hecm_245_oxide_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("67920 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.HECM_245_OXIDE_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("510 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> HECM_245_TRISO_FUEL = ITEMS.register(
            "hecm_245_triso_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("67920 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.HECM_245_TRISO_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("408 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> HECM_243_FUEL = ITEMS.register(
            "hecm_243_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("51960 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.HECM_243_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("672 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> HECM_243_OXIDE_FUEL = ITEMS.register(
            "hecm_243_oxide_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("51960 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.HECM_243_OXIDE_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("840 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> HECM_243_TRISO_FUEL = ITEMS.register(
            "hecm_243_triso_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("51960 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.HECM_243_TRISO_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("672 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> HEB_248_FUEL = ITEMS.register(
            "heb_248_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("86040 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.HEB_248_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("312 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> HEB_248_OXIDE_FUEL = ITEMS.register(
            "heb_248_oxide_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("86040 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.HEB_248_OXIDE_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("398 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> HEB_248_TRISO_FUEL = ITEMS.register(
            "heb_248_triso_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("86040 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.HEB_248_TRISO_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("312 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> HECF_249_FUEL = ITEMS.register(
            "hecf_249_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("60000 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.HECF_249_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("696 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> HECF_249_OXIDE_FUEL = ITEMS.register(
            "hecf_249_oxide_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("60000 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.HECF_249_OXIDE_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("870 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> HECF_249_TRISO_FUEL = ITEMS.register(
            "hecf_249_triso_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("60000 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.HECF_249_TRISO_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("696 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> HECF_251_FUEL = ITEMS.register(
            "hecf_251_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("57960 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.HECF_251_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("720 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> HECF_251_OXIDE_FUEL = ITEMS.register(
            "hecf_251_oxide_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("57960 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.HECF_251_OXIDE_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("900 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> HECF_251_TRISO_FUEL = ITEMS.register(
            "hecf_251_triso_fuel", () -> new Item(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context,
                                            List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_process_time")
                            .withColor(11184810).append("57960 t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_generation_rate")
                            .withColor(11184810).append(GUIUtils.formatNumber(NRRConfig.CONFIG.HECF_251_TRISO_GENERATION_RATE.get(), 1) + " FE/t"));
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.fuel_base_heat_generation")
                            .withColor(11184810).append("720 H/t"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> MARSHMALLOW = ITEMS.register(
            "marshmallow", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(1)
                    .saturationModifier(0.4F)
                    .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 300, 0), 1.0F)
                    .build())));
    public static final DeferredItem<Item> GRAHAM_CRACKER = ITEMS.register(
            "graham_cracker", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(1)
                    .saturationModifier(0.2F)
                    .build())));
    public static final DeferredItem<Item> GROUND_COCOA_NIBS = ITEMS.register(
            "ground_cocoa_nibs", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(1)
                    .saturationModifier(0.2F)
                    .build())));
    public static final DeferredItem<Item> SOLIDIFIED_COCOA_BUTTER = ITEMS.register(
            "solidified_cocoa_butter", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(2)
                    .saturationModifier(0.1F)
                    .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 300, 0), 1.0F)
                    .build())));
    public static final DeferredItem<Item> UNSWEETENED_CHOCOLATE = ITEMS.register(
            "unsweetened_chocolate", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(2)
                    .saturationModifier(0.1F)
                    .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 300, 0), 1.0F)
                    .build())));
    public static final DeferredItem<Item> DARK_CHOCOLATE = ITEMS.register(
            "dark_chocolate", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(3)
                    .saturationModifier(0.8F)
                    .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 300, 0), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 300, 0), 1.0F)
                    .build())));
    public static final DeferredItem<Item> MILK_CHOCOLATE = ITEMS.register(
            "milk_chocolate", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(4)
                    .saturationModifier(0.8F)
                    .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 300, 0), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 300, 0), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 300, 0), 1.0F)
                    .build())));
    public static final DeferredItem<Item> SMORE = ITEMS.register(
            "smore", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(8)
                    .saturationModifier(1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 300, 1), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 300, 1), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 300, 1), 1.0F)
                    .build())));
    public static final DeferredItem<Item> SMORE_DOUBLE = ITEMS.register(
            "smore_double", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(20)
                    .saturationModifier(4.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 600, 1), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 1), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 600, 1), 1.0F)
                    .build())));
    public static final DeferredItem<Item> SMORE_QUADRUPLE = ITEMS.register(
            "smore_quadruple", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(44)
                    .saturationModifier(16.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 1200, 1), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 1), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 1200, 1), 1.0F)
                    .build())));
    public static final DeferredItem<Item> SMORE_OCTUPLE = ITEMS.register(
            "smore_octuple", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(92)
                    .saturationModifier(64.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 1200, 2), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 2), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 1200, 2), 1.0F)
                    .build())));
    public static final DeferredItem<Item> SMORE_SEXDECUPLE = ITEMS.register(
            "smore_sexdecuple", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(188)
                    .saturationModifier(256.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 2400, 2), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2400, 2), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 2400, 2), 1.0F)
                    .build())));
    public static final DeferredItem<Item> SMORE_DUOTRIGINTUPLE = ITEMS.register(
            "smore_duotrigintuple", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(380)
                    .saturationModifier(1024.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 4800, 2), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 4800, 2), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 4800, 2), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 4800, 2), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 4800, 0), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.WATER_BREATHING, 4800, 0), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.LUCK, 4800, 2), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.SATURATION, Integer.MAX_VALUE, 0), 1.0F)
                    .build())));
    public static final DeferredItem<Item> IO_CONFIGURATOR = ITEMS.register(
            "io_configurator", () -> new Item(new Item.Properties().stacksTo(1).component(NRRDataComponents.CONFIGURATION_TYPE, ConfigurationTypes.DISABLE_ALL)) {
                @Override
                public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand usedHand) {
                    var stack = player.getItemInHand(usedHand);
                    if (!level.isClientSide()) {
                        if (player.isCrouching() && player.pick(5.0D, 1.0F, false).getType() == HitResult.Type.MISS) {
                            stack.set(NRRDataComponents.CONFIGURATION_TYPE, ConfigurationTypes.getNext(stack.getComponents().get(NRRDataComponents.CONFIGURATION_TYPE.get())));
                            player.sendSystemMessage(Component.translatable("message.nrreborn.io_configurator_switch_configuration_mode").append(switch (stack.getComponents().get(NRRDataComponents.CONFIGURATION_TYPE.get())) {
                                case ConfigurationTypes.INPUT_ITEM_SLOT_1 -> Component.translatable("tooltip.nrreborn.io_configurator_configure_input_item_slot_1").withColor(5636095);
                                case ConfigurationTypes.INPUT_ITEM_SLOT_2 -> Component.translatable("tooltip.nrreborn.io_configurator_configure_input_item_slot_2").withColor(5636095);
                                case ConfigurationTypes.INPUT_ITEM_SLOT_3 -> Component.translatable("tooltip.nrreborn.io_configurator_configure_input_item_slot_3").withColor(5636095);
                                case ConfigurationTypes.INPUT_ITEM_SLOT_4 -> Component.translatable("tooltip.nrreborn.io_configurator_configure_input_item_slot_4").withColor(5636095);
                                case ConfigurationTypes.OUTPUT_ITEM_SLOT_1 -> Component.translatable("tooltip.nrreborn.io_configurator_configure_output_item_slot_1").withColor(16755200);
                                case ConfigurationTypes.OUTPUT_ITEM_SLOT_2 -> Component.translatable("tooltip.nrreborn.io_configurator_configure_output_item_slot_2").withColor(16755200);
                                case ConfigurationTypes.OUTPUT_ITEM_SLOT_3 -> Component.translatable("tooltip.nrreborn.io_configurator_configure_output_item_slot_3").withColor(16755200);
                                case ConfigurationTypes.OUTPUT_ITEM_SLOT_4 -> Component.translatable("tooltip.nrreborn.io_configurator_configure_output_item_slot_4").withColor(16755200);
                                default -> Component.translatable("tooltip.nrreborn.io_configurator_disable_all").withColor(16733525);
                            }));
                        }
                    }
                    return InteractionResultHolder.success(stack);
                }

                @Override
                public void appendHoverText(@NotNull ItemStack stack, @NotNull TooltipContext context, @NotNull List<Component> tooltipComponents, @NotNull TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.io_configurator_current_mode").withColor(11184810).append(switch (stack.getComponents().get(NRRDataComponents.CONFIGURATION_TYPE.get())) {
                        case ConfigurationTypes.INPUT_ITEM_SLOT_1 -> Component.translatable("tooltip.nrreborn.io_configurator_configure_input_item_slot_1").withColor(5636095);
                        case ConfigurationTypes.INPUT_ITEM_SLOT_2 -> Component.translatable("tooltip.nrreborn.io_configurator_configure_input_item_slot_2").withColor(5636095);
                        case ConfigurationTypes.INPUT_ITEM_SLOT_3 -> Component.translatable("tooltip.nrreborn.io_configurator_configure_input_item_slot_3").withColor(5636095);
                        case ConfigurationTypes.INPUT_ITEM_SLOT_4 -> Component.translatable("tooltip.nrreborn.io_configurator_configure_input_item_slot_4").withColor(5636095);
                        case ConfigurationTypes.OUTPUT_ITEM_SLOT_1 -> Component.translatable("tooltip.nrreborn.io_configurator_configure_output_item_slot_1").withColor(16755200);
                        case ConfigurationTypes.OUTPUT_ITEM_SLOT_2 -> Component.translatable("tooltip.nrreborn.io_configurator_configure_output_item_slot_2").withColor(16755200);
                        case ConfigurationTypes.OUTPUT_ITEM_SLOT_3 -> Component.translatable("tooltip.nrreborn.io_configurator_configure_output_item_slot_3").withColor(16755200);
                        case ConfigurationTypes.OUTPUT_ITEM_SLOT_4 -> Component.translatable("tooltip.nrreborn.io_configurator_configure_output_item_slot_4").withColor(16755200);
                        default -> Component.translatable("tooltip.nrreborn.io_configurator_disable_all").withColor(16733525);
                    }));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }

                @Override
                public InteractionResult useOn(UseOnContext context) {
                    if (!context.getLevel().isClientSide()) {
                        if (context.getLevel().getBlockEntity(context.getClickedPos()) instanceof NRRWrappedMachineBlockEntity blockEntity) {
                            context.getLevel().invalidateCapabilities(context.getClickedPos());
                            blockEntity.setChanged();
                            if (!context.getPlayer().isCrouching()) {
                                if (context.getItemInHand().getComponents().get(NRRDataComponents.CONFIGURATION_TYPE.get()) == ConfigurationTypes.DISABLE_ALL) {
                                    for (int i = 0; i < blockEntity.inputSideConfiguration.length; i++) {
                                        Arrays.fill(blockEntity.inputSideConfiguration[i], false);
                                    }
                                    for (int i = 0; i < blockEntity.outputSideConfiguration.length; i++) {
                                        Arrays.fill(blockEntity.outputSideConfiguration[i], false);
                                    }
                                    context.getPlayer().sendSystemMessage(Component.translatable("message.nrreborn.block_disable_all_sides"));
                                } else if (context.getItemInHand().getComponents().get(NRRDataComponents.CONFIGURATION_TYPE.get()) >= ConfigurationTypes.INPUT_ITEM_SLOT_1 &&
                                        context.getItemInHand().getComponents().get(NRRDataComponents.CONFIGURATION_TYPE.get()) <= ConfigurationTypes.INPUT_ITEM_SLOT_4) {
                                    blockEntity.inputSideConfiguration[context.getClickedFace().get3DDataValue()][context.getItemInHand().getComponents().get(NRRDataComponents.CONFIGURATION_TYPE.get()) - 1] =
                                            !blockEntity.inputSideConfiguration[context.getClickedFace().get3DDataValue()][context.getItemInHand().getComponents().get(NRRDataComponents.CONFIGURATION_TYPE.get()) - 1];
                                } else {
                                    blockEntity.outputSideConfiguration[context.getClickedFace().get3DDataValue()][context.getItemInHand().getComponents().get(NRRDataComponents.CONFIGURATION_TYPE.get()) - 5] =
                                            !blockEntity.outputSideConfiguration[context.getClickedFace().get3DDataValue()][context.getItemInHand().getComponents().get(NRRDataComponents.CONFIGURATION_TYPE.get()) - 5];
                                }
                            } else {
                                if (context.getItemInHand().getComponents().get(NRRDataComponents.CONFIGURATION_TYPE.get()) == ConfigurationTypes.DISABLE_ALL) {
                                    for (int i = 0; i < blockEntity.inputSideConfiguration.length; i++) {
                                        Arrays.fill(blockEntity.inputSideConfiguration[i], false);
                                    }
                                    for (int i = 0; i < blockEntity.outputSideConfiguration.length; i++) {
                                        Arrays.fill(blockEntity.outputSideConfiguration[i], false);
                                    }
                                    context.getPlayer().sendSystemMessage(Component.translatable("message.nrreborn.block_disable_all_sides"));
                                } else if (context.getItemInHand().getComponents().get(NRRDataComponents.CONFIGURATION_TYPE.get()) >= ConfigurationTypes.INPUT_ITEM_SLOT_1 &&
                                        context.getItemInHand().getComponents().get(NRRDataComponents.CONFIGURATION_TYPE.get()) <= ConfigurationTypes.INPUT_ITEM_SLOT_4) {
                                    blockEntity.inputSideConfiguration[context.getClickedFace().getOpposite().get3DDataValue()][context.getItemInHand().getComponents().get(NRRDataComponents.CONFIGURATION_TYPE.get()) - 1] =
                                            !blockEntity.inputSideConfiguration[context.getClickedFace().getOpposite().get3DDataValue()][context.getItemInHand().getComponents().get(NRRDataComponents.CONFIGURATION_TYPE.get()) - 1];
                                } else {
                                    blockEntity.outputSideConfiguration[context.getClickedFace().getOpposite().get3DDataValue()][context.getItemInHand().getComponents().get(NRRDataComponents.CONFIGURATION_TYPE.get()) - 5] =
                                            !blockEntity.outputSideConfiguration[context.getClickedFace().getOpposite().get3DDataValue()][context.getItemInHand().getComponents().get(NRRDataComponents.CONFIGURATION_TYPE.get()) - 5];
                                }
                            }
                        }
                    }
                    return InteractionResult.SUCCESS;
                }
            });
    public static final DeferredItem<Item> PORTABLE_COBBLESTONE_GENERATOR = ITEMS.register(
            "portable_cobblestone_generator", () -> new Item(new Item.Properties().stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
