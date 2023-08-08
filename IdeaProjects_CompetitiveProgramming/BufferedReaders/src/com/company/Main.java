package com.company;

import jdk.nashorn.internal.runtime.UnwarrantedOptimismException;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    static String[] bigSorting(String arr[])
    {
        Arrays.sort(arr, (left, right) ->
        {
            if (left.length() != right.length())
                return left.length() - right.length();
            return left.compareTo(right);
        });

        return arr;
    }


    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    public static void main(String[] args) throws IOException {
	// write your code here

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of testcase");
        int testCase=Integer.parseInt(br.readLine());

        for(int j=0;j<testCase;j++){
            System.out.println("Enter the size of the first array");
            int len=Integer.parseInt(br.readLine());

            System.out.println("enter the "+len+ " element in the array");


            //Main function to write in single line for the array
            String  lines = br.readLine();
            String[] strs = lines.trim().split("\\s+");
            int[] a= new int[len];
            for (int i = 0; i < len; i++) {
                a[i] = Integer.parseInt(strs[i]);
            }


            //output
            System.out.println("Content in the element");
            Arrays.stream(a).forEach(System.out::println);
        }




    }
}
