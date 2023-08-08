package com.company;

import sun.nio.ch.sctp.SctpNet;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    static  int xoroonacci(int a, int b,int n){

        int initiala=a;
        int initialb=b;


        if (n==1) return a;
        if (n==2) return b;


        int next=0;
        int next2=0;
        int initialC=b;

        for (int i=3;i<=n;i++){

            next=initiala^initialb;
            next2=xnor(initiala,initialC);

            initiala=initialb;
            initialb=next;
            initialC=next2;

        }

        return Math.max(next,next2);

    }

    static int togglebit(int n)
    {
        if (n == 0)
            return 1;
        int i = n;

        n |= n >> 1;

        n |= n >> 2;
        n |= n >> 4;
        n |= n >> 8;
        n |= n >> 16;

        return i ^ n;
    }

    static int xnor(int num1, int num2)
    {

        if (num1 < num2)
        {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        num1 = togglebit(num1);

        return num1 ^ num2;
    }


    public static void main(String[] args) throws java.lang.Exception{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));



        int testCase =Integer.parseInt(br.readLine());

        while (testCase-- > 0) {

            String lines=br.readLine();
            String[] str=lines.trim().split("\\s+");

            int m = Integer.parseInt(str[0]);
            int n = Integer.parseInt(str[1]);

            int position = Integer.parseInt(str[2]);



            System.out.println(xoroonacci(m,n,position));


        }
    }

}