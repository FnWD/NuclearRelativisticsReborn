package com.fnwd.nrreborn.fluid;

import com.fnwd.nrreborn.NuclearRelativisticsReborn;
import com.fnwd.nrreborn.block.NRRBlocks;
import com.fnwd.nrreborn.fluid.fluid_types.GasFluidType;
import com.fnwd.nrreborn.item.NRRItems;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.SoundActions;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.function.Supplier;

public class NRRFluids {
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(BuiltInRegistries.FLUID, NuclearRelativisticsReborn.MODID);
    public static final DeferredRegister<FluidType> FLUID_TYPES = DeferredRegister.create(NeoForgeRegistries.Keys.FLUID_TYPES, NuclearRelativisticsReborn.MODID);

    public static final Supplier<FlowingFluid> NITROGEN_SOURCE = FLUIDS.register(
            "nitrogen", () -> new BaseFlowingFluid.Source(NRRFluids.NITROGEN_PROPERTIES));
    public static final Supplier<FlowingFluid> NITROGEN_FLOWING = FLUIDS.register(
            "flowing_nitrogen", () -> new BaseFlowingFluid.Flowing(NRRFluids.NITROGEN_PROPERTIES));
    public static final Supplier<FluidType> NITROGEN_FLUID_TYPE = FLUID_TYPES.register(
            "nitrogen", () -> new GasFluidType(FluidType.Properties.create()
                    .descriptionId("block.nrreborn.nitrogen")
                    .temperature(300)
                    .density(-500)
                    .viscosity(20)
                    .canSwim(false)
                    .canDrown(true)
                    .canExtinguish(true)
                    .lightLevel(0)
                    .motionScale(0.002D)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY),
                    0xFFA2AFA2));
    public static final BaseFlowingFluid.Properties NITROGEN_PROPERTIES = new BaseFlowingFluid.Properties(
        NITROGEN_FLUID_TYPE, NITROGEN_SOURCE, NITROGEN_FLOWING)
            .block(NRRBlocks.NITROGEN_BLOCK)
            .bucket(NRRItems.NITROGEN_BUCKET);

    public static final Supplier<FlowingFluid> OXYGEN_SOURCE = FLUIDS.register(
            "oxygen", () -> new BaseFlowingFluid.Source(NRRFluids.OXYGEN_PROPERTIES));
    public static final Supplier<FlowingFluid> OXYGEN_FLOWING = FLUIDS.register(
            "flowing_oxygen", () -> new BaseFlowingFluid.Flowing(NRRFluids.OXYGEN_PROPERTIES));
    public static final Supplier<FluidType> OXYGEN_FLUID_TYPE = FLUID_TYPES.register(
            "oxygen", () -> new GasFluidType(FluidType.Properties.create()
                    .descriptionId("block.nrreborn.oxygen")
                    .temperature(300)
                    .density(-500)
                    .viscosity(20)
                    .canSwim(false)
                    .canDrown(false)
                    .canExtinguish(false)
                    .lightLevel(0)
                    .motionScale(0.002D)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY),
                    0xFFA4A6B1));
    public static final BaseFlowingFluid.Properties OXYGEN_PROPERTIES = new BaseFlowingFluid.Properties(
            OXYGEN_FLUID_TYPE, OXYGEN_SOURCE, OXYGEN_FLOWING)
            .block(NRRBlocks.OXYGEN_BLOCK)
            .bucket(NRRItems.OXYGEN_BUCKET);

    public static final Supplier<FlowingFluid> FLUORINE_SOURCE = FLUIDS.register(
            "fluorine", () -> new BaseFlowingFluid.Source(NRRFluids.FLUORINE_PROPERTIES));
    public static final Supplier<FlowingFluid> FLUORINE_FLOWING = FLUIDS.register(
            "flowing_fluorine", () -> new BaseFlowingFluid.Flowing(NRRFluids.FLUORINE_PROPERTIES));
    public static final Supplier<FluidType> FLUORINE_FLUID_TYPE = FLUID_TYPES.register(
            "fluorine", () -> new GasFluidType(FluidType.Properties.create()
                    .descriptionId("block.nrreborn.fluorine")
                    .temperature(300)
                    .density(-500)
                    .viscosity(20)
                    .canSwim(false)
                    .canDrown(true)
                    .canExtinguish(false)
                    .lightLevel(0)
                    .motionScale(0.002D)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY),
                    0xFFB3B19E));
    public static final BaseFlowingFluid.Properties FLUORINE_PROPERTIES = new BaseFlowingFluid.Properties(
            FLUORINE_FLUID_TYPE, FLUORINE_SOURCE, FLUORINE_FLOWING)
            .block(NRRBlocks.FLUORINE_BLOCK)
            .bucket(NRRItems.FLUORINE_BUCKET);

    public static final Supplier<FlowingFluid> HYDROGEN_SOURCE = FLUIDS.register(
            "hydrogen", () -> new BaseFlowingFluid.Source(NRRFluids.HYDROGEN_PROPERTIES));
    public static final Supplier<FlowingFluid> HYDROGEN_FLOWING = FLUIDS.register(
            "flowing_hydrogen", () -> new BaseFlowingFluid.Flowing(NRRFluids.HYDROGEN_PROPERTIES));
    public static final Supplier<FluidType> HYDROGEN_FLUID_TYPE = FLUID_TYPES.register(
            "hydrogen", () -> new GasFluidType(FluidType.Properties.create()
                    .descriptionId("block.nrreborn.hydrogen")
                    .temperature(300)
                    .density(-500)
                    .viscosity(20)
                    .canSwim(false)
                    .canDrown(true)
                    .canExtinguish(false)
                    .lightLevel(0)
                    .motionScale(0.002D)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY),
                    0xFFACA2AF));
    public static final BaseFlowingFluid.Properties HYDROGEN_PROPERTIES = new BaseFlowingFluid.Properties(
            HYDROGEN_FLUID_TYPE, HYDROGEN_SOURCE, HYDROGEN_FLOWING)
            .block(NRRBlocks.HYDROGEN_BLOCK)
            .bucket(NRRItems.HYDROGEN_BUCKET);

    public static final Supplier<FlowingFluid> DEUTERIUM_SOURCE = FLUIDS.register(
            "deuterium", () -> new BaseFlowingFluid.Source(NRRFluids.DEUTERIUM_PROPERTIES));
    public static final Supplier<FlowingFluid> DEUTERIUM_FLOWING = FLUIDS.register(
            "flowing_deuterium", () -> new BaseFlowingFluid.Flowing(NRRFluids.DEUTERIUM_PROPERTIES));
    public static final Supplier<FluidType> DEUTERIUM_FLUID_TYPE = FLUID_TYPES.register(
            "deuterium", () -> new GasFluidType(FluidType.Properties.create()
                    .descriptionId("block.nrreborn.deuterium")
                    .temperature(300)
                    .density(-500)
                    .viscosity(20)
                    .canSwim(false)
                    .canDrown(true)
                    .canExtinguish(false)
                    .lightLevel(0)
                    .motionScale(0.002D)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY),
                    0xFFA9A1B7));
    public static final BaseFlowingFluid.Properties DEUTERIUM_PROPERTIES = new BaseFlowingFluid.Properties(
            DEUTERIUM_FLUID_TYPE, DEUTERIUM_SOURCE, DEUTERIUM_FLOWING)
            .block(NRRBlocks.DEUTERIUM_BLOCK)
            .bucket(NRRItems.DEUTERIUM_BUCKET);

    public static final Supplier<FlowingFluid> TRITIUM_SOURCE = FLUIDS.register(
            "tritium", () -> new BaseFlowingFluid.Source(NRRFluids.TRITIUM_PROPERTIES));
    public static final Supplier<FlowingFluid> TRITIUM_FLOWING = FLUIDS.register(
            "flowing_tritium", () -> new BaseFlowingFluid.Flowing(NRRFluids.TRITIUM_PROPERTIES));
    public static final Supplier<FluidType> TRITIUM_FLUID_TYPE = FLUID_TYPES.register(
            "tritium", () -> new GasFluidType(FluidType.Properties.create()
                    .descriptionId("block.nrreborn.tritium")
                    .temperature(300)
                    .density(-500)
                    .viscosity(20)
                    .canSwim(false)
                    .canDrown(true)
                    .canExtinguish(false)
                    .lightLevel(3)
                    .motionScale(0.002D)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY),
                    0xFF9EAEB3));
    public static final BaseFlowingFluid.Properties TRITIUM_PROPERTIES = new BaseFlowingFluid.Properties(
            TRITIUM_FLUID_TYPE, TRITIUM_SOURCE, TRITIUM_FLOWING)
            .block(NRRBlocks.TRITIUM_BLOCK)
            .bucket(NRRItems.TRITIUM_BUCKET);

    public static final Supplier<FlowingFluid> HELIUM_SOURCE = FLUIDS.register(
            "helium", () -> new BaseFlowingFluid.Source(NRRFluids.HELIUM_PROPERTIES));
    public static final Supplier<FlowingFluid> HELIUM_FLOWING = FLUIDS.register(
            "flowing_helium", () -> new BaseFlowingFluid.Flowing(NRRFluids.HELIUM_PROPERTIES));
    public static final Supplier<FluidType> HELIUM_FLUID_TYPE = FLUID_TYPES.register(
            "helium", () -> new GasFluidType(FluidType.Properties.create()
                    .descriptionId("block.nrreborn.helium")
                    .temperature(300)
                    .density(-500)
                    .viscosity(20)
                    .canSwim(false)
                    .canDrown(true)
                    .canExtinguish(true)
                    .lightLevel(0)
                    .motionScale(0.002D)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY),
                    0xFFAFA2A3));
    public static final BaseFlowingFluid.Properties HELIUM_PROPERTIES = new BaseFlowingFluid.Properties(
            HELIUM_FLUID_TYPE, HELIUM_SOURCE, HELIUM_FLOWING)
            .block(NRRBlocks.HELIUM_BLOCK)
            .bucket(NRRItems.HELIUM_BUCKET);

    public static final Supplier<FlowingFluid> HELIUM_3_SOURCE = FLUIDS.register(
            "helium_3", () -> new BaseFlowingFluid.Source(NRRFluids.HELIUM_3_PROPERTIES));
    public static final Supplier<FlowingFluid> HELIUM_3_FLOWING = FLUIDS.register(
            "flowing_helium_3", () -> new BaseFlowingFluid.Flowing(NRRFluids.HELIUM_3_PROPERTIES));
    public static final Supplier<FluidType> HELIUM_3_FLUID_TYPE = FLUID_TYPES.register(
            "helium_3", () -> new GasFluidType(FluidType.Properties.create()
                    .descriptionId("block.nrreborn.helium_3")
                    .temperature(300)
                    .density(-500)
                    .viscosity(20)
                    .canSwim(false)
                    .canDrown(true)
                    .canExtinguish(true)
                    .lightLevel(0)
                    .motionScale(0.002D)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY),
                    0xFFB0AE9F));
    public static final BaseFlowingFluid.Properties HELIUM_3_PROPERTIES = new BaseFlowingFluid.Properties(
            HELIUM_3_FLUID_TYPE, HELIUM_3_SOURCE, HELIUM_3_FLOWING)
            .block(NRRBlocks.HELIUM_3_BLOCK)
            .bucket(NRRItems.HELIUM_3_BUCKET);

    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
        FLUID_TYPES.register(eventBus);
    }
}
