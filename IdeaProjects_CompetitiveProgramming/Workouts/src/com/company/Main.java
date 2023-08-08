package com.company;

import java.util.Scanner;

public class Main {

    static int columnWithMaxZero(int a[][],int n){

        // Your code here
        int count=0;
        int max=0;
        int ans=0;

        for(int i=0;i<a.length;i++){
            for (int j=0;j<a.length;j++){
                if (a[j][i]==0){
                    count++;
                }

                if (count>=max){
                    max=count;
                    ans=j;
                    count=0;
                }
            }
        }
        return ans;


    }

    public static void main(String[] args) {
	// write your code here

        Scanner sc=new Scanner(System.in);

        int testCase=sc.nextInt();

        while (testCase-->0){

            int len=sc.nextInt();
//            int c=sc.nextInt();

            int[][] arr=new int[len][len];

            for (int i=0;i<arr.length;i++){
                for (int j=0;j<len;j++){
                    arr[i][j]=sc.nextInt();
                }
            }

            System.out.print(columnWithMaxZero(arr,len));
        }


    }
}
