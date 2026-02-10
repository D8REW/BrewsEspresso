package brew.modid.item;

import brew.modid.Brewsespresso;
import brew.modid.sound.ModSounds;
import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import java.util.function.Function;

public class ModItems {


//Discs
    public static final Item BREWS_MISCHIEF = register("brews_mischief", Item::new, new Item.Properties().stacksTo(16).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.BREWS_MISCHIEF));
    public static final Item LUNAR_BLOOM = register("lunar_bloom", Item::new, new Item.Properties().stacksTo(16).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.LUNAR_BLOOM));
    public static final Item MURDER_IN_THE_AIR = register("murder_in_the_air", Item::new, new Item.Properties().stacksTo(16).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.MURDER_IN_THE_AIR));

//Icon
    public static final Item BREWICH = register("brewich", Item::new, new Item.Properties());

//Patterns&Trims
    public static final Item TULIP_BANNER_PATTERN = register("tulip_banner_pattern", Item::new, new Item.Properties().stacksTo(16).rarity(Rarity.RARE).component(DataComponents.PROVIDES_BANNER_PATTERNS, TagKey.create(Registries.BANNER_PATTERN, Identifier.fromNamespaceAndPath("brewsespresso", "tulip")))); //Thanks to ThePotatoArchivist, ioblackshaw & Hugman for helping me with the struggle which was Banner Patterns.


    public static <GenericItem extends Item> GenericItem register(String name, Function<Item.Properties, GenericItem> itemFactory, Item.Properties settings) {
        ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Brewsespresso.MOD_ID, name));
        GenericItem item = itemFactory.apply(settings.setId(itemKey));
        Registry.register(BuiltInRegistries.ITEM, itemKey, item);
        return item;
    }

    public static void initialize() {
    }
} 