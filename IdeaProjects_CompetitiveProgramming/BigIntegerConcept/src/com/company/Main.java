package com.company;

import java.math.BigInteger;

public class Main {


        // Returns Factorial of N
        static BigInteger factorial(int N)
        {
            // Initialize result
            BigInteger f = new BigInteger("1"); // Or BigInteger.ONE

            BigInteger f2=BigInteger.ONE;

            // Multiply f with 2, 3, ...N
            for (int i = 2; i <= N; i++)
                f2 = f2.multiply(BigInteger.valueOf(i));

            return f2;
        }

        // Driver method
        public static void main(String args[]) throws Exception
        {
            int N = 10;
            System.out.println(factorial(N));
        }

}
