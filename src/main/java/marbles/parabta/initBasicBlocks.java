package marbles.parabta;

import net.minecraft.core.block.*;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.sound.BlockSounds;
import turniplabs.halplibe.helper.BlockBuilder;

public class initBasicBlocks {
	public static int blockId;

	public static Block <?> MUD_BRICKS;
	public static Block <?> MUD_POLISHED;

	public void initBlocks(){
		MUD_POLISHED = new BlockBuilder(ParaBTA.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setResistance(5.0F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build("polished.mud", blockId++, b -> new BlockLogic(b, Material.stone, () -> {return STONE;}));

		MUD_BRICKS = new BlockBuilder(ParaBTA.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setResistance(5.0F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build("bricks.mud", blockId++, b -> new BlockLogic(b, Material.stone, () -> {return STONE;}));

	}
}
