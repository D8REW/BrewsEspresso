package brew.modid.particle;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;

public class ModParticles {

    public static final SimpleParticleType EMET_CRIT = FabricParticleTypes.simple();
    public static final SimpleParticleType EMET_SWEEP = FabricParticleTypes.simple();





    public static void initialize() {
        Registry.register(BuiltInRegistries.PARTICLE_TYPE,
                Identifier.fromNamespaceAndPath("brewsespresso", "emet_crit"), EMET_CRIT);

        Registry.register(BuiltInRegistries.PARTICLE_TYPE,
                Identifier.fromNamespaceAndPath("brewsespresso", "emet_sweep"), EMET_SWEEP);
    }
}