package com.hitanshudhawan.mccompose.data

import com.hitanshudhawan.mccompose.model.Home
import com.hitanshudhawan.mccompose.model.User

object HomeRepository {

    fun getHomeData(): Home {
        return Home(
            user = User(
                name = "Dhawan"
            ),
            categories = CategoriesRepository.getCategoriesData(),
            popularMenuItems = listOf(),
            recommendedMenuItems = listOf()
        )
    }

}
