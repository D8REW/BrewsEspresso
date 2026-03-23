package brew.modid.block;

import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.grower.TreeGrower;

public class BeSaplings extends SaplingBlock {

    public BeSaplings(TreeGrower treeGrower, Properties properties) {
        super(treeGrower, properties);
    }

    public static void initialize() {
    }
}
