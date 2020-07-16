package rusty.delve.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import rusty.delve.init.DelveItems;

public class ItemBase extends Item {

	public ItemBase(String name) {
		
		setTranslationKey(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MISC);
		
		DelveItems.ITEMS.add(this);
	}
}
