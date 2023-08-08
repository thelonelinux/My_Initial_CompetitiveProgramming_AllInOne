package com.company;

abstract class Child2 implements Parent {

    //abstract class child does not need to implement all the methods of interfaces;

    //but yaa ofcourse you can't still make it's object also
    //means you can't make object of this class also since this is also abstract;


    @Override
    public void abstractMethod1() {
        System.out.println("Only i ve been Defined");
    }
}
