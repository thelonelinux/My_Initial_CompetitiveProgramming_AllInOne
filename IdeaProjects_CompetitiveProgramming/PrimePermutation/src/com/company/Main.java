package com.company;

import java.math.BigInteger;

public class Main {

    public static int factorial(int n) {
        BigInteger fact = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(new BigInteger(i + ""));
        }
        String ans= fact.toString();

        Integer integer=Integer.parseInt(ans);
        return integer;

    }

    public static void main(String[] args) {
	// write your code here

        int num= 354529674;

        String string=Integer.toString(num);

        int numOfPrime=0;
        int numOfNonPrime=0;

        BigInteger bg=new BigInteger(string);


        BigInteger bg2 ;

        for (int i=0;i<string.length();i++){

            bg2 = new BigInteger(String.valueOf(string.charAt(i)));

            if (bg2.isProbablePrime(1)==true){
                numOfPrime=numOfPrime+1;
            }
            else {
                numOfNonPrime=numOfNonPrime+1;
            }
        }

        int ans=factorial(numOfPrime)*factorial(numOfNonPrime);

        System.out.println(ans);




    }
}
