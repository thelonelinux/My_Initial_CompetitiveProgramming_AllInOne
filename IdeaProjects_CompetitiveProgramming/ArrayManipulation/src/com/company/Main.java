package com.company;

public class Main {

    static long arrayManipulation(int n, int[][] queries) {

        long arr[] = new long[n];

        // each successive element contains the difference between itself and previous element

        for (int i = 0; i < queries.length; i++) {
            // when checking query, subtract 1 from both a and b since 0 indexed array
            int a = queries[i][0] - 1;
            int b = queries[i][1] - 1;
            int k = queries[i][2];

            arr[a] += k;
            if (b+1 < n) {
                arr[b+1] -= k;
            }
        }

        // track highest val seen so far as we go
        long max = Long.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i-1];
            max = Math.max(arr[i], max);
        }

        return max;



    }

    public static void main(String[] args) {
	// write your code here

        int[][] query={{1 ,2 ,100},
                    {2, 5, 100},
                    {3 ,4, 100}};

        System.out.println(arrayManipulation(5,query));
    }
}
