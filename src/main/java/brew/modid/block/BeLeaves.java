package brew.modid.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.LeavesBlock;

public class BeLeaves extends LeavesBlock {

    public BeLeaves(float f, Properties properties) {
        super(f, properties);
    }

    public static void initialize() {
    }

    @Override
    public MapCodec<? extends LeavesBlock> codec() {
        return null;
    }

    @Override
    protected void spawnFallingLeavesParticle(Level level, BlockPos blockPos, RandomSource randomSource) {

    }
}
