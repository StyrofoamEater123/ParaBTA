package marbles.parabta;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.EntityRenderDispatcher;
import net.minecraft.client.render.TileEntityRenderDispatcher;
import net.minecraft.client.render.block.color.BlockColorDispatcher;
import net.minecraft.client.render.block.model.*;
import net.minecraft.client.render.item.model.ItemModelDispatcher;
import net.minecraft.core.util.helper.Side;
import turniplabs.halplibe.helper.ModelHelper;
import turniplabs.halplibe.util.ModelEntrypoint;

public class blockModels {
	public void initBlockModels(){
		ModelHelper.setBlockModel(initBasicBlocks.MUD_POLISHED,
			() -> new BlockModelStandard<>(initBasicBlocks.MUD_POLISHED)
				.setTex(0,"parabta:block/mud_polished", Side.sides)
		);
	}
}
