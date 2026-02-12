package brew.modid;

import brew.modid.block.ModBlocks;
import brew.modid.particle.behemoth.BehemothCritParticle;
import brew.modid.particle.behemoth.BehemothGashParticle;
import brew.modid.particle.behemoth.BehemothSweepParticle;
import brew.modid.particle.livyatan.LivyatanCritParticle;
import brew.modid.particle.livyatan.LivyatanSweepParticle;
import brew.modid.particle.ModParticles;
import brew.modid.payload.EmitterParticlePayload;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;

public class BrewsespressoClient implements ClientModInitializer {
        @Override
        public void onInitializeClient() {
                ParticleFactoryRegistry.getInstance().register(ModParticles.LIVYATAN_CRIT, LivyatanCritParticle.Provider::new);
                ParticleFactoryRegistry.getInstance().register(ModParticles.LIVYATAN_SWEEP, LivyatanSweepParticle.Provider::new);
                ParticleFactoryRegistry.getInstance().register(ModParticles.LIVYATAN_GASH, LivyatanSweepParticle.Provider::new);

                ParticleFactoryRegistry.getInstance().register(ModParticles.BEHEMOTH_CRIT, BehemothCritParticle.Provider::new);
                ParticleFactoryRegistry.getInstance().register(ModParticles.BEHEMOTH_SWEEP, BehemothSweepParticle.Provider::new);
                ParticleFactoryRegistry.getInstance().register(ModParticles.BEHEMOTH_GASH, BehemothGashParticle.Provider::new);

                ClientPlayNetworking.registerGlobalReceiver(EmitterParticlePayload.TYPE, new EmitterParticlePayload.Receiver());

                BlockRenderLayerMap.putBlock(ModBlocks.FORGET_ME_NOT, ChunkSectionLayer.CUTOUT);
                BlockRenderLayerMap.putBlock(ModBlocks.BELLADONA, ChunkSectionLayer.CUTOUT);
        }
}
