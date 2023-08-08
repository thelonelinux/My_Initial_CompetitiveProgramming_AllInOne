package com.company;

import sun.nio.ch.sctp.SctpNet;

import java.util.Scanner;

public class Main {

    static long maximumXOR(long n, long l, long r)
    {
        long x = 0;
        for (long i = (long) (Math.log(r)/Math.log(2)); i >= 0; --i)
        {
            if ((n & (1 << i))>0) // Set bit
            {
                if ((x > r) || (x + (1 << i) - 1 < l))
                    x ^= (1 << i);
            }
            else // Unset bit
            {
                if ((x ^ (1 << i)) <= r)
                    x ^= (1 << i);
            }
        }
        return n ^ x;
    }


    public static void main(String[] args) {
	// write your code here

        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while (t-->0){
            long lower=sc.nextLong();
            long upper=sc.nextLong();
            long max=0;
            long ans=upper;


            for (long i=lower;i<=upper;i++){
                max=i|upper;
                if (max>ans){
                    ans=max;
                }
                i++;
            }

            System.out.println(ans);
        }

    }
}
