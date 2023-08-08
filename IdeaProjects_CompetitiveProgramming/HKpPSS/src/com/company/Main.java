package com.company;

import java.math.BigInteger;

public class Main {

    static long strangeCounter(long t) {

        //Wont run in o(n)
        long clock=3;
        long pivot=clock;
        long count=0;

        for(long i=1;i<=t;i++){
            count=clock--;
            if(clock==0){
                pivot=pivot*2;
                clock=pivot;
            }

        }
        BigInteger bg=BigInteger.valueOf(count);
        long ans= bg.longValue();
        return ans;

        //o(logn) algorithm;
//        long rem = 3;
//        while (t > rem){
//            t = t-rem;
//            rem *= 2;
//        }
//
//        return (rem-t+1);



    }


    public static void main(String[] args) {
	// write your code here

        long l=17;
        long m=1000000000000L;

//        long b=649267441662;
//        long[] arr=strangeCounter(m);
//
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }

        System.out.println(strangeCounter(m));

    }
}
