package com.company;

import sun.nio.ch.sctp.SctpNet;

import java.util.Scanner;
import java.util.Stack;


public class Main {

    static long mod=1000000000+7;


    public static void main(String[] args) {
	// write your code here

        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while (t-->0){


            long n=sc.nextLong();

            long k=sc.nextLong();


            long checkpoints = n / k;
            long ans = ((checkpoints%1000000007) * ((checkpoints + 1)%1000000007))%1000000007 * k;
            ans %= 1000000007;
            ans += n;
            ans %= 1000000007;

            System.out.println(ans);


        }
    }
}
