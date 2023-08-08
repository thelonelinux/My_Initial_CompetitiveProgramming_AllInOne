package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] ar= new int[]{10 ,20, 20, 10, 10, 30, 50, 10, 20};

        int n=ar.length;

        Arrays.sort(ar);

        int[] temp=new int[n];

        int j=0;

        for (int i=0;i<n-1;i++){
            if(ar[i]!=ar[i+1]){
                temp[j++]=ar[i];
            }

        }
        temp[j++]=ar[ar.length-1];

//        for (int i=0 ;i<j;i++){
//            System.out.println(temp[i]);
//        }

        int[] newarr=new int[j];

        int count=0;

        for (int i=0;i<j;i++){
            for (int m=0;m<n;m++){
                if (temp[i]==ar[m]){
                    count=count+1;
                }
            }
            newarr[i]=count;
            count=0;

        }

        int sum=0;

        for (int i=0;i<j;i++){
            int indesxum=newarr[i]/2;
             sum= sum+indesxum;
        }

        System.out.println(sum);

//        Scanner scanner = new Scanner(System.in);
//
//        int[] arr=new int[ar.length];
//
//        Arrays.sort(ar);
//        int sum1=0;
//        for(int i=0;i<ar.length;i++){
//            for(int j=1;j<ar.length;j++){
//                if(ar[i]==ar[j]){
//                    sum1=sum1+1;
//
//                }
//            }
//            ar[i]=sum1;
//
//        }
//
//        int p=0;
//        int max=0;
//
//        Arrays.sort(arr);
//        for(int i=0;i<arr.length;i++){
//            int m=arr[i]%2;
//            if(m==0){
//                 p=arr[i];
//
//            }
//        }
//
//        System.out.println(p);

    }
}
