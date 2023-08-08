package com.company;

import sun.nio.ch.sctp.SctpNet;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static boolean isPower(double x, double y)
    {
        // The only power of 1 is 1 itself
        if (x == 1)
            return (y == 1);

        // Repeatedly compute power of x
        double pow = 1;
        while (pow < y)
            pow = pow * x;

        // Check if power of x becomes y
        return (pow == y);
    }

    public static void main(String[] args) {
	// write your code here

        Scanner sc=new Scanner(System.in);

        int testCase=sc.nextInt();

        while ( testCase-->0){


            double n=sc.nextDouble();

            boolean a=isPower(200,n);
            boolean b=isPower(10,n);
            boolean c=isPower(20,n);
            int ans=0;
            long val=0;

            for (long i=1;i<18;i++){
                for (long j=1;j<18;j++){
                    val=(10*j)*(20*i);


                        if (val==n){
                            ans=1;
//                            System.out.println("Yes");
                        }



                }
            }

            if (a || b || c || ans==1){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }




//            double quantitiy=1;
//            int ans=0;
//
//            while (quantitiy<=n){
//                if (quantitiy==n){
//                    ans=1;
//                }
//
//                quantitiy=quantitiy*(10*20);
//            }
//            int ten=10;
//
//            while (ten<=n){
//                if (n/ten==1){
//
//                    ans=1;
//                }
//                n=n/10;
//            }
//
//            int twenty=10;
//
//            while (twenty<=n){
//                if (n/twenty==1){
//
//                    ans=1;
//                }
//                n=n/20;
//            }
//
//            if (ans==1){
//                System.out.println("Yes");
//            }
//            else {
//                System.out.println("No");
//            }


        }
    }
}
