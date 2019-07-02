package com.Octax.GodlyFoods.items.food;

import com.Octax.GodlyFoods.Main;
import com.Octax.GodlyFoods.init.ModItems;
import com.Octax.GodlyFoods.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood implements IHasModel 
{
	
	public FoodBase(String name,int amount , float saturation, boolean 	AlwaysEdible)
	{
		super(amount, saturation, AlwaysEdible);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.FOOD);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void RegisterModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
}
