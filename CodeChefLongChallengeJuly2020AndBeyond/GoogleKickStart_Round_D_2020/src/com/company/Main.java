package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws java.lang.Exception{
	// write your code here

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int m=0;
        while (t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            int[] maxArr=new int[n];
            int max=0;
            for (int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
                max=Math.max(arr[i],max);
                maxArr[i]=max;
            }

            int count=0;

            if (n==1){
                System.out.println("Case #"+(m++)+": "+1);
            }else{

                for (int i=0;i<n-1;i++){

                    if (i==0){
                        if (arr[i+1]<arr[i]){
                            count++;
                        }
                    }else{

                        if (maxArr[i-1]<arr[i] && arr[i]>arr[i+1]){
                            count++;
                        }
                    }

                }
                if (arr[n-1]>maxArr[n-2]){
                    count++;
                }
                System.out.println("Case #"+(m++)+": "+count);

            }

        }

    }
}
