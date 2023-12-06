package com.nhkim.kioskprogramming

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.runBlocking

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}
//fun main() 부분
fun main(){
    var kiosk = Kiosk()
    kiosk.mainMenu()
}