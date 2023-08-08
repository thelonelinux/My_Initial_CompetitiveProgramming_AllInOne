package com.company;

public class Varargs {

    //We will understand the use and importance of varargs;
    //varargs are mostly used while function overloading;

    public void func(int a){
        System.out.println("With single int value "+a);
    }

    public void func(int a,int b){
        System.out.println("With two int value "+a+" "+b);

    }

    public void func(int a,int b,int c){
        System.out.println("With three int value "+a+" "+b+" "+c);

    }

    public void func(int a,int b,int c,int d){
        System.out.println("With four int value "+a+" "+b+" "+c+" "+d);

    }

    //Now comes use of varargs;

    public void func(int... values){
        System.out.println("Having n int value as you wish to enter as argument");
    }


    //similarly for strings;

    public void func(String... values){
        for (String s : values){
            System.out.print(s+" ");
        }
    }
}
