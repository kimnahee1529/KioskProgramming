package com.nhkim.kioskprogramming

import com.nhkim.kioskprogramming.food.*


/**
 *  키오스크 :계산 업무
 *  - 장바구니에 어떤 Food 가 들어와 있는지,
 *  - 현재 결제해야 하는 총 가격 들을 계산
 *  - 계산적인 부분
 *
 *  메뉴 :출력 업무
 *  - 입력값을 받고, 거기에 해당되는 콘솔창 출력부분
 *
 *
 *  그렇다면 키오스크 클래스 안에 메뉴를 넣어서 처리?
 *  - 이래야 나중에 계산할때 메뉴를 참고해서 하지 않을까
 *
 */


class Kiosk {

    var menu = Menu() // menu 클래스 를 만들어 입출력을 다룬다.
    var foods = mutableListOf<Food>() // 장바구니 정보


    fun playApp(){
        menu.initMenu() //메뉴판 초기화
        menu.mainMenu() //메인 메뉴 출력
    }

    fun cart(){}

}

