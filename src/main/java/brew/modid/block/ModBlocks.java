package brew.modid.block;

import brew.modid.Brewsespresso;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

import java.util.function.Function;

public class ModBlocks {


    private static Block register(String name, Function<BlockBehaviour.Properties, Block> blockFactory, BlockBehaviour.Properties settings, boolean shouldRegisterItem) {
        ResourceKey<Block> blockKey = keyOfBlock(name);
        Block block = blockFactory.apply(settings.setId(blockKey));

        if (shouldRegisterItem) {
            ResourceKey<Item> itemKey = keyOfItem(name);
            BlockItem blockItem = new BlockItem(block, new Item.Properties().setId(itemKey).useBlockDescriptionPrefix());
            Registry.register(BuiltInRegistries.ITEM, itemKey, blockItem);
        }
        return Registry.register(BuiltInRegistries.BLOCK, blockKey, block);
    }


    //Purple Heart

    
    public static final Block PURPLE_HEART_LOG = register("purple_heart_log", RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG), true);
    public static final Block PURPLE_HEART_WOOD = register("purple_heart_wood", RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD), true);
    public static final Block STRIPPED_PURPLE_HEART_LOG = register("stripped_purple_heart_log", RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG), true);
    public static final Block STRIPPED_PURPLE_HEART_WOOD = register("stripped_purple_heart_wood", RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD), true);
    public static final Block PURPLE_HEART_PLANKS = register("purple_heart_planks", Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS), true);

    public static final Block PURPLE_HEART_STAIRS = register("purple_heart_stairs", (settings) -> new StairBlock(PURPLE_HEART_PLANKS.defaultBlockState(), settings), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS), true);
    public static final Block PURPLE_HEART_SLAB = register("purple_heart_slab", SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB), true);
    public static final Block PURPLE_HEART_FENCE = register("purple_heart_fence", FenceBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE), true);
    public static final Block PURPLE_HEART_FENCE_GATE = register("purple_heart_fence_gate", (settings) -> new FenceGateBlock(WoodType.OAK, settings), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE), true);

    public static final Block PURPLE_HEART_DOOR = register("purple_heart_door", (settings) -> new DoorBlock(BlockSetType.OAK, settings), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR), true);
    public static final Block PURPLE_HEART_TRAPDOOR = register("purple_heart_trapdoor", (settings) -> new TrapDoorBlock(BlockSetType.OAK, settings), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR), true);
    public static final Block PURPLE_HEART_BUTTON = register("purple_heart_button", (settings) -> new ButtonBlock(BlockSetType.OAK, 30, settings), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON), true);
    public static final Block PURPLE_HEART_PRESSURE_PLATE = register("purple_heart_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.OAK, settings), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE), true);

    //Blood Thistle

    //RootTree

    //Flowers
    public static final Block BELLADONA = register("belladona", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.ROSE_BUSH), true);
    public static final Block FORGET_ME_NOT = register("forget_me_not", FlowerBedBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_PETALS), true);



    private static ResourceKey<Block> keyOfBlock(String name) {
        return ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Brewsespresso.MOD_ID, name));
    }
    private static ResourceKey<Item> keyOfItem(String name) {
        return ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Brewsespresso.MOD_ID, name));
    }

    public static void initialize() {
    }
}