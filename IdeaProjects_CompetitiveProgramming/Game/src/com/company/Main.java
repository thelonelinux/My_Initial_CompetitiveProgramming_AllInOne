package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while (t-->0){

            int n=sc.nextInt();
            long[] arr1=new long[n];
            long[] arr2=new long[n];

            for (int i=0;i<n;i++){
                arr1[i]=sc.nextLong();
            }
            for (int i=0;i<n;i++){
                arr2[i]=sc.nextLong();
            }
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            int a=0;
            int b=0;
            int ok=0;

            while (a<n && b<n){
                if (arr1[a]>arr2[b]){
                    ok++;
                    a++;
                    b++;
                }
                else{
                    a++;
                }
            }

            System.out.println(ok);

        }
    }
}
