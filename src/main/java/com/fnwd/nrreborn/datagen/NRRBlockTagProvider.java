package com.fnwd.nrreborn.datagen;

import com.fnwd.nrreborn.NuclearRelativisticsReborn;
import com.fnwd.nrreborn.block.NRRBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class NRRBlockTagProvider extends BlockTagsProvider {
    public NRRBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, NuclearRelativisticsReborn.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(NRRBlocks.TIN_ORE.get())
                .add(NRRBlocks.DEEPSLATE_TIN_ORE.get())
                .add(NRRBlocks.LEAD_ORE.get())
                .add(NRRBlocks.DEEPSLATE_LEAD_ORE.get())
                .add(NRRBlocks.MAGNESIUM_ORE.get())
                .add(NRRBlocks.DEEPSLATE_MAGNESIUM_ORE.get())
                .add(NRRBlocks.LITHIUM_ORE.get())
                .add(NRRBlocks.DEEPSLATE_LITHIUM_ORE.get())
                .add(NRRBlocks.BORON_ORE.get())
                .add(NRRBlocks.DEEPSLATE_BORON_ORE.get())
                .add(NRRBlocks.THORIUM_ORE.get())
                .add(NRRBlocks.DEEPSLATE_THORIUM_ORE.get())
                .add(NRRBlocks.URANIUM_ORE.get())
                .add(NRRBlocks.DEEPSLATE_URANIUM_ORE.get());
        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(NRRBlocks.TIN_ORE.get())
                .add(NRRBlocks.DEEPSLATE_TIN_ORE.get())
                .add(NRRBlocks.LEAD_ORE.get())
                .add(NRRBlocks.DEEPSLATE_LEAD_ORE.get());
        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(NRRBlocks.MAGNESIUM_ORE.get())
                .add(NRRBlocks.DEEPSLATE_MAGNESIUM_ORE.get())
                .add(NRRBlocks.LITHIUM_ORE.get())
                .add(NRRBlocks.DEEPSLATE_LITHIUM_ORE.get())
                .add(NRRBlocks.BORON_ORE.get())
                .add(NRRBlocks.DEEPSLATE_BORON_ORE.get())
                .add(NRRBlocks.THORIUM_ORE.get())
                .add(NRRBlocks.DEEPSLATE_THORIUM_ORE.get())
                .add(NRRBlocks.URANIUM_ORE.get())
                .add(NRRBlocks.DEEPSLATE_URANIUM_ORE.get());
    }
}
