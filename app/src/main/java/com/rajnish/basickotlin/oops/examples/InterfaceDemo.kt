package com.rajnish.basickotlin.oops.examples

interface InterfaceDemo
{
    var name:String

    fun dispaly()
    {
        println("Called in InterfaceDemo Interface")
    }

    fun name()
    {
        println("Non-Abstract Method")
    }
}

class DemoInterface:InterfaceDemo
{

    override var name: String="Rajnish"

    override fun dispaly()
    {
        println("This override methods")
    }
}