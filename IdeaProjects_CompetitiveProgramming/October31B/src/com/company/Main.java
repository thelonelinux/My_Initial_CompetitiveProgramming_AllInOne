package com.company;

import java.util.Scanner;

public class Main {

    static boolean isKthBitSet(int n,int k){

        if(((n>>(k-1))&1)==1){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
	// write your code here

        long n,x;

        Scanner sc=new Scanner(System.in);

//        scanf("%ld",&n);

        n=sc.nextLong();


        x=n/2;
//        printf("%ld",(x+1)*(n-x));

        System.out.println((x+1)*(n-x));




    }
}
