package brew.modid.datagen;

import brew.modid.item.BehemothItem;
import brew.modid.item.LivyatanItem;
import brew.modid.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.tags.BannerPatternTagsProvider;
import net.minecraft.tags.BannerPatternTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.JukeboxPlayable;
import net.minecraft.world.level.block.entity.BannerPattern;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup) {
        valueLookupBuilder(ItemTags.SWORDS)
                .add(LivyatanItem.LIVYATAN);

        valueLookupBuilder(ItemTags.SWORDS)
                .add(BehemothItem.BEHEMOTH);

        valueLookupBuilder(ItemTags.AXES)
                .add(BehemothItem.BEHEMOTH);
    }
}
