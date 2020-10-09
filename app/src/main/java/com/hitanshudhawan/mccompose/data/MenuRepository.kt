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
                    image = "https://raw.githubusercontent.com/DumbPolyglotProgrammer/PigGame/master/images/" + "big_mac.png",
                    price = 0.00,
                    categoryId = 1
                ),
                MenuItem(
                    id = 1002,
                    name = "Quarter Pounder with Cheese",
                    description = "Each Quarter Pounder with Cheese burger features a ¼ lb. of 100% fresh beef that’s hot, deliciously juicy and cooked when you order. It’s seasoned with just a pinch of salt and pepper, sizzled on a flat iron grill, then topped with slivered onions, tangy pickles and two slices of melty cheese on a sesame seed bun.",
                    image = "https://raw.githubusercontent.com/DumbPolyglotProgrammer/PigGame/master/images/" + "quarter_pounder_with_cheese.png",
                    price = 0.00,
                    categoryId = 1
                ),
                MenuItem(
                    id = 1003,
                    name = "Double Quarter Pounder with Cheese",
                    description = "Each Double Quarter Pounder with Cheese features two quarter pound 100% fresh beef burger patties that are hot, deliciously juicy and cooked when you order. McDonald’s beef patties are seasoned with just a pinch of salt and pepper, sizzled on a flat iron grill, then topped with slivered onions, tangy pickles and two slices of melty cheese on a sesame seed bun.",
                    image = "https://raw.githubusercontent.com/DumbPolyglotProgrammer/PigGame/master/images/" + "double_quarter_pounder_with_cheese.png",
                    price = 0.00,
                    categoryId = 1
                ),
                MenuItem(
                    id = 1004,
                    name = "Quarter Pounder with Cheese Deluxe",
                    description = "The Quarter Pounder with Cheese Deluxe is a fresh take on a Quarter Pounder classic burger. Crisp leaf lettuce and three Roma tomato slices top a ¼ lb. of 100% McDonald’s fresh beef that’s hot, deliciously juicy and cooked when you order. Seasoned with just a pinch of salt and pepper and sizzled on our flat iron grill. Layered with two slices of melty American cheese, creamy mayo, slivered onions and tangy pickles on a soft, fluffy sesame seed hamburger bun.",
                    image = "https://raw.githubusercontent.com/DumbPolyglotProgrammer/PigGame/master/images/" + "quarter_pounder_with_cheese_deluxe.png",
                    price = 0.00,
                    categoryId = 1
                ),
                MenuItem(
                    id = 1005,
                    name = "McDouble",
                    description = "A classic double burger from McDonald’s, the McDouble stacks two 100% pure beef patties seasoned with just a pinch of salt and pepper. It’s topped with tangy pickles, chopped onions, ketchup, mustard and a slice of melty American cheese.",
                    image = "https://raw.githubusercontent.com/DumbPolyglotProgrammer/PigGame/master/images/" + "mcdouble.png",
                    price = 0.00,
                    categoryId = 1
                ),
                MenuItem(
                    id = 1006,
                    name = "Quarter Pounder with Cheese Bacon",
                    description = "Each Quarter Pounder with Cheese Bacon burger features thick-cut applewood smoked bacon atop a ¼ lb. of 100% fresh McDonald’s beef that’s cooked when you order. It’s a hot, deliciously juicy bacon cheeseburger, seasoned with just a pinch of salt and pepper and sizzled on our flat iron grill. Layered with two slices of melty American cheese, slivered onions and tangy pickles on a soft, fluffy sesame seed hamburger bun.",
                    image = "https://raw.githubusercontent.com/DumbPolyglotProgrammer/PigGame/master/images/" + "quarter_pounder_with_cheese_bacon.png",
                    price = 0.00,
                    categoryId = 1
                ),
                MenuItem(
                    id = 1007,
                    name = "Cheeseburger",
                    description = "Our simple, classic cheeseburger begins with a 100% pure beef patty seasoned with just a pinch of salt and pepper. It's topped with a tangy pickle, chopped onions, ketchup, mustard, and a slice of melty American cheese.",
                    image = "https://raw.githubusercontent.com/DumbPolyglotProgrammer/PigGame/master/images/" + "cheeseburger.png",
                    price = 0.00,
                    categoryId = 1
                ),
                MenuItem(
                    id = 1008,
                    name = "Double Cheeseburger",
                    description = "The McDonald’s Double Cheeseburger features two 100% pure beef burger patties seasoned with just a pinch of salt and pepper. It’s topped with tangy pickles, chopped onions, ketchup, mustard and two slices of melty American cheese.",
                    image = "https://raw.githubusercontent.com/DumbPolyglotProgrammer/PigGame/master/images/" + "double_cheeseburger.png",
                    price = 0.00,
                    categoryId = 1
                ),
                MenuItem(
                    id = 1009,
                    name = "Hamburger",
                    description = "The original burger starts with a 100% pure beef patty seasoned with just a pinch of salt and pepper, then topped with a tangy pickle, chopped onions, ketchup and mustard.",
                    image = "https://raw.githubusercontent.com/DumbPolyglotProgrammer/PigGame/master/images/" + "hamburger.png",
                    price = 0.00,
                    categoryId = 1
                ),
                MenuItem(
                    id = 1010,
                    name = "McChicken",
                    description = "The McChicken is a delightfully crispy chicken sandwich with a crispy chicken fillet topped with mayonnaise, shredded iceberg lettuce, and served on a perfectly toasty bun.",
                    image = "https://raw.githubusercontent.com/DumbPolyglotProgrammer/PigGame/master/images/" + "mcchicken.png",
                    price = 0.00,
                    categoryId = 1
                ),
                MenuItem(
                    id = 1011,
                    name = "Filet-O-Fish",
                    description = "Dive into our wild-caught Filet-O-Fish! Sourced from sustainable fisheries, topped with melty American cheese and creamy tartar sauce, and served on a soft, steamed bun.",
                    image = "https://raw.githubusercontent.com/DumbPolyglotProgrammer/PigGame/master/images/" + "filet_o_fish.png",
                    price = 0.00,
                    categoryId = 1
                ),
                MenuItem(
                    id = 2001,
                    name = "Small French Fries",
                    description = "Our World Famous Fries are made with premium potatoes such as the Russet Burbank and the Shepody. With 0g of trans fat per labeled serving, these epic fries are crispy and golden on the outside and fluffy on the inside.",
                    image = "https://raw.githubusercontent.com/DumbPolyglotProgrammer/PigGame/master/images/" + "small_french_fries.png",
                    price = 0.00,
                    categoryId = 2
                ),
                MenuItem(
                    id = 2002,
                    name = "Medium French Fries",
                    description = "Our World Famous Fries are made with premium potatoes such as the Russet Burbank and the Shepody. With 0g of trans fat per labeled serving, these epic fries are crispy and golden on the outside and fluffy on the inside.",
                    image = "https://raw.githubusercontent.com/DumbPolyglotProgrammer/PigGame/master/images/" + "medium_french_fries.png",
                    price = 0.00,
                    categoryId = 2
                ),
                MenuItem(
                    id = 2003,
                    name = "Large French Fries",
                    description = "Our World Famous Fries are made with premium potatoes such as the Russet Burbank and the Shepody. With 0g of trans fat per labeled serving, these epic fries are crispy and golden on the outside and fluffy on the inside.",
                    image = "https://raw.githubusercontent.com/DumbPolyglotProgrammer/PigGame/master/images/" + "large_french_fries.png",
                    price = 0.00,
                    categoryId = 2
                ),
                MenuItem(
                    id = 3001,
                    name = "Coca-Cola",
                    description = "Coca-Cola is a refreshing McDonald's soda option that complements all of your menu favorites.",
                    image = "https://raw.githubusercontent.com/DumbPolyglotProgrammer/PigGame/master/images/" + "coca_cola.png",
                    price = 0.00,
                    categoryId = 3
                ),
                MenuItem(
                    id = 3002,
                    name = "Sprite",
                    description = "Sprite fountain drink has a delicious lemon-lime taste.",
                    image = "https://raw.githubusercontent.com/DumbPolyglotProgrammer/PigGame/master/images/" + "sprite.png",
                    price = 0.00,
                    categoryId = 3
                ),
                MenuItem(
                    id = 3003,
                    name = "Fanta Orange",
                    description = "Fanta Orange full of bubbly, refreshing orange flavor.",
                    image = "https://raw.githubusercontent.com/DumbPolyglotProgrammer/PigGame/master/images/" + "fanta_orange.png",
                    price = 0.00,
                    categoryId = 3
                ),
                MenuItem(
                    id = 3004,
                    name = "Diet Coke",
                    description = "Icy cold Diet Coke, with zero calories.",
                    image = "https://raw.githubusercontent.com/DumbPolyglotProgrammer/PigGame/master/images/" + "diet_coke.png",
                    price = 0.00,
                    categoryId = 3
                ),
                MenuItem(
                    id = 3005,
                    name = "Chocolate Shake",
                    description = "Chocolate Shake featuring our deliciously creamy vanilla soft serve and chocolate syrup, topped with whipped topping.",
                    image = "https://raw.githubusercontent.com/DumbPolyglotProgrammer/PigGame/master/images/" + "chocolate_shake.png",
                    price = 0.00,
                    categoryId = 3
                ),
                MenuItem(
                    id = 3006,
                    name = "Vanilla Shake",
                    description = "The classic vanilla shake from McDonald’s. It’s made with our creamy vanilla soft serve and topped with whipped topping for a cool, tasty treat.",
                    image = "https://raw.githubusercontent.com/DumbPolyglotProgrammer/PigGame/master/images/" + "vanilla_shake.png",
                    price = 0.00,
                    categoryId = 3
                ),
                MenuItem(
                    id = 3007,
                    name = "Strawberry Shake",
                    description = "Strawberry Shake made with creamy vanilla soft serve, blended with strawberry flavored deliciousness, topped with whipped topping.",
                    image = "https://raw.githubusercontent.com/DumbPolyglotProgrammer/PigGame/master/images/" + "strawberry_shake.png",
                    price = 0.00,
                    categoryId = 3
                ),
                MenuItem(
                    id = 3008,
                    name = "McCafé Hot Chocolate",
                    description = "Taste the delicious chocolaty flavor of a McCafé hot chocolate. Hot chocolate made with steamed whole or nonfat milk, rich chocolate syrup, and topped with whipped topping and chocolate drizzle.",
                    image = "https://raw.githubusercontent.com/DumbPolyglotProgrammer/PigGame/master/images/" + "mccafe_hot_chocolate.png",
                    price = 0.00,
                    categoryId = 3
                ),
                MenuItem(
                    id = 3009,
                    name = "Iced Tea",
                    description = "A refreshing drink of McDonald’s Iced Tea, freshly brewed with a brisk blend of orange pekoe and pekoe cut black tea, served ice cold.",
                    image = "https://raw.githubusercontent.com/DumbPolyglotProgrammer/PigGame/master/images/" + "iced_tea.png",
                    price = 0.00,
                    categoryId = 3
                ),
                MenuItem(
                    id = 3010,
                    name = "Minute Maid Premium Orange Juice",
                    description = "100% orange juice, packed with Vitamin C. Available in Small, Medium and Large.",
                    image = "https://raw.githubusercontent.com/DumbPolyglotProgrammer/PigGame/master/images/" + "minute_maid_premium_orange_juice.png",
                    price = 0.00,
                    categoryId = 3
                ),
                MenuItem(
                    id = 3011,
                    name = "Minute Maid Fruit Punch Slushie",
                    description = "Turn up summer with this fruit punch slushie made with crushed ice and blended with Minute Maid fruit punch flavor, available only at McDonald’s.",
                    image = "https://raw.githubusercontent.com/DumbPolyglotProgrammer/PigGame/master/images/" + "minute_maid_fruit_punch_slushie.png",
                    price = 0.00,
                    categoryId = 3
                ),
                MenuItem(
                    id = 3012,
                    name = "Minute Maid Blue Raspberry Slushie",
                    description = "Turn up summer with this Minute Maid Blue Raspberry Slushie, full of sweet, fruity blue raspberry flavor, available only at McDonald’s.",
                    image = "https://raw.githubusercontent.com/DumbPolyglotProgrammer/PigGame/master/images/" + "minute_maid_blue_raspberry_slushie.png",
                    price = 0.00,
                    categoryId = 3
                ),
                MenuItem(
                    id = 3013,
                    name = "Minute Maid Pink Lemonade Slushie",
                    description = "Sip a Minute Maid Pink Lemonade Slushie at McDonald's! Minute Maid Pink Lemonade is the newest addition to our lineup of McDonald's slushie flavors!",
                    image = "https://raw.githubusercontent.com/DumbPolyglotProgrammer/PigGame/master/images/" + "minute_maid_pink_lemonade_slushie.png",
                    price = 0.00,
                    categoryId = 3
                ),
                MenuItem(
                    id = 4001,
                    name = "Big Mac Combo Meal",
                    description = "The one and only McDonald’s Big Mac Combo Meal. Big Mac Ingredients include a classic sesame hamburger bun, Big Mac Sauce, American cheese and sliced pickles. The Big Mac Combo Meal is served with our World Famous Fries and your choice of an icy Coca-Cola fountain drink.",
                    image = "https://raw.githubusercontent.com/DumbPolyglotProgrammer/PigGame/master/images/" + "big_mac_combo_meal.png",
                    price = 0.00,
                    categoryId = 4
                ),
                MenuItem(
                    id = 4002,
                    name = "Cheeseburger Combo Meal",
                    description = "Our Cheeseburger Combo Meal is a simple, satisfying classic McDonald’s 100% beef burger, served with our World Famous Fries and your choice of a Medium McDonald’s soda or soft drink.",
                    image = "https://raw.githubusercontent.com/DumbPolyglotProgrammer/PigGame/master/images/" + "cheeseburger_combo_meal.png",
                    price = 0.00,
                    categoryId = 4
                ),
                MenuItem(
                    id = 4003,
                    name = "Quarter Pounder with Cheese Meal",
                    description = "Refuel with a Quarter Pounder with Cheese made with fresh beef that’s cooked when you order. The Quarter Pounder with Cheese Combo Meal is served with our World Famous Fries and your choice of an icy medium fountain drink.",
                    image = "https://raw.githubusercontent.com/DumbPolyglotProgrammer/PigGame/master/images/" + "quarter_pounder_with_cheese_meal.png",
                    price = 0.00,
                    categoryId = 4
                ),
                MenuItem(
                    id = 4004,
                    name = "Double Quarter Pounder with Cheese Meal",
                    description = "Get double the fresh beef flavor with a Double Quarter Pounder with Cheese made with fresh beef that’s cooked when you order. Served with our World Famous Fries and your choice of an icy soft drink.",
                    image = "https://raw.githubusercontent.com/DumbPolyglotProgrammer/PigGame/master/images/" + "double_quarter_pounder_with_cheese_meal.png",
                    price = 0.00,
                    categoryId = 4
                ),
                MenuItem(
                    id = 4005,
                    name = "10 piece Chicken McNuggets Meal",
                    description = "Enjoy 10 tender and delicious Chicken McNuggets made with all white meat chicken—plus our World Famous Fries and your choice of a Medium McDonald’s drink with the 10 Piece McNuggets for the ultimate McDonald’s Combo Meal.",
                    image = "https://raw.githubusercontent.com/DumbPolyglotProgrammer/PigGame/master/images/" + "ten_piece_chicken_mcnuggets_meal.png",
                    price = 0.00,
                    categoryId = 4
                ),
                MenuItem(
                    id = 4006,
                    name = "Filet-O-Fish Meal",
                    description = "A classic fish sandwich value meal made with wild-caught Alaskan Pollock on a regular McDonald’s bun, served with our World Famous Fries and your choice of an icy soft drink. Enjoy a Filet-O-Fish Meal today.",
                    image = "https://raw.githubusercontent.com/DumbPolyglotProgrammer/PigGame/master/images/" + "filet_o_fish_meal.png",
                    price = 0.00,
                    categoryId = 4
                ),
            ),
        )
    }

}