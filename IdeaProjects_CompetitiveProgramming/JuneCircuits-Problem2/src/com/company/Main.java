package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String args[] ) throws Exception {

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long n=sc.nextLong();
            long l=sc.nextLong();
            List<Long> longList=new ArrayList<Long>();
            long sum=0;
            long[] arr=new long[(int)n];
            for (int i=0;i<n;i++){
                arr[i]=sc.nextLong();
                sum=sum+arr[i];
                longList.add(arr[i]);
            }


            long maximum= Collections.max(longList);

            long max=0;
            int count=0;
            for (long i=0;i<maximum;i++){
                int bitCount=Long.bitCount(i);
                if (bitCount==l){
                    //then only check if it works
                    long num=sum&i;
                    if (num>=max){
                        if (max==num){
                            count++;
                        }else{
                            count=1;
                        }
                        max=num;
                    }
                }
            }
            System.out.println(count);
        }

    }
}
