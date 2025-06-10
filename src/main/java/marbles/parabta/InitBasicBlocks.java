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
	public static Block <?> BONE_PILE;
	public static Block <?> BONE_FENCE;




	public void initBlocks(){

		BlockBuilder weakStoneBuilder = new BlockBuilder(ParaBTA.MOD_ID) //Makes a BlockBuilder type for weak stone blocks, like mud bricks.
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setResistance(5.0F)
			.setBlockItem(ItemBlock::new)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);

		BlockBuilder stoneBuilder = new BlockBuilder(ParaBTA.MOD_ID) //Makes a BlockBuilder type for stone blocks..
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setResistance(5.0F)
			.setBlockItem(ItemBlock::new)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);

		BlockBuilder stoneFenceBuilder = new BlockBuilder(ParaBTA.MOD_ID) //Makes a BlockBuilder type for weak stone fences.
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setResistance(5.0F)
			.setBlockItem(ItemBlock::new)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT);

		MUD_POLISHED = weakStoneBuilder.build("mud.polished", "baked_mud_polished", 2301, b ->
			new BlockLogic(MUD_POLISHED, Material.stone));

		MUD_BRICKS = weakStoneBuilder.build("mud.bricks", "baked_mud_bricks", 2302, b ->
			new BlockLogic(MUD_BRICKS, Material.stone));

		BONE_PILE = weakStoneBuilder.build("bone.pile", "bone_pile", 2303, b ->
			new BlockLogic(BONE_PILE, Material.stone));

		BONE_FENCE = stoneFenceBuilder.build("bone.fence", "bone_fence", 2304, b ->
			new BlockLogicFence(BONE_FENCE));

	}
}
