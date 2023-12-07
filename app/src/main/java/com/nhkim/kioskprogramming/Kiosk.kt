package com.nhkim.kioskprogramming

fun main() {
    val order = Order()

    while (true) {
        displayMainMenu()

        val userInput = readLine()?.toIntOrNull()

        if (userInput != null) {
            when (userInput) {
                1 -> order.orderBurgers(order)
                2 -> order.orderIceCream(order)
                3 -> order.orderDrinks(order)
                4 -> order.orderBeer(order)
                0 -> {
                    println("프로그램을 종료합니다.")
                    break
                }
                else -> println("잘못된 입력입니다. 다시 입력해주세요.")
            }
        } else {
            println("숫자를 입력해주세요.")
        }
    }

    order.displayOrder()
}

fun displayMainMenu() {
    println("[ SHAKESHACK MENU ]")
    println("1. Burgers")
    println("2. Frozen Custard")
    println("3. Drinks")
    println("4. Beer")
    println("0. 종료")
    print("> ")
}



