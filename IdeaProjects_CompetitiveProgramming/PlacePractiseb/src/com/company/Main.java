package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {


    static void minimumBribes(int[] q) {

        int n = q.length;
        int[] arr= Arrays.copyOfRange(q,0,q.length);

        Arrays.sort(arr);

        int value=0;
        int index=0;


        for (int i=arr.length-1;i>0;i--){

            int arrayNum=arr[i];

            for (int j = 0; j < q.length; j++) {
                if (q[j] == arrayNum)
                     index= j+1;
            }

            if ((arr[i]-index)>2){
                System.out.println("Too chaotic");
                return;
            }
            else if (Math.abs(arr[i]-index)<=2){
                value=value+Math.abs(arr[i]-index);
            }
            else if (Math.abs(arr[i]-index)>2){
                value=value+Math.abs(arr[i]-index)+2;
            }
        }

        int finalValue=value/2;
        System.out.println(finalValue);


    }


    public static void main(String[] args) {
	// write your code here

        int[] arr={1 ,2, 5, 3, 7, 8, 6, 4};
        int[] arr2={2 ,1,5, 3, 4};
//        int[] arr2=Arrays.copyOfRange(arr,0,arr.length);

//        System.out.println(arr2[2]);

        minimumBribes(arr);
        minimumBribes(arr2);
    }
}
