package com.company;

import sun.nio.ch.sctp.SctpNet;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    static void ans(int A, int B){

        if(B>=A){
            if (A%2==0  && B%2==0){
                System.out.println("YES");
                return;

            }

            if (A%2==1 && B%2==1){
                System.out.println("YES");
                return;
            }

            if (A%2==1 && B%2==0){
                if ((A*2)<=B){
                    System.out.println("YES");
                    return;
                }
                else {
                    System.out.println("NO");
                    return;
                }
            }

            if (A%2==0 && B%2==1){
                System.out.println("NO");
                return;
            }
        }
        else {
            System.out.println("NO");
            return;
        }


    }

    public static void main(String[] args) {
	// write your code here

        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while (t-->0){

            int A=sc.nextInt();
            int B=sc.nextInt();

            ans(A,B);




        }
    }
}
