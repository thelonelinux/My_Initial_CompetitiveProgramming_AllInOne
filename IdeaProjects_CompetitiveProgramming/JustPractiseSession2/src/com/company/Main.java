package com.company;

import org.omg.PortableInterceptor.INACTIVE;

import java.math.BigInteger;

public class Main {


    static void kaprekarNumbers(int p, int q) {
        int count=0;
        int sub=q-p;

        for(int i=p;i<=q;i++){
            int ans=isKaprekar(i);
            if(ans!=0){
                System.out.print(ans+" ");
                count++;
            }

        }
        if(count==0){
            System.out.println("INVALID RANGE");
        }


    }
    public static int isKaprekar(int num){

        BigInteger bg=BigInteger.valueOf(num);
        BigInteger sq=bg.multiply(bg);
        int d=bg.toString().length();

        String s=sq.toString();

        if(num==1){
            return 1;
        }
        if(num==9){
            return 9;
        }
        if(num<=10){
            return 0;
        }
//        if(num%10==0){
//            return 0;
//        }
        int n=s.length();
        int half=s.length()-d;

//        if(s.length()%2==0){
//            int half=n/2;
//            int first=Integer.parseInt(s.substring(0,half));
//            int second= Integer.parseInt(s.substring(half,n));
//            int sum=first+second;
//
//            if(sum==num){
//                return num;
//            }
//            else {
//                return 0;
//            }

//        }

//        for(int i=1;i<s.length();i++){
            int  first=Integer.parseInt(s.substring(0,half));
            int second=Integer.parseInt(s.substring(s.length()-d,s.length()));
            int sum=first+second;

            if(sum==num){
                return num;
            }
//        }

        return 0;

    }



    public static void main(String[] args) {
	// Kaprekar number checking

//        int num=5050;
////
//        System.out.println(isKaprekar(num));

        kaprekarNumbers(400,700);



    }
}
