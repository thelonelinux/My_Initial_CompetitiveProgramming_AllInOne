package com.company;

import com.sun.org.apache.xml.internal.serializer.utils.SerializerMessages_zh_CN;
import org.omg.PortableInterceptor.INACTIVE;

import java.math.BigInteger;
import java.net.Inet4Address;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while (t-->0){

            int n=sc.nextInt();

            String[] strings=new String[n];

            for (int i=0;i<n;i++){
                strings[i]=sc.next();

            }

            Integer decimal=Integer.parseInt(strings[0],2);
            int ans=decimal;

            for (int i=1;i<n;i++){
                Integer decimals=Integer.parseInt(strings[i],2);
                ans=ans^decimals;

            }

            BigInteger bg=BigInteger.valueOf(ans);
            int bitcount=bg.bitCount();

            System.out.println(bitcount);
        }

//        String[] strings=new String[3];
//
//
//
//         strings[0]="1110001101";
//         strings[1]="1010101011";
//         strings[2]="0000000011";
//
//        Integer decimal1=Integer.parseInt(strings[0],2);
//        Integer decimal2=Integer.parseInt(strings[1],2);
//        Integer decimal3=Integer.parseInt(strings[2],2);
//
//        BigInteger bg=new BigInteger(decimal1.toString());
//        BigInteger bg2=new BigInteger(decimal2.toString());
//        BigInteger bg3=new BigInteger(decimal3.toString());
//
//        BigInteger ans=bg.xor(bg2);
//        ans=ans.xor(bg3);
//
//
//        Integer num=ans.intValue();
//        String binary =Integer.toBinaryString(num);
//        BigInteger bitcount=BigInteger.valueOf(num);
//
//
//
//        System.out.println(binary);
//
//        System.out.println(decimal1);
//
//        System.out.println(bitcount.bitCount());



    }
}
