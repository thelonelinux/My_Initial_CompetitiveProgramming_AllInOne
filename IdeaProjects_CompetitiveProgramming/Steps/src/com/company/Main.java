package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int coverPoints(int[] A, int[] B) {

        int steps1=0;
        int steps2=0;

        // steps1=Math.abs(A[0]-B[0]);
        // steps2=Math.abs(A[1]-B[1]);

        Arrays.sort(A);
        Arrays.sort(B);


        steps1=(int)Math.abs(A[0]-B[B.length-1]);
        steps2=(int)Math.abs(B[0]-A[A.length-1]);

        int ans=(int)Math.max(steps1,steps2);

        return ans;
    }

    public static void main(String[] args){

        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] A= new int[n];
        for(int i=0;i<n;i++){
            A[i]=scn.nextInt();
        }

        int m=scn.nextInt();
        int[] B=new int[m];
        for(int i=0;i<n;i++){
            B[i]=scn.nextInt();
        }

        System.out.println(coverPoints(A,B));
    }
}


