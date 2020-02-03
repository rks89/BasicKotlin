package com.rajnish.basickotlin.oops.examples

class Dog(color: String, size: Int) : Animal(color, size)
{
    override fun sound() {
        super.sound()
        println("Child class calling")
    }
}