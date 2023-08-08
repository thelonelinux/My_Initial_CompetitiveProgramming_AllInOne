package com.company;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;



public class Main {

    static int ans(int n){

        if(n<9){
            return-1;
        }

        if(n%9==0){
            return n/9;
        }

        if(n%10==9){
            return 1;
        }

        if(n%19==0){
            return n/19;
        }

        if(n%9!=0  || n%19!=0){
            return -1;
        }

        return -1;

    }


    public static void main(String[] args) throws IOException {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       Scanner sc=new Scanner(System.in);

       int testCase=sc.nextInt();


       for(int t=0;t<testCase;t++){

           int n=sc.nextInt();

           System.out.println(ans(n));




       }
    }


}