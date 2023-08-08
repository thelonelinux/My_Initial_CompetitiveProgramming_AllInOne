package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws java.lang.Exception{
	// write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int len= Arrays.stream(arr).distinct().toArray().length;
        System.out.println(len-1);
    }
}
