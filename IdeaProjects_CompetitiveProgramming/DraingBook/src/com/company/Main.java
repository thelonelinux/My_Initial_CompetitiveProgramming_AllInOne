package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Enter the total number of pages in the book");

        Scanner scanner = new Scanner(System.in);

        int n=scanner.nextInt();

        int[] arr=new int[n];


        for (int i=0;i<n;i++){
            arr[i]=i+1;
        }

        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

        int turn=1;

        int lastTurn=arr[n-1];

//        System.out.println("last" + lastTurn);

        System.out.println("Enter which page you want to get");

        int p=scanner.nextInt();

        int count=0;

       while(p>=turn ){
           count=count+1;
           turn=turn+2;
//           lastTurn=lastTurn-2;
       }
       count=count-1;

       int count2=0;

       while (p<=lastTurn){
           count2=count2+1;
           lastTurn=lastTurn-2;

       }
       count2=count2-1;

       int min=Math.min(count,count2);
//       count=count-1;
//       if (count==0){
//           count=0;
//       }
//       else {
//           count=count-1;
//       }


       System.out.println(min);

//       System.out.println(lastTurn);
//       System.out.println(turn);


    }
}
