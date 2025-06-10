package marbles.parabta;

import net.minecraft.core.block.*;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.sound.BlockSounds;
import net.minecraft.core.item.block.ItemBlock;
import turniplabs.halplibe.helper.BlockBuilder;

import net.minecraft.core.block.material.Material;

public class InitBasicBlocks {

	public static Block <?> MUD_BRICKS;
	public static Block <?> MUD_POLISHED;




	public void initBlocks(){

		BlockBuilder weakStoneBuilder = new BlockBuilder(ParaBTA.MOD_ID) //Makes a BlockBuilder type for weak stone blocks, like mud bricks.
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setResistance(5.0F)
			.setBlockItem(ItemBlock::new)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);

		MUD_POLISHED = weakStoneBuilder.build("mud.polished", "polished_baked_mud", 2001, b -> new BlockLogic(MUD_POLISHED, Material.stone));

	}
}
