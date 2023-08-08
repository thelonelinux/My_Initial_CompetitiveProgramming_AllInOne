package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc=new Scanner(System.in);

       int[] arr=new int[3];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

       String[] strings=new String[3];

       for(int i=0;i<strings.length;i++){
           strings[i]=sc.next();
       }

       Arrays.sort(arr);
       String str="";


       for(int i=0;i<arr.length;i++) {
           str += strings[i];
       }

       System.out.println(str);


    }
}