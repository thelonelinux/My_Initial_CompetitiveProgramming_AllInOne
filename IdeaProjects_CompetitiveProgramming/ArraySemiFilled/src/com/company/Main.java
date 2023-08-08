package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] arr = new  int[5];

        String s= "vicky";

        arr[0]=1;
        arr[1]=5;
        arr[2]=6;

        for (int i=0; i<arr.length; i++){

            System.out.println(arr[i]);
        }


        System.out.println(arr.getClass().getName());

        System.out.println(s.getClass().getName());
    }
}
