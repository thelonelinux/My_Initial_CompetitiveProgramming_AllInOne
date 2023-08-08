package com.company;

import sun.nio.cs.ext.MacHebrew;

import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    static int gemstones(String[] arr) {


        HashSet<Character> set=new HashSet<>();

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length();j++){

                set.add(arr[i].charAt(j));
            }
        }
        int count=0;
        int ans=arr[0].length();


        for (int i=0;i<arr.length;i++){

            char[] chars=arr[i].toCharArray();
            for (char c: arr[i].toCharArray()){
                if (set.contains(c)){

                }
            }

        }

        return set.size();


    }


    public static void main(String[] args) {
	// write your code here


        Scanner sc=new Scanner(System.in);

        int len=sc.nextInt();

        String[] arr=new String[len];

        for (int i=0;i<arr.length;i++){

            arr[i]=sc.next();


        }

        System.out.println(gemstones(arr));




    }
}
