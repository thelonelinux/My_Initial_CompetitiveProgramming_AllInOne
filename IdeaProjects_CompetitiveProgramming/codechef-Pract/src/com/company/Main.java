package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        try{

            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while (t-->0){
                int len=sc.nextInt();
                int[] arr=new int[len];
                for (int i=0;i<arr.length;i++){
                    arr[i]=sc.nextInt();
                }
                int position=sc.nextInt();
                int num=arr[position-1];
                Arrays.sort(arr);

                for (int i=0;i<arr.length;i++){
                    if (num==arr[i]){
                        System.out.println(i+1);
                        break;
                    }
                }

            }

        }catch (Exception e){
            return;
        }

    }
}
