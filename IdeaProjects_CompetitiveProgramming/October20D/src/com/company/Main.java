package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    static long maximumXOR(long n, long l, long r)
    {
        long x = 0;
        for (long i = (long) (Math.log(r)/Math.log(2)); i >= 0; --i)
        {
            if ((n & (1 << i))>0) // Set bit
            {
                if ((x > r) || (x + (1 << i) - 1 < l))
                    x ^= (1 << i);
            }
            else // Unset bit
            {
                if ((x ^ (1 << i)) <= r)
                    x ^= (1 << i);
            }
        }
        return n ^ x;
    }

    static long maxXor(long l, long r) {
        long lBit = Integer.highestOneBit((int)l);
        long rBit = Integer.highestOneBit((int)r);
        if (lBit == rBit) {
            if (lBit == 0) {
                return 0;
            } else {
                long newL = l & (~lBit);
                long newR = r & (~lBit);
                return maxXor(newL, newR);
            }
        } else {
            long max = Math.max(lBit, rBit);
            return (max << 1) -1;
        }
    }

    public static void main(String[] args)throws java.lang.Exception{
	// write your code here

        Scanner sc=new Scanner(System.in);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int t=Integer.parseInt(br.readLine());

        while (t-->0){

            String line=br.readLine();
            String[] strs=line.trim().split("\\s+");
            long lower=Long.parseLong(strs[0]);
            long upper=Long.parseLong(strs[1]);
            long max=0;
            long ans=upper;



            System.out.println(maxXor(upper,upper));
        }

      /**  Scanner scan = new Scanner(System.in);
        int L = scan.nextInt();
        int R = scan.nextInt();
        scan.close();

        int xored  = L ^ R;
        int significantBit = 31 - Integer.numberOfLeadingZeros(xored);
        int result = (1 << (significantBit + 1)) - 1;

        System.out.println(result);      */
    }
}
