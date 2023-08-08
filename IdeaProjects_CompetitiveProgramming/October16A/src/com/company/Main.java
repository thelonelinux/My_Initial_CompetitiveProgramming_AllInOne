package com.company;

import sun.nio.ch.sctp.SctpNet;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc=new Scanner(System.in);

        int testCase=sc.nextInt();

        while (testCase-->0){

            long A=sc.nextLong();
            long B=sc.nextLong();
            long C=sc.nextLong();

            long sum=A*1+B*2+C*3;

            if (sum%2==0){
                System.out.print("YES");
            }
            else{
                System.out.print("NO");
            }
        }
    }
}
