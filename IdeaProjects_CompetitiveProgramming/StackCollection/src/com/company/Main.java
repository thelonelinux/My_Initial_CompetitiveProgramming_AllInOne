package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Stack s=new Stack();

        s.push(9);
        s.push('c');
        s.push("string");

        Object object=s.peek();
        Object obj2 =s.get(2);
        Boolean bool=s.empty();
        s.addElement(20);

        System.out.println(s);
        System.out.println(obj2);
        System.out.println(bool);
        System.out.println(s);




    }
}
