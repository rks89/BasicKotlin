package com.rajnish.basickotlin.oops.examples

fun main(){

var obj=StudentInfo("Rajnish Kumar","Rajnish@gmail.com")
    println(obj.display())
}

// simple create pass the value into constructor or initialization the parameter
class StudentInfo(var name:String,var email:String)
{
    var n: String=""
    var emailId:String=""

    // for using the initialize the value
    init {

        if(n==name){
            n="NA"
        }
    }
    fun display(){
        this.emailId=email
        this.n=name
        println("$emailId ,$n")
    }

}

