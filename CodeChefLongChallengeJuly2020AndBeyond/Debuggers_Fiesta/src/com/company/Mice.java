package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Mice {

    public static void main(String[] args) throws java.lang.Exception {
        // write your code here

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            int[] arr=new int[n];
            int[] hole=new int[n];

            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            long max=Integer.MIN_VALUE;
            Arrays.sort(arr);
            for (int i=0;i<n;i++){
                hole[i]=sc.nextInt();
            }
            Arrays.sort(hole);
            int[] newHole=new int[hole.length];
            for (int i=0;i<hole.length;i++){
                newHole[i]=hole[n-1-i];
            }
            for (int i=0;i<n;i++){
                max=Math.max(Math.abs(newHole[i]-arr[i]),max);
            }

            System.out.println(max);
        }
    }
}
