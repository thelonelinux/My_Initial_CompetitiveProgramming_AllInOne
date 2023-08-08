package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[][] queries={{1 ,2 ,100}, {2 ,5, 100}, {3 ,4 ,100}};
        int[][] arrTwod2={{1,5,3}, {4,8,7}, {6,9,1}};

        int length =queries.length;

        int n=5;

        int[] arr = new int[n];

        for (int i=0;i<queries.length;i++){

            for (int j=0;j<queries[1].length;j++){

                for (int m=queries[i][j]-1;m<queries[i][j+1];m++){
                    arr[m]=arr[m]+queries[i][queries[i].length-1];
                }
            }
        }

//        Arrays.sort(arr);

        int longArray=arr[n-1];

        for (int a=0;a<arr.length;a++){
            System.out.println(arr[a]);
        }
    }
}
