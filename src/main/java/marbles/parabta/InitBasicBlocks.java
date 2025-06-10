package marbles.parabta;

import net.minecraft.core.block.*;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.sound.BlockSounds;
import net.minecraft.core.item.block.ItemBlock;
import turniplabs.halplibe.helper.BlockBuilder;

import marbles.parabta.blocks.*;

import net.minecraft.core.block.material.Material;

public class InitBasicBlocks {

	public static Block <?> MUD_BRICKS;
	public static Block <?> MUD_POLISHED;
	public static Block <?> MUD_STAIRS;
	public static Block <?> MUD_SLAB;

	public static Block <?> BONE_PILE;
	public static Block <?> BONE_FENCE;
	public static Block <?> STONE_PILLAR;
	public static Block <?> STONE_FENCE;

	public static Block <?> TORCH_GLOWSTONE;




	public void initBlocks(){

		BlockBuilder weakStoneBuilder = new BlockBuilder(ParaBTA.MOD_ID) //Makes a BlockBuilder type for weak stone blocks, like mud bricks.
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setResistance(5.0F)
			.setBlockItem(ItemBlock::new)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);

		BlockBuilder stoneBuilder = new BlockBuilder(ParaBTA.MOD_ID) //Makes a BlockBuilder type for stone blocks..
			.setBlockSound(BlockSounds.STONE)
			.setHardness(1.5F)
			.setResistance(15.0F)
			.setBlockItem(ItemBlock::new)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);

		BlockBuilder stoneTransBuilder = new BlockBuilder(ParaBTA.MOD_ID) //Makes a BlockBuilder type for non-solid stone blocks..
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setResistance(5.0F)
			.setBlockItem(ItemBlock::new)
			.setLightOpacity(0)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);

		BlockBuilder stoneFenceBuilder = new BlockBuilder(ParaBTA.MOD_ID) //Makes a BlockBuilder type for weak stone fences.
			.setBlockSound(BlockSounds.STONE)
			.setHardness(1.5F)
			.setResistance(15.0F)
			.setBlockItem(ItemBlock::new)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE, BlockTags.FENCES_CONNECT);

		BlockBuilder stoneDoorBuilder = new BlockBuilder(ParaBTA.MOD_ID)
			.setBlockSound(BlockSounds.STONE)
			.setHardness(0.5F)
			.setResistance(5.0F)
			.setBlockItem(ItemBlock::new)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE);

		BlockBuilder glassTorchBuilder = new BlockBuilder(ParaBTA.MOD_ID)
			.setBlockSound(BlockSounds.GLASS)
			.setHardness(0.0F)
			.setResistance(0.0F)
			.setBlockItem(ItemBlock::new)
			.setLightOpacity(0)
			.setLuminance(15)
			.setTags();

		MUD_POLISHED = weakStoneBuilder.build("mud.polished", "baked_mud_polished", 2301, b ->
			new BlockLogic(MUD_POLISHED, Material.stone));
		MUD_BRICKS = weakStoneBuilder.build("mud.bricks", "baked_mud_bricks", 2302, b ->
			new BlockLogic(MUD_BRICKS, Material.stone));
		//Mud building blocks ^^ vv
		MUD_STAIRS = stoneTransBuilder.build("mud.stairs", "baked_mud_stairs", 2303, b ->
			new BlockLogicStairs(MUD_STAIRS, MUD_BRICKS));
		MUD_SLAB = stoneTransBuilder.build("mud.slab", "baked_mud_slab", 2304, b ->
			new BlockLogicSlab(MUD_SLAB, MUD_BRICKS));

		BONE_PILE = weakStoneBuilder.build("bone.pile", "bone_pile", 2305, b ->
			new BlockLogic(BONE_PILE, Material.stone));

		BONE_FENCE = stoneFenceBuilder.build("bone.fence", "bone_fence", 2306, b ->
			new BlockLogicFence(BONE_FENCE));

		STONE_PILLAR = stoneBuilder.build("stone.pillar", "stone_pillar", 2307, b ->
			new BlockLogicFullyRotatable(STONE_PILLAR, Material.stone));

		STONE_FENCE = stoneFenceBuilder.build("stone.fence", "stone_fence", 2308, b ->
			new BlockLogicFence(STONE_FENCE));

		TORCH_GLOWSTONE = glassTorchBuilder.build("glowstone.torch", "glowstone_torch", 2309, b ->
			new BlockLogicSparkleTorch(TORCH_GLOWSTONE));


	}
}
