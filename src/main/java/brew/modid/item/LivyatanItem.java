package brew.modid.item;

import brew.modid.Brewsespresso;
import brew.modid.payload.EmitterParticlePayload;
import brew.modid.sound.ModSounds;
import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.component.AttackRange;


import java.util.function.Function;

public class LivyatanItem {


    public static final TagKey<Item> REPAIRS_LIVYATAN = TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Brewsespresso.MOD_ID, "repairs_livyatan.json"));
    public static final ToolMaterial LIVYATAN_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2000, 5.0F, 1.0F, 22, REPAIRS_LIVYATAN);
    public static final Item LIVYATAN = register("livyatan", Item::new, new Item.Properties().sword(LIVYATAN_MATERIAL, 7f, -2.8f).component(DataComponents.ATTACK_RANGE, new AttackRange(0F, 3.5F, 0F, 3.5F, 0F, 0F)));


    public static <GenericItem extends Item> GenericItem register(String name, Function<Item.Properties, GenericItem> itemFactory, Item.Properties settings) {
        ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Brewsespresso.MOD_ID, name));
        GenericItem item = itemFactory.apply(settings.setId(itemKey));
        Registry.register(BuiltInRegistries.ITEM, itemKey, item);
        return item;
    }

    public static void initialize() {
    }
}
