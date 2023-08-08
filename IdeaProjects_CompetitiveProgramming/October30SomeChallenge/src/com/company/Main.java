package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while (t-->0){
            int len=sc.nextInt();
            int k=sc.nextInt();

            int[] arr=new int[len];
            int sum=0;

            for (int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
                sum=sum+arr[i];
            }

            if (sum<=k){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
