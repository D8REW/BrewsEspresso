package brew.modid.block;

import brew.modid.Brewsespresso;
import com.mojang.serialization.MapCodec;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

import java.util.Optional;
import java.util.function.Function;

public class BeBlocks {
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


    //Flowers
    public static final Block BELLADONA = register("belladona", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.ROSE_BUSH), true);
    public static final Block FORGET_ME_NOT = register("forget_me_not", FlowerBedBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_PETALS), true);
    public static final Block EMPOROR_TULIP = register("emporar_tulip", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.ROSE_BUSH),true);
    //public static final Block COLOSSAL_SUNFLOWER = register("colossal_sunflower", TwistingVinesBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.TWISTING_VINES),true);
    //public static final Block MONARCH_SUNFLOWER = register("monarch_sunflower", TwistingVinesBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.TWISTING_VINES),true);
    public static final Block COLOSSAL_LILY_OF_THE_VALLEY = register("colossal_lily_of_the_valley", TallFlowerBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.ROSE_BUSH),true);
    public static final Block CYAN_ROSE = register("cyan_rose", properties -> new FlowerBlock(MobEffects.REGENERATION, 5.0f, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.POPPY), true);
    public static final Block RED_ROSE = register("red_rose", properties -> new FlowerBlock(MobEffects.REGENERATION, 5.0f, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.POPPY), true);

    //Mauvy
    public static final BlockSetType MAUVY_BLOCK_SET = new BlockSetType(
            "mauvy_block_set", // your ID

            true,  // canOpenByHand
            true,  // canOpenByWindCharge
            true,  // canButtonBeActivatedByArrows

            BlockSetType.PressurePlateSensitivity.EVERYTHING,

            SoundType.WOOD,

            SoundEvents.WOODEN_DOOR_CLOSE,
            SoundEvents.WOODEN_DOOR_OPEN,
            SoundEvents.WOODEN_TRAPDOOR_CLOSE,
            SoundEvents.WOODEN_TRAPDOOR_OPEN,
            SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_OFF,
            SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_ON,
            SoundEvents.WOODEN_BUTTON_CLICK_OFF,
            SoundEvents.WOODEN_BUTTON_CLICK_ON
    );

    public static final WoodType MAUVY_WOOD_TYPE = new WoodType("mauvy", MAUVY_BLOCK_SET);

      //public static final Block MAUVY_SAPLING = register("mauvy_sapling", settings -> new SaplingBlock(MAUVY_SAPLING_GENERATOR, settings), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING),true);
      //public static final Block POTTED_MAUVY_SAPLING = register("potted_mauvy_sapling",settings -> new FlowerPotBlock(MAUVY_SAPLING, settings), BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_OAK_SAPLING),true);
      public static final Block MAUVY_LEAVES = register("mauvy_leaves", Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES), true);
      public static final Block MAUVY_LOG = register("mauvy_log", RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG),true);
      public static final Block MAUVY_WOOD = register("mauvy_wood", RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG),true);
      public static final Block STRIPPED_MAUVY_LOG = register("stripped_mauvy_log", RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG),true);
      public static final Block STRIPPED_MAUVY_WOOD = register("stripped_mauvy_wood", RotatedPillarBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG),true);
      public static final Block MAUVY_PLANK = register("mauvy_planks", Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS),true);
      public static final Block MAUVY_STAIR = register("mauvy_stair", (settings) -> new StairBlock(MAUVY_PLANK.defaultBlockState(), settings),BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS),true);
      public static final Block MAUVY_SLAB = register("mauvy_slab", SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB),true);
      public static final Block MAUVY_FENCE = register("mauvy_fence", FenceBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE),true);
      public static final Block MAUVY_FENCE_GATE = register("mauvy_fence_gate",(settings) -> new FenceGateBlock(WoodType.OAK, settings), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE),true);
      public static final Block MAUVY_DOOR = register("mauvy_door", (settings) -> new DoorBlock(BlockSetType.OAK, settings), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR),true);
      public static final Block MAUVY_TRAPDOOR = register("mauvy_trapdoor", (settings) -> new TrapDoorBlock(BlockSetType.OAK, settings), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR),true);
      public static final Block MAUVY_PRESSURE_PLATE = register("mauvy_pressure_plate", (settings) -> new PressurePlateBlock(BlockSetType.OAK, settings), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE),true);
      public static final Block MAUVY_BUTTON = register("mauvy_button", (settings) -> new ButtonBlock(BlockSetType.OAK, 30, settings), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON),true);
      public static final Block MAUVY_SHELF = register("mauvy_shelf", ShelfBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SHELF),true);
      public static final Block MAUVY_SIGN = register("mauvy_sign", settings -> new StandingSignBlock(MAUVY_WOOD_TYPE, settings), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN),true);
      public static final Block MAUVY_WALL_SIGN = register("mauvy_wall_sign", settings -> new WallSignBlock(MAUVY_WOOD_TYPE, settings), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN),true);
      public static final Block MAUVY_HANGING_SIGN = register("mauvy_hanging_sign", settings -> new CeilingHangingSignBlock(MAUVY_WOOD_TYPE, settings), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN),true);
      public static final Block MAUVY_WALL_HANGING_SIGN = register("mauvy_wall_hanging_sign", settings -> new WallHangingSignBlock(MAUVY_WOOD_TYPE, settings), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN),true);

    //Crimson Thistle





    private static ResourceKey<Block> keyOfBlock(String name) {
        return ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Brewsespresso.MOD_ID, name));
    }
    private static ResourceKey<Item> keyOfItem(String name) {
        return ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Brewsespresso.MOD_ID, name));
    }

    public static void initialize() {
    }
}