package brew.modid.item.custom;

import brew.modid.Brewsespresso;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModItemGroups {

    public static final ResourceKey<CreativeModeTab> MAIN_GROUP_KEY = ResourceKey.create(
            Registries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Brewsespresso.MOD_ID, "main_group")
    );

    public static final CreativeModeTab MAIN_GROUP = FabricItemGroup.builder()
            .title(Component.translatable("itemgroup.brewsespresso.main_group"))
            .icon(() -> new ItemStack(ModItems.BREWS_MISCHIEF))
            .displayItems((parameters, output) -> {
                output.accept(ModItems.BREWS_MISCHIEF);
            })
            .build();

    public static void initialize() {
    }
}