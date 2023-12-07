package com.nhkim.kioskprogramming.food

import com.nhkim.kioskprogramming.Kiosk

open class Food {
    var name :String =""
    var price :Int = 0

    //카테고리별 메뉴 출력
    open fun displayInfo(category: String, menuItems: List<MenuItem>) {
        val menuString = buildString {
            appendln("\n[ $category MENU ]")
            menuItems.forEachIndexed { index, item ->
                appendln("${index + 1}. ${item.name} | W ${item.price} | ${item.description}")
            }
            appendln("0. 뒤로가기 | 뒤로가기")
        }
        print(menuString)
    }

    open fun selectMenu(menuItems: List<MenuItem>){
        val menu = Menu()
        val kiosk = Kiosk()
        while(true) {
            try {
                val input = readLine()?.toInt()
                when(input){
                    0 -> {
                        println("뒤로가기를 선택하셨습니다.\n") //TODO:뒤로 가기 로직 짜야 함
                        menu.entireMenu()
                    }
                    in 1..menuItems.size -> {
                        println("\n\"${menuItems[(input?:0)-1].name} | W ${menuItems[(input?:0)-1].price} | ${menuItems[(input?:0)-1].description}\"")
                        kiosk.addCart(menuItems[(input?:0)-1])
                    }
                    else -> println("잘못된 번호를 입력했어요. 다시 입력해주세요.")
                }
            } catch (e: Exception) {
                println("숫자를 입력해주세요.")
            }
        }
    }
}