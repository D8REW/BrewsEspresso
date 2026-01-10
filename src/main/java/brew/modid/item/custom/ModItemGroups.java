package brew.modid.item.custom;

import brew.modid.Brewsespresso;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModItemGroups {

    // Registering the Key for the group
    public static final ResourceKey<CreativeModeTab> MAIN_GROUP_KEY = ResourceKey.create(
            Registries.CREATIVE_MODE_TAB,
            ResourceLocation.fromNamespaceAndPath(Brewsespresso.MOD_ID, "main_group")
    );

    public static final CreativeModeTab MAIN_GROUP = FabricItemGroup.builder()
            .title(Component.translatable("itemgroup.brewsespresso.main_group"))
            .icon(() -> new ItemStack(ModItems.BREWS_MISCHIEF))
            .displayItems((parameters, output) -> {
                output.accept(ModItems.BREWS_MISCHIEF);
            })
            .build();

    public static void registerItemGroups() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, MAIN_GROUP_KEY, MAIN_GROUP);
    }
}