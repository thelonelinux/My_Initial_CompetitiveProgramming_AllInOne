package com.company;

import java.util.Scanner;

public class Sieve {

    static void SieveOfEratosthenes(long n, boolean prime[],boolean primesquare[], long a[]) {
        for (int i = 2; i <= n; i++)
            prime[i] = true;
        for (int i = 0; i < ((n * n) + 1); i++)
            primesquare[i] = false;
        prime[1] = false;

        for (int p = 2; p * p <= n; p++) {
            if (prime[p] == true) {
                for (int i = p * 2; i <= n; i += p)
                    prime[i] = false;
            }
        }
        int j = 0;
        for (int p = 2; p <= n; p++) {
            if (prime[p]) {
                a[j] = p;
                primesquare[p * p] = true;
                j++;
            }
        }
    }

    static int countDivisors(long n,long k){
        if (n == 1)
            return 1;

        boolean prime[] = new boolean[(int)(n + 1)];
        boolean primesquare[] = new boolean[(int)(n * n) + 1];
        long a[] = new long[(int)n];
        SieveOfEratosthenes(n, prime, primesquare, a);
        long ans = 1;
        for (int i = 0;; i++) {
            if (a[i] * a[i] * a[i] > n)
                break;

            long cnt = 1;

            while (n % a[i] == 0) {
                n = n / a[i];

                cnt = cnt + 1;
            }

            // Calculating number of divisors
            // If n = a^p * b^q then total
            // divisors of n are (p+1)*(q+1)
            ans = ans * cnt;
            if(ans>(int)k){
                return 1;
            }
        }


        if (prime[(int)n])
            ans = ans * 2;

        else if (primesquare[(int)n])
            ans = ans * 3;

        else if (n != 1)
            ans = ans * 4;

        return 0; // Total divisors
    }

    // Driver Program
    public static void main(String args[])
    {


        try{
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while (t-->0){
                long x=sc.nextLong();
                long k=sc.nextLong();
                long number = (x/2);
                int numOfFactors=0;
                if(k<=2){
                    for(int i = 1; i <= number; ++i) {
                        if (x % i == 0) {
                            numOfFactors++;
                        }
                        if (numOfFactors+1>k){
                            System.out.println(1);
                            break;
                        }
                    }
                    if (numOfFactors+1<=k){
                        System.out.println(0);
                    }
                }
                if(k>2) {
                    int ans = countDivisors(x ,k);
                    System.out.println(ans);
                }

            }

        }catch (Exception e){
            return;
        }
    }
}

