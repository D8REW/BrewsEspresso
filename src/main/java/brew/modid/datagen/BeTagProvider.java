package brew.modid.datagen;

import brew.modid.block.BeBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalBlockTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;


import java.util.concurrent.CompletableFuture;

public class BeTagProvider {

    public static class BeItemTagProvider extends FabricTagProvider.ItemTagProvider {
        public BeItemTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
            super(output, registriesFuture);
        }

        @Override
        protected void addTags(HolderLookup.Provider wrapperLookup) {
            valueLookupBuilder(ItemTags.SWORDS);

            valueLookupBuilder(ItemTags.AXES);

        }
    }

    public static class BeBlockTagProvider extends FabricTagProvider.BlockTagProvider {
        public BeBlockTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
            super(output, registriesFuture);
        }

        @Override
        protected void addTags(HolderLookup.Provider provider) {
            //Axe Minable
              valueLookupBuilder(BlockTags.MINEABLE_WITH_AXE)
                      .add(BeBlocks.MAUVY_LOG)
                      .add(BeBlocks.MAUVY_WOOD)
                      .add(BeBlocks.STRIPPED_MAUVY_LOG)
                      .add(BeBlocks.STRIPPED_MAUVY_WOOD)
                      .add(BeBlocks.MAUVY_PLANK)
                      .add(BeBlocks.MAUVY_STAIR)
                      .add(BeBlocks.MAUVY_SLAB)
                      .add(BeBlocks.MAUVY_SHELF)
                      .add(BeBlocks.MAUVY_FENCE)
                      .add(BeBlocks.MAUVY_FENCE_GATE)
                      .add(BeBlocks.MAUVY_DOOR)
                      .add(BeBlocks.MAUVY_TRAPDOOR)
                      .add(BeBlocks.MAUVY_PRESSURE_PLATE)
                      .add(BeBlocks.MAUVY_BUTTON);

            //Burnable Logs
              valueLookupBuilder(BlockTags.LOGS_THAT_BURN)
                      .add(BeBlocks.MAUVY_LOG)
                      .add(BeBlocks.MAUVY_WOOD)
                      .add(BeBlocks.STRIPPED_MAUVY_LOG)
                      .add(BeBlocks.STRIPPED_MAUVY_WOOD);

            //Block Definition Tag
              valueLookupBuilder(BlockTags.SLABS)
                      .add(BeBlocks.MAUVY_SLAB);
              valueLookupBuilder(BlockTags.STAIRS)
                      .add(BeBlocks.MAUVY_STAIR);
              valueLookupBuilder(BlockTags.FENCES)
                      .add(BeBlocks.MAUVY_FENCE);
              valueLookupBuilder(BlockTags.BUTTONS)
                      .add(BeBlocks.MAUVY_BUTTON);
              valueLookupBuilder(BlockTags.PRESSURE_PLATES)
                      .add(BeBlocks.MAUVY_PRESSURE_PLATE);
              valueLookupBuilder(BlockTags.DOORS)
                      .add(BeBlocks.MAUVY_DOOR);
              valueLookupBuilder(BlockTags.TRAPDOORS)
                      .add(BeBlocks.MAUVY_TRAPDOOR);

            //Wood Block Definition Tag
              valueLookupBuilder(BlockTags.OVERWORLD_NATURAL_LOGS)
                      .add(BeBlocks.MAUVY_LOG);
              valueLookupBuilder(BlockTags.LOGS)
                      .add(BeBlocks.MAUVY_LOG)
                      .add(BeBlocks.MAUVY_WOOD)
                      .add(BeBlocks.STRIPPED_MAUVY_LOG)
                      .add(BeBlocks.STRIPPED_MAUVY_WOOD);
              valueLookupBuilder(BlockTags.FENCE_GATES)
                      .add(BeBlocks.MAUVY_FENCE_GATE);
              valueLookupBuilder(BlockTags.PLANKS)
                      .add(BeBlocks.MAUVY_PLANK);
              valueLookupBuilder(BlockTags.WOODEN_SLABS)
                      .add(BeBlocks.MAUVY_SLAB);
              valueLookupBuilder(BlockTags.WOODEN_STAIRS)
                      .add(BeBlocks.MAUVY_STAIR);
              valueLookupBuilder(BlockTags.WOODEN_FENCES)
                      .add(BeBlocks.MAUVY_FENCE);
              valueLookupBuilder(BlockTags.WOODEN_BUTTONS)
                      .add(BeBlocks.MAUVY_BUTTON);
              valueLookupBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                      .add(BeBlocks.MAUVY_PRESSURE_PLATE);
              valueLookupBuilder(BlockTags.WOODEN_DOORS)
                      .add(BeBlocks.MAUVY_DOOR);
              valueLookupBuilder(BlockTags.WOODEN_TRAPDOORS)
                      .add(BeBlocks.MAUVY_TRAPDOOR);
              valueLookupBuilder(BlockTags.STANDING_SIGNS)
                      .add(BeBlocks.MAUVY_SIGN);
              valueLookupBuilder(BlockTags.WALL_SIGNS)
                      .add(BeBlocks.MAUVY_WALL_SIGN);
              valueLookupBuilder(BlockTags.CEILING_HANGING_SIGNS)
                      .add(BeBlocks.MAUVY_HANGING_SIGN);
              valueLookupBuilder(BlockTags.WALL_HANGING_SIGNS)
                      .add(BeBlocks.MAUVY_WALL_HANGING_SIGN);
              valueLookupBuilder(BlockTags.WOODEN_SHELVES)
                      .add(BeBlocks.MAUVY_SHELF);


            //Plant Definition
            valueLookupBuilder(BlockTags.SAPLINGS);

            valueLookupBuilder(BlockTags.FLOWER_POTS);

            valueLookupBuilder(BlockTags.BEE_ATTRACTIVE)
                    .add(BeBlocks.FORGET_ME_NOT)
                    .add(BeBlocks.BELLADONA)
                    .add(BeBlocks.EMPOROR_TULIP)
                    //.add(BeBlocks.COLOSSAL_SUNFLOWER)
                    //.add(BeBlocks.MONARCH_SUNFLOWER)
                    .add(BeBlocks.COLOSSAL_LILY_OF_THE_VALLEY);

            valueLookupBuilder(BlockTags.LEAVES)
                     .add(BeBlocks.MAUVY_LEAVES);

            valueLookupBuilder(ConventionalBlockTags.SMALL_FLOWERS)
                    .add(BeBlocks.FORGET_ME_NOT);

            valueLookupBuilder(ConventionalBlockTags.TALL_FLOWERS)
                    .add(BeBlocks.BELLADONA)
                    .add(BeBlocks.EMPOROR_TULIP)
                    .add(BeBlocks.COLOSSAL_LILY_OF_THE_VALLEY);

        }

    }

    public static class BeEntityTagProvider extends FabricTagProvider.EntityTypeTagProvider{
        public BeEntityTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
            super(output, registriesFuture);
        }

        @Override
        protected void addTags(HolderLookup.Provider provider) {

        }
    }



}
