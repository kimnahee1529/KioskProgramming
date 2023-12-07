package com.nhkim.kioskprogramming.food

import com.nhkim.kioskprogramming.Kiosk

/*
* */
class Menu {

    var burgers = mutableListOf<Food>()
    var iceCreams = mutableListOf<Food>()
    var drinks = mutableListOf<Food>()
    var beers = mutableListOf<Food>()

    val burgerMenuItems = listOf(
        MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"),
        MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"),
        MenuItem("Shroom Burger", 9.4, "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거"),
        MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"),
        MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거")
    )

    val iceCreamMenuItems = listOf(
        MenuItem("Shakes ", 5.9, "바닐라, 초콜렛, 솔티드 카라멜, 블랙 & 화이트, 스트로베리, 피넛버터, 커피"),
        MenuItem("Shake of the Week", 6.5, "특별한 커스터드 플레이버"),
        MenuItem("Red Bean Shake", 6.5, "신선한 커스터드와 함께 우유와 레드빈이 블렌딩된 시즈널 쉐이크"),
        MenuItem("Floats", 5.9, "루트 비어, 퍼플 카우, 크림사클"),
        MenuItem("Cups & Cones", 4.9, "바닐라, 초콜렛, Flavor of the Week"),
        MenuItem("Concretes ", 5.9, "쉐이크쉑의 쫀득한 커스터드와 다양한 믹스-인의 조합")
    )

    val drinkMenuItems = listOf(
        MenuItem("Shack-made Lemonade", 3.9, "매장에서 직접 만드는 상큼한 레몬에이드(오리지날/시즈널)"),
        MenuItem("Fresh Brewed Iced Tea", 3.4, "직접 유기농 홍차를 우려낸 아이스티"),
        MenuItem("Fifty/Fifty", 3.5, "레몬에이드와 아이스티의 만남"),
        MenuItem("Fountain Soda", 2.7, "코카콜라, 코카콜라제로,스프라이트, 환타 오렌지, 환타 그레이프"),
        MenuItem("Abita Root Beer", 4.4, "청량감 있는 독특한 미국식 무알콜 탄산음료"),
        MenuItem("Bottled Water", 1.0, "지리산 암반대수층으로 만든 프리미엄 생수"),
    )

    val beerMenuItems = listOf(
        MenuItem("ShackMeister Ale", 9.8, "쉐이크쉑 버거를 위해 뉴욕 브루클린 브루어리에서 특별히 양조한 에일 맥주"),
        MenuItem("Magie Brewing Co.", 6.8, "Pole Ale, Draft / Porter , Draft / Wheat,Draft")
    )

    // 메뉴판 출력
    fun entireMenu(): Int{

        val line =
            """
            [ SHAKESHACK MENU ]
            1. Burgers         | 앵거스 비프 통살을 다져만든 버거
            2. Forzen Custard  | 매장에서 신선하게 만드는 아이스크림
            3. Drinks          | 매장에서 직접 만드는 음료
            4. Beer            | 뉴욕 브루클린 브루어리에서 양조한 맥주
            0. 종료            | 프로그램 종료
        """.trimIndent()
        println(line)


        //항목 선택
        while(true) {
            try {
                val input = readLine()?.toInt()
                when(input){
                    0 -> {
                        println("찾아주셔서 감사합니다. 프로그램이 종료됩니다.")
                        break
                    }
                    in 1..4 -> return input ?: 0
                    else -> println("잘못된 번호를 입력했어요. 다시 입력해주세요.")
                }
            } catch (e: Exception) {
                println("숫자를 입력해주세요.")
            }
        }
        return -1
    }

    fun selectDetailMenu(input: Int){

        when(input){
            1-> {
                val burger = Burger(burgerMenuItems)
                burger.displayInfo("Burgers",burgerMenuItems)
                burger.selectMenu(burgerMenuItems)
            }
            2-> {
                val iceCream = IceCream(iceCreamMenuItems)
                iceCream.displayInfo("IceCream", iceCreamMenuItems)
                iceCream.selectMenu(iceCreamMenuItems)
            }
            3-> {
                val drink = Drink(drinkMenuItems)
                drink.displayInfo("IceCream", drinkMenuItems)
                drink.selectMenu(drinkMenuItems)
            }
            4-> {
                val beer = Beer(beerMenuItems)
                beer.displayInfo("Beer", beerMenuItems)
                beer.selectMenu(beerMenuItems)
            }
            else -> {
                println("else")
            }
        }

    }
}

