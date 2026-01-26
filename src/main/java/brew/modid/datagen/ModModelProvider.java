package brew.modid.datagen;

import brew.modid.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.ModelTemplates;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.createFlatItemModel(ModItems.LUNAR_BLOOM, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.createFlatItemModel(ModItems.MURDER_IN_THE_AIR, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.createFlatItemModel(ModItems.BREWS_MISCHIEF, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.createFlatItemModel(ModItems.TULIP_BANNER_PATTERN, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.createFlatItemModel(ModItems.BREWICH, ModelTemplates.FLAT_ITEM);



    }
}
