package marbles.parabta;

import net.minecraft.client.render.EntityRenderDispatcher;
import net.minecraft.client.render.TileEntityRenderDispatcher;
import net.minecraft.client.render.block.color.BlockColorDispatcher;
import net.minecraft.client.render.block.model.*;
import net.minecraft.core.util.helper.Side;
import turniplabs.halplibe.helper.ModelHelper;
import turniplabs.halplibe.util.ModelEntrypoint;
import net.minecraft.client.render.item.model.ItemModelDispatcher;


public class Models implements ModelEntrypoint{
	@Override
	public void initBlockModels(BlockModelDispatcher dispatcher){
		ModelHelper.setBlockModel(InitBasicBlocks.MUD_POLISHED, () -> new BlockModelStandard(InitBasicBlocks.MUD_POLISHED)
			.setTex(0,"parabta:block/mud_polished", Side.sides));

		ModelHelper.setBlockModel(InitBasicBlocks.MUD_BRICKS, () -> new BlockModelStandard(InitBasicBlocks.MUD_BRICKS)
			.setTex(0,"parabta:block/mud_bricks", Side.sides));

		ModelHelper.setBlockModel(InitBasicBlocks.BONE_PILE, () -> new BlockModelStandard(InitBasicBlocks.BONE_PILE)
			.setTex(0,"parabta:block/bonepile", Side.sides));

		ModelHelper.setBlockModel(InitBasicBlocks.BONE_FENCE, () -> new BlockModelFence(InitBasicBlocks.BONE_FENCE)
			.setTex(0,"parabta:block/bone_fence", Side.sides));

	}

	@Override
	public void initItemModels(ItemModelDispatcher dispatcher) {
	}

	@Override
	public void initEntityModels(EntityRenderDispatcher dispatcher) {
	}

	@Override
	public void initTileEntityModels(TileEntityRenderDispatcher dispatcher) {

	}

	@Override
	public void initBlockColors(BlockColorDispatcher dispatcher) {

	}
}
