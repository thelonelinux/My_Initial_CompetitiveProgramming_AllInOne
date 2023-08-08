package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws java.lang.Exception {
        // write your code here

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int minCache = sc.nextInt();
            int n = sc.nextInt();
            String[] arr = new String[n];
            int[] finals=new int[10001];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.next();
                if (arr[i].equals("SET")){
                    int key=sc.nextInt();
                    int value=sc.nextInt();
                    finals[key]=value;
                }
                else if (arr[i].equals("GET")){
                    int key=sc.nextInt();
                    System.out.print(finals[key]+" ");
                }
            }
            System.out.println();


        }
    }
}