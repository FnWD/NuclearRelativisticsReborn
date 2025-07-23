package com.fnwd.nrreborn.datagen;

import com.fnwd.nrreborn.block.NRRBlocks;
import com.fnwd.nrreborn.item.NRRItems;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class NRRBlockLootTableProvider extends BlockLootSubProvider {
    protected NRRBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        add(NRRBlocks.TIN_ORE.get(), block -> createOreDrop(NRRBlocks.TIN_ORE.get(), NRRItems.RAW_TIN.get()));
        add(NRRBlocks.DEEPSLATE_TIN_ORE.get(), block -> createOreDrop(NRRBlocks.DEEPSLATE_TIN_ORE.get(), NRRItems.RAW_TIN.get()));
        add(NRRBlocks.LEAD_ORE.get(), block -> createOreDrop(NRRBlocks.LEAD_ORE.get(), NRRItems.RAW_LEAD.get()));
        add(NRRBlocks.DEEPSLATE_LEAD_ORE.get(), block -> createOreDrop(NRRBlocks.DEEPSLATE_LEAD_ORE.get(), NRRItems.RAW_LEAD.get()));
        add(NRRBlocks.MAGNESIUM_ORE.get(), block -> createOreDrop(NRRBlocks.MAGNESIUM_ORE.get(), NRRItems.RAW_MAGNESIUM.get()));
        add(NRRBlocks.DEEPSLATE_MAGNESIUM_ORE.get(), block -> createOreDrop(NRRBlocks.DEEPSLATE_MAGNESIUM_ORE.get(), NRRItems.RAW_MAGNESIUM.get()));
        add(NRRBlocks.LITHIUM_ORE.get(), block -> createOreDrop(NRRBlocks.LITHIUM_ORE.get(), NRRItems.RAW_LITHIUM.get()));
        add(NRRBlocks.DEEPSLATE_LITHIUM_ORE.get(), block -> createOreDrop(NRRBlocks.DEEPSLATE_LITHIUM_ORE.get(), NRRItems.RAW_LITHIUM.get()));
        add(NRRBlocks.BORON_ORE.get(), block -> createOreDrop(NRRBlocks.BORON_ORE.get(), NRRItems.RAW_BORON.get()));
        add(NRRBlocks.DEEPSLATE_BORON_ORE.get(), block -> createOreDrop(NRRBlocks.DEEPSLATE_BORON_ORE.get(), NRRItems.RAW_BORON.get()));
        add(NRRBlocks.THORIUM_ORE.get(), block -> createOreDrop(NRRBlocks.THORIUM_ORE.get(), NRRItems.RAW_THORIUM.get()));
        add(NRRBlocks.DEEPSLATE_THORIUM_ORE.get(), block -> createOreDrop(NRRBlocks.DEEPSLATE_THORIUM_ORE.get(), NRRItems.RAW_THORIUM.get()));
        add(NRRBlocks.URANIUM_ORE.get(), block -> createOreDrop(NRRBlocks.URANIUM_ORE.get(), NRRItems.RAW_URANIUM.get()));
        add(NRRBlocks.DEEPSLATE_URANIUM_ORE.get(), block -> createOreDrop(NRRBlocks.DEEPSLATE_URANIUM_ORE.get(), NRRItems.RAW_URANIUM.get()));
        dropSelf(NRRBlocks.MANUFACTORY.get());
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return NRRBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
