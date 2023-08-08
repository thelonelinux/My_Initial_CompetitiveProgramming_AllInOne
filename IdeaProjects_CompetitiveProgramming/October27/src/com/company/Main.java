package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String args[] ) throws Exception {

        Scanner k = new Scanner(System.in);

        int t = k.nextInt();

        while (t-- > 0) {

            long n = k.nextLong();


            long p = 1;
            long i = 0, K = 0;
            while (K >= 0) {
                if (n > Math.pow(20, i) * Math.pow(10, K)) {
                    K++;
                } else if (n == Math.pow(20, i) * Math.pow(10, K)) {
                    System.out.println("Yes");
                    break;

                } else {
                    K = 0;
                    i++;
                    if (Math.pow(20, i) > n) {
                        System.out.println("No");
                        break;
                    }

                }
            }


        }
    }
}