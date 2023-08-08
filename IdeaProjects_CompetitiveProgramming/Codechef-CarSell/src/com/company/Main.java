package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        long mod=1000000007;

        try{

            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while (t-->0){
                int n=sc.nextInt();
                int[] arr=new int[n];
                long sum=0;
                for (int i=0;i<arr.length;i++){
                    arr[i]=sc.nextInt();
                }
                Arrays.sort(arr);
                int[] newArr=new int[n];
                for (int i=0;i<arr.length;i++){
                    newArr[i]=arr[n-1-i];
                }
                for (int i=0;i<arr.length;i++){
                    if (newArr[i]>i){
                        sum=((sum%mod)+(newArr[i]-i)%mod)%mod;
                    }else {
                        break;
                    }
                }

                System.out.println(sum);
            }

        }catch (Exception e){
            return;
        }
    }
}
