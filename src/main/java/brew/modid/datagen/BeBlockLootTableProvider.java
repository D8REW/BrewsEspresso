package brew.modid.datagen;

import brew.modid.block.BeBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class BeBlockLootTableProvider extends FabricBlockLootTableProvider {
    public BeBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
    dropSelf(BeBlocks.BELLADONA);
    dropSelf(BeBlocks.FORGET_ME_NOT);
    dropSelf(BeBlocks.CYAN_ROSE);
    dropSelf(BeBlocks.RED_ROSE);
    dropSelf(BeBlocks.EMPOROR_TULIP);
    dropSelf(BeBlocks.COLOSSAL_LILY_OF_THE_VALLEY);

    }
}
