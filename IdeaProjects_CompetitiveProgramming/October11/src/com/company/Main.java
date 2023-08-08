package com.company;

import sun.nio.ch.sctp.SctpNet;

import java.util.Scanner;

public class Main {

    static int palindromeIndex(String s) {

        StringBuilder sb=new StringBuilder(s);

        String rev=sb.reverse().toString();

        if (s.equals(rev)){
            return -1;
        }

        for (int i=0;i<s.length();i++){

            String str= s.substring(0,i) + s.substring(i+1,s.length());
            StringBuilder sb2=new StringBuilder(str);
            String reverse=sb2.reverse().toString();

            if(str.equals(reverse)){
                return i;
            }

        }

        return -1;


    }

    public static void main(String[] args) {
	// write your code here

        Scanner sc= new Scanner(System.in);

        int testCase=sc.nextInt();

        while (testCase-->0){
            String str=sc.next();

            System.out.println(palindromeIndex(str));
        }

    }
}
