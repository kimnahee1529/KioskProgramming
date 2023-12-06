package com.nhkim.kioskprogramming.food

open class Food(name :String,detail :String,price:Double) {
    var name :String = name
    var detail : String = detail
    var price :Double = price

    open fun displayInfo(){
        println(this.name +" | ${this.price} | " + this.detail)
    }
}