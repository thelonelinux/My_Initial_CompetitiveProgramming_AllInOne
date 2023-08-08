package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


	// write your code here




        Scanner scanner=new Scanner(System.in);

        System.out.println("enter the length of the array");

        int p=scanner.nextInt();

        long[] c= new long[p];

        for (int m=0;m<c.length;m++){
            c[m]=scanner.nextLong();
        }

        System.out.println("enter the sum you want to get");

        int n=scanner.nextInt();

//        for (int i=0;i<array.length;i++){
//            long i =array[i];
//        }
//
//        long sum = 0;
//
//        for (int i=0;i<9;i++){
//            for (int j=0;j<9;j++){
//                for (int k=0;k<9;k++){
//                    for (int l=0;l<9;l++){
//                        if (array[0]*i+array[1]*j+array[2]*k+array[3]*l==10){
//                            sum=sum+1;
//
//                        }
//
//                    }
//                }
//            }
//        }

        long sum = 0;
        int l1=c.length;

        if(l1==4) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    for (int k = 0; k < 9; k++) {
                        for (int l = 0; l < 9; l++) {
                            if (c[0] * i + c[1] * j + c[2] * k + c[3] * l == n) {
                                sum = sum + 1;

                            } else {
                                sum = sum;
                            }

                        }
                    }
                }
            }
        }else if(l1==3) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    for (int k = 0; k < 9; k++) {
                        if (c[0] * i + c[1] * j + c[2] * k == n) {
                            sum = sum + 1;

                        } else {
                            sum = sum;
                        }
                    }
                }
            }
        }
        else if(l1==5) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    for (int k = 0; k < 9; k++) {
                        for (int l = 0; l < 9; l++) {
                            for (int g=0;g<9;g++){
                                if (c[0] * i + c[1] * j + c[2] * k + c[3] * l+c[4]*g == n) {
                                    sum = sum + 1;

                                } else {
                                    sum = sum;
                                }
                            }


                        }
                    }
                }
            }
        }else {
                    sum=sum;
        }




        System.out.println(sum );

//        long sums=0;

//        for (int i=0;i<array.length;i++){
//            sums=sums+array[i];
//        }
//
//        System.out.print(sums);
    }
}
