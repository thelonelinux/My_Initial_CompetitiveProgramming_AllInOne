package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //This is our built in stack in the java;

//        Stack<String> stack = new Stack<>();
//
//        stack.enqueue("hello");
//
//        stack.enqueue("vicky");
//
//        System.out.println(stack);

        Queue queueDemo = new Queue();

        queueDemo.enqueue(23); queueDemo.display();
        queueDemo.enqueue(2); queueDemo.display();
        queueDemo.enqueue(73); queueDemo.display();


        queueDemo.dequeue(); queueDemo.display();
        queueDemo.dequeue();

        queueDemo.display();
    }



}
