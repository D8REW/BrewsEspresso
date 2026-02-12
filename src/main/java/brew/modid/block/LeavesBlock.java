package brew.modid.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;

public class LeavesBlock extends net.minecraft.world.level.block.LeavesBlock {

    public LeavesBlock(float f, Properties properties) {
        super(f, properties);
    }

    @Override
    public MapCodec<? extends net.minecraft.world.level.block.LeavesBlock> codec() {
        return null;
    }

    @Override
    protected void spawnFallingLeavesParticle(Level level, BlockPos blockPos, RandomSource randomSource) {

    }
    public static void initialize() {
    }
}
