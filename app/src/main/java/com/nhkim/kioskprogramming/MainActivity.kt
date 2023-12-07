package com.nhkim.kioskprogramming

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
//fun main() 부분
fun main(){
    println("SHAKESHACK BURGER 에 오신걸 환영합니다.\n"+
            "아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.\n")
    val kiosk = Kiosk()
    kiosk.printEntireMenu()
}