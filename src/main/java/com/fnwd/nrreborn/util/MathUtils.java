package com.fnwd.nrreborn.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

public final class MathUtils {
    private MathUtils() {}

    public static String getGUIEnergyText(int energy, int capacity) {
        return formatEnergy(energy) + " / " + formatEnergy(capacity);
    }

    public static String formatEnergy(int energy) {
        if (energy < 1_000) return energy + " FE";
        else if (energy < 1_000_000) return formatNumber((double) energy / 1_000, 2) + " kFE";
        else if (energy < 1_000_000_000) return formatNumber((double) energy / 1_000_000, 2) + " MFE";
        else return formatNumber((double) energy / 1_000_000_000, 2) + " GFE";
    }

    public static String formatNumber(double value, int scale) {
        return BigDecimal.valueOf(value)
                .setScale(scale, RoundingMode.HALF_UP)
                .stripTrailingZeros()
                .toPlainString();
    }

    public static String formatNumber(BigDecimal value, int scale) {
        return value
                .setScale(scale, RoundingMode.HALF_UP)
                .stripTrailingZeros()
                .toPlainString();
    }

    public static String formatFractal(int numerator, int denominator) {
        if (numerator == 0) return "0";
        if (denominator == 1) return String.valueOf(numerator);
        else return numerator + "/" + denominator;
    }

    public static String formatParticleMass(BigDecimal mass) {
        if (mass.compareTo(BigDecimal.valueOf(0)) == 0) return "0 eV/c^2";
        else if (mass.compareTo(BigDecimal.valueOf(1)) < 0) return "<1 eV/c^2";
        else if (mass.compareTo(BigDecimal.valueOf(1_000)) < 0) return formatNumber(mass, 2) + " eV/c^2";
        else if (mass.compareTo(BigDecimal.valueOf(1_000_000)) < 0) return formatNumber(mass.divide(BigDecimal.valueOf(1_000), 3, RoundingMode.HALF_UP), 2) + " keV/c^2";
        else if (mass.compareTo(BigDecimal.valueOf(1_000_000_000)) < 0) return formatNumber(mass.divide(BigDecimal.valueOf(1_000_000), 6, RoundingMode.HALF_UP), 2) + " MeV/c^2";
        else if (mass.compareTo(BigDecimal.valueOf(1_000_000_000_000L)) < 0) return formatNumber(mass.divide(BigDecimal.valueOf(1_000_000_000), 9, RoundingMode.HALF_UP), 2) + " GeV/c^2";
        else return ">=1 TeV/c^2";
    }
}
