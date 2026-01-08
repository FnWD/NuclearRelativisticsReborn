package com.fnwd.nrreborn.particle;

import com.fnwd.nrreborn.NuclearRelativisticsReborn;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.math.BigDecimal;
import java.util.function.Supplier;

public class NRRParticles {
    public static final ResourceKey<Registry<Particle>> KEY = ResourceKey.createRegistryKey(ResourceLocation.fromNamespaceAndPath(NuclearRelativisticsReborn.MODID, "particle"));
    public static final DeferredRegister<Particle> PARTICLES = DeferredRegister.create(KEY, NuclearRelativisticsReborn.MODID);

    public static final Supplier<Particle> UP_QUARK = PARTICLES.register(
            "up_quark", () -> new Particle("up_quark", new Particle.Properties()
                    .mass(new BigDecimal("2.2E+6"))
                    .charge(2, 3)
                    .spin(1, 2)
                    .strongInteraction(true)
                    .weakInteraction(true)));
    public static final Supplier<Particle> DOWN_QUARK = PARTICLES.register(
            "down_quark", () -> new Particle("down_quark", new Particle.Properties()
                    .mass(new BigDecimal("4.7E+6"))
                    .charge(-1, 3)
                    .spin(1, 2)
                    .strongInteraction(true)
                    .weakInteraction(true)));
    public static final Supplier<Particle> CHARM_QUARK = PARTICLES.register(
            "charm_quark", () -> new Particle("charm_quark", new Particle.Properties()
                    .mass(new BigDecimal("1.28E+9"))
                    .charge(2, 3)
                    .spin(1, 2)
                    .strongInteraction(true)
                    .weakInteraction(true)));
    public static final Supplier<Particle> STRANGE_QUARK = PARTICLES.register(
            "strange_quark", () -> new Particle("strange_quark", new Particle.Properties()
                    .mass(new BigDecimal("95E+6"))
                    .charge(-1, 3)
                    .spin(1, 2)
                    .strongInteraction(true)
                    .weakInteraction(true)));
    public static final Supplier<Particle> TOP_QUARK = PARTICLES.register(
            "top_quark", () -> new Particle("top_quark", new Particle.Properties()
                    .mass(new BigDecimal("173E+9"))
                    .charge(2, 3)
                    .spin(1, 2)
                    .strongInteraction(true)
                    .weakInteraction(true)));
    public static final Supplier<Particle> BOTTOM_QUARK = PARTICLES.register(
            "bottom_quark", () -> new Particle("bottom_quark", new Particle.Properties()
                    .mass(new BigDecimal("4.18E+9"))
                    .charge(-1, 3)
                    .spin(1, 2)
                    .strongInteraction(true)
                    .weakInteraction(true)));

    public static void register(IEventBus eventBus) {
        PARTICLES.register(eventBus);
    }
}
