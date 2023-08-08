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
                Arrays.sort(arr);
                int ans=0;

                int min=arr[0];
                for (int i=0;i<arr.length;i++){
                    ans+=arr[i];
                }

                System.out.println(ans-len*min);
            }
        }catch (Exception e){
            return;
        }

    }
}
