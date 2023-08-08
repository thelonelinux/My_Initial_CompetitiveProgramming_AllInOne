package com.company;

import sun.nio.ch.sctp.SctpNet;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
	// write your code here

        Scanner sc=new Scanner(System.in);

        int len=sc.nextInt();
        int k=sc.nextInt();

        int[] arr=new int[len];

        for (int i=0;i<arr.length;i++){

            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);
        int n=len;

        // To store the required count
        int cnt = 0;
        int i = 0, j = 1;

        while (i < n && j < n) {


            j = (j <= i) ? (i + 1) : j;
            while (j < n && (arr[j] - arr[i]) < k)
                j++;


            cnt += (n - j);


            i++;
        }


        System.out.print(cnt);
    }
}
