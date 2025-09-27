package com.fnwd.nrreborn.fluid.fluid_types;

import com.fnwd.nrreborn.NuclearRelativisticsReborn;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.material.FluidState;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.neoforge.fluids.FluidStack;
import net.neoforged.neoforge.fluids.FluidType;
import org.jetbrains.annotations.Nullable;

import java.util.function.Consumer;

public class GasFluidType extends FluidType implements IClientFluidTypeExtensions {
    private final ResourceLocation UNDERWATER = ResourceLocation.fromNamespaceAndPath("minecraft", "textures/misc/underwater.png");
    private final ResourceLocation STILL = ResourceLocation.fromNamespaceAndPath(NuclearRelativisticsReborn.MODID, "block/gas_still");
    private final ResourceLocation FLOWING = ResourceLocation.fromNamespaceAndPath(NuclearRelativisticsReborn.MODID, "block/gas_flowing");
    private final ResourceLocation OVERLAY = ResourceLocation.fromNamespaceAndPath(NuclearRelativisticsReborn.MODID, "block/gas_overlay");
    protected int tintColor;

    public GasFluidType(Properties properties, int tintColor) {
        super(properties);
        this.tintColor = tintColor;
    }

    @Override
    public ResourceLocation getStillTexture() {
        return STILL;
    }

    @Override
    public ResourceLocation getFlowingTexture() {
        return FLOWING;
    }

    @Override
    public @Nullable ResourceLocation getOverlayTexture() {
        return OVERLAY;
    }

    @Override
    public @Nullable ResourceLocation getRenderOverlayTexture(Minecraft mc) {
        return UNDERWATER;
    }

    @Override
    public int getTintColor() {
        return tintColor;
    }

    @Override
    public int getTintColor(FluidStack stack) {
        return tintColor;
    }

    @Override
    public int getTintColor(FluidState state, BlockAndTintGetter getter, BlockPos pos) {
        return tintColor;
    }

    @Override
    public void initializeClient(Consumer<IClientFluidTypeExtensions> consumer) {
        consumer.accept(new IClientFluidTypeExtensions() {
            @Override
            public int getTintColor() {
                return tintColor;
            }

            @Override
            public ResourceLocation getStillTexture() {
                return STILL;
            }

            @Override
            public ResourceLocation getFlowingTexture() {
                return FLOWING;
            }

            @Override
            public @Nullable ResourceLocation getOverlayTexture() {
                return OVERLAY;
            }
        });
    }
}
