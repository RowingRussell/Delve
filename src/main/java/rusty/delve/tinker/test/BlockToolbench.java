package rusty.delve.tinker.test;

import net.dries007.tfc.api.types.Metal;
import net.dries007.tfc.objects.blocks.metal.BlockAnvilTFC;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.properties.PropertyDirection;

public class BlockToolbench extends BlockAnvilTFC {

	public static final PropertyDirection FACING = BlockHorizontal.FACING;
	
	public BlockToolbench(Metal metal) {
		
		super(metal);
	}
}
