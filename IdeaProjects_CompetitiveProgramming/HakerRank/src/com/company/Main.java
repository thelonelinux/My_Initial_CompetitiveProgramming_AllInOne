package com.company;

import java.util.Arrays;

public class Main {

    static int jumpingOnClouds(int[] c, int k) {

        int start=0;
        int jump=k;
        int total=c.length;
        int money=100;
        int nextJump=start;
        boolean ans=true;

        while(ans){
            nextJump=(nextJump+jump)%total;

            if(c[nextJump]==0){
                money=money-1;

            }
            else{
                money=money-3;
            }
            if(nextJump==start){
                // return money;
                ans=false;
            }
        }
        return money;


    }

    public static void main(String[] args) {
	// write your code here

        int[] c={0 ,0 ,1 ,0 ,0 ,1 ,1 ,0};
        int k=2;


        System.out.println(jumpingOnClouds(c,k));
    }
}
