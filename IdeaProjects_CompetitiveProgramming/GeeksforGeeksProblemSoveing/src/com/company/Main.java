package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {



    // Method for maximum amount of water
    static int findWater(int n,int[] arr)
    {
        // left[i] contains height of tallest bar to the
        // left of i'th bar including itself
        int left[] = new int[n];

        // Right [i] contains height of tallest bar to
        // the right of ith bar including itself
        int right[] = new int[n];

        // Initialize result
        int water = 0;

        // Fill left array
        left[0] = arr[0];
        for (int i = 1; i < n; i++)
            left[i] = Math.max(left[i-1], arr[i]);

        // Fill right array
        right[n-1] = arr[n-1];
        for (int i = n-2; i >= 0; i--)
            right[i] = Math.max(right[i+1], arr[i]);

        // Calculate the accumulated water element by element
        // consider the amount of water on i'th bar, the
        // amount of water accumulated on this particular
        // bar will be equal to min(left[i], right[i]) - arr[i] .
        for (int i = 0; i < n; i++)
            water += Math.min(left[i],right[i]) - arr[i];

        return water;
    }


    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        //enter the nunber of testcase
        int teseCase=sc.nextInt();
        for(int i=0;i<teseCase;i++){

            //enter the lenght of the ith array;

            int len=sc.nextInt();

            int[] arr=new int[len];

            //enter the elements in the array;

            for(int j=0;j<len;j++){
                arr[j]=sc.nextInt();
            }

            System.out.println(findWater(arr.length,arr));
        }
    }
}
