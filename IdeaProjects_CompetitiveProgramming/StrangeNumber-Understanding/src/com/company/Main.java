package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int t;
        Scanner scan=new Scanner(System.in);
        t=scan.nextInt();
        while(t--!=0)
        {
            long x,k;
            x=scan.nextInt();
            long x1=x;
            k=scan.nextInt();
            int sum=0;
            for(int i=2;i*i<=x1;i++) {
                if(x%i==0) {
                    while(x%i==0) {
                        x=x/i;
                        sum+=1;
                    }
                }
            }

            if(x!=1) {
                sum+=1;
            }

            if(sum>=k) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
