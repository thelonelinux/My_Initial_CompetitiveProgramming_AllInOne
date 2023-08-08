package com.company;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Arrays;

public class Main {

   public static String biggerIsGreater(String w) {

        char[] arr=w.toCharArray();

        int[] nums=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            nums[i]=arr[i];
        }

        int count=0;

        for(int v=nums.length-1;v>0;v--){
            if(nums[v-1]>=nums[v]){
                count++;
            }
        }

            int i = nums.length - 2;
            while (i >= 0 && nums[i + 1] <= nums[i]) {
                i--;
            }

            if (i >= 0) {
                int j = nums.length - 1;
                while (j >= 0 && nums[j] <= nums[i]) {
                    j--;
                }


                swap(nums, i, j);
            }
            reverse(nums, i + 1);

            char[] chars=new char[nums.length];
            for(int v=0;v<nums.length;v++){
                chars[v]=(char)nums[v];
            }

            String str=new String(chars);

            if(count>=nums.length-1){
                return "no answer";
            }

            return str;

        }

        /**
         Reverses from 'start' to the end of the array 'nums'
         */
        public static void reverse(int[] nums, int start) {

            int left = start;
            int right = nums.length - 1;

            while (left < right) {
                swap(nums, left, right);
                left++;
                right--;
            }

        }

        /**
         Swap helper
         */
        public static void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }


    public static void main(String[] args) {
	// write your code here

//        String str="110011";
//        String str2="101100";
//
//
//        int ans= Integer.parseInt(str,2);
//        int ans2=Integer.parseInt(str2,2);
//
//        int ansFinal=ans|ans2;
//
//
//        System.out.println(ansFinal);

        String str="cb";

        System.out.println(biggerIsGreater(str));

    }
}
