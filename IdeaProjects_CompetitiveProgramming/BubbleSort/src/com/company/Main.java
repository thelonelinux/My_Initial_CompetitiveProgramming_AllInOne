package com.company;

import java.util.Arrays;
import java.util.HashSet;

public class Main {

    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }

    public static void main(String[] args) {
	// write your code here

        int[] prices={3 ,7, 2, 9, 4,1};
        int k=15;

        Arrays.sort(prices);

        int count=0;
        int sum=0;


        int i=0;
        while(sum<=k && i<prices.length){


            sum=sum+prices[i];
            count++;
            i++;
        }

       System.out.println(count-1);

        HashSet<Integer> hs=new HashSet<>();
        hs.add(1);

    }
}
