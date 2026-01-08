package com.fnwd.nrreborn.util.jei;

import com.fnwd.nrreborn.particle.ParticleStack;
import mezz.jei.api.ingredients.IIngredientType;

public class ParticleStackType implements IIngredientType<ParticleStack> {
    public static final ParticleStackType PARTICLE_STACK_TYPE = new ParticleStackType();

    private ParticleStackType() {}

    @Override
    public Class<? extends ParticleStack> getIngredientClass() {
        return ParticleStack.class;
    }
}
