package com.fnwd.nrreborn.util;

import net.neoforged.neoforge.energy.EnergyStorage;

public abstract class NRREnergyStorage extends EnergyStorage {
    public NRREnergyStorage(int capacity, int maxReceive, int maxExtract) {
        super(capacity, maxReceive, maxExtract);
    }

    @Override
    public int receiveEnergy(int toReceive, boolean simulate) {
        int receivedEnergy = super.receiveEnergy(toReceive, simulate);
        if (receivedEnergy != 0) {
            onEnergyChanged();
        }
        return receivedEnergy;
    }

    @Override
    public int extractEnergy(int toExtract, boolean simulate) {
        int extractedEnergy = super.extractEnergy(toExtract, simulate);
        if (extractedEnergy != 0) {
            onEnergyChanged();
        }
        return extractedEnergy;
    }

    public int setEnergy(int toSet) {
        this.energy = toSet;
        return toSet;
    }

    public abstract void onEnergyChanged();
}
