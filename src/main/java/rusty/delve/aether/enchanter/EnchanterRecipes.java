package rusty.delve.aether.enchanter;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import rusty.delve.init.DelveItems;

public class EnchanterRecipes {

	private static final EnchanterRecipes INSTANCE = new EnchanterRecipes();

	private static final List<List<ItemStack>> RECIPES = new ArrayList<List<ItemStack>>();
	
	public static EnchanterRecipes getInstance() {
		return INSTANCE;
	}
	
	//Recipes
	private EnchanterRecipes() {
		
		addEnchantingRecipe(new ItemStack(DelveItems.AETHERFLUX_CRYSTAL), 
							new ItemStack(DelveItems.AETHERFLUX), 
							new ItemStack(DelveItems.AETHERFLUX),
							new ItemStack(DelveItems.AETHERFLUX),
							new ItemStack(DelveItems.AETHERFLUX));
	}
	
	public void addEnchantingRecipe(ItemStack result, ItemStack input1, ItemStack input2, ItemStack input3, ItemStack input4) 
	{
		List<ItemStack> newRecipe = new ArrayList<ItemStack>();
		newRecipe.add(result);
		newRecipe.add(input1);
		newRecipe.add(input2);
		newRecipe.add(input3);
		newRecipe.add(input4);
		RECIPES.add(newRecipe);
	}
	
	public ItemStack getEnchantingResult(ItemStack input1, ItemStack input2, ItemStack input3, ItemStack input4) 
	{
		for(List<ItemStack> recipe : RECIPES) 
		{
			System.out.println("getEnchantingResult");
			if(compareItemStacks(input1, recipe.get(1)))
			{
				System.out.println("input 1");
				if(compareItemStacks(input2, recipe.get(2)))
				{
					System.out.println("input 2");
					if(compareItemStacks(input3, recipe.get(3)))
					{
						System.out.println("input 3");
						if(compareItemStacks(input4, recipe.get(4)))
						{
							System.out.println("input 4");
							return recipe.get(0);
						}
					}
				}
			}
		}
			/*List<ItemStack> temp = recipe;
			
			for(int i = 1; i < 5; i++)
			{
				if(compareItemStacks(input1, recipe.get(i)))
				{
					recipe.remove(i);
					
					for(int j = 1; j < 4; j++)
					{
						if(compareItemStacks(input2, recipe.get(j)))
						{
							recipe.remove(j);
							
							for(int k = 1; k < 3; k++)
							{
								if(compareItemStacks(input3, recipe.get(k)))
								{
									recipe.remove(k);
									
									if(compareItemStacks(input4, recipe.get(1)))
									{
										return recipe.get(0);
									}
								}
							}
						}
					}
				}
			}
			recipe = temp;
		}*/
		return new ItemStack(Blocks.OBSIDIAN);
	}
	
	private boolean compareItemStacks(ItemStack stack1, ItemStack stack2) {
		return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack2.getMetadata());
	}
	
	public List<List<ItemStack>> getEnchantingList(){
		return EnchanterRecipes.RECIPES;
	}
}
