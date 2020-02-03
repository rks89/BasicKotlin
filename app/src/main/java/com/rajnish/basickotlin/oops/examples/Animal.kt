package com.rajnish.basickotlin.oops.examples
// byDefault all class is final in kotlin

open class Animal(var color:String,var size:Int)
{
    init {
        println("Color is $color")
        println("Sise is :$size")
    }
    open fun sound() {
        println("Animal makes a sound")
    }
    open fun eat(){
        println("Animal makes a eat")

    }
    open fun sleep(){
        println("Animal makes a sleep")

    }
    open fun walk(){
        println("Animal makes a walk")

    }
    open fun speak(){
        println("Animal makes a speak")

    }
}