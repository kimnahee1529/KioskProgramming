package com.nhkim.kioskprogramming.food

class Drink(menuItems: List<MenuItem>): Food() {

    var size :String =""
    override fun displayInfo(category: String, menuItems: List<MenuItem>) {
        super.displayInfo("IceCream", menuItems)
    }
    override fun selectMenu(menuItems: List<MenuItem>) {
        super.selectMenu(menuItems)
    }

    fun addIce(){}
    fun selectSize(){}
}
