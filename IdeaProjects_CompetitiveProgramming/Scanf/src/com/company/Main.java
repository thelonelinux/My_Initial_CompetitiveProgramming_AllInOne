package com.company;

import org.omg.PortableInterceptor.INACTIVE;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws  java.lang.Exception{
	// write your code here

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int testCase=Integer.parseInt(br.readLine());

        for (int t=0;t<testCase;t++){

            String lines=br.readLine();
          String[] str=lines.trim().split("\\s+");

          String s1=str[0];
          String s2=str[1];

          System.out.println(s1+" && "+s2);






        }


    }
}
