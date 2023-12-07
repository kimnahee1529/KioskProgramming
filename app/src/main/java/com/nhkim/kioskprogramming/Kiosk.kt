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
    println("1. Burgers         | 앵거스 비프 통살을 다져만든 버거")
    println("2. Frozen Custard  | 매장에서 신선하게 만드는 아이스크림")
    println("3. Drinks          | 매장에서 직접 만드는 음료")
    println("4. Beer            | 뉴욕 브루클린 브루어리에서 양조한 맥주")
    println("0. 종료             | 프로그램 종료")
    print("> ")
}



