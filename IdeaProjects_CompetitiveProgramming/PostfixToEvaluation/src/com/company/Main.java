package com.company;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static int postfixToEvalutation(String s){

        Stack<Integer> stack=new Stack<>();
        int x=0;
        int y=0;

        char[] ch=s.toCharArray();

        for (char c: ch){
            if (c>='0' && c<='9'){
                stack.push((int) (c-'0')); //Here only its type casting it to int;
            }
            else {
                y= stack.pop();
                x=stack.pop();
                switch (c){
                    case '+':
                        stack.push(x+y);
                        break;

                    case '-':
                        stack.push(x-y);
                        break;
                    case '*':
                        stack.push(x*y);
                        break;
                    case '/':
                        stack.push(x/y);
                        break;
                }
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
	// write your code here

//        String exp="231*+";
//
//        System.out.println(postfixToEvalutation(exp));

//        char c='9';
//        int i=(int) c;
//        System.out.println(i);

//        Stack stack=new Stack();
//
//        stack.push(1);
//        stack.push( 15);
//        stack.push( 12);
//
//        int i=(int)stack.peek();
//
//
//        System.out.println(stack);
//        System.out.println(i);
//
//        int j=(int)stack.pop();
//        System.out.println(j);

//        Character c='c';
//        int i=(int) c;
//        System.out.println(i);

//        Integer integer=5;
//        int i=(int) integer;
//        char c=(char) integer;
//        System.out.println(i);
    }
}
