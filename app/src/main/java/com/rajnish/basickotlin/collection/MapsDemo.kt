package com.rajnish.basickotlin.collection

class MapsDemo
{

    fun makeMap(){

        val mapName= mutableMapOf("name" to "Rajnish" ,
                            "id" to "101" ,
                        "email" to "rajnish@gmail.com","email" to "rajnish@gmail.com")

        for (item in mapName){

            println(item.key)
            println(item.value)
        }

        // here is mutable the map in kotlin languages
        mapName.put("name","Rajnish kumar Singh")


    }
}