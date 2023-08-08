package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int len=sc.nextInt();


            int[] arr=new int[len];
            for (int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }

            Arrays.sort(arr);
            int max=arr[len-1];

            for (int i=0;i<arr.length;i++){
                System.out.print(max+1+" ");
            }
            System.out.println();



        }
    }
}
