package com.nhkim.kioskprogramming.food

// 메뉴 항목을 나타내는 추상 클래스
open class Food(val name: String, val price: Double, val description: String) {
    open fun displayInfo() {
        println("$name | W $price | $description")
    }
}