package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();


        long[] arr=new long[(int)n];

        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);
        long sum = 0;
        for (int i=n-1; i>=0; i--)
            sum += i*arr[i] - (n-1-i)*arr[i];



        System.out.print(sum);

    }
}
