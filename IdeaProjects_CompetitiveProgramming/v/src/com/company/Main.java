package com.company;

import java.util.Scanner;

import static java.sql.JDBCType.INTEGER;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int ans=Integer.MAX_VALUE;
        long[] arr1=new long[n];
        long[] arr2=new long[n];

        for (int i=0;i<n;i++){
            arr1[i]=sc.nextLong();
        }

        for (int i=0;i<n;i++){
            arr2[i]=sc.nextLong();
        }

        for (int i=0;i<n;i++){
            int sum=(int)(arr2[i]/arr1[i]);
            ans=Math.min(sum,ans);
        }

        System.out.println(ans);
    }
}
