package com.rajnish.basickotlin.collection

class ArrayListDemo
{
    fun makeList(){
        val list= listOf(1,2,1,5,4,7)
        val mutableList= mutableListOf(12,3,4,6,8,9)
        mutableList.add(12)

        for (item in list){
            println(item)
        }
    }
}