package com.hitanshudhawan.mccompose.model

data class Home(
    val user: User,
    val categories: List<Category>,
    val popularMenuItems: List<MenuItem>,
    val recommendedMenuItems: List<MenuItem>
)