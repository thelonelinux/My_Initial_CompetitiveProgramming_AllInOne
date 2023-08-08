package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Also here you can't make object of interfaces;

//        Parent parent=new Parent();  //Error: since it has abstract methods undefined

        //But in this following way you can create object for interfaces;
        //After implementing or defining all its methods;

//        Parent parent = new Parent() {
//            @Override
//            public void abstractMethod1() {
//
//            }
//
//            @Override
//            public void abstractMethod2() {
//
//            }
//
//            @Override
//            public void abstractMethod3() {
//
//            }
//        };


        Child child = new Child();

        child.abstractMethod1();
        child.abstractMethod2();
        child.abstractMethod3();
    }
}
