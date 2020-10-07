package com.hitanshudhawan.mccompose.data

import com.hitanshudhawan.mccompose.model.Menu

object MenuRepository {

    fun getMenuData(): Menu {
        return Menu(
            categories = CategoriesRepository.getCategoriesData(),
            menuItems = listOf(),
        )
    }

}