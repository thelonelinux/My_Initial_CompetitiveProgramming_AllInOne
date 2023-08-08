package com.company;

import java.math.BigInteger;

public class Main {

    // Returns Factorial of N
    static void factorial(int n)
    {
        // Initialize result
        BigInteger f = new BigInteger("1"); // Or BigInteger.ONE

        // Multiply f with 2, 3, ...N
        for (int i = 2; i <= n; i++) {
            f = f.multiply(BigInteger.valueOf(i));
        }


        System.out.println(f);
    }









    public static void main(String args[]) throws Exception
    {

        int N = 20;
        factorial(N);
    }




}
