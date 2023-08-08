package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner= new Scanner(System.in);

        System.out.println("How many test case you want");
        int testCase=scanner.nextInt();


        System.out.println("enter the size of the array");
        int[] arr=new int[scanner.nextInt()];

        System.out.println("Enter the elements in the array");

        for (int i=0; i<testCase;i++){

            for (int j=0;j<arr.length;j++){

                arr[j]=scanner.nextInt();
            }
        }

        System.out.println("You array is");

        for (int m=0;m<arr.length; m++){

            System.out.print(arr[m]+ " ");
        }
        System.out.println(" ");

        Arrays.sort(arr);

        int temp;

        int[] temparr=new int[arr.length-1];


        for (int i=1;i<arr.length;i++){

            temp=0;

            temp=temp+arr[arr.length-i]-arr[arr.length-(i+1)];
            temparr[i-1]=temp;
        }

        Arrays.sort(temparr);

        System.out.println("The smallest difference horse is " + temparr[0]);


    }
}
