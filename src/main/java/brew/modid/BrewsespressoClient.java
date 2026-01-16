package brew.modid;

import brew.modid.particle.custom.EmetCritParticle;
import brew.modid.particle.custom.EmetSweepParticle;
import brew.modid.particle.custom.ModParticles;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;


public class BrewsespressoClient implements ClientModInitializer {
        @Override
        public void onInitializeClient() {
                ParticleFactoryRegistry.getInstance().register(ModParticles.EMET_CRIT, EmetCritParticle.Provider::new);
                ParticleFactoryRegistry.getInstance().register(ModParticles.EMET_SWEEP, EmetSweepParticle.Provider::new);

        }
}

