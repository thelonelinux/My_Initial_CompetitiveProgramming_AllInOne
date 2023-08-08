package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc=new Scanner(System.in);

        long n=sc.nextInt();

        long[] arr=new long[(int)n];

        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);
        long max=0;
        long ans=0;

        for (int i=0;i<n;i++){
             max=arr[i]*(n-i);

             ans=Math.max(ans,max);

        }

        System.out.print(ans);

    }
}
