package com.fnwd.nrreborn.particle;

import com.fnwd.nrreborn.NuclearRelativisticsReborn;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;

import java.math.BigDecimal;

public class Particle {
    private final String name;
    private final BigDecimal mass;
    private final int chargeNumerator;
    private final int chargeDenominator;
    private final int spinNumerator;
    private final int spinDenominator;
    private final boolean hasStrongInteraction;
    private final boolean hasWeakInteraction;
    @Nullable
    private final Particle antiParticle;
    private final ResourceLocation texture;

    public Particle(String name, Properties properties) {
        this.name = name;
        texture = ResourceLocation.fromNamespaceAndPath(
                NuclearRelativisticsReborn.MODID, "textures/particle/" + this.name + ".png");
        mass = properties.getMass();
        chargeNumerator = properties.getChargeNumerator();
        chargeDenominator = properties.getChargeDenominator();
        spinNumerator = properties.getSpinNumerator();
        spinDenominator = properties.getSpinDenominator();
        hasStrongInteraction = properties.hasStrongInteraction();
        hasWeakInteraction = properties.hasWeakInteraction();
        antiParticle = properties.getAntiParticle();
    }

    @Override
    public String toString() {
        return "particle." + NuclearRelativisticsReborn.MODID + "." + name;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getMass() {
        return mass;
    }

    public int getChargeNumerator() {
        return chargeNumerator;
    }

    public int getChargeDenominator() {
        return chargeDenominator;
    }

    public int getSpinNumerator() {
        return spinNumerator;
    }

    public int getSpinDenominator() {
        return spinDenominator;
    }

    public boolean hasStrongInteraction() {
        return hasStrongInteraction;
    }

    public boolean hasWeakInteraction() {
        return hasWeakInteraction;
    }

    public Particle getAntiParticle() {
        return antiParticle;
    }

    public ResourceLocation getTexture() {
        return texture;
    }

    public static class Properties {
        private BigDecimal mass;
        private int chargeNumerator;
        private int chargeDenominator;
        private int spinNumerator;
        private int spinDenominator;
        private boolean hasStrongInteraction;
        private boolean hasWeakInteraction;
        @Nullable
        private Particle antiParticle;

        public Properties mass(BigDecimal mass) {
            this.mass = mass;
            return this;
        }

        public Properties charge(int numerator, int denominator) {
            chargeNumerator = numerator;
            chargeDenominator = denominator;
            return this;
        }

        public Properties spin(int numerator, int denominator) {
            spinNumerator = numerator;
            spinDenominator = denominator;
            return this;
        }

        public Properties strongInteraction(boolean interaction) {
            hasStrongInteraction = interaction;
            return this;
        }

        public Properties weakInteraction(boolean interaction) {
            hasWeakInteraction = interaction;
            return this;
        }

        public Properties antiParticle(Particle antiParticle) {
            this.antiParticle = antiParticle;
            return this;
        }

        public BigDecimal getMass() {
            return mass;
        }

        public int getChargeNumerator() {
            return chargeNumerator;
        }

        public int getChargeDenominator() {
            return chargeDenominator;
        }

        public int getSpinNumerator() {
            return spinNumerator;
        }

        public int getSpinDenominator() {
            return spinDenominator;
        }

        public boolean hasStrongInteraction() {
            return hasStrongInteraction;
        }

        public boolean hasWeakInteraction() {
            return hasWeakInteraction;
        }

        public Particle getAntiParticle() {
            return antiParticle;
        }
    }
}
