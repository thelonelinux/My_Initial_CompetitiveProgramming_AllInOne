package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static void fun(int[] arr, int n, int k){

        int[] arr2=Arrays.stream(arr).sorted().toArray();


        int sum=0;
        int count=0;

        for (int i=0;i<arr.length-1;i++){
            sum=arr[i]+arr[i+1];

            if (sum==k){
                System.out.println("true");
                System.out.print(arr[i]+" "+arr[i+1]);
                count=1;

                break;
            }
        }

        if (arr2[0]>k){
            System.out.println("false");
        }

        if (count==0){
            System.out.println("false");

        }


    }



    public static void main(String[] args) {
	// write your code here

        Scanner sc=new Scanner(System.in);

        String str=sc.next();
        String ans="";

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                if (str.charAt(i+1)==')'){
                    ans+="()";
                }

            }
        }

        System.out.print(ans);





    }
}
