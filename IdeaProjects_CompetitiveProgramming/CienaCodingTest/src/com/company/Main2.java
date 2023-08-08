package com.company;

public class Main2 {

    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        B c=new C();
        B b2=new C();

        a.doA(b);
        a.doA(c);
        a.doA(b2);
        b=c;
        a.doA(b);
    }
}
