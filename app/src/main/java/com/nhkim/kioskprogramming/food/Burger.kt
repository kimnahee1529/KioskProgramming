package com.nhkim.kioskprogramming.food

import com.nhkim.kioskprogramming.Kiosk

class Burger(menuItems: List<MenuItem>): Food() {
    override fun displayInfo(category: String, menuItems: List<MenuItem>) {
        super.displayInfo("Burgers", menuItems)
    }

    override fun selectMenu(menuItems: List<MenuItem>) {
        super.selectMenu(menuItems)
    }
    fun addTopping():Int = 0
}