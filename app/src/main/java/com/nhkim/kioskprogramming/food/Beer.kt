package com.nhkim.kioskprogramming.food

// 맥주를 나타내는 클래스
class Beer(name: String, price: Double, description: String) : Food(name, price, description) {
    override fun displayInfo() {
        println("$name | W $price | $description")
    }
}