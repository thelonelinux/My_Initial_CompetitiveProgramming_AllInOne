package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the size of the given string");


        int n = scanner.nextInt();

        String[] g = new String[n];

        System.out.println("enter the values of strings in the array");

        for (int i =0; i<g.length;i++){
            System.out.println("enter the "+i+"th string");
            g[i]=scanner.next();
        }

        System.out.println("your given string content is ");

        for (int i =0; i<g.length;i++){
            System.out.print(g[i]+" ");
            System.out.println("");

        }

        System.out.println("now inter the size of query string array");

        int m = scanner.nextInt();

        String[] q = new String[m];

        for (int i =0; i<q.length;i++){
            System.out.println("enter the "+i+"th string");
            q[i]=scanner.next();
        }

        System.out.println("your given query string content is ");

        for (int i =0; i<q.length;i++){
            System.out.print(q[i]+" ");
            System.out.println("");



        }

        int[] h = new int[q.length];
        int sum=0;

        for (int i=0;i<q.length;i++){
            for (int j=0;j<g.length;j++){
                if(q[i].equals(g[j])){
                    sum=sum+1;


                }



            }
            h[i]=sum;
            sum=0;
        }

        System.out.print("your ans is :");

//        System.out.println(sum);

        for (int i =0; i<q.length;i++){
            System.out.print(h[i]+" ");


        }


        //3 ab bc cd 2 ab gh


    }
}
