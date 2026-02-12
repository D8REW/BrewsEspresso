package brew.modid.datagen;

import brew.modid.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalBlockTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {

    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        //Axe Minable
        valueLookupBuilder(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.PURPLE_HEART_LOG)
                .add(ModBlocks.PURPLE_HEART_WOOD)
                .add(ModBlocks.STRIPPED_PURPLE_HEART_LOG)
                .add(ModBlocks.STRIPPED_PURPLE_HEART_WOOD)
                .add(ModBlocks.PURPLE_HEART_PLANKS)
                .add(ModBlocks.PURPLE_HEART_STAIRS)
                .add(ModBlocks.PURPLE_HEART_SLAB)
                .add(ModBlocks.PURPLE_HEART_FENCE)
                .add(ModBlocks.PURPLE_HEART_FENCE_GATE)
                .add(ModBlocks.PURPLE_HEART_DOOR)
                .add(ModBlocks.PURPLE_HEART_TRAPDOOR)
                .add(ModBlocks.PURPLE_HEART_BUTTON)
                .add(ModBlocks.PURPLE_HEART_PRESSURE_PLATE);

        //Burnable Logs
        valueLookupBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.PURPLE_HEART_LOG)
                .add(ModBlocks.PURPLE_HEART_WOOD)
                .add(ModBlocks.STRIPPED_PURPLE_HEART_LOG)
                .add(ModBlocks.STRIPPED_PURPLE_HEART_WOOD);

        //Block Definition Tag
        valueLookupBuilder(BlockTags.SLABS).add(ModBlocks.PURPLE_HEART_SLAB);
        valueLookupBuilder(BlockTags.STAIRS).add(ModBlocks.PURPLE_HEART_STAIRS);
        valueLookupBuilder(BlockTags.FENCES).add(ModBlocks.PURPLE_HEART_FENCE);
        valueLookupBuilder(BlockTags.BUTTONS).add(ModBlocks.PURPLE_HEART_BUTTON);
        valueLookupBuilder(BlockTags.PRESSURE_PLATES).add(ModBlocks.PURPLE_HEART_PRESSURE_PLATE);
        valueLookupBuilder(BlockTags.DOORS).add(ModBlocks.PURPLE_HEART_DOOR);
        valueLookupBuilder(BlockTags.TRAPDOORS).add(ModBlocks.PURPLE_HEART_TRAPDOOR);

        //Wood Block Definition Tag
        valueLookupBuilder(BlockTags.OVERWORLD_NATURAL_LOGS).add(ModBlocks.PURPLE_HEART_LOG);
        valueLookupBuilder(BlockTags.FENCE_GATES).add(ModBlocks.PURPLE_HEART_FENCE_GATE);
        valueLookupBuilder(BlockTags.PLANKS).add(ModBlocks.PURPLE_HEART_PLANKS);
        valueLookupBuilder(BlockTags.LOGS).add(ModBlocks.STRIPPED_PURPLE_HEART_LOG).add(ModBlocks.STRIPPED_PURPLE_HEART_WOOD).add(ModBlocks.PURPLE_HEART_LOG).add(ModBlocks.PURPLE_HEART_WOOD);
        valueLookupBuilder(BlockTags.WOODEN_SLABS).add(ModBlocks.PURPLE_HEART_SLAB);
        valueLookupBuilder(BlockTags.WOODEN_STAIRS).add(ModBlocks.PURPLE_HEART_STAIRS);
        valueLookupBuilder(BlockTags.WOODEN_FENCES).add(ModBlocks.PURPLE_HEART_FENCE);
        valueLookupBuilder(BlockTags.WOODEN_BUTTONS).add(ModBlocks.PURPLE_HEART_BUTTON);
        valueLookupBuilder(BlockTags.WOODEN_PRESSURE_PLATES).add(ModBlocks.PURPLE_HEART_PRESSURE_PLATE);
        valueLookupBuilder(BlockTags.WOODEN_DOORS).add(ModBlocks.PURPLE_HEART_DOOR);
        valueLookupBuilder(BlockTags.WOODEN_TRAPDOORS).add(ModBlocks.PURPLE_HEART_TRAPDOOR);
        valueLookupBuilder(BlockTags.STANDING_SIGNS);
        valueLookupBuilder(BlockTags.WALL_SIGNS);
        valueLookupBuilder(BlockTags.CEILING_HANGING_SIGNS);
        valueLookupBuilder(BlockTags.WALL_HANGING_SIGNS);
        valueLookupBuilder(BlockTags.WOODEN_SHELVES);


        //Plant Definition
        valueLookupBuilder(BlockTags.FLOWER_POTS);
        valueLookupBuilder(BlockTags.BEE_ATTRACTIVE).add(ModBlocks.FORGET_ME_NOT).add(ModBlocks.BELLADONA);
        valueLookupBuilder(BlockTags.LEAVES);
        valueLookupBuilder(ConventionalBlockTags.SMALL_FLOWERS).add(ModBlocks.FORGET_ME_NOT);
        valueLookupBuilder(ConventionalBlockTags.TALL_FLOWERS).add(ModBlocks.BELLADONA);
    }
}


