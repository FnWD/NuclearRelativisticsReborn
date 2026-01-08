package com.fnwd.nrreborn.util.pack;

import com.fnwd.nrreborn.NuclearRelativisticsReborn;
import com.google.gson.JsonElement;
import net.minecraft.SharedConstants;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackLocationInfo;
import net.minecraft.server.packs.PackResources;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.metadata.MetadataSectionSerializer;
import net.minecraft.server.packs.metadata.pack.PackMetadataSection;
import net.minecraft.server.packs.repository.PackSource;
import net.minecraft.server.packs.resources.IoSupplier;
import org.jetbrains.annotations.Nullable;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.*;

import static com.fnwd.nrreborn.NuclearRelativisticsReborn.GSON;

public class NRRPackResources implements PackResources {
    private final Map<String, IoSupplier<InputStream>> fileMap = new HashMap<>();
    private final String id;
    private final PackType type;
    private final PackMetadataSection metadata;
    private final PackLocationInfo locationInfo;

    public NRRPackResources(String id, PackType type) {
        this.id = id;
        this.type = type;
        metadata = new PackMetadataSection(Component.empty(),
                SharedConstants.getCurrentVersion().getPackVersion(type));
        locationInfo = new PackLocationInfo(id, Component.literal(id),
                PackSource.BUILT_IN, Optional.empty());
    }

    public NRRPackResources put(ResourceLocation location, IoSupplier<InputStream> supplier) {
        fileMap.put(NuclearRelativisticsReborn.getPath(type, location), supplier);
        return this;
    }

    public NRRPackResources put(ResourceLocation location, String string) {
        return put(location, () -> new ByteArrayInputStream(string.getBytes(StandardCharsets.UTF_8)));
    }

    public NRRPackResources put(ResourceLocation location, JsonElement element) {
        return put(location.withSuffix(".json"), GSON.toJson(element));
    }

    @Nullable
    @Override
    public IoSupplier<InputStream> getRootResource(String... elements) {
        return fileMap.getOrDefault(String.join("/", elements), null);
    }

    @Nullable
    @Override
    public IoSupplier<InputStream> getResource(PackType packType, ResourceLocation location) {
        return fileMap.getOrDefault(NuclearRelativisticsReborn.getPath(packType, location), null);
    }

    @Override
    public void listResources(PackType packType, String namespace, String path, ResourceOutput resourceOutput) {
        if (packType != this.type) return;
        var prefix = "%s/%s/".formatted(packType.getDirectory(), namespace);
        fileMap.forEach((fullPath, supplier) -> {
            if (fullPath.startsWith(prefix) && fullPath.endsWith(".json")) {
                var relativePath = fullPath.substring(prefix.length());
                if (relativePath.startsWith(path)) {
                    var location = ResourceLocation.fromNamespaceAndPath(namespace, relativePath);
                    resourceOutput.accept(location, supplier);
                }
            }
        });
    }

    @Override
    public Set<String> getNamespaces(PackType type) {
        Set<String> namespaces = new HashSet<>();
        var dir = type.getDirectory() + "/";
        for (var path : fileMap.keySet()) {
            if (path.startsWith(dir)) {
                var relative = path.substring(dir.length());
                if (relative.contains("/")) {
                    namespaces.add(relative.substring(0, relative.indexOf("/")));
                }
            }
        }
        return namespaces;
    }

    @Nullable
    @Override
    public <T> T getMetadataSection(MetadataSectionSerializer<T> deserializer) {
        return deserializer.equals(PackMetadataSection.TYPE) ? (T) metadata : null;
    }

    @Override
    public PackLocationInfo location() {
        return locationInfo;
    }

    @Override
    public String packId() {
        return id;
    }

    @Override
    public void close() {
    }
}
