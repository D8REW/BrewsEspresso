package brew.modid.datagen;

import brew.modid.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;

import java.util.concurrent.CompletableFuture;

import static brew.modid.block.ModBlocks.*;
import static net.minecraft.tags.TagEntry.tag;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        valueLookupBuilder(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.PURPLE_HEART_LOG)
                .add(PURPLE_HEART_WOOD)
                .add(STRIPPED_PURPLE_HEART_LOG)
                .add(STRIPPED_PURPLE_HEART_WOOD)
                .add(PURPLE_HEART_PLANKS)
                .add(PURPLE_HEART_STAIRS)
                .add(PURPLE_HEART_SLAB)
                .add(PURPLE_HEART_FENCE)
                .add(PURPLE_HEART_FENCE_GATE)
                .add(PURPLE_HEART_DOOR)
                .add(PURPLE_HEART_TRAPDOOR)
                .add(PURPLE_HEART_BUTTON)
                .add(PURPLE_HEART_PRESSURE_PLATE);

        valueLookupBuilder(BlockTags.LOGS_THAT_BURN)
                .add(PURPLE_HEART_LOG)
                .add(PURPLE_HEART_WOOD)
                .add(STRIPPED_PURPLE_HEART_LOG)
                .add(STRIPPED_PURPLE_HEART_WOOD);
    }
}


