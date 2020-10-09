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
                image = "https://raw.githubusercontent.com/DumbPolyglotProgrammer/PigGame/master/images/" + "cheeseburger_combo_meal.png",
            ),
            Category(
                id = 5,
                name = "Happy Meals",
                image = "https://raw.githubusercontent.com/DumbPolyglotProgrammer/PigGame/master/images/" + "hamburger_happy_meal.png",
            ),
            Category(
                id = 6,
                name = "Desserts",
                image = "https://raw.githubusercontent.com/DumbPolyglotProgrammer/PigGame/master/images/" + "vanilla_cone.png",
            )
        )
    }

}