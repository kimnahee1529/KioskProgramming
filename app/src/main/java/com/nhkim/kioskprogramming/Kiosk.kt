package com.nhkim.kioskprogramming

import com.nhkim.kioskprogramming.food.*

class Kiosk {
    var input :Int? = null
    var foods :MutableList<Food> = mutableListOf<Food>()

    var burgerList = mutableListOf<Food>()
    var iceCreamList = mutableListOf<Food>()
    var drinkList = mutableListOf<Food>()
    var beerList = mutableListOf<Food>()


    //메뉴 초기화
    //추후 음식 주문할때 정보들을 저장
    fun initMenu(){

        burgerList.add(Burger("ShackBurger","토마토, 양상추, 쉑소스가 토핑된 치즈버거",6.9))
        burgerList.add(Burger("SmokeShack","베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거",8.9))
        burgerList.add(Burger("Shroom Burger","몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거",9.4))
        burgerList.add(Burger("Cheeseburger","포테이토 번과 비프패티, 치즈가 토핑된 치즈버거",6.9))
        burgerList.add(Burger("Hamburger","비프패티를 기반으로 야채가 들어간 기본버거",5.4))

        iceCreamList.add(IceCream("Shakes","바닐라, 초콜렛, 솔티드 카라멜, 블랙 & 화이트, 스트로베리, 피넛버터, 커피",5.9))
        iceCreamList.add(IceCream("Shake of the Week","특별한 커스터드 플레이버",6.5))
        iceCreamList.add(IceCream("Red Bean Shake","신선한 커스터드와 함께 우유와 레드빈이 블렌딩된 시즈널 쉐이크",6.5))
        iceCreamList.add(IceCream("Floats","루트 비어, 퍼플 카우, 크림사클",5.9))
        iceCreamList.add(IceCream("Cups & Cones","바닐라, 초콜렛, Flavor of the Week",4.9))
        iceCreamList.add(IceCream("Concretes","쉐이크쉑의 쫀득한 커스터드와 다양한 믹스-인의 조합",5.9))

        drinkList.add(Drink("Shack-made Lemonade","매장에서 직접 만드는 상큼한 레몬에이드(오리지날/시즈널)",3.9))
        drinkList.add(Drink("Fresh Brewed Iced Tea","직접 유기농 홍차를 우려낸 아이스티",3.4))
        drinkList.add(Drink("Fifty/Fifty","레몬에이드와 아이스티의 만남",3.5))
        drinkList.add(Drink("Fountain Soda","코카콜라, 코카콜라제로,스프라이트, 환타 오렌지, 환타 그레이프",2.7))
        drinkList.add(Drink("Abita Root Beer","청량감 있는 독특한 미국식 무알콜 탄산음료",4.4))
        drinkList.add(Drink("Bottled Water","지리산 암반대수층으로 만든 프리미엄 생수",1.0))

        beerList.add(Beer("ShackMeister Ale","쉐이크쉑 버거를 위해 뉴욕 브루클린 브루어리에서 특별히 양조한 에일 맥주",9.8))
        beerList.add(Beer("Magie Brewing Co.","Pole Ale, Draft / Porter , Draft / Wheat,Draft",6.8))

    }
    fun mainMenu(){

        // 메뉴판 초기화
        initMenu()
        // 메뉴판 출력
        val line ="""
            "SHAKESHACK BURGER 에 오신걸 환영합니다."
            아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.

            [ SHAKESHACK MENU ]
            1. Burgers         | 앵거스 비프 통살을 다져만든 버거
            2. Forzen Custard  | 매장에서 신선하게 만드는 아이스크림
            3. Drinks          | 매장에서 직접 만드는 음료
            4. Beer            | 뉴욕 브루클린 브루어리에서 양조한 맥주
            0. 종료            | 프로그램 종료
           
        """.trimIndent()

        //값을 입력
        while(true) {
            try {


                println(line)
                //만약 foods에 값이 있다면 order menu 출력

                input = readLine()?.toInt()
                when(input){
                    0 -> break
                    in 1..4 -> orderMenu(input!!)
                }
                println(input)
            } catch (e: Exception) {
                println("숫자 이외의 값을 입력하시오")
            }
        }
    }
    fun orderMenu(i: Int){
        when(i){
            1 -> {
                println("[ Burgers MENU ]")
                for(i in burgerList.indices){
                    print("${i+1}. ")
                    burgerList[i].displayInfo()
                }
            }
            2 -> {
                println("[ Frozen Custard MENU ]")
                for(i in iceCreamList.indices){
                    print("${i+1}. ")
                    iceCreamList[i].displayInfo()
                }
            }
            3 -> {
                println("[ Drinks MENU ]")
                for(i in drinkList.indices){
                    print("${i+1}. ")
                    drinkList[i].displayInfo()
                }
            }
            4 -> {
                println("[ Beer MENU ]")
                for(i in beerList.indices){
                    print("${i+1}. ")
                    beerList[i].displayInfo()
                }
            }
        }
        println("0. 뒤로가기      | 뒤로가기")
        //입력부분
        while(true){
            input = readLine()?.toInt()
            when(input){
                0 -> break
            }
        }

    }
    fun cart(){}

}