package com.company;

import java.util.Scanner;

public class Codeforce {

    public static void main(String[] args) throws java.lang.Exception{
        Scanner sc=new Scanner(System.in);


        int t=sc.nextInt();
        while (t-->0){

            int n=sc.nextInt();
            int[] arr=new int[n];

            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }

            int sum=0;
            for (int i=0;i<n;i++){
                sum+=arr[i];
            }
            if (sum%n==0){
               System.out.println(sum/n);
            }else{

                long ans=sum/n;
                System.out.println(ans+1);
            }

        }
    }

}
