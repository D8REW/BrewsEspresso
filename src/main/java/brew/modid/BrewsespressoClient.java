package brew.modid;

import brew.modid.particle.emet.EmetCritParticle;
import brew.modid.particle.emet.EmetSweepParticle;
import brew.modid.particle.ModParticles;
import brew.modid.payload.EmitterParticlePayload;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;

public class BrewsespressoClient implements ClientModInitializer {
        @Override
        public void onInitializeClient() {
                ParticleFactoryRegistry.getInstance().register(ModParticles.EMET_CRIT, EmetCritParticle.Provider::new);
                ParticleFactoryRegistry.getInstance().register(ModParticles.EMET_SWEEP, EmetSweepParticle.Provider::new);
                ClientPlayNetworking.registerGlobalReceiver(EmitterParticlePayload.TYPE, new EmitterParticlePayload.Receiver());
        }
}
