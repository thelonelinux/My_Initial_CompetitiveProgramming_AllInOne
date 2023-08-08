package com.company;

import org.omg.PortableInterceptor.INACTIVE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    static long fun(long A, long B, long C){

        long first=B-A;
        long second=C-B;
        long sum=Math.abs(second-first);

        long ans=(long)Math.ceil(sum/2);

        if(sum%2!=0){
            ans=ans+1;
        }
        return ans;
    }



    public static void main(String[] args) throws java.lang.Exception {
	// write your code here

        Scanner sc=new Scanner(System.in);

        int testCase=sc.nextInt();

        for (int i=0;i<testCase;i++){
            long a=sc.nextLong();
            long b=sc.nextLong();
            long c=sc.nextLong();

            System.out.println(fun(a,b,c));


        }
    }
}
