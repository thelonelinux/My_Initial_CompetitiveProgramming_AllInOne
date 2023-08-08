package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);

        int i=scanner.nextInt();
        int j=scanner.nextInt();
        int k=scanner.nextInt();

        int[] arr = new int[j-i+1];

        for (int m=0;m<arr.length;m++){
            arr[m]=i;
            i++;
        }

//        for (int v=0;v<arr.length;v++){
//            System.out.println(arr[v]);
//        }
        int[] newarr= new int[arr.length];
        for (int h=0;h<arr.length;h++){

            int reversed=0;

            int num = arr[h];

            while(num != 0) {
                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num /= 10;
            }
            newarr[h]=reversed;
        }


//        System.out.println("Reversed Number: " );
//
//        for (int v=0;v<arr.length;v++){
//            System.out.println(newarr[v]);
//        }
        double[] doubles = new double[arr.length];
        for (int v=0;v<arr.length;v++){
            doubles[v]=Math.abs((double)(arr[v]-newarr[v])/k);
        }
//        for (int v=0;v<arr.length;v++){
//            System.out.println(doubles[v]);
//        }


        int goodday=0;
        int badday=0;

        for (int v=0;v<arr.length;v++){

            if (doubles[v]-(int)doubles[v]>0){
                badday=badday+1;
            }
            else {
                goodday=goodday+1;
            }
        }

        System.out.println(goodday);






    }
}
