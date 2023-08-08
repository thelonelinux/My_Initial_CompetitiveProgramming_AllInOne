package com.company;

import java.util.Scanner;

public class Practise {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int q =sc.nextInt();
            int arr[] = new int[q];
            int min = Integer.MAX_VALUE;
            int sum=0;
            for (int j = 0; j < q; j++) {
                arr[j]=sc.nextInt();
                sum+=arr[j];
                min=Math.min(min, arr[j]);
            }
            //System.out.println(min+" "+sum);
            System.out.println(sum-q*min);
        }

    }

}
