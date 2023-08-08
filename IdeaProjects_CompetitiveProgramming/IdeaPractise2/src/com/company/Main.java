package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


//        Scanner scanner = new Scanner(System.in);
//
//        int n = scanner.nextInt();
//
//        String s = scanner.next();
//
//        System.out.println(n);
//
//        System.out.println(s);

//        int n=10;
//
//        float f=10.05646F;
//
//        double d=10.2123;
//
//        long l=10L;
//
//        char c= 'r';
//
//        String s= "vicky";
//
//        boolean b=true;
//
//        System.out.println(n);
//        System.out.println(f);
//        System.out.println(d);
//        System.out.println(l);
//
//        System.out.println(c);
//        System.out.println(s);
//
//        System.out.println(b);





//        int n;
//        scanf("%d",&n);
//
//        int i ;
//        int arr[n];
//
//        for(i=0;i<n;i++){
//            scanf("%d",&arr[i]);
//        }
//
//        for(i=n-1;i>=0;i--){
//            printf("%d",arr[i]);
//        }


        //Decision Making

//        int a,b,c;

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("enter the three numbers");
//
//        int a= scanner.nextInt();
//        int b=scanner.nextInt();
//        int c=scanner.nextInt();
//
//        if (a>b && a>c){
//            System.out.println(a+" is largest");
//        }
//        else if (b>a && b>c){
//            System.out.println(b+" is largest");
//        }
//        else {
//            System.out.println(c+" is the largest");
//       }

        //Leap year testing condition
//        System.out.println("Checking for the leap year");
//
//        System.out.println("Enter the Year");
//
//        Scanner scanner= new Scanner(System.in);
//
//        int year = scanner.nextInt();
//
//        if (year%4==0 && year%100!=0 ){
//            System.out.println("It is a leap year");
//        }
//
//        else if (year%100==0 && year%400==0){
//            System.out.println("It is a leap year");
//        }
//        else {
//            System.out.println("It is not a leap year");
//        }

        //Looping

//        int sum=0;
//
//        Scanner scanner= new Scanner(System.in);
//
//        System.out.println("enter the double");
//
//        double d = scanner.nextDouble();
//
//        System.out.println(d);
//
//        System.out.println(sum);
//
//        for (int i=0;i<5;i++){
//            sum=sum+i;
//            System.out.println(sum);
//        }
//
//        System.out.println("after the loop");
//        System.out.println(sum);


        //while loop

//        long sum=0;
//        long i=1;
//
//        System.out.println("before the loop "+sum);
//
//        while (i<=100000000000L){
//            sum=sum+i;
//            i=i+1;
//        }
//
//
//
//        System.out.println("after the loop "+sum);

        //do while loop

        int sum=0;
        int i=1;

        do {
            sum=sum+i;
            i=i+1;
        }while (i<5);

        System.out.println(sum);



    }
}
