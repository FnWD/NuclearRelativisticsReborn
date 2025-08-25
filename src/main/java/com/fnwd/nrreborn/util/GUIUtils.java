package com.fnwd.nrreborn.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

public final class GUIUtils {
    private GUIUtils() {}

    public static String getGUIEnergyText(int energy, int capacity) {
        return formatEnergy(energy) + " / " + formatEnergy(capacity);
    }

    public static String formatEnergy(int energy) {
        if (energy < 1_000) return energy + " FE";
        else if (energy < 1_000_000) return BigDecimal.valueOf((double) energy / 1_000)
                .setScale(2, RoundingMode.HALF_UP)
                .stripTrailingZeros()
                .toPlainString() + " kFE";
        else if (energy < 1_000_000_000) return BigDecimal.valueOf((double) energy / 1_000_000)
                .setScale(2, RoundingMode.HALF_UP)
                .stripTrailingZeros()
                .toPlainString() + " MFE";
        else return BigDecimal.valueOf((double) energy / 1_000_000_000)
                .setScale(2, RoundingMode.HALF_UP)
                .stripTrailingZeros()
                .toPlainString() + " GFE";
    }
}
