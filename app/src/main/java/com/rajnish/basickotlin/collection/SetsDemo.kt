package com.rajnish.basickotlin.collection

class SetsDemo
{
    fun makeSet(){

        // set is store collection of data and only store unique value into set not store in duplicate value in set
        var setName= setOf(12,2,3,4,5,6,7,7,7)

        var nameSets= setOf("name","Rajnish")

        for (item in setName){
            println(item)
        }

    }
}