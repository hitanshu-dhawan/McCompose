package com.hitanshudhawan.mccompose.data

import com.hitanshudhawan.mccompose.model.Menu
import com.hitanshudhawan.mccompose.model.MenuItem

object MenuRepository {

    fun getMenuData(): Menu {
        return Menu(
            categories = CategoriesRepository.getCategoriesData(),
            menuItems = listOf(
                MenuItem(
                    id = 1001,
                    name = "Big Mac",
                    description = "Mouthwatering perfection starts with two 100% pure beef patties and Big Mac sauce sandwiched between a sesame seed bun. It’s topped off with pickles, crisp shredded lettuce, finely chopped onion and American cheese.",
                    image = "big_mac.png",
                    price = 0.00,
                    categoryId = 1
                ),
                MenuItem(
                    id = 1002,
                    name = "Quarter Pounder with Cheese",
                    description = "Each Quarter Pounder with Cheese burger features a ¼ lb. of 100% fresh beef that’s hot, deliciously juicy and cooked when you order. It’s seasoned with just a pinch of salt and pepper, sizzled on a flat iron grill, then topped with slivered onions, tangy pickles and two slices of melty cheese on a sesame seed bun.",
                    image = "quarter_pounder_with_cheese.png",
                    price = 0.00,
                    categoryId = 1
                ),
                MenuItem(
                    id = 1003,
                    name = "Double Quarter Pounder with Cheese",
                    description = "Each Double Quarter Pounder with Cheese features two quarter pound 100% fresh beef burger patties that are hot, deliciously juicy and cooked when you order. McDonald’s beef patties are seasoned with just a pinch of salt and pepper, sizzled on a flat iron grill, then topped with slivered onions, tangy pickles and two slices of melty cheese on a sesame seed bun.",
                    image = "double_quarter_pounder_with_cheese.png",
                    price = 0.00,
                    categoryId = 1
                ),
                MenuItem(
                    id = 1004,
                    name = "Quarter Pounder with Cheese Deluxe",
                    description = "The Quarter Pounder with Cheese Deluxe is a fresh take on a Quarter Pounder classic burger. Crisp leaf lettuce and three Roma tomato slices top a ¼ lb. of 100% McDonald’s fresh beef that’s hot, deliciously juicy and cooked when you order. Seasoned with just a pinch of salt and pepper and sizzled on our flat iron grill. Layered with two slices of melty American cheese, creamy mayo, slivered onions and tangy pickles on a soft, fluffy sesame seed hamburger bun.",
                    image = "quarter_pounder_with_cheese_deluxe.png",
                    price = 0.00,
                    categoryId = 1
                ),
                MenuItem(
                    id = 1005,
                    name = "McDouble",
                    description = "A classic double burger from McDonald’s, the McDouble stacks two 100% pure beef patties seasoned with just a pinch of salt and pepper. It’s topped with tangy pickles, chopped onions, ketchup, mustard and a slice of melty American cheese.",
                    image = "mcdouble.png",
                    price = 0.00,
                    categoryId = 1
                ),
                MenuItem(
                    id = 1006,
                    name = "Quarter Pounder with Cheese Bacon",
                    description = "Each Quarter Pounder with Cheese Bacon burger features thick-cut applewood smoked bacon atop a ¼ lb. of 100% fresh McDonald’s beef that’s cooked when you order. It’s a hot, deliciously juicy bacon cheeseburger, seasoned with just a pinch of salt and pepper and sizzled on our flat iron grill. Layered with two slices of melty American cheese, slivered onions and tangy pickles on a soft, fluffy sesame seed hamburger bun.",
                    image = "quarter_pounder_with_cheese_bacon.png",
                    price = 0.00,
                    categoryId = 1
                ),
                MenuItem(
                    id = 1007,
                    name = "Cheeseburger",
                    description = "Our simple, classic cheeseburger begins with a 100% pure beef patty seasoned with just a pinch of salt and pepper. It's topped with a tangy pickle, chopped onions, ketchup, mustard, and a slice of melty American cheese.",
                    image = "cheeseburger.png",
                    price = 0.00,
                    categoryId = 1
                ),
                MenuItem(
                    id = 1008,
                    name = "Double Cheeseburger",
                    description = "The McDonald’s Double Cheeseburger features two 100% pure beef burger patties seasoned with just a pinch of salt and pepper. It’s topped with tangy pickles, chopped onions, ketchup, mustard and two slices of melty American cheese.",
                    image = "double_cheeseburger.png",
                    price = 0.00,
                    categoryId = 1
                ),
                MenuItem(
                    id = 1009,
                    name = "Hamburger",
                    description = "The original burger starts with a 100% pure beef patty seasoned with just a pinch of salt and pepper, then topped with a tangy pickle, chopped onions, ketchup and mustard.",
                    image = "hamburger.png",
                    price = 0.00,
                    categoryId = 1
                ),
            ),
        )
    }

}