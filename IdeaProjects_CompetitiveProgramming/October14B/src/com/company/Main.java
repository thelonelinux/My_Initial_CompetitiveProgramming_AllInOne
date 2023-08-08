package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.lang.Character.MAX_VALUE;
import static java.lang.Character.forDigit;

public class Main {

    static int[] closestNumbers(int[] arr) {



        ArrayList<Integer> list=new ArrayList<>();

        Arrays.sort(arr);
        int min=MAX_VALUE;
        int diff=0;

        for (int i=1;i<arr.length;i++){

            diff=arr[i]-arr[i-1];

            min=Math.min(diff,min);


        }


        for (int i=1;i<arr.length;i++){
            if ((arr[i]-arr[i-1])==min){
                    list.add(arr[i-1]);
                    list.add(arr[i]);
            }
        }

        int[] array=new int[list.size()];

        for ( int i=0;i<list.size();i++){
            array[i]=list.get(i);
        }

        return array;


    }


    static int commonChild(String s1, String s2) {

        int stop=-1;
        int count=0;


       for (int i=0;i<s2.length();i++){

           for(int j=stop+1;j<s1.length();j++){

               if (s2.charAt(i)==s1.charAt(j)){
                   count++;
                   stop=j;
                   break;
               }

           }
       }

       int count2=0;
       int stop2=-1;
        for (int i=0;i<s1.length();i++){

            for(int j=stop2+1;j<s2.length();j++){

                if (s1.charAt(i)==s2.charAt(j)){
                    count2++;
                    stop2=j;
                    break;
                }

            }
        }

       return Math.max(count,count2);

    }




    public static void main(String[] args) {
	// write your code here

        Scanner sc=new Scanner(System.in);

       String str1=sc.next();
       String str2=sc.next();

       System.out.println(commonChild(str1,str2));


    }


}
