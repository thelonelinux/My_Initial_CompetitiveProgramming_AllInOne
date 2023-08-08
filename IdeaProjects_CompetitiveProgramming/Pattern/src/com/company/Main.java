package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Pattern Staircase

        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];

//        for (int i=0;i<n;i++){
//            for (int j=n;j>n-1-i;j--){
//                System.out.print(" # ");
//            }
//            System.out.println("");
//        }

        for (int i=4;i>n;i--){
            for (int j=0;j<n-1-i;j++){
                System.out.print(" # ");
            }
            System.out.println("");
        }
    }
}
