package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Buffer {

    public static void main(String[] args) {

        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int t=Integer.parseInt(br.readLine());
            while (t-->0){
                String lines=br.readLine();
                String[] str=lines.trim().split("\\s+");
                long x=Long.parseLong(str[0]);
                long k=Long.parseLong(str[1]);
                int number = (int)(x/2);
                int numOfFactors=0;
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
        }catch (Exception e){
            return;
        }
    }
}
