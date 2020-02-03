package com.rajnish.basickotlin.oops.examples

abstract class AbstractClassDemo
{
    abstract var name:String
    abstract fun displayName():String
    fun demo(){
        println("Hello this Simple function in abstract class")
    }
}

class AccessAbstracrtClass: AbstractClassDemo()
{

    override var name: String="Rajnish Kumar"
    override fun displayName(): String {
        return name

    }

}