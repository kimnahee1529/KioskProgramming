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
        burgerList.add(Burger("","",0.0))
        burgerList.add(Burger("","",0.0))
        burgerList.add(Burger("","",0.0))
        burgerList.add(Burger("","",0.0))

        iceCreamList.add(IceCream("","",0.0))
        iceCreamList.add(IceCream("","",0.0))
        iceCreamList.add(IceCream("","",0.0))
        iceCreamList.add(IceCream("","",0.0))
        iceCreamList.add(IceCream("","",0.0))
        iceCreamList.add(IceCream("","",0.0))

        drinkList.add(Drink("","",0.0))
        drinkList.add(Drink("","",0.0))
        drinkList.add(Drink("","",0.0))
        drinkList.add(Drink("","",0.0))
        drinkList.add(Drink("","",0.0))
        drinkList.add(Drink("","",0.0))

        beerList.add(Beer("","",0.0))
        beerList.add(Beer("","",0.0))

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