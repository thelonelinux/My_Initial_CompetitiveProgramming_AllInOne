package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws java.lang.Exception{
	// write your code here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long x=sc.nextLong();
            long y=sc.nextLong();
            long n=sc.nextLong();

            long left=n-x;
            long step=x-y;
            long ans=left/step;
            if (left%step!=0){
                System.out.println(ans+2);
            }else{
                System.out.println(ans+1);
            }


        }
    }
}
