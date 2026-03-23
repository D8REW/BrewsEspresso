package brew.modid;

import brew.modid.block.BeBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;

public class BrewsespressoClient implements ClientModInitializer {
        @Override
        public void onInitializeClient() {

                BlockRenderLayerMap.putBlock(BeBlocks.FORGET_ME_NOT, ChunkSectionLayer.CUTOUT);
                BlockRenderLayerMap.putBlock(BeBlocks.BELLADONA, ChunkSectionLayer.CUTOUT);
                BlockRenderLayerMap.putBlock(BeBlocks.RED_ROSE, ChunkSectionLayer.CUTOUT);
                BlockRenderLayerMap.putBlock(BeBlocks.CYAN_ROSE, ChunkSectionLayer.CUTOUT);
                //BlockRenderLayerMap.putBlock(BeBlocks.COLOSSAL_SUNFLOWER, ChunkSectionLayer.CUTOUT);
                //BlockRenderLayerMap.putBlock(BeBlocks.MONARCH_SUNFLOWER, ChunkSectionLayer.CUTOUT);
                BlockRenderLayerMap.putBlock(BeBlocks.EMPOROR_TULIP, ChunkSectionLayer.CUTOUT);
                BlockRenderLayerMap.putBlock(BeBlocks.COLOSSAL_LILY_OF_THE_VALLEY, ChunkSectionLayer.CUTOUT);
                BlockRenderLayerMap.putBlock(BeBlocks.MAUVY_LEAVES, ChunkSectionLayer.CUTOUT);
                //BlockRenderLayerMap.putBlock(BeBlocks.MAUVY_SAPLING, ChunkSectionLayer.CUTOUT);
        }
}
