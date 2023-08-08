package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        printDI(3);


    }

    public static void printDI(int n){
        //Base Case

        if (n==0){
            return;
        }

        //Work before the recursive call
        System.out.println(n);

        //Recursive call
        printDI(n-1);

        //work after the recursive call
        System.out.println(n);
    }

}
