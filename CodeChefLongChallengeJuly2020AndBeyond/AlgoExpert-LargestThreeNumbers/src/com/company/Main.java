package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int one=arr[0],two=arr[1],three=arr[2];
        int lowest=Math.min(one,Math.min(two,three));
        for (int i=3;i<n;i++){

            if (arr[i]>lowest){
                lowest=arr[i];
                lowest=Math.min(one,Math.min(two,three));
            }

        }

        int[] array= {one,two,three,lowest};
        Arrays.sort(array);

        System.out.println(array[3]+" "+array[2]+" "+array[1]);
    }
}
