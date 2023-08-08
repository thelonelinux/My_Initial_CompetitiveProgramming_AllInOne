package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
	//Dynamic Programming Memoization Method this below is.
	//In another example we will see about Tabulation method
	//In tabulation method we normally make table of
	//n+1 and m+1 to find the optimal solution

        int[] arr={20,21,7,6,5};

        int[] L=new int[arr.length];
        for (int i=0;i<arr.length;i++){
            L[i]=1;
        }

        int max=0;
        for (int i=1;i<arr.length;i++){
            for (int j=0;j<i;j++){
                if (arr[j]<arr[i]){
                    max=Math.max(L[j],max);
                }
            }
            L[i]=L[i]+max;
            max=0;
        }

        Arrays.sort(L);
        System.out.println(L[arr.length-1]);


    }
}
