package brew.modid;

import brew.modid.block.*;
import brew.modid.entity.BeEntityTypes;
import brew.modid.item.BeItems;
import brew.modid.sound.BeSounds;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntityType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static brew.modid.block.BeBlocks.MAUVY_SHELF;

//import static brew.modid.block.BeBlocks.MAUVY_SHELF;

public class Brewsespresso implements ModInitializer {
	public static final String MOD_ID = "brewsespresso";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	public static final ResourceKey<CreativeModeTab> CUSTOM_ITEM_GROUP_KEY =
			ResourceKey.create(Registries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(MOD_ID, "item_group"));


	public static final CreativeModeTab CUSTOM_ITEM_GROUP = FabricItemGroup.builder()
			.title(Component.translatable("itemGroup." + MOD_ID + ".item_group"))
			.icon(() -> new ItemStack(BeItems.BREWICH))
			.build();


	@Override
	public void onInitialize() {
		//class initalize
		BeBlocks.initialize();
		BeItems.initialize();
		BeSounds.initialize();
		BeEntityTypes.initialize();

		//block interactions
		StrippableBlockRegistry.register(BeBlocks.MAUVY_WOOD, BeBlocks.STRIPPED_MAUVY_WOOD);
		StrippableBlockRegistry.register(BeBlocks.MAUVY_LOG, BeBlocks.STRIPPED_MAUVY_LOG);
		BlockEntityType.SHELF.addSupportedBlock(MAUVY_SHELF);
		BlockEntityType.SIGN.addSupportedBlock(BeBlocks.MAUVY_SIGN);
		BlockEntityType.SIGN.addSupportedBlock(BeBlocks.MAUVY_WALL_SIGN);
		BlockEntityType.HANGING_SIGN.addSupportedBlock(BeBlocks.MAUVY_HANGING_SIGN);
		BlockEntityType.HANGING_SIGN.addSupportedBlock(BeBlocks.MAUVY_WALL_HANGING_SIGN);

		//creative tab registry
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, CUSTOM_ITEM_GROUP_KEY, CUSTOM_ITEM_GROUP);
		ItemGroupEvents.modifyEntriesEvent(CUSTOM_ITEM_GROUP_KEY).register(itemGroup -> {

			//Discs
			itemGroup.accept(BeItems.BREWS_MISCHIEF);
			itemGroup.accept(BeItems.LUNAR_BLOOM);
			itemGroup.accept(BeItems.MURDER_IN_THE_AIR);

			//Patterns&Trims
			itemGroup.accept(BeItems.TULIP_BANNER_PATTERN);

			//Flowers
			itemGroup.accept(BeBlocks.BELLADONA);
			itemGroup.accept(BeBlocks.FORGET_ME_NOT);
			itemGroup.accept(BeBlocks.CYAN_ROSE);
			itemGroup.accept(BeBlocks.RED_ROSE);
			itemGroup.accept(BeBlocks.EMPOROR_TULIP);
			itemGroup.accept(BeBlocks.COLOSSAL_LILY_OF_THE_VALLEY);

			//Mauvy
		});
	}
}