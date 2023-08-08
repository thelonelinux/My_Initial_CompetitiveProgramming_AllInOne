package com.company;

import java.util.Arrays;

public class Main {

    static long arrayManipulation(int n, int[][] queries) {

        int[] arr = new int[n];

        for (int i=0;i<queries.length;i++){

            for (int j=0;j<queries[1].length;j++){

                for (int m=queries[i][j]-1;m<queries[i][queries[i].length-2]-1;m++){
                    arr[m]=arr[m]+queries[i][queries[i].length-1];
                }
            }
        }

        Arrays.sort(arr);

        int longArray=arr[n-1];



        return longArray;

    }


    public static void main(String[] args) {
	// write your code here

        int[][] arrTwod={{1 ,2 ,100}, {2 ,5, 100}, {3 ,4 ,100}};
        int[][] arrTwod2={{1,5,3}, {4,8,7}, {6,9,1}};

        int length =arrTwod.length;

        int n=5;

        System.out.println(arrayManipulation(n,arrTwod));
        System.out.println(arrayManipulation(10,arrTwod2));


    }
}
