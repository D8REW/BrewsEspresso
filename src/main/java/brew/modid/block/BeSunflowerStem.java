package brew.modid.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.GrowingPlantBodyBlock;
import net.minecraft.world.level.block.GrowingPlantHeadBlock;
import net.minecraft.world.phys.shapes.VoxelShape;

public class BeSunflowerStem extends GrowingPlantBodyBlock {
    protected BeSunflowerStem(Properties properties, Direction direction, VoxelShape voxelShape, boolean bl) {
        super(properties, direction, voxelShape, bl);
    }

    @Override
    protected MapCodec<? extends GrowingPlantBodyBlock> codec() {
        return null;
    }

    @Override
    protected GrowingPlantHeadBlock getHeadBlock() {
        return null;
    }
}
