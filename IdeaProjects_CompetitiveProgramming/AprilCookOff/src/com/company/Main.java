package com.company;

import java.util.Scanner;

public class Main {

    static long mod=1000000000+7;

    public static void main(String[] args) throws java.lang.Exception {
	// write your code here

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){

            long size=sc.nextLong();
            long start=sc.nextLong();
            long odd=1;
            long ans=(long)Math.pow(start,1);
            long nextStart=ans*start;
            for (int i=1;i<size;i++){
                odd=odd+2;
                long toBeAdded=(long)Math.pow(nextStart,odd);
                ans+=(long)Math.pow(nextStart,odd);
                nextStart=toBeAdded*nextStart;
            }

            System.out.println(ans%mod);

        }

    }
}
