package com.nhkim.kioskprogramming

import com.nhkim.kioskprogramming.food.Beer
import com.nhkim.kioskprogramming.food.Burger
import com.nhkim.kioskprogramming.food.Drink
import com.nhkim.kioskprogramming.food.Food
import com.nhkim.kioskprogramming.food.IceCream

// 주문을 나타내는 클래스
class Order {
    private val items = mutableListOf<Food>()

    private fun addItem(item: Food) {
        items.add(item)
        println("${item.name}를 장바구니에 담았습니다.")
    }

    fun displayOrder() {
        println("[ Your Order ]")
        for ((index, item) in items.withIndex()) {
            println("${index + 1}. ${item.name} | W ${item.price}")
        }
        println("Total Price: W ${calculateTotalPrice()}만원입니다.")
    }

    private fun calculateTotalPrice(): Double {
        return items.sumByDouble { it.price }
    }

    private fun orderMenu(foodType: String, foods: List<Food>, order: Order) {
        while (true) {
            println("[ $foodType MENU ]")

            foods.forEachIndexed { index, item ->
                print("${index + 1}. ")
                item.displayMenu()
            }

            println("0. 뒤로가기")
            print("> ")

            val userInput = readLine()?.toIntOrNull()

            if (userInput != null) {
                when (userInput) {
                    in 1..foods.size -> {
                        order.addItem(foods[userInput - 1])
                        println("${foods[userInput - 1].name}를 선택하셨습니다.")
                    }
                    0 -> break
                    else -> println("잘못된 입력입니다. 다시 입력해주세요.")
                }
            } else {
                println("숫자를 입력해주세요.")
            }
        }
    }

    fun orderBurgers(order: Order) {
        val burgers = listOf(
            Burger("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"),
            Burger("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"),
            Burger("Shroom Burger", 9.4, "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거"),
            Burger("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"),
            Burger("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거")
        )

        orderMenu("Burgers", burgers, order)
    }

    fun orderIceCream(order: Order) {
        val iceCreams = listOf(
            IceCream("Shakes", 5.9, "바닐라, 초콜렛, 솔티드 카라멜, 블랙 & 화이트, 스트로베리, 피넛버터, 커피"),
            IceCream("Shake of the Week", 6.5, "특별한 커스터드 플레이버"),
            IceCream("Red Bean Shake", 6.5, "신선한 커스터드와 함께 우유와 레드빈이 블렌딩된 시즈널 쉐이크"),
            IceCream("Floats", 5.9, "루트 비어, 퍼플 카우, 크림사클"),
            IceCream("Cups & Cones", 4.9, "바닐라, 초콜렛, Flavor of the Week"),
            IceCream("Concretes", 5.9, "쉐이크쉑의 쫀득한 커스터드와 다양한 믹스-인의 조합")
        )

        orderMenu("Frozen Custard", iceCreams, order)
    }

    fun orderDrinks(order: Order) {
        val drinks = listOf(
            Drink("Shack-made Lemonade", 3.9, "매장에서 직접 만드는 상큼한 레몬에이드(오리지날/시즈널)"),
            Drink("Fresh Brewed Iced Tea", 3.4, "직접 유기농 홍차를 우려낸 아이스티"),
            Drink("Fifty/Fifty", 3.5, "레몬에이드와 아이스티의 만남"),
            Drink("Fountain Soda", 2.7, "코카콜라, 코카콜라제로,스프라이트, 환타 오렌지, 환타 그레이프"),
            Drink("Bottled Water", 1.0, "지리산 암반대수층으로 만든 프리미엄 생수")
        )

        orderMenu("Drinks", drinks, order)
    }

    fun orderBeer(order: Order) {
        val beers = listOf(
            Beer("ShackMeister Ale", 9.8, "쉐이크쉑 버거를 위해 뉴욕 브루클린 브루어리에서 특별히 양조한 에일 맥주"),
            Beer("Magie Brewing Co.", 6.8, "Pole Ale, Draft / Porter , Draft / Wheat,Draft")
        )

        orderMenu("Beer", beers, order)
    }
}
