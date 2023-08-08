package com.company;

import java.util.Scanner;

public class Factors {

    public static void main(String[] args) {

        try{
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while (t-->0){
                long x=sc.nextLong();
                long k=sc.nextLong();
                int number = (int)(x/2);
                int numOfFactors=0;
                for(int i = 1; i <= number; ++i) {
                    if (x % i == 0) {
                        numOfFactors++;
                    }
                    if (numOfFactors+1>k){
                        System.out.println(1);
                        break;
                    }
                }
                if (numOfFactors+1<=k){
                    System.out.println(0);
                }
            }
        }catch (Exception e){
            return;
        }
    }
}
