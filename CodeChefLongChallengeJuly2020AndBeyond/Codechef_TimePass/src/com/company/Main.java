package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws java.lang.Exception{
	// write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][2];
        for (int i=0;i<n;i++){
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }

        int num=sc.nextInt();

        int[] myArr=new int[n];
        System.out.print(num+" ");
        for (int i=1;i<=n;i++){

            if (i!=num){
//                myArr[i]=i;
                System.out.print(i+" ");
            }
        }
        System.out.println();



    }
}
