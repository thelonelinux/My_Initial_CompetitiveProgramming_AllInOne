package com.company;

import java.lang.String;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code

//        String str="Hello";
//
//        StringBuilder sb=new StringBuilder(str);
//
//        int c=str.codePointAt(2);
//
//
//        System.out.println(c);

        //staggered array

        Scanner scn=new Scanner(System.in);
        int n;

        int[][] arr=new int[5][];

        for (int i=0;i<arr.length;i++){

            System.out.println("Enter the size of the "+i+"th array");
            arr[i]=new int[scn.nextInt()];
        }

    }
}
