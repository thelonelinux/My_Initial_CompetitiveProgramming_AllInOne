package com.company;

import sun.nio.cs.ext.MacHebrew;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    static boolean isPrime(int num){

        if (num==0)return false;
        if (num==1) return false;

        if (num==2) return true;

        for (int i=2;i<= Math.sqrt(num);i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) throws java.lang.Exception{
	// write your code here

//        Scanner sc=new Scanner(System.in);
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int len = Integer.parseInt(br.readLine());

            String lines = br.readLine();
            String[] str = lines.trim().split("\\s+");

            int[] arr = new int[len];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }

            int firstElement = 0, lastElement = 0;
            int firstHalf = 0, secondHalf = 0;

            int mid = len / 2;

            for (int i = 0; i < arr.length; i++) {

                if (i < mid) {
                    if (isPrime(arr[i])) {
                        firstHalf++;
                        if (firstElement == 0) {
                            firstElement = arr[i];
                        }
                    }
                }

                if (i >= mid) {
                    if (isPrime(arr[i])) {
                        secondHalf++;

                        lastElement = arr[i];

                    }
                }
            }



            if (firstHalf == secondHalf) {
                if (lastElement < firstElement) {
                    System.out.println("PERFECT");
                } else {
                    System.out.println("IMPERFECT");
                }
            } else {
                System.out.println("IMPERFECT");
            }
        }catch (Exception e){
            return;
        }
    }
}
