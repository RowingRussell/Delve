package rusty.delve.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import rusty.delve.aether.enchanter.BlockEnchanter;

public class DelveBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block ENCHANTER = new BlockEnchanter("enchanter");
}
