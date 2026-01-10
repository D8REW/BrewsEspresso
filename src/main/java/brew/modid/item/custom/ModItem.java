package brew.modid.item.custom;

import brew.modid.Brewsespresso;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

import java.util.function.Function;

public class ModItems {

    public static final Item BREWS_MISCHIEF = register("brews_mischief",
            settings -> new Item(settings.stacksTo(16).rarity(Rarity.RARE)),
            new Item.Settings()
    );

    public static Item register(String name, Function<Item.Settings, Item> itemFactory, Item.Settings settings) {
        // Mojang uses ResourceLocation.fromNamespaceAndPath
        ResourceLocation id = ResourceLocation.fromNamespaceAndPath(Brewsespresso.MOD_ID, name);
        ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, id);

        // In 1.21+, we must pass the key into the settings
        Item item = itemFactory.apply(settings.setId(key));

        return Registry.register(BuiltInRegistries.ITEM, key, item);
    }

    public static void initialize() {
        Brewsespresso.LOGGER.info("Registering Mod Items for " + Brewsespresso.MOD_ID);
    }
}