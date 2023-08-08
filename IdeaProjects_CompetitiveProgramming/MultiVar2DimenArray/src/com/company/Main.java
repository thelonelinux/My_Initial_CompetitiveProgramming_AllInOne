package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

       //2 dimension array with variable input element in each row;

//        int[] arr = new int[]{1,2,3,4,5};
//
//
//        //this is new way of looping val(can be i or anything u want) in arr;
//
//        for (int val : arr){
//            System.out.println(val);
//        }


//        ArrayList<Integer> arrayList = new ArrayList<>();
//
//        System.out.println(arrayList);

        //2 dimension array with variable input element in each row;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of arr :");

        int n = scanner.nextInt();



        int[][] array = new int[n][];

        for (int i=0 ; i<n;i++){
            System.out.println("Enter the size of "+i+"th arr");

            int size=scanner.nextInt();

            array[i]=new int[size];

            System.out.println("Enter the elements in "+i+"th array: ");

            for (int j=0 ; j<size;j++){

                System.out.println("Enter the "+j+"th element of the "+i+ "th array");
                array[i][j]=scanner.nextInt();
            }
        }






    }
}
