package brew.modid.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.GrowingPlantHeadBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.VoxelShape;

public class BeSunflowerHead extends GrowingPlantHeadBlock {
    protected BeSunflowerHead(Properties properties, Direction direction, VoxelShape voxelShape, boolean bl, double d) {
        super(properties, direction, voxelShape, bl, d);
    }

    @Override
    protected MapCodec<? extends GrowingPlantHeadBlock> codec() {
        return null;
    }

    @Override
    protected Block getBodyBlock() {
        return null;
    }

    @Override
    protected int getBlocksToGrowWhenBonemealed(RandomSource randomSource) {
        return 0;
    }

    @Override
    protected boolean canGrowInto(BlockState blockState) {
        return false;
    }
}
