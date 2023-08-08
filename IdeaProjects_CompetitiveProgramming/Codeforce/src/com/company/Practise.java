package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Practise {



        // function to find the longest subarray
        // with sum divisible by k
        static int longSubarrWthSumDivByK(int arr[],
                                          int n, int k)
        {
            // unodered map 'um' implemented as
            // hash table
            HashMap<Integer, Integer> um= new HashMap<Integer, Integer>();

            // 'mod_arr[i]' stores (sum[0..i] % k)
            int mod_arr[]= new int[n];
            int max = 0;
            int curr_sum = 0;

            // traverse arr[] and build up the
            // array 'mod_arr[]'
            for (int i = 0; i < n; i++)
            {
                curr_sum += arr[i];

                // as the sum can be negative,
                // taking modulo twice
                mod_arr[i] = ((curr_sum % k) + k) % k;
            }

            for (int i = 0; i < n; i++)
            {
                // if true then sum(0..i) is
                // not divisible by k
                if (mod_arr[i] != 0)
                    // update 'max'
                    max = i + 1;

                    // if value 'mod_arr[i]' not present in 'um'
                    // then store it in 'um' with index of its
                    // first occurrence
                else if (um.containsKey(mod_arr[i]) == false)
                    um.put(mod_arr[i] , i);

                else
                    // if true, then update 'max'
                    if (max < (i - um.get(mod_arr[i])))
                        max = i - um.get(mod_arr[i]);
            }

            // required length of longest subarray with
            // sum divisible by 'k'
            return max;
        }

        public static void main (String[] args) {
//            int arr[] = {2, 7, 6, 1, 4, 5};
//            int n = arr.length;
//            int k = 3;

            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while (t-->0) {
                int len = sc.nextInt();
                int divisor = sc.nextInt();

                int[] arr = new int[len];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = sc.nextInt();
                }

                System.out.println("Length = "+
                        longSubarrWthSumDivByK(arr, len, divisor));

            }

        }

}
