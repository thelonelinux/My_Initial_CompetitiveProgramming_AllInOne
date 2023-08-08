package com.company;

import java.util.*;
import java.io.*;
import java.lang.*;

public class Solution{

    public static void main(String[] args) throws java.lang.Exception{

        try{

            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            int v=0;
            while(t-->0){
                long n=sc.nextInt();
                long money=sc.nextInt();
                long[] arr=new long[(int)n];
                for(int i=0;i<n;i++){
                    arr[i]=sc.nextInt();

                }

                Arrays.sort(arr);
                long count=0;
                for(int i=0;i<n;i++){
                    if(money>=arr[i]){
                        count++;
                        money-=arr[i];
                    }
                }
                ++v;
                System.out.println("Case #"+v+": "+count);
            }

        }catch (Exception e){
            return;
        }



    }
}
