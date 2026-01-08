package com.fnwd.nrreborn.particle;

import org.jetbrains.annotations.Nullable;

import java.util.Objects;

public class ParticleStack {
    public static final ParticleStack EMPTY = new ParticleStack(null, 0, 0, 0);

    @Nullable
    private Particle particle;
    private long count;
    private long energy;
    private double focus;

    public ParticleStack(Particle particle, long count, long energy, double focus) {
        this.particle = particle;
        this.count = count;
        this.energy = energy;
        this.focus = focus;
    }

    public ParticleStack(Particle particle, long count, long energy) {
        this(particle, count, energy, 0);
    }

    public ParticleStack(Particle particle, long count) {
        this(particle, count, 0, 0);
    }

    public ParticleStack(Particle particle) {
        this(particle, 1, 0, 0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParticleStack that = (ParticleStack) o;
        return count == that.count && energy == that.energy && Double.compare(focus, that.focus) == 0 && Objects.equals(particle, that.particle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(particle, count, energy, focus);
    }

    public Particle getParticle() {
        return particle;
    }

    public long getCount() {
        return count;
    }

    public long getEnergy() {
        return energy;
    }

    public double getFocus() {
        return focus;
    }

    public boolean isEmpty() {
        return this.equals(EMPTY);
    }

    public void setParticle(Particle particle) {
        this.particle = particle;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public void setEnergy(long energy) {
        this.energy = energy;
    }

    public void setFocus(double focus) {
        this.focus = focus;
    }

    public void insertCount(long count) {
        this.count += count;
    }

    public void increaseEnergy(long energy) {
        this.energy += energy;
    }

    public void increaseFocus(double focus) {
        this.focus += focus;
    }

    public void extractCount(long count) {
        if (this.count <= count) {
            particle = null;
            this.count = 0;
            energy = 0;
            focus = 0;
        }
        this.count -= count;
    }

    public void decreaseEnergy(long energy) {
        this.energy -= energy;
    }

    public void decreaseFocus(double focus) {
        this.focus -= focus;
    }
}
