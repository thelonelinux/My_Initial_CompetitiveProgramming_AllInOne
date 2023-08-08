package com.company;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws java.lang.Exception{
        // write your code here
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        long[][] arr=new long[(int)n][2];

        for (int i=0;i<n;i++){
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }

        if (n<=2){
            System.out.println(n);
        }else{
            long count=2;

            for (int i=1;i<n-1;i++){
                long forwardMax=arr[i+1][0];
                long backMin=arr[i-1][0];

                long maxPossible=arr[i][0]+arr[i][1];
                long minPossible=arr[i][0]-arr[i][1];

                if (minPossible>backMin || maxPossible<forwardMax){
                    count++;
                }
            }
            System.out.println(count);
        }



    }
}
