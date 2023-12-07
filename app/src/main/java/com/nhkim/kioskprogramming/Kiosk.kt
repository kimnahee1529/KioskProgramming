package com.nhkim.kioskprogramming

import com.nhkim.kioskprogramming.food.Food
import com.nhkim.kioskprogramming.food.Menu
import com.nhkim.kioskprogramming.food.MenuItem

/*
Kiosk
음식의 메뉴 정보 "출력"
장바구니에 들어갈 음식 객체 계산
총 가격
* */
class Kiosk {

    var foods :MutableList<Food> = mutableListOf<Food>()
    var cart = mutableListOf<Food>()
    val menu = Menu()


    fun printEntireMenu(){
        val selectMenu = menu.entireMenu()
        menu.selectDetailMenu(selectMenu)
    }

    fun addCart(menuItem: MenuItem) {
        println("위 메뉴를 장바구니에 추가하시겠습니까?\n" +
                 "1. 확인 \t 2. 취소")
        val input = readLine()?.toInt()
        while(true){
            try {
                if(input==1) {
                    println("${menuItem.name} 가 장바구니에 추가되었습니다")
//                    cart.add(menuItem.)
                    println("cart: ${cart}")
                    println("장바구니 : ${cart.size}")
                    break
                } else if(input==2){
                    println("취소하셨습니다")
                    break
                }else{
                    println("1,2 둘 중 하나를 입력해주세요.")
                    break
                }
            }catch(e: Exception) {
                println("올바른 값을 입력해주세요.")
            }
        }


    }

}