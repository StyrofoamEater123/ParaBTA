package marbles.parabta;

import net.minecraft.core.block.*;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.sound.BlockSounds;
import turniplabs.halplibe.helper.BlockBuilder;
import net.minecraft.core.block.material.Material;

public class initBasicBlocks {

	public static Block <?> MUD_BRICKS;
	public static Block <?> MUD_POLISHED;

	public static BlockBuilder standardBlockBuilder = new BlockBuilder(ParaBTA.MOD_ID);

	public void initBlocks(){

		MUD_POLISHED = standardBlockBuilder
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setResistance(5.0F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build("stoneSide", 2001, b -> new BlockLogic(MUD_POLISHED, Material.grass));

	}
}
