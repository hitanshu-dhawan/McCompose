package com.hitanshudhawan.mccompose.data

import com.hitanshudhawan.mccompose.data.MenuRepository.getRandomPrice
import com.hitanshudhawan.mccompose.model.Home
import com.hitanshudhawan.mccompose.model.MenuItem
import com.hitanshudhawan.mccompose.model.User

object HomeRepository {

    fun getHomeData(): Home {
        return Home(
            user = User(
                name = "Dhawan"
            ),
            categories = CategoriesRepository.getCategoriesData(),
            popularMenuItems = listOf(
                MenuItem(
                    id = 4001,
                    name = "Big Mac Combo Meal",
                    description = "The one and only McDonald’s Big Mac Combo Meal. Big Mac Ingredients include a classic sesame hamburger bun, Big Mac Sauce, American cheese and sliced pickles. The Big Mac Combo Meal is served with our World Famous Fries and your choice of an icy Coca-Cola fountain drink.",
                    image = "https://raw.githubusercontent.com/hitanshu-dhawan/McCompose/main/app/src/main/res/drawable-nodpi/" + "menu_item_big_mac_combo_meal.png",
                    price = getRandomPrice(),
                    categoryId = 4
                ),
                MenuItem(
                    id = 4002,
                    name = "Cheeseburger Combo Meal",
                    description = "Our Cheeseburger Combo Meal is a simple, satisfying classic McDonald’s 100% beef burger, served with our World Famous Fries and your choice of a Medium McDonald’s soda or soft drink.",
                    image = "https://raw.githubusercontent.com/hitanshu-dhawan/McCompose/main/app/src/main/res/drawable-nodpi/" + "menu_item_cheeseburger_combo_meal.png",
                    price = getRandomPrice(),
                    categoryId = 4
                ),
                MenuItem(
                    id = 4004,
                    name = "Double Quarter Pounder with Cheese Meal",
                    description = "Get double the fresh beef flavor with a Double Quarter Pounder with Cheese made with fresh beef that’s cooked when you order. Served with our World Famous Fries and your choice of an icy soft drink.",
                    image = "https://raw.githubusercontent.com/hitanshu-dhawan/McCompose/main/app/src/main/res/drawable-nodpi/" + "menu_item_double_quarter_pounder_with_cheese_meal.png",
                    price = getRandomPrice(),
                    categoryId = 4
                ),
                MenuItem(
                    id = 4005,
                    name = "10 piece Chicken McNuggets Meal",
                    description = "Enjoy 10 tender and delicious Chicken McNuggets made with all white meat chicken—plus our World Famous Fries and your choice of a Medium McDonald’s drink with the 10 Piece McNuggets for the ultimate McDonald’s Combo Meal.",
                    image = "https://raw.githubusercontent.com/hitanshu-dhawan/McCompose/main/app/src/main/res/drawable-nodpi/" + "menu_item_ten_piece_chicken_mcnuggets_meal.png",
                    price = getRandomPrice(),
                    categoryId = 4
                ),
//                MenuItem(
//                    id = 1001,
//                    name = "Big Mac",
//                    description = "Mouthwatering perfection starts with two 100% pure beef patties and Big Mac sauce sandwiched between a sesame seed bun. It’s topped off with pickles, crisp shredded lettuce, finely chopped onion and American cheese.",
//                    image = "https://raw.githubusercontent.com/hitanshu-dhawan/McCompose/main/app/src/main/res/drawable-nodpi/" + "menu_item_big_mac.png",
//                    price = getRandomPrice(),
//                    categoryId = 1
//                ),
//                MenuItem(
//                    id = 1003,
//                    name = "Double Quarter Pounder with Cheese",
//                    description = "Each Double Quarter Pounder with Cheese features two quarter pound 100% fresh beef burger patties that are hot, deliciously juicy and cooked when you order. McDonald’s beef patties are seasoned with just a pinch of salt and pepper, sizzled on a flat iron grill, then topped with slivered onions, tangy pickles and two slices of melty cheese on a sesame seed bun.",
//                    image = "https://raw.githubusercontent.com/hitanshu-dhawan/McCompose/main/app/src/main/res/drawable-nodpi/" + "menu_item_double_quarter_pounder_with_cheese.png",
//                    price = getRandomPrice(),
//                    categoryId = 1
//                ),
                MenuItem(
                    id = 5001,
                    name = "Hamburger Happy Meal",
                    description = "A juicy hamburger with kid-sized World Famous Fries and your choice of a Happy Meal side: Apple Slices or Yoplait GO-GURT Low Fat Strawberry Yogurt. Then pick a kids’ drink: 1% Low Fat Milk Jug, DASANI Water or Honest Kids Appley Ever After Organic Juice Drink.",
                    image = "https://raw.githubusercontent.com/hitanshu-dhawan/McCompose/main/app/src/main/res/drawable-nodpi/" + "menu_item_hamburger_happy_meal.png",
                    price = getRandomPrice(),
                    categoryId = 5
                ),
                MenuItem(
                    id = 6002,
                    name = "Hot Fudge Sundae",
                    description = "Our classic hot fudge sundae is made with creamy vanilla soft serve and smothered in chocolaty hot fudge topping.",
                    image = "https://raw.githubusercontent.com/hitanshu-dhawan/McCompose/main/app/src/main/res/drawable-nodpi/" + "menu_item_hot_fudge_sundae.png",
                    price = getRandomPrice(),
                    categoryId = 6
                ),
//                MenuItem(
//                    id = 6006,
//                    name = "McFlurry with OREO Cookies",
//                    description = "The McDonald’s McFlurry with OREO Cookies is an popular combination of OREO pieces and vanilla soft serve!",
//                    image = "https://raw.githubusercontent.com/hitanshu-dhawan/McCompose/main/app/src/main/res/drawable-nodpi/" + "menu_item_mcflurry_with_oreo_cookies.png",
//                    price = getRandomPrice(),
//                    categoryId = 6
//                ),
            ),
            recommendedMenuItems = listOf(
                MenuItem(
                    id = 4001,
                    name = "Big Mac Combo Meal",
                    description = "The one and only McDonald’s Big Mac Combo Meal. Big Mac Ingredients include a classic sesame hamburger bun, Big Mac Sauce, American cheese and sliced pickles. The Big Mac Combo Meal is served with our World Famous Fries and your choice of an icy Coca-Cola fountain drink.",
                    image = "https://raw.githubusercontent.com/hitanshu-dhawan/McCompose/main/app/src/main/res/drawable-nodpi/" + "menu_item_big_mac_combo_meal.png",
                    price = getRandomPrice(),
                    categoryId = 4
                ),
                MenuItem(
                    id = 4004,
                    name = "Double Quarter Pounder with Cheese Meal",
                    description = "Get double the fresh beef flavor with a Double Quarter Pounder with Cheese made with fresh beef that’s cooked when you order. Served with our World Famous Fries and your choice of an icy soft drink.",
                    image = "https://raw.githubusercontent.com/hitanshu-dhawan/McCompose/main/app/src/main/res/drawable-nodpi/" + "menu_item_double_quarter_pounder_with_cheese_meal.png",
                    price = getRandomPrice(),
                    categoryId = 4
                ),
                MenuItem(
                    id = 4006,
                    name = "Filet-O-Fish Meal",
                    description = "A classic fish sandwich value meal made with wild-caught Alaskan Pollock on a regular McDonald’s bun, served with our World Famous Fries and your choice of an icy soft drink. Enjoy a Filet-O-Fish Meal today.",
                    image = "https://raw.githubusercontent.com/hitanshu-dhawan/McCompose/main/app/src/main/res/drawable-nodpi/" + "menu_item_filet_o_fish_meal.png",
                    price = getRandomPrice(),
                    categoryId = 4
                ),
//                MenuItem(
//                    id = 1004,
//                    name = "Quarter Pounder with Cheese Deluxe",
//                    description = "The Quarter Pounder with Cheese Deluxe is a fresh take on a Quarter Pounder classic burger. Crisp leaf lettuce and three Roma tomato slices top a ¼ lb. of 100% McDonald’s fresh beef that’s hot, deliciously juicy and cooked when you order. Seasoned with just a pinch of salt and pepper and sizzled on our flat iron grill. Layered with two slices of melty American cheese, creamy mayo, slivered onions and tangy pickles on a soft, fluffy sesame seed hamburger bun.",
//                    image = "https://raw.githubusercontent.com/hitanshu-dhawan/McCompose/main/app/src/main/res/drawable-nodpi/" + "menu_item_quarter_pounder_with_cheese_deluxe.png",
//                    price = getRandomPrice(),
//                    categoryId = 1
//                ),
//                MenuItem(
//                    id = 1006,
//                    name = "Quarter Pounder with Cheese Bacon",
//                    description = "Each Quarter Pounder with Cheese Bacon burger features thick-cut applewood smoked bacon atop a ¼ lb. of 100% fresh McDonald’s beef that’s cooked when you order. It’s a hot, deliciously juicy bacon cheeseburger, seasoned with just a pinch of salt and pepper and sizzled on our flat iron grill. Layered with two slices of melty American cheese, slivered onions and tangy pickles on a soft, fluffy sesame seed hamburger bun.",
//                    image = "https://raw.githubusercontent.com/hitanshu-dhawan/McCompose/main/app/src/main/res/drawable-nodpi/" + "menu_item_quarter_pounder_with_cheese_bacon.png",
//                    price = getRandomPrice(),
//                    categoryId = 1
//                ),
                MenuItem(
                    id = 2002,
                    name = "Medium French Fries",
                    description = "Our World Famous Fries are made with premium potatoes such as the Russet Burbank and the Shepody. With 0g of trans fat per labeled serving, these epic fries are crispy and golden on the outside and fluffy on the inside.",
                    image = "https://raw.githubusercontent.com/hitanshu-dhawan/McCompose/main/app/src/main/res/drawable-nodpi/" + "menu_item_medium_french_fries.png",
                    price = getRandomPrice(),
                    categoryId = 2
                ),
//                MenuItem(
//                    id = 3005,
//                    name = "Chocolate Shake",
//                    description = "Chocolate Shake featuring our deliciously creamy vanilla soft serve and chocolate syrup, topped with whipped topping.",
//                    image = "https://raw.githubusercontent.com/hitanshu-dhawan/McCompose/main/app/src/main/res/drawable-nodpi/" + "menu_item_chocolate_shake.png",
//                    price = getRandomPrice(),
//                    categoryId = 3
//                ),
                MenuItem(
                    id = 3008,
                    name = "McCafé Hot Chocolate",
                    description = "Taste the delicious chocolaty flavor of a McCafé hot chocolate. Hot chocolate made with steamed whole or nonfat milk, rich chocolate syrup, and topped with whipped topping and chocolate drizzle.",
                    image = "https://raw.githubusercontent.com/hitanshu-dhawan/McCompose/main/app/src/main/res/drawable-nodpi/" + "menu_item_mccafe_hot_chocolate.png",
                    price = getRandomPrice(),
                    categoryId = 3
                ),
//                MenuItem(
//                    id = 3012,
//                    name = "Minute Maid Blue Raspberry Slushie",
//                    description = "Turn up summer with this Minute Maid Blue Raspberry Slushie, full of sweet, fruity blue raspberry flavor, available only at McDonald’s.",
//                    image = "https://raw.githubusercontent.com/hitanshu-dhawan/McCompose/main/app/src/main/res/drawable-nodpi/" + "menu_item_minute_maid_blue_raspberry_slushie.png",
//                    price = getRandomPrice(),
//                    categoryId = 3
//                ),
//                MenuItem(
//                    id = 6003,
//                    name = "McFlurry with M&M'S Candies",
//                    description = "The McDonald’s M&M McFlurry is a sweet, creamy M&M’S dessert of vanilla soft serve with M&M’S chocolate candies swirled in.",
//                    image = "https://raw.githubusercontent.com/hitanshu-dhawan/McCompose/main/app/src/main/res/drawable-nodpi/" + "menu_item_mcflurry_with_m_and_m_candies.png",
//                    price = getRandomPrice(),
//                    categoryId = 6
//                ),
//                MenuItem(
//                    id = 6007,
//                    name = "Baked Apple Pie",
//                    description = "McDonald's Baked Apple Pie is loaded with 100% American-grown apples, with a lattice crust baked to perfection and topped with sprinkled sugar.",
//                    image = "https://raw.githubusercontent.com/hitanshu-dhawan/McCompose/main/app/src/main/res/drawable-nodpi/" + "menu_item_baked_apple_pie.png",
//                    price = getRandomPrice(),
//                    categoryId = 6
//                ),
            )
        )
    }

}
