package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static long findLCM(long a, long b)
    {
        long lar = Math.max(a, b);
        long small = Math.min(a, b);
        for (long i = lar; ; i += lar) {
            if (i % small == 0)
                return i;
        }
    }

    static long smallestDivisor(long n)
    {
        // if divisible by 2
        if (n % 2 == 0)
            return 2;

        // iterate from 3 to sqrt(n)
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0)
                return i;
        }

        return n;
    }

    static long power(long a,long n, long p)
    {
        // Initialize result
        long res = 1;

        // Update 'a' if 'a' >= p
        a = a % p;

        while (n > 0)
        {
            // If n is odd, multiply 'a' with result
            if ((n & 1) == 1)
                res = (res * a) % p;

            // n must be even now
            n = n >> 1; // n = n/2
            a = (a * a) % p;
        }
        return res;
    }

    // If n is prime, then always returns true,
    // If n is composite than returns false with
    // high probability Higher value of k increases
    //  probability of correct result.
    static boolean isPrime(long n, long k)
    {
        // Corner cases
        if (n <= 1 || n == 4) return false;
        if (n <= 3) return true;

        // Try k times
        while (k > 0)
        {
            // Pick a random number in [2..n-2]
            // Above corner cases make sure that n > 4
            int a = 2 + (int)(Math.random() % (n - 4));

            // Fermat's little theorem
            if (power(a, n - 1, n) != 1)
                return false;

            k--;
        }

        return true;
    }

    public static void main(String[] args) throws java.lang.Exception {
	// write your code here



        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){

            Long n=sc.nextLong();
            long start=1;
            long end=n-1;
            long min=Integer.MAX_VALUE;
            long finalAnswerA=0;
            long finalAnswerB=0;
            BigInteger bg=BigInteger.valueOf(n);
            if (n%2==0){
                System.out.println(n/2+" "+n/2);
                continue;
            }
            if (n%3==0){
                System.out.println((n*1)/3+" "+(n*2)/3);
                continue;
            }
            if (isPrime(n,3)){
                System.out.println(1+" "+(n-1));
                continue;
            }else{
                long prime=smallestDivisor(n);
                System.out.println(prime+" "+(n-prime));
            }
//            for (int i=0;i<n/2;i++){
//                long lcm=findLCM(start,end);
//                if (lcm<min){
//                    finalAnswerA=start;
//                    finalAnswerB=end;
//                    min=lcm;
//                }
//                start++;
//                end--;
//
//            }
//            System.out.println(finalAnswerA+" "+finalAnswerB);

        }

    }
}
