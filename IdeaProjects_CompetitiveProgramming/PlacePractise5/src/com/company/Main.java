package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {


    static void minimumBribes(int[] q) {

        int n = q.length;

        int[] arr= Arrays.copyOfRange(q,0,q.length);

        Arrays.sort(arr);

        int value=0;
        for (int i=0;i<n;i++){

            if(Math.abs(arr[i]-q[i])<=2){
                value=value+Math.abs(arr[i]-q[i]);

            }

            else{
                if (Math.abs(arr[i]-q[i])>2 && (arr[i]-q[i])>0){
                    value=value+Math.abs(arr[i]-q[i])+2;
                }
                else{
                    if(Math.abs(arr[i]-q[i])>2 && (arr[i]-q[i])<0) {
                        System.out.println("Too chaotic");
                        return;
                    }
                }
            }
        }
        int finalValue=value/2;
        System.out.println(finalValue);


    }


    public static void main(String[] args) {
	// write your code here

        int[] arr={1 ,2, 5, 3, 7, 8, 6, 4};
        int[] arr2=Arrays.copyOfRange(arr,0,arr.length);

//        System.out.println(arr2[2]);

        minimumBribes(arr);
    }
}
