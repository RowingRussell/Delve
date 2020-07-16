package rusty.delve.blocks.ore;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import rusty.delve.init.OreBlocks;
import rusty.delve.init.DelveItems;

public class AetherBase extends Block {

	private String name;
	
	public AetherBase(String name, Material material) {

		super(material);
		this.name = name;
		
		setTranslationKey(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MISC);

		OreBlocks.BLOCKS.add(this);
		DelveItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		
		setSoundType(SoundType.STONE);
		setHardness(10.0F);
		setResistance(20.0F);
		setHarvestLevel("pickaxe", 1);
	}
	
	@Override
	public List<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {

		NonNullList<ItemStack> oreItems = NonNullList.create();
		oreItems.add(OreBlocks.getOreDrop(name));
		return oreItems;
	}
}
