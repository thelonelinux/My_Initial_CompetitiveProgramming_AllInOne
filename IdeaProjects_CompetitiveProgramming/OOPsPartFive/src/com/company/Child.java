package com.company;

public class Child implements Parent {

    //it's child class class must define all methods of interface;


    @Override
    public void abstractMethod1() {
        System.out.println("AbstractMethod1");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("AbstractMethod2");
    }

    @Override
    public void abstractMethod3() {
        System.out.println("AbstractMethod3");
    }
}
