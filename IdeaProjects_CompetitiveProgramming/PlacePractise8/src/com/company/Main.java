package com.company;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

//        Scanner scanner =new Scanner(System.in);

        InputStreamReader inputStreamReader =new InputStreamReader(System.in);

        BufferedReader bufferedReader=new BufferedReader(inputStreamReader);

        System.out.println("Enter the string :");

        String s= bufferedReader.readLine();

        System.out.println("Enter the integer value" );

        int n=Integer.parseInt(bufferedReader.readLine());
    }
}
