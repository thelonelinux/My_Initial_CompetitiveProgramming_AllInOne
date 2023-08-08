package com.company;


import java.util.Scanner;

public class Main {

    static int solve(int N, int M){
        // Write your code here

        if (N%2==1 || M%2==1){
            return -1;
        }

        int cost=0;
        while (N!=M){

            if ((N+N)<M){
                //like 6 and 24 then better choose two
                cost+=N/2;
                N=N+2;

            }
            if ((N+N)>=M){
                
            }
        }

    }

    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int N=sc.nextInt();
            int M=sc.nextInt();

            System.out.println(solve(N,M));
        }

    }

}

