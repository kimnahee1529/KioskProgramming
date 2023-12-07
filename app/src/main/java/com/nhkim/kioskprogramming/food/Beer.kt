package com.nhkim.kioskprogramming.food

class Beer(menuItems: List<MenuItem>): Food() {
    var size :Int =0
    var type :String =""

    override fun displayInfo(category: String, menuItems: List<MenuItem>) {
        super.displayInfo("Beer", menuItems)
    }
    override fun selectMenu(menuItems: List<MenuItem>) {
        super.selectMenu(menuItems)
    }
    fun selectSize(){}
    fun selectType(){}
}