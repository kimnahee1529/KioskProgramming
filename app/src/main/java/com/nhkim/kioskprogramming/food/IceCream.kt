package com.nhkim.kioskprogramming.food

// 아이스크림을 나타내는 클래스
class IceCream(name: String, price: Double, description : String) : Food(name, price, description) {
    override fun displayInfo() {
        println("$name | W $price | $description")
    }
}