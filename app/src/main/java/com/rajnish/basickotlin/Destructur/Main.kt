package com.rajnish.basickotlin.Destructur

fun main(){

    println("Hello")
    val person = User("Rajnish",  20)

    val(id, name) = person

    println(id)
    println(name)

}


data class User(val name:String,val id:Int)

class MapDemo{

    fun createMap(){

        var map= mutableMapOf("Name" to "Rajnish KUmar" , "Id" to "101")
    }
}