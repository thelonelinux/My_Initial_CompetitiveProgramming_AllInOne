package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //or example, given the array  there are  elements,
        // two positive, two negative and one zero. Their ratios would be
        // ,  and . It should be printed as 0.40000 etc;see in hacker rank;
        //6 -4 3 -9 0 4 1

        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr = new int[n];

        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }

        double a=0;
        double b=0;
        double c=0;

        for (int i=0;i<n;i++){

            if(arr[i]>0){
                a=a+1;

            }
            else if(arr[i]<0){
                b=b+1;
            }
            else {
                c=c+1;
            }

        }

        double d=(a/n);
        double e=(b/n);
        double f=(c/n);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);





    }
}
