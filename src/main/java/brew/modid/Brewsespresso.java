package brew.modid;

import brew.modid.item.LivyatanItem;
import brew.modid.item.ModItemGroups;
import brew.modid.item.ModItems;
import brew.modid.particle.ModParticles;
import brew.modid.payload.EmitterParticlePayload;
import brew.modid.sound.ModSounds;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
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
		ModItems.initialize();
		ModItemGroups.initialize();
		ModSounds.initialize();
		ModParticles.initialize();
		LivyatanItem.initialize();
		PayloadTypeRegistry.playS2C().register(EmitterParticlePayload.TYPE, EmitterParticlePayload.CODEC);



		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, CUSTOM_ITEM_GROUP_KEY, CUSTOM_ITEM_GROUP);
		ItemGroupEvents.modifyEntriesEvent(CUSTOM_ITEM_GROUP_KEY).register(itemGroup -> {
			itemGroup.accept(ModItems.BREWS_MISCHIEF);
			itemGroup.accept(ModItems.TULIP_BANNER_PATTERN);
			itemGroup.accept(LivyatanItem.LIVYATAN);
		});
	}
}