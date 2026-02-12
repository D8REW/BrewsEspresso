package brew.modid;

import brew.modid.block.*;
import brew.modid.item.BehemothItem;
import brew.modid.item.LivyatanItem;
import brew.modid.item.ModItems;
import brew.modid.particle.ModParticles;
import brew.modid.payload.EmitterParticlePayload;
import brew.modid.sound.ModSounds;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Brewsespresso implements ModInitializer {
	public static final String MOD_ID = "brewsespresso";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	public static final ResourceKey<CreativeModeTab> CUSTOM_ITEM_GROUP_KEY =
			ResourceKey.create(Registries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(MOD_ID, "item_group"));


	public static final CreativeModeTab CUSTOM_ITEM_GROUP = FabricItemGroup.builder()
			.title(Component.translatable("itemGroup." + MOD_ID + ".item_group"))
			.icon(() -> new ItemStack(ModItems.BREWICH))
			.build();


	@Override
	public void onInitialize() {
		//class initalize
		ModBlocks.initialize();
		ModBlockEntity.initialize();
		ModItems.initialize();
		ModSounds.initialize();
		ModParticles.initialize();

		LivyatanItem.initialize();
		BehemothItem.initialize();

		HangingFruit.initialize();
		LeavesBlock.initialize();
		SaplingBlock.initialize();

		//payload
		PayloadTypeRegistry.playS2C().register(EmitterParticlePayload.TYPE, EmitterParticlePayload.CODEC);

		//block interactions
		StrippableBlockRegistry.register(ModBlocks.PURPLE_HEART_LOG, ModBlocks.STRIPPED_PURPLE_HEART_LOG);
		StrippableBlockRegistry.register(ModBlocks.PURPLE_HEART_WOOD, ModBlocks.STRIPPED_PURPLE_HEART_WOOD);

		//creative tab registry
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, CUSTOM_ITEM_GROUP_KEY, CUSTOM_ITEM_GROUP);
		ItemGroupEvents.modifyEntriesEvent(CUSTOM_ITEM_GROUP_KEY).register(itemGroup -> {

			//Discs
			itemGroup.accept(ModItems.BREWS_MISCHIEF);
			itemGroup.accept(ModItems.LUNAR_BLOOM);
			itemGroup.accept(ModItems.MURDER_IN_THE_AIR);

			//Patterns&Trims
			itemGroup.accept(ModItems.TULIP_BANNER_PATTERN);

			//Weapons
			itemGroup.accept(LivyatanItem.LIVYATAN);
			itemGroup.accept(BehemothItem.BEHEMOTH);

			//Flowers
			itemGroup.accept(ModBlocks.BELLADONA);
			itemGroup.accept(ModBlocks.FORGET_ME_NOT);

			//Purple Heart
			itemGroup.accept(ModBlocks.PURPLE_HEART_LOG);
			itemGroup.accept(ModBlocks.PURPLE_HEART_WOOD);
			itemGroup.accept(ModBlocks.STRIPPED_PURPLE_HEART_LOG);
			itemGroup.accept(ModBlocks.STRIPPED_PURPLE_HEART_WOOD);
			itemGroup.accept(ModBlocks.PURPLE_HEART_PLANKS);
			itemGroup.accept(ModBlocks.PURPLE_HEART_SLAB);
			itemGroup.accept(ModBlocks.PURPLE_HEART_STAIRS);
			itemGroup.accept(ModBlocks.PURPLE_HEART_FENCE);
			itemGroup.accept(ModBlocks.PURPLE_HEART_FENCE_GATE);
			itemGroup.accept(ModBlocks.PURPLE_HEART_BUTTON);
			itemGroup.accept(ModBlocks.PURPLE_HEART_PRESSURE_PLATE);
			itemGroup.accept(ModBlocks.PURPLE_HEART_DOOR);
			itemGroup.accept(ModBlocks.PURPLE_HEART_TRAPDOOR);

			//Blood Thistle

			//Root Tree
		});
	}
}