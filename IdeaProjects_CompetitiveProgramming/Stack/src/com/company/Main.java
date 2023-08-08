package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        MyStack theStack = new MyStack(3);   //size is passed here only;
        theStack.push(10); theStack.display();
        theStack.push(20); theStack.display();
        theStack.push(30); theStack.display();
        theStack.pop(); theStack.display();
        theStack.push(20); theStack.display();
        theStack.display();
    }
}
