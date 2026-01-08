package com.fnwd.nrreborn.block;

import com.fnwd.nrreborn.NuclearRelativisticsReborn;
import com.fnwd.nrreborn.block.generators.rtgs.AmericiumRTGBlock;
import com.fnwd.nrreborn.block.generators.rtgs.CaliforniumRTGBlock;
import com.fnwd.nrreborn.block.generators.rtgs.PlutoniumRTGBlock;
import com.fnwd.nrreborn.block.generators.rtgs.UraniumRTGBlock;
import com.fnwd.nrreborn.block.generators.solar_panels.AdvancedSolarPanelBlock;
import com.fnwd.nrreborn.block.generators.solar_panels.BasicSolarPanelBlock;
import com.fnwd.nrreborn.block.generators.solar_panels.DepletedUraniumSolarPanelBlock;
import com.fnwd.nrreborn.block.generators.solar_panels.EliteSolarPanelBlock;
import com.fnwd.nrreborn.block.manufactory.ManufactoryBlock;
import com.fnwd.nrreborn.fluid.NRRFluids;
import com.fnwd.nrreborn.item.NRRItems;
import net.minecraft.network.chat.Component;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.function.Supplier;

public class NRRBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(NuclearRelativisticsReborn.MODID);

    public static final DeferredBlock<Block> TIN_ORE = registerBlock(
            "tin_ore", () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3.0F, 3.0F)
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.STONE)));
    public static final DeferredBlock<Block> DEEPSLATE_TIN_ORE = registerBlock(
            "deepslate_tin_ore", () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(4.5F, 3.0F)
                    .sound(SoundType.DEEPSLATE)
                    .mapColor(MapColor.DEEPSLATE)));
    public static final DeferredBlock<Block> LEAD_ORE = registerBlock(
            "lead_ore", () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3.0F, 3.0F)
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.STONE)));
    public static final DeferredBlock<Block> DEEPSLATE_LEAD_ORE = registerBlock(
            "deepslate_lead_ore", () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(4.5F, 3.0F)
                    .sound(SoundType.DEEPSLATE)
                    .mapColor(MapColor.DEEPSLATE)));
    public static final DeferredBlock<Block> MAGNESIUM_ORE = registerBlock(
            "magnesium_ore", () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3.0F, 3.0F)
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.STONE)));
    public static final DeferredBlock<Block> DEEPSLATE_MAGNESIUM_ORE = registerBlock(
            "deepslate_magnesium_ore", () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(4.5F, 3.0F)
                    .sound(SoundType.DEEPSLATE)
                    .mapColor(MapColor.DEEPSLATE)));
    public static final DeferredBlock<Block> LITHIUM_ORE = registerBlock(
            "lithium_ore", () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3.0F, 3.0F)
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.STONE)));
    public static final DeferredBlock<Block> DEEPSLATE_LITHIUM_ORE = registerBlock(
            "deepslate_lithium_ore", () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(4.5F, 3.0F)
                    .sound(SoundType.DEEPSLATE)
                    .mapColor(MapColor.DEEPSLATE)));
    public static final DeferredBlock<Block> BORON_ORE = registerBlock(
            "boron_ore", () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3.0F, 3.0F)
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.STONE)));
    public static final DeferredBlock<Block> DEEPSLATE_BORON_ORE = registerBlock(
            "deepslate_boron_ore", () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(4.5F, 3.0F)
                    .sound(SoundType.DEEPSLATE)
                    .mapColor(MapColor.DEEPSLATE)));
    public static final DeferredBlock<Block> THORIUM_ORE = registerBlock(
            "thorium_ore", () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3.0F, 3.0F)
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.STONE)));
    public static final DeferredBlock<Block> DEEPSLATE_THORIUM_ORE = registerBlock(
            "deepslate_thorium_ore", () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(4.5F, 3.0F)
                    .sound(SoundType.DEEPSLATE)
                    .mapColor(MapColor.DEEPSLATE)));
    public static final DeferredBlock<Block> URANIUM_ORE = registerBlock(
            "uranium_ore", () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(3.0F, 3.0F)
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.STONE)));
    public static final DeferredBlock<Block> DEEPSLATE_URANIUM_ORE = registerBlock(
            "deepslate_uranium_ore", () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(4.5F, 3.0F)
                    .sound(SoundType.DEEPSLATE)
                    .mapColor(MapColor.DEEPSLATE)));
    public static final DeferredBlock<LiquidBlock> NITROGEN_BLOCK = registerFluidBlock(
            "nitrogen", () -> new LiquidBlock(NRRFluids.NITROGEN_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    public static final DeferredBlock<LiquidBlock> OXYGEN_BLOCK = registerFluidBlock(
            "oxygen", () -> new LiquidBlock(NRRFluids.OXYGEN_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    public static final DeferredBlock<LiquidBlock> FLUORINE_BLOCK = registerFluidBlock(
            "fluorine", () -> new LiquidBlock(NRRFluids.FLUORINE_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    public static final DeferredBlock<LiquidBlock> HYDROGEN_BLOCK = registerFluidBlock(
            "hydrogen", () -> new LiquidBlock(NRRFluids.HYDROGEN_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    public static final DeferredBlock<LiquidBlock> DEUTERIUM_BLOCK = registerFluidBlock(
            "deuterium", () -> new LiquidBlock(NRRFluids.DEUTERIUM_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    public static final DeferredBlock<LiquidBlock> TRITIUM_BLOCK = registerFluidBlock(
            "tritium", () -> new LiquidBlock(NRRFluids.TRITIUM_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER).lightLevel(block -> 3)));
    public static final DeferredBlock<LiquidBlock> HELIUM_BLOCK = registerFluidBlock(
            "helium", () -> new LiquidBlock(NRRFluids.HELIUM_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    public static final DeferredBlock<LiquidBlock> HELIUM_3_BLOCK = registerFluidBlock(
            "helium_3", () -> new LiquidBlock(NRRFluids.HELIUM_3_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    public static final DeferredBlock<LiquidBlock> CARBON_DIOXIDE_BLOCK = registerFluidBlock(
            "carbon_dioxide", () -> new LiquidBlock(NRRFluids.CARBON_DIOXIDE_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    public static final DeferredBlock<LiquidBlock> CARBON_MONOXIDE_BLOCK = registerFluidBlock(
            "carbon_monoxide", () -> new LiquidBlock(NRRFluids.CARBON_MONOXIDE_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    public static final DeferredBlock<LiquidBlock> AMMONIA_BLOCK = registerFluidBlock(
            "ammonia", () -> new LiquidBlock(NRRFluids.AMMONIA_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    public static final DeferredBlock<LiquidBlock> SULFUR_DIOXIDE_BLOCK = registerFluidBlock(
            "sulfur_dioxide", () -> new LiquidBlock(NRRFluids.SULFUR_DIOXIDE_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    public static final DeferredBlock<LiquidBlock> SULFUR_TRIOXIDE_BLOCK = registerFluidBlock(
            "sulfur_trioxide", () -> new LiquidBlock(NRRFluids.SULFUR_TRIOXIDE_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    public static final DeferredBlock<LiquidBlock> ETHYLENE_BLOCK = registerFluidBlock(
            "ethylene", () -> new LiquidBlock(NRRFluids.ETHYLENE_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    public static final DeferredBlock<LiquidBlock> DIBORANE_BLOCK = registerFluidBlock(
            "diborane", () -> new LiquidBlock(NRRFluids.DIBORANE_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    public static final DeferredBlock<LiquidBlock> OXYGEN_DIFLUORIDE_BLOCK = registerFluidBlock(
            "oxygen_difluoride", () -> new LiquidBlock(NRRFluids.OXYGEN_DIFLUORIDE_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    public static final DeferredBlock<LiquidBlock> FLUOROMETHANE_BLOCK = registerFluidBlock(
            "fluoromethane", () -> new LiquidBlock(NRRFluids.FLUOROMETHANE_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    public static final DeferredBlock<LiquidBlock> LIQUID_NITROGEN_BLOCK = registerFluidBlock(
            "liquid_nitrogen", () -> new LiquidBlock(NRRFluids.LIQUID_NITROGEN_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    public static final DeferredBlock<LiquidBlock> LIQUID_HELIUM_BLOCK = registerFluidBlock(
            "liquid_helium", () -> new LiquidBlock(NRRFluids.LIQUID_HELIUM_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    public static final DeferredBlock<LiquidBlock> METHANOL_BLOCK = registerFluidBlock(
            "methanol", () -> new LiquidBlock(NRRFluids.METHANOL_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    public static final DeferredBlock<LiquidBlock> ETHANOL_BLOCK = registerFluidBlock(
            "ethanol", () -> new LiquidBlock(NRRFluids.ETHANOL_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    public static final DeferredBlock<LiquidBlock> SULFURIC_ACID_BLOCK = registerFluidBlock(
            "sulfuric_acid", () -> new LiquidBlock(NRRFluids.SULFURIC_ACID_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    public static final DeferredBlock<LiquidBlock> BORIC_ACID_BLOCK = registerFluidBlock(
            "boric_acid", () -> new LiquidBlock(NRRFluids.BORIC_ACID_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    public static final DeferredBlock<LiquidBlock> BORAX_SOLUTION_BLOCK = registerFluidBlock(
            "borax_solution", () -> new LiquidBlock(NRRFluids.BORAX_SOLUTION_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    public static final DeferredBlock<LiquidBlock> CALCIUM_SULFATE_SOLUTION_BLOCK = registerFluidBlock(
            "calcium_sulfate_solution", () -> new LiquidBlock(NRRFluids.CALCIUM_SULFATE_SOLUTION_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    public static final DeferredBlock<LiquidBlock> SODIUM_FLUORIDE_SOLUTION_BLOCK = registerFluidBlock(
            "sodium_fluoride_solution", () -> new LiquidBlock(NRRFluids.SODIUM_FLUORIDE_SOLUTION_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    public static final DeferredBlock<LiquidBlock> POTASSIUM_FLUORIDE_SOLUTION_BLOCK = registerFluidBlock(
            "potassium_fluoride_solution", () -> new LiquidBlock(NRRFluids.POTASSIUM_FLUORIDE_SOLUTION_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    public static final DeferredBlock<LiquidBlock> SODIUM_HYDROXIDE_SOLUTION_BLOCK = registerFluidBlock(
            "sodium_hydroxide_solution", () -> new LiquidBlock(NRRFluids.SODIUM_HYDROXIDE_SOLUTION_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    public static final DeferredBlock<LiquidBlock> POTASSIUM_HYDROXIDE_SOLUTION_BLOCK = registerFluidBlock(
            "potassium_hydroxide_solution", () -> new LiquidBlock(NRRFluids.POTASSIUM_HYDROXIDE_SOLUTION_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    public static final DeferredBlock<LiquidBlock> FLUORITE_WATER_BLOCK = registerFluidBlock(
            "fluorite_water", () -> new LiquidBlock(NRRFluids.FLUORITE_WATER_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    public static final DeferredBlock<LiquidBlock> BORON_NITRIDE_SOLUTION_BLOCK = registerFluidBlock(
            "boron_nitride_solution", () -> new LiquidBlock(NRRFluids.BORON_NITRIDE_SOLUTION_SOURCE.get(), BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)));
    public static final DeferredBlock<Block> MANUFACTORY = registerBlock(
            "manufactory", () -> new ManufactoryBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(5.0F, 6.0F)
                    .sound(SoundType.METAL)
                    .mapColor(MapColor.COLOR_GRAY)
                    .lightLevel(state -> state.getValue(ManufactoryBlock.WORKING) ? 8 : 0)) {
                @Override
                public void appendHoverText(@NotNull ItemStack stack, Item.@NotNull TooltipContext context, @NotNull List<Component> tooltipComponents, @NotNull TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.manufactory").withColor(5636095));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredBlock<Block> BASIC_SOLAR_PANEL = registerBlock(
            "basic_solar_panel", () -> new BasicSolarPanelBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(5.0F, 6.0F)
                    .sound(SoundType.METAL)
                    .mapColor(MapColor.COLOR_GRAY)) {
                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.basic_solar_panel").withColor(5636095));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredBlock<Block> ADVANCED_SOLAR_PANEL = registerBlock(
            "advanced_solar_panel", () -> new AdvancedSolarPanelBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(5.0F, 6.0F)
                    .sound(SoundType.METAL)
                    .mapColor(MapColor.COLOR_GRAY)) {
                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.advanced_solar_panel").withColor(5636095));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredBlock<Block> DEPLETED_URANIUM_SOLAR_PANEL = registerBlock(
            "depleted_uranium_solar_panel", () -> new DepletedUraniumSolarPanelBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(5.0F, 6.0F)
                    .sound(SoundType.METAL)
                    .mapColor(MapColor.COLOR_GRAY)) {
                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.depleted_uranium_solar_panel").withColor(5636095));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredBlock<Block> ELITE_SOLAR_PANEL = registerBlock(
            "elite_solar_panel", () -> new EliteSolarPanelBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(5.0F, 6.0F)
                    .sound(SoundType.METAL)
                    .mapColor(MapColor.COLOR_GRAY)) {
                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.elite_solar_panel").withColor(5636095));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredBlock<Block> URANIUM_RTG = registerBlock(
            "uranium_rtg", () -> new UraniumRTGBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(5.0F, 6.0F)
                    .sound(SoundType.METAL)
                    .mapColor(MapColor.COLOR_GRAY)) {
                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.uranium_rtg").withColor(5636095));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredBlock<Block> PLUTONIUM_RTG = registerBlock(
            "plutonium_rtg", () -> new PlutoniumRTGBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(5.0F, 6.0F)
                    .sound(SoundType.METAL)
                    .mapColor(MapColor.COLOR_GRAY)) {
                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.plutonium_rtg").withColor(5636095));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredBlock<Block> AMERICIUM_RTG = registerBlock(
            "americium_rtg", () -> new AmericiumRTGBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(5.0F, 6.0F)
                    .sound(SoundType.METAL)
                    .mapColor(MapColor.COLOR_GRAY)) {
                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.americium_rtg").withColor(5636095));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredBlock<Block> CALIFORNIUM_RTG = registerBlock(
            "californium_rtg", () -> new CaliforniumRTGBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(5.0F, 6.0F)
                    .sound(SoundType.METAL)
                    .mapColor(MapColor.COLOR_GRAY)) {
                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.nrreborn.californium_rtg").withColor(5636095));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> deferredBlock = BLOCKS.register(name, block);
        registerBlockItem(name, deferredBlock);
        return deferredBlock;
    }

    private static <T extends Block> DeferredBlock<T> registerFluidBlock(String name, Supplier<T> fluidBlock) {
        return BLOCKS.register(name, fluidBlock);
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        NRRItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
