package com.company;

import java.util.Scanner;

public class RealGuess {

    public static void solve(Scanner input, long a, long b) {
        long m = (a + b) / 2;
        System.out.println(m);
        System.out.flush();
        char s = input.next().charAt(0);
        if (s=='E') {
            return;
        } else if (s=='L') {
            solve(input, m + 1, b);
        } else {
            solve(input, a, m - 1);
        }
    }

    public static void main(String args[]) throws java.lang.Exception{
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        for (int ks = 1; ks <= T; ks++) {
//            long a = input.nextInt();
            long a=0;
            long b=1000000000;
//            long b = input.nextInt();
            long n = input.nextInt();
            solve(input, a + 1, b);
        }
    }
}
