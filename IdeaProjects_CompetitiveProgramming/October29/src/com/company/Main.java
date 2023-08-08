package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static long getWays(int n, List<Long> c) {
        int m=c.size();

        long[] S=new long[m];
        for (int i=0;i<m;i++){
            S[i]=c.get(i);
        }
        long[] table = new long[n+1];

        // Initialize all table values as 0
        Arrays.fill(table, 0);   //O(n)

        // Base case (If given value is 0)
        table[0] = 1;

        // Pick all coins one by one and update the table[]
        // values after the index greater than or equal to
        // the value of the picked coin
        for (int i=0; i<m; i++)
            for (int j=(int)S[i]; j<=n; j++)
                table[j] += table[(int)(j-S[i])];

        return table[n];


    }

    public static void main(String[] args) {
	// write your code here

        int arr[] = {1, 2, 3};

        List<Long> c=new ArrayList<>();
        c.add((long)1);
        c.add((long)2);
        c.add((long)3);

        int m = arr.length;
        int n = 4;
        System.out.println(getWays(n,c));

    }
}
