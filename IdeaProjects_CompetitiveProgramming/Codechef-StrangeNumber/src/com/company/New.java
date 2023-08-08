package com.company;

import java.util.Scanner;

public class New {

    static long MAX = 10000001;
    static long factor[];
    static void generatePrimeFactors() {
        factor[1] = 1;
        for (int i = 2; i < MAX; i++)
            factor[i] = i;
        for (int i = 4; i < MAX; i += 2)
            factor[i] = 2;
        for (int i = 3; i * i < MAX; i++) {
            if (factor[i] == i) {
                for (int j = i * i; j < MAX; j += i) {
                    if (factor[j] == j)
                        factor[j] = i;
                }
            }
        }
    }
    static long calculateNoOFactors(long n) {

        if ((int)n == 1)
            return 1;
        long ans = 1;
        long dup = factor[(int)n];
        int c = 1;
        long j = n / factor[(int)n];
        while (j != 1) {
            if (factor[(int)j] == dup)
                c += 1;
            else {
                dup = factor[(int)j];
                ans = ans * (c + 1);
                c = 1;
            }
            j = j / factor[(int)j];
        }
        ans = ans * (c + 1);
        return ans;
    }
    public static void main(String[] args) throws java.lang.Exception{
        factor = new long[(int)MAX];
        factor[0] = 0;
        generatePrimeFactors();

        try{

            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while (t-->0){
                long x=sc.nextLong();
                long k=sc.nextLong();

                long numOfFactors=calculateNoOFactors(x);

                if (numOfFactors>k){
                    System.out.println(1);
                }
                else {
                    System.out.println(0);
                }

            }

        }catch (Exception e){
            return;
        }
    }

}
