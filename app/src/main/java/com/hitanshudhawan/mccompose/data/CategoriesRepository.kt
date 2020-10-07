package com.hitanshudhawan.mccompose.data

import com.hitanshudhawan.mccompose.model.Category

object CategoriesRepository {

    fun getCategoriesData(): List<Category> {
        return listOf(
            Category(
                id = 1,
                image = "https://www.mcdonalds.com/is/image/content/dam/usa/nfl/nutrition/items/hero/desktop/t-mcdonalds-qpc-deluxe-burger.jpg",
                name = "Burgers",
            ),
            Category(
                id = 2,
                image = "https://www.mcdonalds.com/is/image/content/dam/usa/nfl/nutrition/items/hero/desktop/t-mcdonalds-fries-medium.jpg",
                name = "Fries",
            ),
            Category(
                id = 3,
                image = "https://www.mcdonalds.com/is/image/content/dam/usa/nfl/nutrition/items/hero/desktop/t-mcdonalds-Coca-Cola-Classic-Small.jpg",
                name = "Beverages",
            ),
            Category(
                id = 4,
                image = "https://www.mcdonalds.com/is/image/content/dam/usa/nfl/assets/meal/desktop/h-mcdonalds-2-Cheeseburger-Extra-Value-Meals.jpg",
                name = "Combo Meals"
            ),
            Category(
                id = 5,
                image = "https://www.mcdonalds.com/is/image/content/dam/usa/nfl/assets/meal/desktop/h-mcdonalds-Hamburger.png",
                name = "Happy Meals",
            ),
            Category(
                id = 6,
                image = "https://www.mcdonalds.com/is/image/content/dam/usa/nfl/nutrition/items/hero/desktop/t-mcdonalds-Vanilla-Reduced-Fat-Ice-Cream-Cone.jpg",
                name = "Desserts",
            )
        )
    }

}