package com.fnwd.nrreborn.datagen;

import com.fnwd.nrreborn.NuclearRelativisticsReborn;
import com.fnwd.nrreborn.fluid.NRRFluids;
import com.fnwd.nrreborn.util.tag.CTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.FluidTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class NRRFluidTagProvider extends FluidTagsProvider {
    public NRRFluidTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> provider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, provider, NuclearRelativisticsReborn.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(CTags.Fluids.NITROGEN)
                .add(NRRFluids.NITROGEN_SOURCE.get())
                .add(NRRFluids.NITROGEN_FLOWING.get());
        tag(CTags.Fluids.OXYGEN)
                .add(NRRFluids.OXYGEN_SOURCE.get())
                .add(NRRFluids.OXYGEN_FLOWING.get());
        tag(CTags.Fluids.FLUORINE)
                .add(NRRFluids.FLUORINE_SOURCE.get())
                .add(NRRFluids.FLUORINE_FLOWING.get());
        tag(CTags.Fluids.HYDROGEN)
                .add(NRRFluids.HYDROGEN_SOURCE.get())
                .add(NRRFluids.HYDROGEN_FLOWING.get());
        tag(CTags.Fluids.DEUTERIUM)
                .add(NRRFluids.DEUTERIUM_SOURCE.get())
                .add(NRRFluids.DEUTERIUM_FLOWING.get());
        tag(CTags.Fluids.TRITIUM)
                .add(NRRFluids.TRITIUM_SOURCE.get())
                .add(NRRFluids.TRITIUM_FLOWING.get());
        tag(CTags.Fluids.HELIUM)
                .add(NRRFluids.HELIUM_SOURCE.get())
                .add(NRRFluids.HELIUM_FLOWING.get());
        tag(CTags.Fluids.HELIUM_3)
                .add(NRRFluids.HELIUM_3_SOURCE.get())
                .add(NRRFluids.HELIUM_3_FLOWING.get());
        tag(CTags.Fluids.CARBON_DIOXIDE)
                .add(NRRFluids.CARBON_DIOXIDE_SOURCE.get())
                .add(NRRFluids.CARBON_DIOXIDE_FLOWING.get());
        tag(CTags.Fluids.CARBON_MONOXIDE)
                .add(NRRFluids.CARBON_MONOXIDE_SOURCE.get())
                .add(NRRFluids.CARBON_MONOXIDE_FLOWING.get());
        tag(CTags.Fluids.AMMONIA)
                .add(NRRFluids.AMMONIA_SOURCE.get())
                .add(NRRFluids.AMMONIA_FLOWING.get());
        tag(CTags.Fluids.SULFUR_DIOXIDE)
                .add(NRRFluids.SULFUR_DIOXIDE_SOURCE.get())
                .add(NRRFluids.SULFUR_DIOXIDE_FLOWING.get());
        tag(CTags.Fluids.SULFUR_TRIOXIDE)
                .add(NRRFluids.SULFUR_TRIOXIDE_SOURCE.get())
                .add(NRRFluids.SULFUR_TRIOXIDE_FLOWING.get());
        tag(CTags.Fluids.ETHYLENE)
                .add(NRRFluids.ETHYLENE_SOURCE.get())
                .add(NRRFluids.ETHYLENE_FLOWING.get());
        tag(CTags.Fluids.DIBORANE)
                .add(NRRFluids.DIBORANE_SOURCE.get())
                .add(NRRFluids.DIBORANE_FLOWING.get());
        tag(CTags.Fluids.OXYGEN_DIFLUORIDE)
                .add(NRRFluids.OXYGEN_DIFLUORIDE_SOURCE.get())
                .add(NRRFluids.OXYGEN_DIFLUORIDE_FLOWING.get());
        tag(CTags.Fluids.FLUOROMETHANE)
                .add(NRRFluids.FLUOROMETHANE_SOURCE.get())
                .add(NRRFluids.FLUOROMETHANE_FLOWING.get());
        tag(CTags.Fluids.LIQUID_NITROGEN)
                .add(NRRFluids.LIQUID_NITROGEN_SOURCE.get())
                .add(NRRFluids.LIQUID_NITROGEN_FLOWING.get());
        tag(CTags.Fluids.LIQUID_HELIUM)
                .add(NRRFluids.LIQUID_HELIUM_SOURCE.get())
                .add(NRRFluids.LIQUID_HELIUM_FLOWING.get());
        tag(CTags.Fluids.METHANOL)
                .add(NRRFluids.METHANOL_SOURCE.get())
                .add(NRRFluids.METHANOL_FLOWING.get());
        tag(CTags.Fluids.ETHANOL)
                .add(NRRFluids.ETHANOL_SOURCE.get())
                .add(NRRFluids.ETHANOL_FLOWING.get());
        tag(CTags.Fluids.SULFURIC_ACID)
                .add(NRRFluids.SULFURIC_ACID_SOURCE.get())
                .add(NRRFluids.SULFURIC_ACID_FLOWING.get());
        tag(CTags.Fluids.BORIC_ACID)
                .add(NRRFluids.BORIC_ACID_SOURCE.get())
                .add(NRRFluids.BORIC_ACID_FLOWING.get());
        tag(CTags.Fluids.BORAX_SOLUTION)
                .add(NRRFluids.BORAX_SOLUTION_SOURCE.get())
                .add(NRRFluids.BORAX_SOLUTION_FLOWING.get());
        tag(CTags.Fluids.CALCIUM_SULFATE_SOLUTION)
                .add(NRRFluids.CALCIUM_SULFATE_SOLUTION_SOURCE.get())
                .add(NRRFluids.CALCIUM_SULFATE_SOLUTION_FLOWING.get());
        tag(CTags.Fluids.SODIUM_FLUORIDE_SOLUTION)
                .add(NRRFluids.SODIUM_FLUORIDE_SOLUTION_SOURCE.get())
                .add(NRRFluids.SODIUM_FLUORIDE_SOLUTION_FLOWING.get());
        tag(CTags.Fluids.POTASSIUM_FLUORIDE_SOLUTION)
                .add(NRRFluids.POTASSIUM_FLUORIDE_SOLUTION_SOURCE.get())
                .add(NRRFluids.POTASSIUM_FLUORIDE_SOLUTION_FLOWING.get());
        tag(CTags.Fluids.SODIUM_HYDROXIDE_SOLUTION)
                .add(NRRFluids.SODIUM_HYDROXIDE_SOLUTION_SOURCE.get())
                .add(NRRFluids.SODIUM_HYDROXIDE_SOLUTION_FLOWING.get());
        tag(CTags.Fluids.POTASSIUM_HYDROXIDE_SOLUTION)
                .add(NRRFluids.POTASSIUM_HYDROXIDE_SOLUTION_SOURCE.get())
                .add(NRRFluids.POTASSIUM_HYDROXIDE_SOLUTION_FLOWING.get());
        tag(CTags.Fluids.FLUORITE_WATER)
                .add(NRRFluids.FLUORITE_WATER_SOURCE.get())
                .add(NRRFluids.FLUORITE_WATER_FLOWING.get());
        tag(CTags.Fluids.BORON_NITRIDE_SOLUTION)
                .add(NRRFluids.BORON_NITRIDE_SOLUTION_SOURCE.get())
                .add(NRRFluids.BORON_NITRIDE_SOLUTION_FLOWING.get());
    }
}
