package com.fnwd.nrreborn.multiblock.fission_reactor;

import com.fnwd.nrreborn.util.tag.NRRTags;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Level;

public final class FissionReactorConstructionUtils {
    private FissionReactorConstructionUtils() {}

    public static FissionReactorData getFissionReactorData(Level level, BlockPos controllerPos, Direction controllerFacing) {
        BlockPos frontFaceTop = controllerPos, frontFaceBottom = controllerPos, frontFaceLeft = controllerPos, frontFaceRight = controllerPos;
        for (;;) {
            if (level.getBlockState(frontFaceTop.above()).is(NRRTags.Blocks.FISSION_REACTOR_CASINGS)) {
                frontFaceTop = frontFaceTop.above();
            } else break;
        }
        for (;;) {
            if (level.getBlockState(frontFaceBottom.below()).is(NRRTags.Blocks.FISSION_REACTOR_CASINGS)) {
                frontFaceBottom = frontFaceBottom.below();
            } else break;
        }
        for (;;) {
            if (level.getBlockState(frontFaceLeft.relative(controllerFacing.getClockWise())).is(NRRTags.Blocks.FISSION_REACTOR_CASINGS)) {
                frontFaceLeft = frontFaceLeft.relative(controllerFacing.getClockWise());
            } else break;
        }
        for (;;) {
            if (level.getBlockState(frontFaceRight.relative(controllerFacing.getCounterClockWise())).is(NRRTags.Blocks.FISSION_REACTOR_CASINGS)) {
                frontFaceRight = frontFaceRight.relative(controllerFacing.getCounterClockWise());
            } else break;
        }
        BlockPos frontFaceTopLeft = new BlockPos(frontFaceLeft.getX(), frontFaceTop.getY(), frontFaceLeft.getZ());
        BlockPos frontFaceBottomRight = new BlockPos(frontFaceRight.getX(), frontFaceBottom.getY(), frontFaceRight.getZ());
        for (var pos : BlockPos.betweenClosed(frontFaceTopLeft, frontFaceBottomRight)) {
            if (!level.getBlockState(pos).is(NRRTags.Blocks.FISSION_REACTOR_CASINGS)) return null;
        }
        // TODO: Complete the detection logic
        return null;
    }
}
