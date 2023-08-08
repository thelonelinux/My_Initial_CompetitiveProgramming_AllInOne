package com.company;

import java.util.Scanner;

public class Leetcode {

    public static int reverse(int x) {
        Integer integer=Math.abs(x);
        String str=integer.toString();
        int len=str.length();
        boolean notInMiddle=false;

        if (x<0){
            System.out.print("-");
        }
        for (int i=len-1;i>=0;i--){
            if (str.charAt(i)!='0' ){
                System.out.print(str.charAt(i));
                notInMiddle=true;
            }
            if (str.charAt(i)=='0' && notInMiddle){
                System.out.print(str.charAt(i));
            }
        }


        return 0;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){

            int num=sc.nextInt();
            System.out.println(reverse(num));

        }

    }
}
