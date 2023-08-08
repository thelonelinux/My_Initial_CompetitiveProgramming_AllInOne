package com.company;

public class Main {

    //Number of bits difference between two numbers
    public static long countSetBits(long n) {
        int count = 0;
        while (n != 0) {
            count++;
            n &=(n-1);
        }
        return count;
    }

    public static long FlippedCount(long a, long b) {
        // Return count of set bits in
        // a XOR b
        return countSetBits(a ^ b);
    }

    public static void main(String[] args) {
	// write your code here

        long x=4;
        String givenX=Long.toBinaryString(x);

        long y=12;
        String givenY=Long.toBinaryString(y);

        long main=x|y;
        System.out.println(main);
        String xored=Long.toBinaryString(main);

        System.out.println("X= " +givenX+" Y="+givenY);

        long l=0;
        long r=9;
        long maxValue=0;
        long xorWithXored=0;

        for (long i=l;i<=r;i++){
            String string=Long.toBinaryString(i);
            System.out.print(i+" = "+string+" Xored="+xored+"  ");
            maxValue=(x&i)*(y&i);
            xorWithXored=main&i;
            System.out.print("Bit dif "+ FlippedCount(i,main)+" ");
            System.out.println("Value => "+maxValue);
//            System.out.println(" ^ operator" +(i^main));

        }

    }
}
