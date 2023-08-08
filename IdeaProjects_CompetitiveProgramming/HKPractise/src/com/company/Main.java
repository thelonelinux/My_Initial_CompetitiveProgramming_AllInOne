package com.company;

import java.util.*;

public class Main {

    static long maximumSum(long[] a, long m) {

        long maxSum=0;
        int n=a.length;

        TreeSet<Long> prefix = new TreeSet<Long>();
        long currentSum=0;

        for(int i=0;i<n;i++){
            currentSum=(currentSum+a[i]%m)%m;
            SortedSet<Long> set = prefix.tailSet(currentSum+1);
            Iterator<Long> itr = set.iterator();
            if(itr.hasNext()){

                maxSum= Math.max(maxSum, (currentSum-itr.next()+m)%m);
            }

            maxSum=Math.max(maxSum, currentSum);
            prefix.add(currentSum);
        }


        return maxSum;

    }


    public static void main(String[] args) {
	// write your code here

//      String s="Welcome to Java";
//
//      for(String w : s.split("\\s",0)){
//
//          System.out.println(w);
//      }
//
//      for(String w : s.split("\\s",1)){
//
//          System.out.println(w);
//      }
//
//      for(String w : s.split("\\s",2)){
//
//          System.out.println(w);
//      }

//        String str = "GeeksforGeeks:A Computer Science Portal";
//        String[] arrOfStr = str.split(":");
//
//        for (String a : arrOfStr)
//            System.out.println(a);

        // Initializing array of integers
//        Integer[] num = { 2, 4, 7, 5, 9 };
//
//        // using Collections.min() to find minimum element
//        // using only 1 line.
//        int min = Collections.min(Arrays.asList(num));
//
//        // using Collections.max() to find maximum element
//        // using only 1 line.
//        int max = Collections.max(Arrays.asList(num));
//
//        // printing minimum and maximum numbers
//        System.out.println("Minimum number of array is : " + min);
//        System.out.println("Maximum number of array is : " + max);
//
//        int[] arr = { 2, 4, 7, 5, 9 };

        int[] arr3=new int[]{1,2,3};


//        long[] arr={1 ,5 ,9};
        long[] arr={3 ,3 ,9 ,9 ,5};

        int m=7;
        String s="hello";

        System.out.println(maximumSum(arr,m));
        System.out.println(arr3[1]);






    }
}
