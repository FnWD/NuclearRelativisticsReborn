package com.fnwd.nrreborn.util.pack;

import net.minecraft.network.chat.Component;
import net.minecraft.server.packs.PackLocationInfo;
import net.minecraft.server.packs.PackResources;
import net.minecraft.server.packs.PackSelectionConfig;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import net.minecraft.server.packs.repository.RepositorySource;

import java.util.Optional;
import java.util.function.Consumer;

public record NRRRepositorySource(String id, PackType type, Pack.Position position, PackResources resources) implements RepositorySource {
    @Override
    public void loadPacks(Consumer<Pack> onLoad) {
        var locationInfo = new PackLocationInfo(id, Component.literal(id),
                PackSource.BUILT_IN, Optional.empty());
        var selectionConfig = new PackSelectionConfig(true, position, true);
        var supplier = new Pack.ResourcesSupplier() {
            @Override
            public PackResources openPrimary(PackLocationInfo location) {
                return resources;
            }

            @Override
            public PackResources openFull(PackLocationInfo location, Pack.Metadata metadata) {
                return resources;
            }
        };
        onLoad.accept(Pack.readMetaAndCreate(locationInfo, supplier, type, selectionConfig));
    }
}
