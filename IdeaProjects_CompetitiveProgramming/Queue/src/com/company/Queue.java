package com.company;

import java.util.Scanner;

public class Queue {

    private static final int capacity = 3;
    int arr[] = new int[capacity];
    int size = 0;
    int front = -1;
    int rear = 0;

    //rear++ and front++ used here in functions of queue are ok
    //take example of four key in and u will understand how its working;
    //understood;

    public void enqueue(int pushedElement) {
        if (front < capacity - 1) {
            front++;
            arr[front] = pushedElement;
            System.out.println( pushedElement
                    + " is pushed to Queue ");

        } else {
            System.out.println("Overflow !");
        }

    }

    public void dequeue() {
        if (front >= rear) {
            rear++;
            System.out.println("Pop operation done ");

        } else {
            System.out.println("Underflow !");
        }
    }

    public void display() {
        if (front >= rear) {
            System.out.print("Elements in Queue : ");
            for (int i = rear; i <= front; i++) {
                System.out.print(arr[i]+",");
            }
            System.out.println("  ");
        }
    }
}


