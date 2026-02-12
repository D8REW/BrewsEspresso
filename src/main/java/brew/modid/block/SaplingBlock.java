package brew.modid.block;

import net.minecraft.world.level.block.grower.TreeGrower;

public class SaplingBlock extends net.minecraft.world.level.block.SaplingBlock {
    public SaplingBlock(TreeGrower treeGrower, Properties properties) {
        super(treeGrower, properties);
    }

    public static void initialize() {
    }
}
