package com.company;

public class MyStack {

    private int maxSize;
    private int [] stackArray;
    private int top;


    //size is itself taken in constructor
    //and so also initialised the top;

    public MyStack(int s) {
        maxSize = s;
        stackArray = new int[maxSize];
        top = -1;
    }

    //remember in this the top is changed everywhere within the methods with stackArray;
    //since stackArray is non-primitive type data so the changes is kept. and its permanent;

    public void push(int j) {
        if(isFull()){
            System.out.println("Stack is Full");
        }
        else {
            stackArray[++top] = j; //you can write here this.stackArray also . But this will also do;
        }
    }

    public void pop() {
        if(isEmpty()){
            System.out.println("Stack is empty");

        }
//        else{
//            return stackArray[top--];
//        }

        else{

            System.out.println("the pop item is "+ stackArray[top--]); //here also can be this.stack...;

        }
    }

    public void display(){

        System.out.println("The content of the Stack is :- ");
        if(this.maxSize==-1){
            System.out.println("Stack is empty");
        }
        else{

            for (int i=0;i<=top;i++){
                System.out.print(stackArray[i]+" ");
            }
            System.out.println(" ");
        }

    }

    public int peek() {
        return stackArray[top];
    }

//    public void popAll(){
//
//        while (!this.isEmpty()) {
//            int value = this.pop();
//            System.out.print(value);
//            System.out.print(" ");
//        }
//        System.out.println("");
//    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

}

