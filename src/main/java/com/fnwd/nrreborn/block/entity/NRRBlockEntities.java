package com.fnwd.nrreborn.block.entity;

import com.fnwd.nrreborn.NuclearRelativisticsReborn;
import com.fnwd.nrreborn.block.NRRBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class NRRBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, NuclearRelativisticsReborn.MODID);

    public static final Supplier<BlockEntityType<ManufactoryBlockEntity>> MANUFACTORY_BLOCK_ENTITY = BLOCK_ENTITIES.register(
            "manufactory_block_entity", () -> BlockEntityType.Builder.of(
                    ManufactoryBlockEntity::new, NRRBlocks.MANUFACTORY.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
