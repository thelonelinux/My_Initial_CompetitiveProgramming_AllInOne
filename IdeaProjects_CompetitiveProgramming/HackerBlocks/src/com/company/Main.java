package com.company;

import java.util.Scanner;

public class Main {


    static long mod=1000000000+7;

    static long fact(long m){
        if (m==0) return 0;
        if (m==1) return 1;

        else return ((m%mod)*(fact(m-1)%mod))%mod;

    }

    static long powe(long n, long m){

        if (n-m==0)return 1;

        long x=n-m;
        long y=1;
        while (x-->0){
            y=((y%mod)*((n-m)%mod))%mod;
        }
        return y;
    }


    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);


        int testCases = sc.nextInt();

        long n=5;
        long r=2;

        System.out.println("Helo");

        long mfact=0;

        System.out.println(mfact);
//        long mpow=powe(n,r);
//
//        System.out.println("Hello World");
//
//        System.out.println(((mfact%mod)*(mpow%mod))%mod);




    }
}