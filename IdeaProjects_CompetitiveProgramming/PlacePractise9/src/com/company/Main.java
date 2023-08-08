package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        2
//        5 2
//        11 3

        Scanner s= new Scanner(System.in);

        int n=s.nextInt();

        int[][] array=new int[n][2];


        for (int i=0;i<n;i++){

            for (int j=0;j<2;j++)
            array[i][j]=s.nextInt();
        }
        int[] temp =new int[n];
        int c=0;

        for (int m=0;m<n;m++){
            int left=array[m][0]/array[m][1];
            temp[c]=left;
            c++;
            left=0;

        }

        for (int b=0;b<n;b++){
            System.out.println(temp[b]);
        }
    }
}
