package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    static long mod=1000000000+7;

    static int palindromeIndex(String s){
        for(int i =0,j =s.length()-1; i<j; i++, j--)
            if(s.charAt(i)!=s.charAt(j))
                if(isPalindrome(s, i))
                    return i;
                else if(isPalindrome(s, j))
                    return j;
        return -1;
    }

    static boolean isPalindrome(String s, int index){
        for(int i =index+1,j =s.length()-1-index; i<j; i++, j--)
            if(s.charAt(i)!=s.charAt(j))
                return false;
        return true;
    }

    public static  int[] twoSum(int[] nums, int target) {

        int i=0;
        int j=nums.length-1;
        int[] arr=new int[2];

        int[] old= Arrays.stream(nums).toArray();

        Arrays.sort(nums);

        while(i<j){

            if(nums[i]+nums[j]==target){
                arr[0]=Arrays.binarySearch(old,nums[i]);
                arr[1]=Arrays.binarySearch(old,nums[j]);
            }

            if (nums[i]+nums[j]>target){
               j--;
            }
            else {
                i++;
            }

        }

        if (arr[0]==arr[1]){
            arr[1]=arr[0]+1;
        }
        return arr;

    }




    public static void main(String[] args) {
	// write your code here


       int[] arr={3,3};

       int[] ans=twoSum(arr,6);

       for (int i=0;i<ans.length;i++){
           System.out.println(ans[i]);
       }




    }
}
