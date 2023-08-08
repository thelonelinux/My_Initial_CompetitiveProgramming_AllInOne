package com.company;

import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws java.lang.Exception{
	// write your code here
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
       long[][] arr=new long[(int)n][2];

       for (int i=0;i<n;i++){
           arr[i][0]=sc.nextInt();
           arr[i][1]=sc.nextInt();
       }

       if (n<=2){
           System.out.println(n);
       }else{
           int count=1;
           long backMin=arr[0][0];
           long forwardMax=0;
           boolean done=false;

           for (int i=1;i<n-1;i++){
               forwardMax=arr[i+1][0];

               if (arr[i][0]-arr[i][1]>backMin || arr[i][0]+arr[i][1]<forwardMax){

                   if (arr[i][0]-arr[i][1]>backMin){

                       backMin=arr[i][0];
                       count++;
                       done=true;

                   }else if(arr[i][0]+arr[i][1]<forwardMax && !done){
                       backMin=arr[i][0]+arr[i][1];
                       count++;
                   }
                   done=false;
               }else{
                   forwardMax= arr[i+1][0];
                   backMin=arr[i][0];
               }
           }

           //for last one
           if (forwardMax<=arr[(int)n-1][0]){
               count++;
           }


           System.out.println(count);
       }



    }
}
