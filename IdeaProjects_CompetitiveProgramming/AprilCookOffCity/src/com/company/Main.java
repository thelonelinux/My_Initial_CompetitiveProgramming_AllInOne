package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();

            int sum=0;
            for ( int i=1;i<=n-1;i++){
                for (int j=i+1;j<=n;j++){
                    sum=sum+(i & j);
                }
            }

            if (sum==0){
                System.out.println(-1);
            }else{
                System.out.println(sum);
            }
        }

    }
}
