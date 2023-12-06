package com.nhkim.kioskprogramming

import com.nhkim.kioskprogramming.food.Food

class Kiosk {
    var input :Int? = null
    var foods :MutableList<Food> = mutableListOf<Food>()
    fun mainMenu(){

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
        println(line)

        //값을 입력
        while(true) {
            try {
                input = readLine()?.toInt()
                when(input){
                    0 -> break
                    in 1..4 -> orderMenu()
                }
                println(input)
            } catch (e: Exception) {
                println("숫자 이외의 값을 입력하시오")
            }
        }
    }
    fun orderMenu(){
        println("OrderMenu 생성")
        println()

    }
    fun cart(){}

}