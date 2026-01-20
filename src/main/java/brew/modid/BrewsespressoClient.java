package brew.modid;

import brew.modid.particle.livyatan.LivyatanCritParticle;
import brew.modid.particle.livyatan.LivyatanSweepParticle;
import brew.modid.particle.ModParticles;
import brew.modid.payload.EmitterParticlePayload;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;

public class BrewsespressoClient implements ClientModInitializer {
        @Override
        public void onInitializeClient() {
                ParticleFactoryRegistry.getInstance().register(ModParticles.LIVYATAN_CRIT, LivyatanCritParticle.Provider::new);
                ParticleFactoryRegistry.getInstance().register(ModParticles.LIVYATAN_SWEEP, LivyatanSweepParticle.Provider::new);
                ClientPlayNetworking.registerGlobalReceiver(EmitterParticlePayload.TYPE, new EmitterParticlePayload.Receiver());
        }
}
