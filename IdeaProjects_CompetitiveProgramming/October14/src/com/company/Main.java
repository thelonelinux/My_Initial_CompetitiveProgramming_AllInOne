package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    static String[] weightedUniformStrings(String s, int[] queries) {

        String[] arr=new String[queries.length];

        HashSet<Integer> set=new HashSet<>();
        int m=1;
        set.add((int)s.charAt(0)-96);

        for (int i=1;i<s.length();i++){

            if (s.charAt(i)!=s.charAt(i-1)){
                set.add((int)s.charAt(i)-96);
                m=1;
            }


            if (s.charAt(i)==s.charAt(i-1)){
                m++;
                int sum=m*((int)s.charAt(i)-96);
                set.add(sum);

            }
        }
        int n=0;

        for (int i=0;i<queries.length;i++){

            if (set.contains(queries[i])){
                arr[n++]="Yes";

            }
            else{
                arr[n++]="No";
            }
        }

        return arr;


    }

    public static void main(String[] args) {
	// write your code here


        Scanner sc=new Scanner(System.in);


        String str=sc.next();
        int len=sc.nextInt();

        int[] queries=new int[len];


        for (int i=0;i<queries.length;i++){
            queries[i]=sc.nextInt();
        }

        String[] arr=weightedUniformStrings(str,queries);

        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }





    }
}
