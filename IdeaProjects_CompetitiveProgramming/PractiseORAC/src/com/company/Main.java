package com.company;

import java.awt.image.AffineTransformOp;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws java.lang.Exception{
	// write your code here
        Scanner sc=new Scanner(System.in);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int len=sc.nextInt();
        String line=br.readLine();
        String[] str=line.trim().split("\\s+");


        String[][] arr=new String[len][];
        int m=0;
        for (int i=0;i<len;i++){

            for (int j=arr[i].length-1;j>=0;j--){
                arr[i][j]=str[m++];
            }
        }

        for (int i=len-1;i>=0;i--){
            for (int j=arr[i].length-1;j>=0;j--){
                System.out.println(arr[i][j]);
            }
        }
    }
}
