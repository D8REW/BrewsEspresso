package brew.modid.datagen;

import brew.modid.block.BeBlocks;
import brew.modid.item.BeItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;

public class BeModelProvider extends FabricModelProvider {
    public BeModelProvider(FabricDataOutput output) {super(output);}

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {

        //Purple Heart
        BlockModelGenerators.BlockFamilyProvider MauvyFamily = blockModelGenerators.family(BeBlocks.MAUVY_PLANK);

        MauvyFamily.stairs(BeBlocks.MAUVY_STAIR);
        MauvyFamily.slab(BeBlocks.MAUVY_SLAB);
        MauvyFamily.fence(BeBlocks.MAUVY_FENCE);
        MauvyFamily.fenceGate(BeBlocks.MAUVY_FENCE_GATE);
        MauvyFamily.button(BeBlocks.MAUVY_BUTTON);
        MauvyFamily.pressurePlate(BeBlocks.MAUVY_PRESSURE_PLATE);

        blockModelGenerators.woodProvider(BeBlocks.MAUVY_LOG)
                .log(BeBlocks.MAUVY_LOG)
                .wood(BeBlocks.MAUVY_WOOD);

        blockModelGenerators.woodProvider(BeBlocks.STRIPPED_MAUVY_LOG)
                .log(BeBlocks.STRIPPED_MAUVY_LOG)
                .wood(BeBlocks.STRIPPED_MAUVY_WOOD);

        blockModelGenerators.createDoor(BeBlocks.MAUVY_DOOR);
        blockModelGenerators.createTrapdoor(BeBlocks.MAUVY_TRAPDOOR);
        //blockModelGenerators.createShelf(BeBlocks.MAUVY_SHELF);
        //blockModelGenerators.createTrivialBlock(BeBlocks.MAUVY_LEAVES);
        //blockModelGenerators.createCrossBlock(BeBlocks.MAUVY_SAPLING);

        //Flowers
        blockModelGenerators.createDoublePlant(BeBlocks.BELLADONA, BlockModelGenerators.PlantType.NOT_TINTED);
        blockModelGenerators.createDoublePlant(BeBlocks.COLOSSAL_LILY_OF_THE_VALLEY, BlockModelGenerators.PlantType.NOT_TINTED);
        blockModelGenerators.createDoublePlant(BeBlocks.EMPOROR_TULIP, BlockModelGenerators.PlantType.NOT_TINTED);
        blockModelGenerators.createCrossBlock(BeBlocks.CYAN_ROSE, BlockModelGenerators.PlantType.NOT_TINTED);
        blockModelGenerators.createCrossBlock(BeBlocks.RED_ROSE, BlockModelGenerators.PlantType.NOT_TINTED);
        blockModelGenerators.createFlowerBed(BeBlocks.FORGET_ME_NOT);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {

        //Discs, Patterns & Trims
        itemModelGenerators.createFlatItemModel(BeItems.LUNAR_BLOOM, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.createFlatItemModel(BeItems.MURDER_IN_THE_AIR, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.createFlatItemModel(BeItems.BREWS_MISCHIEF, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.createFlatItemModel(BeItems.TULIP_BANNER_PATTERN, ModelTemplates.FLAT_ITEM);

        //Patterns&Trims
        itemModelGenerators.createFlatItemModel(BeItems.MAUVY_BOAT, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.createFlatItemModel(BeItems.MAUVY_CHEST_BOAT, ModelTemplates.FLAT_ITEM);

        //Icon
        itemModelGenerators.createFlatItemModel(BeItems.BREWICH, ModelTemplates.FLAT_ITEM);

        //Blocks as Items

    }
}
 