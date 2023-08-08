package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc=new Scanner(System.in);

        int[] arr={1,2,3,4,5};
        int[] ans=new int[arr.length];


        ArrayList<Integer> list=new ArrayList<>();
        int m=0;
        int k=sc.nextInt();

        if (k==1){
            for (int i=0;i<arr.length;i++){
//                System.out.print(arr[i]+" ");
                ans[m++]=arr[i];

            }
            System.out.println();
        }else if (k>=arr.length){
            for (int i=arr.length-1;i>=0;i--){
//                System.out.print(arr[i]+" ");
                ans[m++]=arr[i];
            }
//            System.out.println();
        }else{
            int mod=k;
            int j=1;
            while ((k-1)<arr.length){
                while (--k%mod!=0){
//                    System.out.print(arr[k]+" ");
                    ans[m++]=arr[k];

                }
//                System.out.print(arr[k]+" ");
                ans[m++]=arr[k];
                j++;
                k=j*mod;

            }
            int len=arr.length;
            if (arr.length%mod!=0){
                int remainder=arr.length%mod;
                while (remainder-->0){
//                    System.out.print(arr[len-1]+" ");
                    ans[m++]=arr[len-1];
                    len--;
                }
            }
//            System.out.println();
        }

        for (int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }


    }
}
