package com.company;

import java.util.Scanner;

public class Codeforce_Maximums {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        long[] arr=new long[(int)n];

        long max=0;
        long[] maxArrayX=new long[(int)n];
        maxArrayX[0]=0;
        for (int i=1;i<n;i++){
            max=Math.max(max,arr[i]);

        }

    }
}
