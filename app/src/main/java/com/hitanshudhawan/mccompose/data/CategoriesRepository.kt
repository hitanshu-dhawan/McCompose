package com.hitanshudhawan.mccompose.data

import com.hitanshudhawan.mccompose.model.Category

object CategoriesRepository {

    fun getCategoriesData(): List<Category> {
        return listOf(
            Category(
                id = 1,
                name = "Burgers",
                image = "https://raw.githubusercontent.com/DumbPolyglotProgrammer/PigGame/master/images/" + "quarter_pounder_with_cheese_deluxe.png",
            ),
            Category(
                id = 2,
                name = "Fries",
                image = "https://raw.githubusercontent.com/DumbPolyglotProgrammer/PigGame/master/images/" + "medium_french_fries.png",
            ),
            Category(
                id = 3,
                name = "Beverages",
                image = "https://raw.githubusercontent.com/DumbPolyglotProgrammer/PigGame/master/images/" + "coca_cola.png",
            ),
            Category(
                id = 4,
                name = "Combo Meals",
                image = "https://www.mcdonalds.com/is/image/content/dam/usa/nfl/assets/meal/desktop/h-mcdonalds-2-Cheeseburger-Extra-Value-Meals.jpg",
            ),
            Category(
                id = 5,
                name = "Happy Meals",
                image = "https://www.mcdonalds.com/is/image/content/dam/usa/nfl/assets/meal/desktop/h-mcdonalds-Hamburger.png",
            ),
            Category(
                id = 6,
                name = "Desserts",
                image = "https://www.mcdonalds.com/is/image/content/dam/usa/nfl/nutrition/items/hero/desktop/t-mcdonalds-Vanilla-Reduced-Fat-Ice-Cream-Cone.jpg",
            )
        )
    }

}