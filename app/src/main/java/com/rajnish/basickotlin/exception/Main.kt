package com.rajnish.basickotlin.exception

import java.lang.Exception

fun main(){

    var obj=Sport()

    try
    {
       obj.doSomething()
    }
    catch (e:Exception)
    {
        println(e.toString())
    }finally {
        // clean the code and released the memory location
    }
}

class Sport{

    fun doSomething(){
        println("I am playing football in ground")

    }
}