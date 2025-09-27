package com.fnwd.nrreborn.multiblock.fission_reactor;

public record FissionReactorData(int xLength, int yLength, int zLength,
                                 int reactorCellCount, int netCoolRate,
                                 int basicFluidCoolerCount, int advancedFluidCoolerCount) {
    public int getVolume() {
        return xLength * yLength * zLength;
    }
}
