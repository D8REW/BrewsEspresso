package brew.modid.item.emet;

import brew.modid.Brewsespresso;
import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextColor;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;

import java.util.function.Function;

public class EmetItem {

    public static final TagKey<Item> REPAIRS_EMET = TagKey.create(
            Registries.ITEM,
            Identifier.fromNamespaceAndPath(Brewsespresso.MOD_ID, "repairs_emet.json")
    );
    public static final ToolMaterial EMET_MATERIAL = new ToolMaterial(
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            2000, // Durability
            5.0F, // Mining speed
            1.0F, // Enchantability (Bonus damage)
            22, // Enchantability (Enchantment quality)
            REPAIRS_EMET // The repair tag we made above
    );
    public static final Item EMET = register(
            "emet",
            Item::new,
            new Item.Properties()
                    .sword(EMET_MATERIAL, 7f, -2.8f)
                    .component(DataComponents.CUSTOM_NAME, Component.literal("Emet")
                            .withStyle(style -> style
                                    .withColor(TextColor.fromRgb(0xC0C0C0))
                            ))
    );


    public static <GenericItem extends Item> GenericItem register(String name, Function<Item.Properties, GenericItem> itemFactory, Item.Properties settings) {
        ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Brewsespresso.MOD_ID, name));
        GenericItem item = itemFactory.apply(settings.setId(itemKey));
        Registry.register(BuiltInRegistries.ITEM, itemKey, item);
        return item;
    }

    public static void initialize() {
    }
}
