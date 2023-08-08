package com.company;

import sun.nio.ch.sctp.SctpNet;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while (t-->0){

            int n=sc.nextInt();
            int k=sc.nextInt();
            int[][] arr=new int[k][2];

            HashSet<Integer> set=new HashSet<>();
           for (int i=0;i<k;i++){
               arr[i][0]=sc.nextInt();
               set.add(arr[i][0]);
               arr[i][1]=sc.nextInt();
               set.add(arr[i][1]);
           }

           int[] pos=new int[n];

           for (int i=0;i<n;i++){
               pos[i]=i+1;
           }

           int ans=0;

           for (int i=0;i<n;i++){
               if (!set.contains(pos[i])){
                   ans=pos[i];
               }
           }

           if (ans==0){
               System.out.println("impossible");
           }
           else {
               System.out.print(ans/ans+" "+n*n);
           }
           System.out.println("");



        }
    }
}
