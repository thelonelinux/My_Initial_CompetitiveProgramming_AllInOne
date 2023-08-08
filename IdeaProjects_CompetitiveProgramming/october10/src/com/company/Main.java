package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static int[] absolutePermutation(int n, int k) {

        int[] arr=new int[n];
        ArrayList<Integer> list=new ArrayList<>();

        int[] ans=new int[n];


        for(int i=0;i<n;i++){
            arr[i]=i+1;
            list.add(i+1);
        }

        for (int i=0;i<arr.length;i++){

            for(int j=0;j<list.size();j++){

                if(Math.abs(arr[i]-list.get(j))==k){
                    ans[i]=list.get(j);
                    list.remove(list.get(j));
                    break;
                }
            }


        }

        int[] ans2={-1};

        if (list.isEmpty()){
            return ans;
        }

        return ans2;

    }



    public static void main(String[] args) {
	// write your code here

        Scanner sc=new Scanner(System.in);

        int testCase=sc.nextInt();

        while (testCase-->0){

            int n=sc.nextInt();
            int k=sc.nextInt();

            int[] arr=absolutePermutation(n,k);

            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println("");
        }

    }
}
