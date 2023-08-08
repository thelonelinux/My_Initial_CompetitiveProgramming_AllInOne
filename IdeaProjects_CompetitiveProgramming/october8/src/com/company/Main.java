package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static long mod=1000000000+7;

    static long fact(long m){

        if(m==0) return 1;
        if (m==1) return 1;

        else return ((m%mod)*(fact(m-1)%mod))%mod;
    }



     public static void main(String[] args) {
	// write your code here

         Scanner sc=new Scanner(System.in);

         int len=sc.nextInt();
         int k=sc.nextInt();

         int[] arr=new int[len];

         for (int i=0;i<arr.length;i++){
             arr[i]=sc.nextInt();
         }

         int[] arr2= Arrays.stream(arr).sorted().distinct().toArray();
         long ans=0;
         for (int i=1;i<len;i++){

            if (len-i >= k-1){

                long upper=fact(len-i);
                long lower1=fact(k-1);
                long lower2=fact((len-i)-(k-1));

                long down=(lower1*lower2)%mod;
                long fact=(upper/down)&mod;
                 ans=ans+arr2[arr2.length-i]*fact;
             }
         }

         System.out.println(ans);





    }
}


