package brew.modid;

import brew.modid.particle.custom.EmetCritParticle;
import brew.modid.particle.custom.EmetSweepParticle;
import brew.modid.particle.custom.ModParticles;
import brew.modid.payload.custom.EmitterParticlePayload;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.world.entity.Entity;


public class BrewsespressoClient implements ClientModInitializer {
        @Override
        public void onInitializeClient() {
                ParticleFactoryRegistry.getInstance().register(ModParticles.EMET_CRIT, EmetCritParticle.Provider::new);
                ParticleFactoryRegistry.getInstance().register(ModParticles.EMET_SWEEP, EmetSweepParticle.Provider::new);
                ClientPlayNetworking.registerGlobalReceiver(EmitterParticlePayload.ID, (payload, context) -> {
                        context.client().execute(() -> {
                                Entity target = context.client().level.getEntity(payload.entityId());
                                if (target != null) {
                                        // Logic to spawn the particle at the entity's position
                                        context.client().level.addParticle(
                                                payload.particle(),
                                                target.getX(), target.getY() + 1.0, target.getZ(),
                                                0, 0, 0
                                        );
                                }
                        });
                });
        }
}