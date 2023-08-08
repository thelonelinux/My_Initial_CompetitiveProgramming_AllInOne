package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        try{
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while (t-->0){
                String str=sc.next();
                String newStr=new String();

                for (char c : str.toCharArray()){
                    int add=(int)c;
                    int plus=c+1;
                    if ((plus)==123){
                        plus=65;
                    }
                    newStr+=(char)plus;
                }
                String again=new String();

                for (char c : newStr.toCharArray()){
                    int plus=(int)c;
                    if (c==97 || c==101 || c== 105 || c==111 || c==117){
                         plus=plus-32;
                    }
                    again+=(char)plus;


                }
//                System.out.println(newStr);
                System.out.println(again);

            }
        }catch (Exception e){
            return;
        }

    }
}
