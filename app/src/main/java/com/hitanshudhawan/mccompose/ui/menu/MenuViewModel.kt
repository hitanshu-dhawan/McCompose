package com.hitanshudhawan.mccompose.ui.menu

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hitanshudhawan.mccompose.data.MenuRepository
import com.hitanshudhawan.mccompose.model.Menu
import com.hitanshudhawan.mccompose.model.MenuItem

class MenuViewModel : ViewModel() {

    private val _data = MutableLiveData(MenuRepository.getMenuData())
    val data: LiveData<Menu> = _data

    fun incrementMenuItemQuantity(menuItem: MenuItem) {
        // TODO : Is it possible to have recomposition without copying and making a new instance of list item ?
        _data.value = _data.value!!.let { menu ->
            menu.copy(
                menuItems = menu.menuItems.toMutableList().also { menuItems ->
                    menuItems[menuItems.indexOf(menuItem)] = menuItem.copy(quantity = menuItem.quantity + 1)
                }
            )
        }
    }

    fun decrementMenuItemQuantity(menuItem: MenuItem) {
        // TODO : Is it possible to have recomposition without copying and making a new instance of list item ?
        _data.value = _data.value!!.let { menu ->
            menu.copy(
                menuItems = menu.menuItems.toMutableList().also { menuItems ->
                    menuItems[menuItems.indexOf(menuItem)] = menuItem.copy(quantity = menuItem.quantity - 1)
                }
            )
        }
    }

}