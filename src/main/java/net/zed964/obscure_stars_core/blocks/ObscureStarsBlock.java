package net.zed964.obscure_stars_core.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class ObscureStarsBlock extends Block implements SimpleWaterloggedBlock {

    /**
     * Constructor for ObscureStarsBlock
     * @param blockProperties Properties of block
     */
    public ObscureStarsBlock(BlockBehaviour.Properties blockProperties) {
        super(blockProperties);
    }
}
