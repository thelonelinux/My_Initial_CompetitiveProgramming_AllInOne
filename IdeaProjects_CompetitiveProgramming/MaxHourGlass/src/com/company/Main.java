package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);

        System.out.println("enter the length of the nxn array i.e. value of n:");
        int n=scanner.nextInt();

        int[][] arr = new int[n][n];

        System.out.println("enter the elements in the array");

        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.println("Enter the "+j+"th element of the "+i+"th row");
                arr[i][j]=scanner.nextInt();
            }
        }

        System.out.println("your matrix is :");

        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println(" ");
        }


        //from here our computation of finding the maxhour glass starts;



        int[] d= new int[(n-2)*(n-2)];
        int l=0;

        for (int i= 0;i<n-2;i++){
            for (int j =0;j<n-2;j++){
              int sum=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
              d[l]=sum;
              l++;
              sum=0;

            }

        }

        System.out.println("elements of the array d : ");

        for (int i=0;i<d.length;i++){
            System.out.print(d[i]+" ");
        }

//
        //insertion sort;
        int m=d.length;
        for (int i=1;i<m;++i){
            int key=d[i];
            int j = i-1;
            while (j>=0 && d[j]>key){
                d[j+1]=d[j];
                j=j-1;
            }
            d[j+1]=key;
        }
//
        System.out.println("content of hour glass sum are after sorting");

        for (int i=0;i<m;i++){
            System.out.print(d[i]+" ");
        }
//
        System.out.println("the maximum sum is "+d[m-1]);






    }
}
