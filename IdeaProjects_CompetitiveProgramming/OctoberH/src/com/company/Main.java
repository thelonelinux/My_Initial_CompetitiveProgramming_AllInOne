package com.company;

import javax.lang.model.util.SimpleAnnotationValueVisitor6;
import java.util.Scanner;

public class Main {

    static long mod=1000000000+7;
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while (t-->0){
            long num=sc.nextLong();

            long[] arr=new long[(int)num+1];

            long[] brr=new long[(int)num+1];

            arr[0]=1;
            arr[1]=2;

            brr[0]=1;
            brr[1]=1;

            for (int i=2;i<=num;i++){
                arr[i]=((2*(arr[i-1])%mod)+(3*(arr[i-2])%mod)+(2*(brr[i-1])%mod)%mod+(3*(brr[i-2])%mod)%mod)%mod;
                brr[i]=((2*(brr[i-1])%mod)+(3*(brr[i-2])%mod)%mod)%mod;
            }
            System.out.println(arr[(int)num]);
        }
    }
}
