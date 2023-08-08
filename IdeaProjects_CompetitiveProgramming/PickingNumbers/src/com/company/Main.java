package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static int pickingNumbers(List<Integer> a) {
        int[] arr = new int[a.size()];
        for (int i=0;i<a.size();i++){
            arr[i]=a.get(i);
        }
        Arrays.sort(arr);

        int[][] subarr1=new int[a.size()][a.size()];

        for (int i=0;i<a.size();i++){

            subarr1[i][0]=arr[i];

            for (int j=i+1;j<a.size();j++){

                if(Math.abs(arr[i]-arr[j])<=1){
                    subarr1[i][j]=arr[j];

                }


            }
        }
        int[] array = new int[a.size()];



        for (int i=0;i<a.size();i++){

            int count=0;

            for (int  j=0;j<a.size();j++){
                if (subarr1[i][j]!=0){
                    count =count+1;

                }

            }
            array[i]=count;
        }

        Arrays.sort(array);

        return array[array.length-1];

    }


    public static void main(String[] args) {
	// write your code here

        List<Integer> a = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the a :");

        int n=scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the values in the a :");

        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
            a.add(arr[i]);
        }

        int result=pickingNumbers(a);
        System.out.println(result);

//        System.out.println("elements in the a or array are :");
//
//        for (int i=0;i<n;i++){
//
//            System.out.println(a.get(i));
//        }

//        Arrays.sort(arr);
//
//        int[][] subarr1=new int[n][n];
//
//        for (int i=0;i<n;i++){
//
//            subarr1[i][0]=arr[i];
//
//            for (int j=i+1;j<n;j++){
//
//                if(Math.abs(arr[i]-arr[j])<=1){
//                    subarr1[i][j]=arr[j];
//
//                }
//
//
//            }
//        }
//
//
//
////        System.out.println("Elements in the subarray; ");
//
////        for (int i=0;i<n;i++){
////            for (int j=0;j<subarr1[i].length;j++){
////                System.out.print(subarr1[i][j]+ " ");
////            }
////            System.out.println(" ");
////        }
//
//        int[] array = new int[n];
//
//
//
//        for (int i=0;i<n;i++){
//
//            int count=0;
//
//            for (int  j=0;j<n;j++){
//                if (subarr1[i][j]!=0){
//                    count =count+1;
//
//                }
//
//            }
//            array[i]=count;
//        }
//
////        System.out.println("count arrays :");
//
//        Arrays.sort(array);
//        System.out.println("Maximum length subarray is :"+array[array.length-1]);
//
//
//

    }
}
