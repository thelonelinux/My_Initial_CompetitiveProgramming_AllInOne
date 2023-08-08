package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


//        Parent parent=new Parent();  //Error: so you can't directly make abstract class object .

        //However you can make its object only if u define all its abstract method as shown below;

//        Parent parent=new Parent() {
//            @Override
//            void func2() {
//                System.out.println("he;;p");
//            }
//        };

        //Normally we make object of its child to access the abstract class;

        Child child = new Child();

        child.func2();
        child.func1();
    }
}
