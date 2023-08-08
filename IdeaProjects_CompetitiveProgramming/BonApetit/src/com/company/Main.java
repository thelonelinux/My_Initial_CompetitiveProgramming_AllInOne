package com.company;

import java.io.BufferedReader;
import java.io.*;
import java.util.*;

public class Main {



    // Complete the bonAppetit function below.
    //functon is howeer completed:
    //Rest do the input part of list later;
    static void bonAppetit(List<Integer> bill, int k, int b) {

        int[] arr = new int[bill.size()];

        for (int i=0;i<bill.size();i++){
            arr[i]=bill.get(i);
        }

        arr[k]=0;

        int sum=0;

        for (int i=0;i<arr.length;i++){

            sum=sum+arr[i];
        }

        int moneyPayable=sum/2;

        if (b==moneyPayable){
            System.out.println("Bon Appetit");
        }
        else{
            int num=b-moneyPayable;
            int nums=Math.abs(num);
            System.out.println(nums);
        }



    }

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the number of  things they ordered");

        int n=scanner.nextInt();

        List<Integer> bill = new ArrayList<>(n);

        int[] arr = new int[bill.size()];


        for (int i=0;i<bill.size();i++){
            arr[i]=scanner.nextInt();
            bill.add(arr[i]);

        }

        System.out.println("Enter the k of things she didn't ate :");

        int k=scanner.nextInt();

        System.out.println("Adding the total amount that both ate together");

        int b=scanner.nextInt();

        bonAppetit(bill,k,b);

    }
}
