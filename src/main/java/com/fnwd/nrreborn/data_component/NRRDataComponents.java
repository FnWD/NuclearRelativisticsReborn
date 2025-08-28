package com.fnwd.nrreborn.data_component;

import com.fnwd.nrreborn.NuclearRelativisticsReborn;
import com.mojang.serialization.Codec;
import net.minecraft.core.component.DataComponentType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class NRRDataComponents {
    public static final DeferredRegister<DataComponentType<?>> DATA_COMPONENT_TYPES = DeferredRegister.createDataComponents(NuclearRelativisticsReborn.MODID);

    public static final DeferredHolder<DataComponentType<?>, DataComponentType<Integer>> CONFIGURATION_TYPE = DATA_COMPONENT_TYPES.register(
            "configuration_type", () -> DataComponentType.<Integer>builder().persistent(Codec.INT).build());

    public static void register(IEventBus eventBus) {
        DATA_COMPONENT_TYPES.register(eventBus);
    }
}
