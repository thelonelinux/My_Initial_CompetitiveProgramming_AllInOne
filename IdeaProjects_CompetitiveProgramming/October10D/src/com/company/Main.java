package com.company;

import java.util.Scanner;

public class Main {


    static int stringSimilarity(String s) {


        String str=s;

        int sum=0;

        for(int i=0;i<str.length();i++){

            String sub=str.substring(i,str.length());
            sum=sum+compare(str,sub);

        }

        return sum;



    }

    static int compare(String string, String subString){

        if(string.equals(subString)){
            return string.length();
        }
        int count=0;

        for (int i=0;i<subString.length();i++){

            if (subString.charAt(i)==string.charAt(i)){
                count++;
            }
            else {
                break;
            }
        }

        return count;

    }



    public static void main(String[] args) {
	// write your code here

        Scanner sc=new Scanner(System.in);

        int testCase=sc.nextInt();

        while (testCase-->0){

            String str=sc.next();

            System.out.println(stringSimilarity(str));



        }
    }
}
