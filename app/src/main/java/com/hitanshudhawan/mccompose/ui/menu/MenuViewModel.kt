package com.hitanshudhawan.mccompose.ui.menu

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.hitanshudhawan.mccompose.data.MenuRepository
import com.hitanshudhawan.mccompose.model.Menu
import com.hitanshudhawan.mccompose.model.MenuItem

class MenuViewModel : ViewModel() {

    private val _data = mutableStateOf(MenuRepository.getMenuData())
    val data: State<Menu> = _data

    fun incrementMenuItemQuantity(menuItem: MenuItem) {
        _data.value = _data.value.let { menu ->
            menu.copy(
                menuItems = menu.menuItems.toMutableList().also { menuItems ->
                    menuItems[menuItems.indexOf(menuItem)] = menuItem.copy(quantity = menuItem.quantity + 1)
                }
            )
        }
    }

    fun decrementMenuItemQuantity(menuItem: MenuItem) {
        _data.value = _data.value.let { menu ->
            menu.copy(
                menuItems = menu.menuItems.toMutableList().also { menuItems ->
                    menuItems[menuItems.indexOf(menuItem)] = menuItem.copy(quantity = menuItem.quantity - 1)
                }
            )
        }
    }

    // TODO : Is it possible to have recomposition without copying and making a new instance of list item ?

}
