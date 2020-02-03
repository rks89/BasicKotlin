package com.rajnish.basickotlin;

public class SingletonJava
{
   private SingletonJava instance=null;

   private SingletonJava()
   {

   }

public synchronized SingletonJava createInstance(){

       if(instance==null) {
           this.instance = new SingletonJava();
       }
       return instance;
}


public SingletonJava getInstance(){

       if(instance==null) createInstance();
        return instance;
}

}
