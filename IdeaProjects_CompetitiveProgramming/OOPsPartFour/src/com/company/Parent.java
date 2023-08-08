package com.company;

abstract class Parent {

    public void func1(){
        System.out.println("hello i m a abstract class");
    }

    abstract void func2();  //Abstract class must have atleast one method undefine;

     //abstract class can't be instantiated i.e. its object can't be made
    //so we also need to extend this class to create its object from child class;
}
