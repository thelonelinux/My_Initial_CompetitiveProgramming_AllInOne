package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int len=sc.nextInt();
            int[] arr=new int[len];
            for(int i=0;i<len;i++){
                arr[i]=sc.nextInt();
            }

            int len2=sc.nextInt();

            int[] arr2=new int[len2];

            for (int i=0;i<len2;i++){
                arr2[i]=sc.nextInt();
            }

            Arrays.sort(arr);
            Arrays.sort(arr2);
            int m=0;
            int n=0;
            int minDifference=Integer.MAX_VALUE;
            int difference=0;
            int first=0;
            int second=0;

            while (m<len && n<len2){

                difference=Math.abs(arr[m]-arr2[n]);
                if (difference<minDifference){
                    minDifference=difference;
                    first=arr[m];
                    second=arr2[n];
                    if (arr[m]>arr2[n]){
                        n++;
                    }else{
                        m++;
                    }
                }else{
                    if (arr[m]>arr2[n]){
                        n++;
                    }else{
                        m++;
                    }
                }
            }

            System.out.println(first+" "+second);



        }
    }
}
