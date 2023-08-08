package com.company;

import sun.nio.ch.sctp.SctpNet;

import javax.naming.InitialContext;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    static long factorial(long num){

        if (num==1) return 1;
        if (num==0) return 0;

        for (long i=num-1;i>=1;i--){
            num*=i;
        }

        return num;
    }
    static boolean isPrime(int n){

        if(n==1) return false;
        if(n==2) return true;

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws java.lang.Exception {
        // write your code here

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int t= Integer.parseInt(br.readLine());

        while (t-->0){

            int len=Integer.parseInt(br.readLine());


            int[] arr=new int[len];

            String lines=br.readLine();
            String[] str=lines.trim().split("\\s+");
            int count=0;


            for (int i=0;i<arr.length;i++){
                arr[i]=Integer.parseInt(str[i]);
                if (isPrime(arr[i])){
                    count++;
                }
            }

            System.out.println(count);


        }

    }
}

