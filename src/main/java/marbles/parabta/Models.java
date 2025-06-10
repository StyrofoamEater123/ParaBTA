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

	}

	@Override
	public void initItemModels(ItemModelDispatcher dispatcher) {
		// If you're not doing anything with item models, just leave it empty.
	}

	@Override
	public void initEntityModels(EntityRenderDispatcher dispatcher) {
		// If you don't need to do anything with entity models, just leave it empty.
	}

	@Override
	public void initTileEntityModels(TileEntityRenderDispatcher dispatcher) {

	}

	@Override
	public void initBlockColors(BlockColorDispatcher dispatcher) {

	}
}
