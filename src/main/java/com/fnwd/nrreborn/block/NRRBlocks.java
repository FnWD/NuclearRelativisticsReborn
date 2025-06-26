package com.fnwd.nrreborn.block;

import com.fnwd.nrreborn.NuclearRelativisticsReborn;
import com.fnwd.nrreborn.item.NRRItems;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

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

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> deferredBlock = BLOCKS.register(name, block);
        registerBlockItem(name, deferredBlock);
        return deferredBlock;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        NRRItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
