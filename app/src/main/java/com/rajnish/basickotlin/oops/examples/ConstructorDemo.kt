package com.rajnish.basickotlin.oops.examples

 class ConstructorDemo
{
     var n:String=""
     var email:String=""
     var id:Int=0

    constructor(name:String){
        this.n=name
    }

    constructor(id:Int,email:String){
        this.id=id
        this.email=email
    }
}