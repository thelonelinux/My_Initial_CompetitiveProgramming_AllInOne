package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class BikeRacing {

    public static void main(String[] args) throws java.lang.Exception {
        // write your code here

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int max=sc.nextInt();
            int l=sc.nextInt();

            int[][] arr=new int[n][2];
            for (int i=0;i<n;i++){
                arr[i][0]=sc.nextInt();
                arr[i][1]=sc.nextInt();
            }

            int value=0;
            int count=0;
            int initialSpeed=0;
            int acceleration=0;
            int nextSpped=0;
            while (value<max){
                for (int i=0;i<arr.length;i++){


                     acceleration=arr[i][1];
                     if (count==0){
                         initialSpeed=arr[i][0];
                        if (initialSpeed>l){
                            value+=initialSpeed;
                        }
                        else{
                            value=0;
                        }
                    }else{
                        nextSpped+=(initialSpeed+acceleration);
                        initialSpeed=nextSpped;
                        if (nextSpped>l){
                            value+=nextSpped;
                        }
                    }
                }
                if (value>max){
                    break;
                }else {
                    value=0;
                    count++;
                }
            }

            System.out.println(count);


        }
    }
}
