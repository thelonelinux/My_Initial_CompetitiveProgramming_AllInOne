package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Multidemensional array

//        int[][] arr=new int[2][2];
//
//         int ar[][] ={{1,2},{3,4}};
//
//         arr[0][0]=1;
//         arr[0][1]=2;
//         arr[1][0]=3;
//         arr[1][1]=4;
//
//         System.out.println(arr[0][0]);
//
//         int[][][] array=new int[2][2][2];
//         array[0][0][0]=1;
//
//         System.out.println(array[0][0][0]);
//ow


        //Diagonal abslute differences from left up to top down diagonal
        //and from top right to left down diagonal; their differences

        Scanner scanner=new Scanner(System.in);

//        System.out.print("Enter the n for square matrix");
        int n=scanner.nextInt();

//        System.out.println("Now enter the matrix");

        int[][] arr=new int[n][n];
        for (int i=0 ;i<n; i++){

           for (int j=0;j<n;j++){

//               System.out.print("Enter the "+j+"th column of "+i+"th row");
               arr[i][j]=scanner.nextInt();
           }
        }

        int sum1=0;
        for (int i=0 ;i<n; i++){
            sum1=sum1+arr[i][i];
        }

        int sum2=0;
        for (int i=0 ;i<n; i++){
            sum2= sum2+arr[i][(n-1)-i];
        }
        int sum=sum1-sum2;

        System.out.println(Math.abs(sum));

    }
}
