package com.fnwd.nrreborn.fluid;

import com.fnwd.nrreborn.NuclearRelativisticsReborn;
import com.fnwd.nrreborn.block.NRRBlocks;
import com.fnwd.nrreborn.fluid.fluid_types.GasFluidType;
import com.fnwd.nrreborn.fluid.fluid_types.LiquidFluidType;
import com.fnwd.nrreborn.item.NRRItems;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
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

import static net.minecraft.client.renderer.RenderType.TRANSLUCENT;

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
                    .density(500)
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
                    .density(500)
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

    public static final Supplier<FlowingFluid> CARBON_DIOXIDE_SOURCE = FLUIDS.register(
            "carbon_dioxide", () -> new BaseFlowingFluid.Source(NRRFluids.CARBON_DIOXIDE_PROPERTIES));
    public static final Supplier<FlowingFluid> CARBON_DIOXIDE_FLOWING = FLUIDS.register(
            "flowing_carbon_dioxide", () -> new BaseFlowingFluid.Flowing(NRRFluids.CARBON_DIOXIDE_PROPERTIES));
    public static final Supplier<FluidType> CARBON_DIOXIDE_FLUID_TYPE = FLUID_TYPES.register(
            "carbon_dioxide", () -> new GasFluidType(FluidType.Properties.create()
                    .descriptionId("block.nrreborn.carbon_dioxide")
                    .temperature(300)
                    .density(500)
                    .viscosity(20)
                    .canSwim(false)
                    .canDrown(true)
                    .canExtinguish(true)
                    .lightLevel(0)
                    .motionScale(0.002D)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY),
                    0xFF9E9F9D));
    public static final BaseFlowingFluid.Properties CARBON_DIOXIDE_PROPERTIES = new BaseFlowingFluid.Properties(
            CARBON_DIOXIDE_FLUID_TYPE, CARBON_DIOXIDE_SOURCE, CARBON_DIOXIDE_FLOWING)
            .block(NRRBlocks.CARBON_DIOXIDE_BLOCK)
            .bucket(NRRItems.CARBON_DIOXIDE_BUCKET);

    public static final Supplier<FlowingFluid> CARBON_MONOXIDE_SOURCE = FLUIDS.register(
            "carbon_monoxide", () -> new BaseFlowingFluid.Source(NRRFluids.CARBON_MONOXIDE_PROPERTIES));
    public static final Supplier<FlowingFluid> CARBON_MONOXIDE_FLOWING = FLUIDS.register(
            "flowing_carbon_monoxide", () -> new BaseFlowingFluid.Flowing(NRRFluids.CARBON_MONOXIDE_PROPERTIES));
    public static final Supplier<FluidType> CARBON_MONOXIDE_FLUID_TYPE = FLUID_TYPES.register(
            "carbon_monoxide", () -> new GasFluidType(FluidType.Properties.create()
                    .descriptionId("block.nrreborn.carbon_monoxide")
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
                    0xFF9A9C9A));
    public static final BaseFlowingFluid.Properties CARBON_MONOXIDE_PROPERTIES = new BaseFlowingFluid.Properties(
            CARBON_MONOXIDE_FLUID_TYPE, CARBON_MONOXIDE_SOURCE, CARBON_MONOXIDE_FLOWING)
            .block(NRRBlocks.CARBON_MONOXIDE_BLOCK)
            .bucket(NRRItems.CARBON_MONOXIDE_BUCKET);

    public static final Supplier<FlowingFluid> AMMONIA_SOURCE = FLUIDS.register(
            "ammonia", () -> new BaseFlowingFluid.Source(NRRFluids.AMMONIA_PROPERTIES));
    public static final Supplier<FlowingFluid> AMMONIA_FLOWING = FLUIDS.register(
            "flowing_ammonia", () -> new BaseFlowingFluid.Flowing(NRRFluids.AMMONIA_PROPERTIES));
    public static final Supplier<FluidType> AMMONIA_FLUID_TYPE = FLUID_TYPES.register(
            "ammonia", () -> new GasFluidType(FluidType.Properties.create()
                    .descriptionId("block.nrreborn.ammonia")
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
                    0xFFA2AFA9));
    public static final BaseFlowingFluid.Properties AMMONIA_PROPERTIES = new BaseFlowingFluid.Properties(
            AMMONIA_FLUID_TYPE, AMMONIA_SOURCE, AMMONIA_FLOWING)
            .block(NRRBlocks.AMMONIA_BLOCK)
            .bucket(NRRItems.AMMONIA_BUCKET);

    public static final Supplier<FlowingFluid> SULFUR_DIOXIDE_SOURCE = FLUIDS.register(
            "sulfur_dioxide", () -> new BaseFlowingFluid.Source(NRRFluids.SULFUR_DIOXIDE_PROPERTIES));
    public static final Supplier<FlowingFluid> SULFUR_DIOXIDE_FLOWING = FLUIDS.register(
            "flowing_sulfur_dioxide", () -> new BaseFlowingFluid.Flowing(NRRFluids.SULFUR_DIOXIDE_PROPERTIES));
    public static final Supplier<FluidType> SULFUR_DIOXIDE_FLUID_TYPE = FLUID_TYPES.register(
            "sulfur_dioxide", () -> new GasFluidType(FluidType.Properties.create()
                    .descriptionId("block.nrreborn.sulfur_dioxide")
                    .temperature(300)
                    .density(500)
                    .viscosity(20)
                    .canSwim(false)
                    .canDrown(true)
                    .canExtinguish(true)
                    .lightLevel(0)
                    .motionScale(0.002D)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY),
                    0xFFB0AFA3));
    public static final BaseFlowingFluid.Properties SULFUR_DIOXIDE_PROPERTIES = new BaseFlowingFluid.Properties(
            SULFUR_DIOXIDE_FLUID_TYPE, SULFUR_DIOXIDE_SOURCE, SULFUR_DIOXIDE_FLOWING)
            .block(NRRBlocks.SULFUR_DIOXIDE_BLOCK)
            .bucket(NRRItems.SULFUR_DIOXIDE_BUCKET);

    public static final Supplier<FlowingFluid> SULFUR_TRIOXIDE_SOURCE = FLUIDS.register(
            "sulfur_trioxide", () -> new BaseFlowingFluid.Source(NRRFluids.SULFUR_TRIOXIDE_PROPERTIES));
    public static final Supplier<FlowingFluid> SULFUR_TRIOXIDE_FLOWING = FLUIDS.register(
            "flowing_sulfur_trioxide", () -> new BaseFlowingFluid.Flowing(NRRFluids.SULFUR_TRIOXIDE_PROPERTIES));
    public static final Supplier<FluidType> SULFUR_TRIOXIDE_FLUID_TYPE = FLUID_TYPES.register(
            "sulfur_trioxide", () -> new GasFluidType(FluidType.Properties.create()
                    .descriptionId("block.nrreborn.sulfur_trioxide")
                    .temperature(318)
                    .density(500)
                    .viscosity(20)
                    .canSwim(false)
                    .canDrown(true)
                    .canExtinguish(true)
                    .lightLevel(0)
                    .motionScale(0.002D)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY),
                    0xFFB3AC9E));
    public static final BaseFlowingFluid.Properties SULFUR_TRIOXIDE_PROPERTIES = new BaseFlowingFluid.Properties(
            SULFUR_TRIOXIDE_FLUID_TYPE, SULFUR_TRIOXIDE_SOURCE, SULFUR_TRIOXIDE_FLOWING)
            .block(NRRBlocks.SULFUR_TRIOXIDE_BLOCK)
            .bucket(NRRItems.SULFUR_TRIOXIDE_BUCKET);

    public static final Supplier<FlowingFluid> ETHYLENE_SOURCE = FLUIDS.register(
            "ethylene", () -> new BaseFlowingFluid.Source(NRRFluids.ETHYLENE_PROPERTIES));
    public static final Supplier<FlowingFluid> ETHYLENE_FLOWING = FLUIDS.register(
            "flowing_ethylene", () -> new BaseFlowingFluid.Flowing(NRRFluids.ETHYLENE_PROPERTIES));
    public static final Supplier<FluidType> ETHYLENE_FLUID_TYPE = FLUID_TYPES.register(
            "ethylene", () -> new GasFluidType(FluidType.Properties.create()
                    .descriptionId("block.nrreborn.ethylene")
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
                    0xFFB9B5A9));
    public static final BaseFlowingFluid.Properties ETHYLENE_PROPERTIES = new BaseFlowingFluid.Properties(
            ETHYLENE_FLUID_TYPE, ETHYLENE_SOURCE, ETHYLENE_FLOWING)
            .block(NRRBlocks.ETHYLENE_BLOCK)
            .bucket(NRRItems.ETHYLENE_BUCKET);

    public static final Supplier<FlowingFluid> DIBORANE_SOURCE = FLUIDS.register(
            "diborane", () -> new BaseFlowingFluid.Source(NRRFluids.DIBORANE_PROPERTIES));
    public static final Supplier<FlowingFluid> DIBORANE_FLOWING = FLUIDS.register(
            "flowing_diborane", () -> new BaseFlowingFluid.Flowing(NRRFluids.DIBORANE_PROPERTIES));
    public static final Supplier<FluidType> DIBORANE_FLUID_TYPE = FLUID_TYPES.register(
            "diborane", () -> new GasFluidType(FluidType.Properties.create()
                    .descriptionId("block.nrreborn.diborane")
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
                    0xFFB1A0A6));
    public static final BaseFlowingFluid.Properties DIBORANE_PROPERTIES = new BaseFlowingFluid.Properties(
            DIBORANE_FLUID_TYPE, DIBORANE_SOURCE, DIBORANE_FLOWING)
            .block(NRRBlocks.DIBORANE_BLOCK)
            .bucket(NRRItems.DIBORANE_BUCKET);

    public static final Supplier<FlowingFluid> OXYGEN_DIFLUORIDE_SOURCE = FLUIDS.register(
            "oxygen_difluoride", () -> new BaseFlowingFluid.Source(NRRFluids.OXYGEN_DIFLUORIDE_PROPERTIES));
    public static final Supplier<FlowingFluid> OXYGEN_DIFLUORIDE_FLOWING = FLUIDS.register(
            "flowing_oxygen_difluoride", () -> new BaseFlowingFluid.Flowing(NRRFluids.OXYGEN_DIFLUORIDE_PROPERTIES));
    public static final Supplier<FluidType> OXYGEN_DIFLUORIDE_FLUID_TYPE = FLUID_TYPES.register(
            "oxygen_difluoride", () -> new GasFluidType(FluidType.Properties.create()
                    .descriptionId("block.nrreborn.oxygen_difluoride")
                    .temperature(300)
                    .density(500)
                    .viscosity(20)
                    .canSwim(false)
                    .canDrown(true)
                    .canExtinguish(true)
                    .lightLevel(0)
                    .motionScale(0.002D)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY),
                    0xFFB6928D));
    public static final BaseFlowingFluid.Properties OXYGEN_DIFLUORIDE_PROPERTIES = new BaseFlowingFluid.Properties(
            OXYGEN_DIFLUORIDE_FLUID_TYPE, OXYGEN_DIFLUORIDE_SOURCE, OXYGEN_DIFLUORIDE_FLOWING)
            .block(NRRBlocks.OXYGEN_DIFLUORIDE_BLOCK)
            .bucket(NRRItems.OXYGEN_DIFLUORIDE_BUCKET);

    public static final Supplier<FlowingFluid> FLUOROMETHANE_SOURCE = FLUIDS.register(
            "fluoromethane", () -> new BaseFlowingFluid.Source(NRRFluids.FLUOROMETHANE_PROPERTIES));
    public static final Supplier<FlowingFluid> FLUOROMETHANE_FLOWING = FLUIDS.register(
            "flowing_fluoromethane", () -> new BaseFlowingFluid.Flowing(NRRFluids.FLUOROMETHANE_PROPERTIES));
    public static final Supplier<FluidType> FLUOROMETHANE_FLUID_TYPE = FLUID_TYPES.register(
            "fluoromethane", () -> new GasFluidType(FluidType.Properties.create()
                    .descriptionId("block.nrreborn.fluoromethane")
                    .temperature(300)
                    .density(500)
                    .viscosity(20)
                    .canSwim(false)
                    .canDrown(true)
                    .canExtinguish(false)
                    .lightLevel(0)
                    .motionScale(0.002D)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY),
                    0xFF999A8E));
    public static final BaseFlowingFluid.Properties FLUOROMETHANE_PROPERTIES = new BaseFlowingFluid.Properties(
            FLUOROMETHANE_FLUID_TYPE, FLUOROMETHANE_SOURCE, FLUOROMETHANE_FLOWING)
            .block(NRRBlocks.FLUOROMETHANE_BLOCK)
            .bucket(NRRItems.FLUOROMETHANE_BUCKET);

    public static final Supplier<FlowingFluid> LIQUID_NITROGEN_SOURCE = FLUIDS.register(
            "liquid_nitrogen", () -> new BaseFlowingFluid.Source(NRRFluids.LIQUID_NITROGEN_PROPERTIES));
    public static final Supplier<FlowingFluid> LIQUID_NITROGEN_FLOWING = FLUIDS.register(
            "flowing_liquid_nitrogen", () -> new BaseFlowingFluid.Flowing(NRRFluids.LIQUID_NITROGEN_PROPERTIES));
    public static final Supplier<FluidType> LIQUID_NITROGEN_FLUID_TYPE = FLUID_TYPES.register(
            "liquid_nitrogen", () -> new LiquidFluidType(FluidType.Properties.create()
                    .descriptionId("block.nrreborn.liquid_nitrogen")
                    .temperature(77)
                    .density(1000)
                    .viscosity(100)
                    .canSwim(false)
                    .canDrown(true)
                    .canExtinguish(true)
                    .lightLevel(0)
                    .motionScale(0.014D)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY),
                    0xFF50A855));
    public static final BaseFlowingFluid.Properties LIQUID_NITROGEN_PROPERTIES = new BaseFlowingFluid.Properties(
            LIQUID_NITROGEN_FLUID_TYPE, LIQUID_NITROGEN_SOURCE, LIQUID_NITROGEN_FLOWING)
            .block(NRRBlocks.LIQUID_NITROGEN_BLOCK)
            .bucket(NRRItems.LIQUID_NITROGEN_BUCKET);

    public static final Supplier<FlowingFluid> LIQUID_HELIUM_SOURCE = FLUIDS.register(
            "liquid_helium", () -> new BaseFlowingFluid.Source(NRRFluids.LIQUID_HELIUM_PROPERTIES));
    public static final Supplier<FlowingFluid> LIQUID_HELIUM_FLOWING = FLUIDS.register(
            "flowing_liquid_helium", () -> new BaseFlowingFluid.Flowing(NRRFluids.LIQUID_HELIUM_PROPERTIES));
    public static final Supplier<FluidType> LIQUID_HELIUM_FLUID_TYPE = FLUID_TYPES.register(
            "liquid_helium", () -> new LiquidFluidType(FluidType.Properties.create()
                    .descriptionId("block.nrreborn.liquid_helium")
                    .temperature(4)
                    .density(1000)
                    .viscosity(0)
                    .canSwim(false)
                    .canDrown(true)
                    .canExtinguish(true)
                    .lightLevel(0)
                    .motionScale(0.014D)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY),
                    0xFFC46E6B));
    public static final BaseFlowingFluid.Properties LIQUID_HELIUM_PROPERTIES = new BaseFlowingFluid.Properties(
            LIQUID_HELIUM_FLUID_TYPE, LIQUID_HELIUM_SOURCE, LIQUID_HELIUM_FLOWING)
            .block(NRRBlocks.LIQUID_HELIUM_BLOCK)
            .bucket(NRRItems.LIQUID_HELIUM_BUCKET);

    public static final Supplier<FlowingFluid> METHANOL_SOURCE = FLUIDS.register(
            "methanol", () -> new BaseFlowingFluid.Source(NRRFluids.METHANOL_PROPERTIES));
    public static final Supplier<FlowingFluid> METHANOL_FLOWING = FLUIDS.register(
            "flowing_methanol", () -> new BaseFlowingFluid.Flowing(NRRFluids.METHANOL_PROPERTIES));
    public static final Supplier<FluidType> METHANOL_FLUID_TYPE = FLUID_TYPES.register(
            "methanol", () -> new LiquidFluidType(FluidType.Properties.create()
                    .descriptionId("block.nrreborn.methanol")
                    .temperature(300)
                    .density(1000)
                    .viscosity(1000)
                    .canSwim(false)
                    .canDrown(true)
                    .canExtinguish(true)
                    .lightLevel(0)
                    .motionScale(0.014D)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY),
                    0xFF817573));
    public static final BaseFlowingFluid.Properties METHANOL_PROPERTIES = new BaseFlowingFluid.Properties(
            METHANOL_FLUID_TYPE, METHANOL_SOURCE, METHANOL_FLOWING)
            .block(NRRBlocks.METHANOL_BLOCK)
            .bucket(NRRItems.METHANOL_BUCKET);

    public static final Supplier<FlowingFluid> ETHANOL_SOURCE = FLUIDS.register(
            "ethanol", () -> new BaseFlowingFluid.Source(NRRFluids.ETHANOL_PROPERTIES));
    public static final Supplier<FlowingFluid> ETHANOL_FLOWING = FLUIDS.register(
            "flowing_ethanol", () -> new BaseFlowingFluid.Flowing(NRRFluids.ETHANOL_PROPERTIES));
    public static final Supplier<FluidType> ETHANOL_FLUID_TYPE = FLUID_TYPES.register(
            "ethanol", () -> new LiquidFluidType(FluidType.Properties.create()
                    .descriptionId("block.nrreborn.ethanol")
                    .temperature(300)
                    .density(1000)
                    .viscosity(1000)
                    .canSwim(false)
                    .canDrown(true)
                    .canExtinguish(true)
                    .lightLevel(0)
                    .motionScale(0.014D)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY),
                    0xFF7C746E));
    public static final BaseFlowingFluid.Properties ETHANOL_PROPERTIES = new BaseFlowingFluid.Properties(
            ETHANOL_FLUID_TYPE, ETHANOL_SOURCE, ETHANOL_FLOWING)
            .block(NRRBlocks.ETHANOL_BLOCK)
            .bucket(NRRItems.ETHANOL_BUCKET);

    public static final Supplier<FlowingFluid> SULFURIC_ACID_SOURCE = FLUIDS.register(
            "sulfuric_acid", () -> new BaseFlowingFluid.Source(NRRFluids.SULFURIC_ACID_PROPERTIES));
    public static final Supplier<FlowingFluid> SULFURIC_ACID_FLOWING = FLUIDS.register(
            "flowing_sulfuric_acid", () -> new BaseFlowingFluid.Flowing(NRRFluids.SULFURIC_ACID_PROPERTIES));
    public static final Supplier<FluidType> SULFURIC_ACID_FLUID_TYPE = FLUID_TYPES.register(
            "sulfuric_acid", () -> new LiquidFluidType(FluidType.Properties.create()
                    .descriptionId("block.nrreborn.sulfuric_acid")
                    .temperature(300)
                    .density(1000)
                    .viscosity(1000)
                    .canSwim(false)
                    .canDrown(true)
                    .canExtinguish(true)
                    .lightLevel(0)
                    .motionScale(0.014D)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY),
                    0xFF707055));
    public static final BaseFlowingFluid.Properties SULFURIC_ACID_PROPERTIES = new BaseFlowingFluid.Properties(
            SULFURIC_ACID_FLUID_TYPE, SULFURIC_ACID_SOURCE, SULFURIC_ACID_FLOWING)
            .block(NRRBlocks.SULFURIC_ACID_BLOCK)
            .bucket(NRRItems.SULFURIC_ACID_BUCKET);

    public static final Supplier<FlowingFluid> BORIC_ACID_SOURCE = FLUIDS.register(
            "boric_acid", () -> new BaseFlowingFluid.Source(NRRFluids.BORIC_ACID_PROPERTIES));
    public static final Supplier<FlowingFluid> BORIC_ACID_FLOWING = FLUIDS.register(
            "flowing_boric_acid", () -> new BaseFlowingFluid.Flowing(NRRFluids.BORIC_ACID_PROPERTIES));
    public static final Supplier<FluidType> BORIC_ACID_FLUID_TYPE = FLUID_TYPES.register(
            "boric_acid", () -> new LiquidFluidType(FluidType.Properties.create()
                    .descriptionId("block.nrreborn.boric_acid")
                    .temperature(300)
                    .density(1000)
                    .viscosity(1000)
                    .canSwim(false)
                    .canDrown(true)
                    .canExtinguish(true)
                    .lightLevel(0)
                    .motionScale(0.014D)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY),
                    0xFF7E7E6B));
    public static final BaseFlowingFluid.Properties BORIC_ACID_PROPERTIES = new BaseFlowingFluid.Properties(
            BORIC_ACID_FLUID_TYPE, BORIC_ACID_SOURCE, BORIC_ACID_FLOWING)
            .block(NRRBlocks.BORIC_ACID_BLOCK)
            .bucket(NRRItems.BORIC_ACID_BUCKET);

    public static final Supplier<FlowingFluid> BORAX_SOLUTION_SOURCE = FLUIDS.register(
            "borax_solution", () -> new BaseFlowingFluid.Source(NRRFluids.BORAX_SOLUTION_PROPERTIES));
    public static final Supplier<FlowingFluid> BORAX_SOLUTION_FLOWING = FLUIDS.register(
            "flowing_borax_solution", () -> new BaseFlowingFluid.Flowing(NRRFluids.BORAX_SOLUTION_PROPERTIES));
    public static final Supplier<FluidType> BORAX_SOLUTION_FLUID_TYPE = FLUID_TYPES.register(
            "borax_solution", () -> new LiquidFluidType(FluidType.Properties.create()
                    .descriptionId("block.nrreborn.borax_solution")
                    .temperature(300)
                    .density(1000)
                    .viscosity(1000)
                    .canSwim(false)
                    .canDrown(true)
                    .canExtinguish(true)
                    .lightLevel(0)
                    .motionScale(0.014D)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY),
                    0xFF898EC5));
    public static final BaseFlowingFluid.Properties BORAX_SOLUTION_PROPERTIES = new BaseFlowingFluid.Properties(
            BORAX_SOLUTION_FLUID_TYPE, BORAX_SOLUTION_SOURCE, BORAX_SOLUTION_FLOWING)
            .block(NRRBlocks.BORAX_SOLUTION_BLOCK)
            .bucket(NRRItems.BORAX_SOLUTION_BUCKET);

    public static final Supplier<FlowingFluid> CALCIUM_SULFATE_SOLUTION_SOURCE = FLUIDS.register(
            "calcium_sulfate_solution", () -> new BaseFlowingFluid.Source(NRRFluids.CALCIUM_SULFATE_SOLUTION_PROPERTIES));
    public static final Supplier<FlowingFluid> CALCIUM_SULFATE_SOLUTION_FLOWING = FLUIDS.register(
            "flowing_calcium_sulfate_solution", () -> new BaseFlowingFluid.Flowing(NRRFluids.CALCIUM_SULFATE_SOLUTION_PROPERTIES));
    public static final Supplier<FluidType> CALCIUM_SULFATE_SOLUTION_FLUID_TYPE = FLUID_TYPES.register(
            "calcium_sulfate_solution", () -> new LiquidFluidType(FluidType.Properties.create()
                    .descriptionId("block.nrreborn.calcium_sulfate_solution")
                    .temperature(300)
                    .density(1000)
                    .viscosity(1000)
                    .canSwim(false)
                    .canDrown(true)
                    .canExtinguish(true)
                    .lightLevel(0)
                    .motionScale(0.014D)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY),
                    0xFF787CAE));
    public static final BaseFlowingFluid.Properties CALCIUM_SULFATE_SOLUTION_PROPERTIES = new BaseFlowingFluid.Properties(
            CALCIUM_SULFATE_SOLUTION_FLUID_TYPE, CALCIUM_SULFATE_SOLUTION_SOURCE, CALCIUM_SULFATE_SOLUTION_FLOWING)
            .block(NRRBlocks.CALCIUM_SULFATE_SOLUTION_BLOCK)
            .bucket(NRRItems.CALCIUM_SULFATE_SOLUTION_BUCKET);

    public static final Supplier<FlowingFluid> SODIUM_FLUORIDE_SOLUTION_SOURCE = FLUIDS.register(
            "sodium_fluoride_solution", () -> new BaseFlowingFluid.Source(NRRFluids.SODIUM_FLUORIDE_SOLUTION_PROPERTIES));
    public static final Supplier<FlowingFluid> SODIUM_FLUORIDE_SOLUTION_FLOWING = FLUIDS.register(
            "flowing_sodium_fluoride_solution", () -> new BaseFlowingFluid.Flowing(NRRFluids.SODIUM_FLUORIDE_SOLUTION_PROPERTIES));
    public static final Supplier<FluidType> SODIUM_FLUORIDE_SOLUTION_FLUID_TYPE = FLUID_TYPES.register(
            "sodium_fluoride_solution", () -> new LiquidFluidType(FluidType.Properties.create()
                    .descriptionId("block.nrreborn.sodium_fluoride_solution")
                    .temperature(300)
                    .density(1000)
                    .viscosity(1000)
                    .canSwim(false)
                    .canDrown(true)
                    .canExtinguish(true)
                    .lightLevel(0)
                    .motionScale(0.014D)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY),
                    0xFF7C7DAB));
    public static final BaseFlowingFluid.Properties SODIUM_FLUORIDE_SOLUTION_PROPERTIES = new BaseFlowingFluid.Properties(
            SODIUM_FLUORIDE_SOLUTION_FLUID_TYPE, SODIUM_FLUORIDE_SOLUTION_SOURCE, SODIUM_FLUORIDE_SOLUTION_FLOWING)
            .block(NRRBlocks.SODIUM_FLUORIDE_SOLUTION_BLOCK)
            .bucket(NRRItems.SODIUM_FLUORIDE_SOLUTION_BUCKET);

    public static final Supplier<FlowingFluid> POTASSIUM_FLUORIDE_SOLUTION_SOURCE = FLUIDS.register(
            "potassium_fluoride_solution", () -> new BaseFlowingFluid.Source(NRRFluids.POTASSIUM_FLUORIDE_SOLUTION_PROPERTIES));
    public static final Supplier<FlowingFluid> POTASSIUM_FLUORIDE_SOLUTION_FLOWING = FLUIDS.register(
            "flowing_potassium_fluoride_solution", () -> new BaseFlowingFluid.Flowing(NRRFluids.POTASSIUM_FLUORIDE_SOLUTION_PROPERTIES));
    public static final Supplier<FluidType> POTASSIUM_FLUORIDE_SOLUTION_FLUID_TYPE = FLUID_TYPES.register(
            "potassium_fluoride_solution", () -> new LiquidFluidType(FluidType.Properties.create()
                    .descriptionId("block.nrreborn.potassium_fluoride_solution")
                    .temperature(300)
                    .density(1000)
                    .viscosity(1000)
                    .canSwim(false)
                    .canDrown(true)
                    .canExtinguish(true)
                    .lightLevel(0)
                    .motionScale(0.014D)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY),
                    0xFF7E85A9));
    public static final BaseFlowingFluid.Properties POTASSIUM_FLUORIDE_SOLUTION_PROPERTIES = new BaseFlowingFluid.Properties(
            POTASSIUM_FLUORIDE_SOLUTION_FLUID_TYPE, POTASSIUM_FLUORIDE_SOLUTION_SOURCE, POTASSIUM_FLUORIDE_SOLUTION_FLOWING)
            .block(NRRBlocks.POTASSIUM_FLUORIDE_SOLUTION_BLOCK)
            .bucket(NRRItems.POTASSIUM_FLUORIDE_SOLUTION_BUCKET);

    public static final Supplier<FlowingFluid> SODIUM_HYDROXIDE_SOLUTION_SOURCE = FLUIDS.register(
            "sodium_hydroxide_solution", () -> new BaseFlowingFluid.Source(NRRFluids.SODIUM_HYDROXIDE_SOLUTION_PROPERTIES));
    public static final Supplier<FlowingFluid> SODIUM_HYDROXIDE_SOLUTION_FLOWING = FLUIDS.register(
            "flowing_sodium_hydroxide_solution", () -> new BaseFlowingFluid.Flowing(NRRFluids.SODIUM_HYDROXIDE_SOLUTION_PROPERTIES));
    public static final Supplier<FluidType> SODIUM_HYDROXIDE_SOLUTION_FLUID_TYPE = FLUID_TYPES.register(
            "sodium_hydroxide_solution", () -> new LiquidFluidType(FluidType.Properties.create()
                    .descriptionId("block.nrreborn.sodium_hydroxide_solution")
                    .temperature(300)
                    .density(1000)
                    .viscosity(1000)
                    .canSwim(false)
                    .canDrown(true)
                    .canExtinguish(true)
                    .lightLevel(0)
                    .motionScale(0.014D)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY),
                    0xFF7B7EB5));
    public static final BaseFlowingFluid.Properties SODIUM_HYDROXIDE_SOLUTION_PROPERTIES = new BaseFlowingFluid.Properties(
            SODIUM_HYDROXIDE_SOLUTION_FLUID_TYPE, SODIUM_HYDROXIDE_SOLUTION_SOURCE, SODIUM_HYDROXIDE_SOLUTION_FLOWING)
            .block(NRRBlocks.SODIUM_HYDROXIDE_SOLUTION_BLOCK)
            .bucket(NRRItems.SODIUM_HYDROXIDE_SOLUTION_BUCKET);

    public static final Supplier<FlowingFluid> POTASSIUM_HYDROXIDE_SOLUTION_SOURCE = FLUIDS.register(
            "potassium_hydroxide_solution", () -> new BaseFlowingFluid.Source(NRRFluids.POTASSIUM_HYDROXIDE_SOLUTION_PROPERTIES));
    public static final Supplier<FlowingFluid> POTASSIUM_HYDROXIDE_SOLUTION_FLOWING = FLUIDS.register(
            "flowing_potassium_hydroxide_solution", () -> new BaseFlowingFluid.Flowing(NRRFluids.POTASSIUM_HYDROXIDE_SOLUTION_PROPERTIES));
    public static final Supplier<FluidType> POTASSIUM_HYDROXIDE_SOLUTION_FLUID_TYPE = FLUID_TYPES.register(
            "potassium_hydroxide_solution", () -> new LiquidFluidType(FluidType.Properties.create()
                    .descriptionId("block.nrreborn.potassium_hydroxide_solution")
                    .temperature(300)
                    .density(1000)
                    .viscosity(1000)
                    .canSwim(false)
                    .canDrown(true)
                    .canExtinguish(true)
                    .lightLevel(0)
                    .motionScale(0.014D)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY),
                    0xFF7882B3));
    public static final BaseFlowingFluid.Properties POTASSIUM_HYDROXIDE_SOLUTION_PROPERTIES = new BaseFlowingFluid.Properties(
            POTASSIUM_HYDROXIDE_SOLUTION_FLUID_TYPE, POTASSIUM_HYDROXIDE_SOLUTION_SOURCE, POTASSIUM_HYDROXIDE_SOLUTION_FLOWING)
            .block(NRRBlocks.POTASSIUM_HYDROXIDE_SOLUTION_BLOCK)
            .bucket(NRRItems.POTASSIUM_HYDROXIDE_SOLUTION_BUCKET);

    public static final Supplier<FlowingFluid> FLUORITE_WATER_SOURCE = FLUIDS.register(
            "fluorite_water", () -> new BaseFlowingFluid.Source(NRRFluids.FLUORITE_WATER_PROPERTIES));
    public static final Supplier<FlowingFluid> FLUORITE_WATER_FLOWING = FLUIDS.register(
            "flowing_fluorite_water", () -> new BaseFlowingFluid.Flowing(NRRFluids.FLUORITE_WATER_PROPERTIES));
    public static final Supplier<FluidType> FLUORITE_WATER_FLUID_TYPE = FLUID_TYPES.register(
            "fluorite_water", () -> new LiquidFluidType(FluidType.Properties.create()
                    .descriptionId("block.nrreborn.fluorite_water")
                    .temperature(300)
                    .density(1000)
                    .viscosity(1000)
                    .canSwim(false)
                    .canDrown(true)
                    .canExtinguish(true)
                    .lightLevel(0)
                    .motionScale(0.014D)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY),
                    0xFF6A7DA9));
    public static final BaseFlowingFluid.Properties FLUORITE_WATER_PROPERTIES = new BaseFlowingFluid.Properties(
            FLUORITE_WATER_FLUID_TYPE, FLUORITE_WATER_SOURCE, FLUORITE_WATER_FLOWING)
            .block(NRRBlocks.FLUORITE_WATER_BLOCK)
            .bucket(NRRItems.FLUORITE_WATER_BUCKET);

    public static final Supplier<FlowingFluid> BORON_NITRIDE_SOLUTION_SOURCE = FLUIDS.register(
            "boron_nitride_solution", () -> new BaseFlowingFluid.Source(NRRFluids.BORON_NITRIDE_SOLUTION_PROPERTIES));
    public static final Supplier<FlowingFluid> BORON_NITRIDE_SOLUTION_FLOWING = FLUIDS.register(
            "flowing_boron_nitride_solution", () -> new BaseFlowingFluid.Flowing(NRRFluids.BORON_NITRIDE_SOLUTION_PROPERTIES));
    public static final Supplier<FluidType> BORON_NITRIDE_SOLUTION_FLUID_TYPE = FLUID_TYPES.register(
            "boron_nitride_solution", () -> new LiquidFluidType(FluidType.Properties.create()
                    .descriptionId("block.nrreborn.boron_nitride_solution")
                    .temperature(300)
                    .density(1000)
                    .viscosity(1000)
                    .canSwim(false)
                    .canDrown(true)
                    .canExtinguish(true)
                    .lightLevel(0)
                    .motionScale(0.014D)
                    .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY),
                    0xFF627299));
    public static final BaseFlowingFluid.Properties BORON_NITRIDE_SOLUTION_PROPERTIES = new BaseFlowingFluid.Properties(
            BORON_NITRIDE_SOLUTION_FLUID_TYPE, BORON_NITRIDE_SOLUTION_SOURCE, BORON_NITRIDE_SOLUTION_FLOWING)
            .block(NRRBlocks.BORON_NITRIDE_SOLUTION_BLOCK)
            .bucket(NRRItems.BORON_NITRIDE_SOLUTION_BUCKET);

    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
        FLUID_TYPES.register(eventBus);
    }

    public static void setRenderLayer() {
        ItemBlockRenderTypes.setRenderLayer(NITROGEN_SOURCE.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(NITROGEN_FLOWING.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(OXYGEN_SOURCE.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(OXYGEN_FLOWING.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(FLUORINE_SOURCE.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(FLUORINE_FLOWING.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(HYDROGEN_SOURCE.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(HYDROGEN_FLOWING.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(DEUTERIUM_SOURCE.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(DEUTERIUM_FLOWING.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(TRITIUM_SOURCE.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(TRITIUM_FLOWING.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(HELIUM_SOURCE.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(HELIUM_FLOWING.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(HELIUM_3_SOURCE.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(HELIUM_3_FLOWING.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CARBON_DIOXIDE_SOURCE.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CARBON_DIOXIDE_FLOWING.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CARBON_MONOXIDE_SOURCE.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CARBON_MONOXIDE_FLOWING.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(AMMONIA_SOURCE.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(AMMONIA_FLOWING.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(SULFUR_DIOXIDE_SOURCE.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(SULFUR_DIOXIDE_FLOWING.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(SULFUR_TRIOXIDE_SOURCE.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(SULFUR_TRIOXIDE_FLOWING.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(ETHYLENE_SOURCE.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(ETHYLENE_FLOWING.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(DIBORANE_SOURCE.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(DIBORANE_FLOWING.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(OXYGEN_DIFLUORIDE_SOURCE.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(OXYGEN_DIFLUORIDE_FLOWING.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(FLUOROMETHANE_SOURCE.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(FLUOROMETHANE_FLOWING.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(LIQUID_NITROGEN_SOURCE.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(LIQUID_NITROGEN_FLOWING.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(LIQUID_HELIUM_SOURCE.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(LIQUID_HELIUM_FLOWING.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(METHANOL_SOURCE.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(METHANOL_FLOWING.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(ETHANOL_SOURCE.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(ETHANOL_FLOWING.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(SULFURIC_ACID_SOURCE.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(SULFURIC_ACID_FLOWING.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(BORIC_ACID_SOURCE.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(BORIC_ACID_FLOWING.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(BORAX_SOLUTION_SOURCE.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(BORAX_SOLUTION_FLOWING.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CALCIUM_SULFATE_SOLUTION_SOURCE.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CALCIUM_SULFATE_SOLUTION_FLOWING.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(SODIUM_FLUORIDE_SOLUTION_SOURCE.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(SODIUM_FLUORIDE_SOLUTION_FLOWING.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(POTASSIUM_FLUORIDE_SOLUTION_SOURCE.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(POTASSIUM_FLUORIDE_SOLUTION_FLOWING.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(SODIUM_HYDROXIDE_SOLUTION_SOURCE.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(SODIUM_HYDROXIDE_SOLUTION_FLOWING.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(POTASSIUM_HYDROXIDE_SOLUTION_SOURCE.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(POTASSIUM_HYDROXIDE_SOLUTION_FLOWING.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(FLUORITE_WATER_SOURCE.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(FLUORITE_WATER_FLOWING.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(BORON_NITRIDE_SOLUTION_SOURCE.get(), TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(BORON_NITRIDE_SOLUTION_FLOWING.get(), TRANSLUCENT);
    }
}
