package com.company;



public class Stack {

    private int maxSize;
    private int [] stackArray;
    private int top;

    public Stack(int s) {
        maxSize = s;
        stackArray = new int[maxSize];
        top = -1;
    }
    public void push(int j) {
        if(isFull()){
            System.out.println("Stack is Full");
        }
        else {
        stackArray[++top] = j;
        }
    }

    public int pop() {
        if(isEmpty()){
            System.out.println("Stack is empty");
            return 0;
        }
        else{
        return stackArray[top--];
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

    public void popAll(){

        while (!this.isEmpty()) {
            int value = this.pop();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println("");
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

}
