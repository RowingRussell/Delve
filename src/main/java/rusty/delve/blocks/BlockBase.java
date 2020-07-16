package rusty.delve.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import rusty.delve.init.DelveBlocks;
import rusty.delve.init.DelveItems;

public class BlockBase extends Block {

	public BlockBase(String name, Material material) {

		super(material);
		
		setTranslationKey(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MISC);

		DelveBlocks.BLOCKS.add(this);
		DelveItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
}