package com.company;

import java.util.Scanner;

public class Main {

    static int bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        int count=0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    //swap elements
                    count++;
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        return count;

    }

    public static void main(String[] args)throws Exception {
	// write your code here
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
        int[] arr=new int[n];
       for (int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }

       System.out.println(bubbleSort(arr));

    }
}
