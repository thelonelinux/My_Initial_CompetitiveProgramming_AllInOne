package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {

    static int findMaxSubarraySum(int arr[],
                                  int n, int sum){
        // To store current sum and
        // max sum of subarrays
        int curr_sum = arr[0], max_sum = 0, start = 0;

        // To find max_sum less than sum
        for (int i = 1; i < n; i++) {

            // Update max_sum if it becomes
            // greater than curr_sum
            if (curr_sum <= sum)
                max_sum = Math.max(max_sum, curr_sum);

            // If curr_sum becomes greater than
            // sum subtract starting elements of array
            while (curr_sum + arr[i] > sum && start < i) {
                curr_sum -= arr[start];
                start++;
            }

            // Add elements to curr_sum
            curr_sum += arr[i];
        }

        // Adding an extra check for last subarray
        if (curr_sum <= sum)
            max_sum = Math.max(max_sum, curr_sum);

        return max_sum;
    }

    static long maxSum(List<Integer> arr, long threshold){
        int n=arr.size();
        long currentSum=arr.get(0);
        long maxSum=0;
        long start=0;
        for (int i=1;i<n;i++){
            if (currentSum<=threshold){
                maxSum=Math.max(maxSum,currentSum);
            }
            while (maxSum+arr.get(i)>threshold && start<i){
                currentSum-=arr.get((int)start);
                start++;
            }

            currentSum=currentSum+arr.get(i);
        }

        if (currentSum<=threshold){
            maxSum=Math.max(maxSum,currentSum);
        }
        return maxSum;

    }

    // Driver program to test above function
    public static void main(String[] args)
    {
        int arr[] = { 1, 2, 4,5 };
        List<Integer> list=new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        int n = arr.length;
        int sum = 10;

        System.out.println(findMaxSubarraySum(arr, n, sum));
        System.out.println(maxSum(list,  sum));
    }
}
