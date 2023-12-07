package com.nhkim.kioskprogramming.food

// 음료를 나타내는 클래스
class Drink(name: String, price: Double, description: String) : Food(name, price, description) {
    override fun displayMenu() {
        println("$name | W $price | $description")
    }
}