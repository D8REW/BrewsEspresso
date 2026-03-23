package brew.modid.item;

import brew.modid.Brewsespresso;
import brew.modid.block.BeBlocks;
import brew.modid.entity.BeEntityTypes;
import brew.modid.sound.BeSounds;
import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.ItemContainerContents;

import java.util.function.Function;

public class BeItems {



//Discs
    public static final Item BREWS_MISCHIEF = register("brews_mischief", Item::new, new Item.Properties().stacksTo(16).rarity(Rarity.RARE).jukeboxPlayable(BeSounds.BREWS_MISCHIEF));
    public static final Item LUNAR_BLOOM = register("lunar_bloom", Item::new, new Item.Properties().stacksTo(16).rarity(Rarity.RARE).jukeboxPlayable(BeSounds.LUNAR_BLOOM));
    public static final Item MURDER_IN_THE_AIR = register("murder_in_the_air", Item::new, new Item.Properties().stacksTo(16).rarity(Rarity.RARE).jukeboxPlayable(BeSounds.MURDER_IN_THE_AIR));

//Icon
    public static final Item BREWICH = register("brewich", Item::new, new Item.Properties());

//Patterns&Trims
    public static final Item TULIP_BANNER_PATTERN = register("tulip_banner_pattern", Item::new, new Item.Properties().stacksTo(16).rarity(Rarity.RARE).component(DataComponents.PROVIDES_BANNER_PATTERNS, TagKey.create(Registries.BANNER_PATTERN, Identifier.fromNamespaceAndPath("brewsespresso", "tulip")))); //Thanks to ThePotatoArchivist, ioblackshaw & Hugman for helping me with the struggle which was Banner Patterns.

    //Mauvy
    //public static final Item MAUVY_SHELF = register("mauvy_shelf", props -> new BlockItem(BeBlocks.MAUVY_SHELF, props), new Item.Properties().component(DataComponents.CONTAINER, ItemContainerContents.EMPTY));
    //public static final Item MAUVY_DOOR = register("mauvy_door", props -> new DoubleHighBlockItem(BeBlocks.MAUVY_DOOR, props), new Item.Properties().stacksTo(16));
    //public static final Item MAUVY_SIGN = register("mauvy_sign", props -> new SignItem(BeBlocks.MAUVY_SIGN, BeBlocks.MAUVY_WALL_SIGN, props), new Item.Properties().stacksTo(16));
    //public static final Item MAUVY_HANGING_SIGN = register("mauvy_hanging_sign", props -> new HangingSignItem(BeBlocks.MAUVY_HANGING_SIGN, BeBlocks.MAUVY_WALL_HANGING_SIGN, props), new Item.Properties().stacksTo(16));

    public static final Item MAUVY_BOAT = register("mauvy_boat", props -> new BoatItem(BeEntityTypes.MAUVY_BOAT, props), new Item.Properties().stacksTo(1));
    public static final Item MAUVY_CHEST_BOAT = register("mauvy_chest_boat", props -> new BoatItem(BeEntityTypes.MAUVY_CHEST_BOAT, props), new Item.Properties().stacksTo(1));

    public static <GenericItem extends Item> GenericItem register(String name, Function<Item.Properties, GenericItem> itemFactory, Item.Properties settings) {
        ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Brewsespresso.MOD_ID, name));
        GenericItem item = itemFactory.apply(settings.setId(itemKey));
        Registry.register(BuiltInRegistries.ITEM, itemKey, item);
        return item;
    }

    public static void initialize() {
    }
} 