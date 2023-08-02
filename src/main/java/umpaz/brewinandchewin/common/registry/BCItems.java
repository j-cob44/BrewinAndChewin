package umpaz.brewinandchewin.common.registry;

import umpaz.brewinandchewin.BrewinAndChewin;
import umpaz.brewinandchewin.common.item.BoozeItem;
import umpaz.brewinandchewin.common.item.DreadNogItem;
import umpaz.brewinandchewin.common.properties.BCFoodProperties;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


@SuppressWarnings("unused")
public class BCItems
{
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BrewinAndChewin.MODID);

	// Helper methods
	public static Item.Properties basicItem() {
		return new Item.Properties();
	}

	public static Item.Properties foodItem(FoodProperties food) {
		return new Item.Properties().food(food);
	}

	public static Item.Properties bowlFoodItem(FoodProperties food) {
		return new Item.Properties().food(food).craftRemainder(Items.BOWL).stacksTo(16);
	}

	public static Item.Properties drinkItem() {
		return new Item.Properties().craftRemainder(Items.GLASS_BOTTLE).stacksTo(16);
	}

	public static Item.Properties drinkItemNoItem() {
		return new Item.Properties().craftRemainder(Items.GLASS_BOTTLE).stacksTo(16);
	}

	// START OF ITEM LIST

	public static final RegistryObject<Item> KEG = ITEMS.register("keg",
			() -> new BlockItem(BCBlocks.KEG.get(), basicItem().stacksTo(1)));

	public static final RegistryObject<Item> UNRIPE_FLAXEN_CHEESE_WHEEL = ITEMS.register("unripe_flaxen_cheese_wheel",
			() -> new BlockItem(BCBlocks.UNRIPE_FLAXEN_CHEESE_WHEEL.get(), new Item.Properties().stacksTo(16)));
	public static final RegistryObject<Item> FLAXEN_CHEESE_WHEEL = ITEMS.register("flaxen_cheese_wheel",
			() -> new BlockItem(BCBlocks.FLAXEN_CHEESE_WHEEL.get(), new Item.Properties().stacksTo(16)));
	public static final RegistryObject<Item> UNRIPE_SCARLET_CHEESE_WHEEL = ITEMS.register("unripe_scarlet_cheese_wheel",
			() -> new BlockItem(BCBlocks.UNRIPE_SCARLET_CHEESE_WHEEL.get(), new Item.Properties().stacksTo(16)));
	public static final RegistryObject<Item> SCARLET_CHEESE_WHEEL = ITEMS.register("scarlet_cheese_wheel",
			() -> new BlockItem(BCBlocks.SCARLET_CHEESE_WHEEL.get(), new Item.Properties().stacksTo(16)));

	public static final RegistryObject<Item> FLAXEN_CHEESE_WEDGE = ITEMS.register("flaxen_cheese_wedge",
			() -> new Item(new Item.Properties().food(BCFoodProperties.FLAXEN_CHEESE_WEDGE)));
	public static final RegistryObject<Item> SCARLET_CHEESE_WEDGE = ITEMS.register("scarlet_cheese_wedge",
			() -> new Item(new Item.Properties().food(BCFoodProperties.SCARLET_CHEESE_WEDGE)));

	public static final RegistryObject<Item> CHEESE_PIZZA = ITEMS.register("cheese_pizza",
			() -> new BlockItem(BCBlocks.CHEESE_PIZZA.get(), new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> CHEESE_PIZZA_SLICE = ITEMS.register("cheese_pizza_slice",
			() -> new Item(new Item.Properties().food(BCFoodProperties.CHEESE_PIZZA_SLICE)));

	public static final RegistryObject<Item> SUPREME_PIZZA = ITEMS.register("supreme_pizza",
			() -> new BlockItem(BCBlocks.SUPREME_PIZZA.get(), new Item.Properties().stacksTo(1)));
	public static final RegistryObject<Item> SUPREME_PIZZA_SLICE = ITEMS.register("supreme_pizza_slice",
			() -> new Item(new Item.Properties().food(BCFoodProperties.SUPREME_PIZZA_SLICE)));

	public static final RegistryObject<Item> TANKARD = ITEMS.register("tankard",
			() -> new Item(new Item.Properties()));

	public static final RegistryObject<Item> BEER = ITEMS.register("beer",
			() -> new BoozeItem(1, 8, new Item.Properties().stacksTo(16).craftRemainder(BCItems.TANKARD.get())));
	public static final RegistryObject<Item> VODKA = ITEMS.register("vodka",
			() -> new BoozeItem(1, 12, new Item.Properties().stacksTo(16).craftRemainder(BCItems.TANKARD.get())));
	public static final RegistryObject<Item> MEAD = ITEMS.register("mead",
			() -> new BoozeItem(1, 8, new Item.Properties().food(BCFoodProperties.MEAD).stacksTo(16).craftRemainder(BCItems.TANKARD.get())));
	public static final RegistryObject<Item> RICE_WINE = ITEMS.register("rice_wine",
			() -> new BoozeItem(1, 5, new Item.Properties().food(BCFoodProperties.RICE_WINE).stacksTo(16).craftRemainder(BCItems.TANKARD.get())));
	public static final RegistryObject<Item> EGG_GROG = ITEMS.register("egg_grog",
			() -> new BoozeItem(1, 0, new Item.Properties().food(BCFoodProperties.EGG_GROG).stacksTo(16).craftRemainder(BCItems.TANKARD.get())));
	public static final RegistryObject<Item> STRONGROOT_ALE = ITEMS.register("strongroot_ale",
			() -> new BoozeItem(2, 12, new Item.Properties().food(BCFoodProperties.STRONGROOT_ALE).stacksTo(16).craftRemainder(BCItems.TANKARD.get())));
	public static final RegistryObject<Item> SACCHARINE_RUM = ITEMS.register("saccharine_rum",
			() -> new BoozeItem(2, 8, new Item.Properties().food(BCFoodProperties.SACCHARINE_RUM).stacksTo(16).craftRemainder(BCItems.TANKARD.get())));
	public static final RegistryObject<Item> PALE_JANE = ITEMS.register("pale_jane",
			() -> new BoozeItem(1, 5, new Item.Properties().food(BCFoodProperties.PALE_JANE).stacksTo(16).craftRemainder(BCItems.TANKARD.get())));

	public static final RegistryObject<Item> DREAD_NOG = ITEMS.register("dread_nog",
			() -> new DreadNogItem(3, 5, new Item.Properties().stacksTo(16).craftRemainder(BCItems.TANKARD.get())));

	public static final RegistryObject<Item> SALTY_FOLLY = ITEMS.register("salty_folly",
			() -> new BoozeItem(2, 10, new Item.Properties().food(BCFoodProperties.SALTY_FOLLY).stacksTo(16).craftRemainder(BCItems.TANKARD.get())));
	public static final RegistryObject<Item> STEEL_TOE_STOUT = ITEMS.register("steel_toe_stout",
			() -> new BoozeItem(3, 10, new Item.Properties().food(BCFoodProperties.STEEL_TOE_STOUT).stacksTo(16).craftRemainder(BCItems.TANKARD.get())));
	public static final RegistryObject<Item> GLITTERING_GRENADINE = ITEMS.register("glittering_grenadine",
			() -> new BoozeItem(1, 5, new Item.Properties().food(BCFoodProperties.GLITTERING_GRENADINE).stacksTo(16).craftRemainder(BCItems.TANKARD.get())));
	public static final RegistryObject<Item> BLOODY_MARY = ITEMS.register("bloody_mary",
			() -> new BoozeItem(1, 12, new Item.Properties().food(BCFoodProperties.BLOODY_MARY).stacksTo(16).craftRemainder(BCItems.TANKARD.get())));
	public static final RegistryObject<Item> RED_RUM = ITEMS.register("red_rum",
			() -> new BoozeItem(1, 18, new Item.Properties().food(BCFoodProperties.RED_RUM).stacksTo(16).craftRemainder(BCItems.TANKARD.get())));
	public static final RegistryObject<Item> WITHERING_DROSS = ITEMS.register("withering_dross",
			() -> new BoozeItem(3, 20, new Item.Properties().food(BCFoodProperties.WITHERING_DROSS).stacksTo(16).craftRemainder(BCItems.TANKARD.get())));


	public static final RegistryObject<Item> KIMCHI = ITEMS.register("kimchi",
			() -> new Item(new Item.Properties().food(BCFoodProperties.KIMCHI)));
	public static final RegistryObject<Item> PICKLED_PICKLES = ITEMS.register("pickled_pickles",
			() -> new Item(new Item.Properties().food(BCFoodProperties.PICKLED_PICKLES)));
	public static final RegistryObject<Item> KIPPERS = ITEMS.register("kippers",
			() -> new Item(new Item.Properties().food(BCFoodProperties.KIPPERS)));
	public static final RegistryObject<Item> COCOA_FUDGE = ITEMS.register("cocoa_fudge",
			() -> new Item(new Item.Properties().food(BCFoodProperties.COCOA_FUDGE)));

	public static final RegistryObject<Item> HAM_AND_CHEESE_SANDWICH = ITEMS.register("ham_and_cheese_sandwich",
			() -> new Item(new Item.Properties().food(BCFoodProperties.HAM_AND_CHEESE_SANDWICH)));
	public static final RegistryObject<Item> VEGETABLE_OMELET = ITEMS.register("vegetable_omelet",
			() -> new Item(new Item.Properties().food(BCFoodProperties.VEGETABLE_OMELET)));
	public static final RegistryObject<Item> CHEESY_PASTA = ITEMS.register("cheesy_pasta",
			() -> new Item(new Item.Properties().food(BCFoodProperties.CHEESY_PASTA)));
	public static final RegistryObject<Item> SCARLET_PIEROGIES = ITEMS.register("scarlet_pierogies",
			() -> new Item(new Item.Properties().food(BCFoodProperties.SCARLET_PIEROGIES)));
	public static final RegistryObject<Item> CREAMY_ONION_SOUP = ITEMS.register("creamy_onion_soup",
			() -> new Item(new Item.Properties().food(BCFoodProperties.CREAMY_ONION_SOUP)));
}
