package brew.modid.datagen;

import brew.modid.block.ModBlocks;
import brew.modid.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {super(output);}

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {

        //Purple Heart
        BlockModelGenerators.BlockFamilyProvider purpleHeartFamily = blockModelGenerators.family(ModBlocks.PURPLE_HEART_PLANKS);

        blockModelGenerators.createTrivialCube(ModBlocks.PURPLE_HEART_PLANKS);
        purpleHeartFamily.stairs(ModBlocks.PURPLE_HEART_STAIRS);
        purpleHeartFamily.slab(ModBlocks.PURPLE_HEART_SLAB);
        purpleHeartFamily.fence(ModBlocks.PURPLE_HEART_FENCE);
        purpleHeartFamily.fenceGate(ModBlocks.PURPLE_HEART_FENCE_GATE);
        purpleHeartFamily.button(ModBlocks.PURPLE_HEART_BUTTON);
        purpleHeartFamily.pressurePlate(ModBlocks.PURPLE_HEART_PRESSURE_PLATE);

        blockModelGenerators.woodProvider(ModBlocks.PURPLE_HEART_LOG)
                .log(ModBlocks.PURPLE_HEART_LOG)
                .wood(ModBlocks.PURPLE_HEART_WOOD);

        blockModelGenerators.woodProvider(ModBlocks.STRIPPED_PURPLE_HEART_LOG)
                .log(ModBlocks.STRIPPED_PURPLE_HEART_LOG)
                .wood(ModBlocks.STRIPPED_PURPLE_HEART_WOOD);

        blockModelGenerators.createDoor(ModBlocks.PURPLE_HEART_DOOR);
        blockModelGenerators.createTrapdoor(ModBlocks.PURPLE_HEART_TRAPDOOR);


        //Blood Thistle

        //RootTree

        //Flowers
        blockModelGenerators.createDoublePlant(ModBlocks.BELLADONA, BlockModelGenerators.PlantType.NOT_TINTED);
        blockModelGenerators.createFlowerBed(ModBlocks.FORGET_ME_NOT);

        //
    }
    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        //Discs
        itemModelGenerators.createFlatItemModel(ModItems.LUNAR_BLOOM, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.createFlatItemModel(ModItems.MURDER_IN_THE_AIR, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.createFlatItemModel(ModItems.BREWS_MISCHIEF, ModelTemplates.FLAT_ITEM);

        //Patterns&Trims
        itemModelGenerators.createFlatItemModel(ModItems.TULIP_BANNER_PATTERN, ModelTemplates.FLAT_ITEM);

        //Icon
        itemModelGenerators.createFlatItemModel(ModItems.BREWICH, ModelTemplates.FLAT_ITEM);



    }
}
