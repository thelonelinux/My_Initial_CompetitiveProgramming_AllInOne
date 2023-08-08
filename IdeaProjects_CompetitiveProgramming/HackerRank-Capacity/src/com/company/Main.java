package com.company;

import jdk.jshell.SourceCodeAnalysis;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static String organizingContainers(int[][] arr) {

        int sizeOfArray=arr.length;

        int[] columnSum=new int[sizeOfArray];
        int[] rowSum=new int[sizeOfArray];
        int colSum=0;
        int roSum=0;

        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                roSum+=arr[i][j];
            }
            rowSum[i]=roSum;
            roSum=0;
        }

        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                colSum+=arr[j][i];
            }
            columnSum[i]=colSum;
            colSum=0;
        }

        Arrays.sort(rowSum);
        Arrays.sort(columnSum);
        if (Arrays.equals(columnSum,rowSum)){
            return "Possible";
        }
        else {
            return "Impossible";
        }

    }

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while (t-->0){
            int sizeOfArray=sc.nextInt();
            int[][] arr=new int[sizeOfArray][sizeOfArray];

            for (int i=0;i<arr.length;i++){
                for (int j=0;j<arr.length;j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            System.out.println(organizingContainers(arr));
        }

    }
}
