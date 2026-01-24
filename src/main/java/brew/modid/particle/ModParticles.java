package brew.modid.particle;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;

public class ModParticles {

    public static final SimpleParticleType LIVYATAN_CRIT = FabricParticleTypes.simple();
    public static final SimpleParticleType LIVYATAN_SWEEP = FabricParticleTypes.simple();
    public static final SimpleParticleType LIVYATAN_GASH = FabricParticleTypes.simple();

    public static final SimpleParticleType BEHEMOTH_CRIT = FabricParticleTypes.simple();
    public static final SimpleParticleType BEHEMOTH_SWEEP = FabricParticleTypes.simple();
    public static final SimpleParticleType BEHEMOTH_GASH = FabricParticleTypes.simple();




    public static void initialize() {
        Registry.register(BuiltInRegistries.PARTICLE_TYPE,
                Identifier.fromNamespaceAndPath("brewsespresso", "livyatan_crit"), LIVYATAN_CRIT);

        Registry.register(BuiltInRegistries.PARTICLE_TYPE,
                Identifier.fromNamespaceAndPath("brewsespresso", "livyatan_sweep"), LIVYATAN_SWEEP);

        Registry.register(BuiltInRegistries.PARTICLE_TYPE,
                Identifier.fromNamespaceAndPath("brewsespresso", "livyatan_gash"), LIVYATAN_GASH);
    }
}