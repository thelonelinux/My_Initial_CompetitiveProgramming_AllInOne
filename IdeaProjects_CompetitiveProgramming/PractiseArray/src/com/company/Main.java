package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

//        int[] arr=new int[5];
//        arr[0]=1;
//
//        System.out.println(arr[0]);


//        int[] array={5,4,7,20,10,15,63,96};

//        System.out.println(array[0]);


//        //taking the input from the user
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the size of the array");
//        int n=scanner.nextInt();
//
//        int[] array=new int[n];
//
//        for (int i=0;i<n;i++){
//            System.out.println("Enter the "+i+"th number ");
//            array[i]=scanner.nextInt();
//        }
//
//
//        System.out.print("The numbers in the arrays are ");
//
//
////        for (int i=0;i<array.length;i++){
////            System.out.print(array[i]);
////            System.out.print(" ");
////        }
//        System.out.print(array[0]+" "+array[1]);
//    }


        //Sum of n numbers of large numbers using aray

//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        long[] l=new long[n];
//
//
//        for(int i=0;i<l.length;i++){
//            l[i]=scanner.nextLong();
//        }
//        long sum=0;
//        for(int i=0;i<l.length;i++){
//
//            sum=sum+l[i];
//        }
//
//
//        System.out.println(sum);

        //Arraylist as Dynamic array;


        ArrayList<Integer> arrayList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
//
//        arrayList.add(5);
//        arrayList.add(0,4);
//       int a= arrayList.get(1);
//        arrayList.set(1,100);
//        arrayList.size();
//        System.out.println(arrayList);


        //Adding data into ArrayList using scanner;

        System.out.print("Enter how much data you want to enter");

        int n=scanner.nextInt();

        for(int i=0;i<n;i++){
            arrayList.add(scanner.nextInt());
        }


        System.out.print(arrayList+" ");



//        for (int i=0;i<arrayList.size();i++){
//
//        }





    }
}
