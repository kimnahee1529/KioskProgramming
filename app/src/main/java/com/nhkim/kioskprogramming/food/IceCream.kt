package com.nhkim.kioskprogramming.food

class IceCream(menuItems: List<MenuItem>): Food() {

    var size :Int =0
    var flavor :String =""

    override fun displayInfo(category: String, menuItems: List<MenuItem>) {
        super.displayInfo("IceCream", menuItems)
    }

    override fun selectMenu(menuItems: List<MenuItem>) {
        super.selectMenu(menuItems)
    }

    fun selectSize(){}
    fun selectFlavor(){

    }
}