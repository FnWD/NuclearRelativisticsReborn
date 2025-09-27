package com.fnwd.nrreborn.datagen;

import com.fnwd.nrreborn.NuclearRelativisticsReborn;
import com.fnwd.nrreborn.fluid.NRRFluids;
import com.fnwd.nrreborn.util.CTags;
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
    }
}
