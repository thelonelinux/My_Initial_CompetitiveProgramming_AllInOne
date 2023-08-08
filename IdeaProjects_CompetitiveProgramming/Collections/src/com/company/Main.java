package com.company;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Main {

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {



        int[] arr=new int[n];



        for(int i=0;i<queries.length;i++){
            for(int j=queries[i][0]-1;j<queries[i][1]-1;j++){
                arr[j]=arr[j]+queries[i][2];
            }
        }

        Arrays.sort(arr);
        long l=arr[arr.length-1];
        return l;



    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n=10;
        int[][] arr={{2 ,6, 8},
                {3 ,5, 7},
                {1 ,8 ,1},
                {5 ,9 ,15}};

        System.out.println(arrayManipulation(n,arr));
    }
}

