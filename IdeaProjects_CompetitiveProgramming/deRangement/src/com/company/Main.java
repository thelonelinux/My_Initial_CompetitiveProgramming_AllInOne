package com.company;

public class Main {


    public static int derCount(int n){

        if (n==1) return 0;
        if (n==0) return 1;
        if (n==2) return 1;

        return (n-1)*(derCount(n-1)+derCount(n-2));

    }

    public static int derCount2(int n){
        int[] der=new int[n+1];

        der[0]=1;
        der[1]=0;
        der[2]=1;

        for (int i=3;i<=n;++i){
            der[i]=(i-1)*(der[i-1]+der[i-2]);
        }

        return der[n];
    }


    public static void main(String[] args) {
	// write your code here

        int n=4;

        System.out.println("Derangement= "+ derCount2(n));


    }
}
