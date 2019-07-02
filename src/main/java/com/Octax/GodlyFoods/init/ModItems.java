package com.Octax.GodlyFoods.init;

import java.util.List;

import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.potion.PotionEffect;
import java.util.ArrayList;
import com.Octax.GodlyFoods.items.ItemBase;
import com.Octax.GodlyFoods.items.food.FoodBase;
import com.Octax.GodlyFoods.items.food.FoodEffectBase;

public class ModItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item AVOCADO = new ItemBase("avocado");
	public static final Item SALT = new ItemBase("salt");
	public static final Item SUSHI = new ItemBase("sushi");
	public static final Item BOILED_EGG = new ItemBase("boiled_egg");
	public static final Item FRIED_EGG = new ItemBase("fried_egg");
	public static final Item RICE = new ItemBase("rice");
	public static final Item RAMEN = new ItemBase("ramen");
	public static final Item DOUGHNUT = new FoodEffectBase("doughnut", 16, 3f, true, new PotionEffect(MobEffects.SPEED, (60*20), 2, false, true));
	public static final Item BUBBLE_GUM = new FoodEffectBase("bubble_gum", 8, 1f, true, new PotionEffect(MobEffects.JUMP_BOOST, (30*20), 2, false, true));
	
}
