package com.company;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{

     // Max tree size
     final static int MAX = 1000;

     static int BITree[] = new int[MAX];

     static int getSum(int index) {
         int sum = 0; // Iniialize result

         index = index + 1;

         while (index > 0) {

             sum += BITree[index];

             index -= index & (-index);
         }
         return sum;
     }


     public static void updateBIT(int n, int index,
                                  int val) {

         index = index + 1;

         while (index <= n) {
             BITree[index] += val;


             index += index & (-index);
         }
     }



    static void constructBITree(int arr[], int n) {
         // Initialize BITree[] as 0
         for (int i = 1; i <= n; i++)
             BITree[i] = 0;

         // Store the actual values in BITree[]
         // using update()
         for (int i = 0; i < n; i++)
             updateBIT(n, i, arr[i]);
     }


    // Main function
    public static void main(String args[])
    {
        int freq[] = {2, 1, 1, 3, 2, 3,
                4, 5, 6, 7, 8, 9};
        int n = freq.length;


        // Build fenwick tree from given array
        constructBITree(freq, n);

        System.out.println("Sum of elements in arr[0..5]"+
                " is "+ getSum(5));

        // Let use test the update operation
        freq[3] += 6;

        // Update BIT for above change in arr[]
        updateBIT(n, 3, 6);

        // Find sum after the value is updated
        System.out.println("Sum of elements in arr[0..5]"+
                " after update is " + getSum(5));
    }
}



