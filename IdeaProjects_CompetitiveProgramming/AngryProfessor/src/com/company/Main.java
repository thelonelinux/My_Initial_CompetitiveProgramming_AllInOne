package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] a= new int[]{-1,0,-1,2,2};

        int n=a.length;

        int late=0;

        int time=0;

        for (int i=0;i<n;i++){
            if (a[i]>0){
                late=late+1;
            }
            else {
                time=time+1;
            }
        }



        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the number of k required to run the class: ");

        int k=scanner.nextInt();

        if(k<=time){
            System.out.println("Class is not cancelled");
        }
        else {
            System.out.println("class is cancelled");
        }
    }
}
