package com.company;

import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class Main {

    public static int numOfPrime(int n){
        int[] arr=new int[n];

        for(int i=2;i<n;i++){
            arr[i]=i;
        }

        int max=(int)Math.sqrt(n);

        for (int j=2;j<=max;j++){
            for(int q=2; q<n-j;q++) {


                if (arr[j+q] / j == 0) {
                    arr[q + 1] = 0;
                }
            }
        }
        int m=0;
        int p=0;
        ArrayList<Integer> al= new ArrayList<>();
        while(arr[p]!=0){
            al.add(arr[m++]);
            p++;
        }

        return al.size();
    }

    public static void main(String[] args) {
	// write your code here

        int n=50;
        System.out.println(numOfPrime(n));
    }
}
