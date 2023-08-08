package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Fast {

    public static void main(String[] args) {
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int t=Integer.parseInt(br.readLine());
            while (t-->0){
                String lines=br.readLine();
                String[] str=lines.trim().split("\\s+");
                long len= Long.parseLong(str[0]);
                long query=Long.parseLong(str[1]);

                String string=br.readLine();

                int[] arr=new int[26];

                for (char c : string.toCharArray()){
                    int num=c-97;
                    arr[num]=arr[num]+1;
                }

                long duplicates;
                while (query-->0){
                     duplicates=Long.parseLong(br.readLine());
                    if (duplicates==0){
                        System.out.println(len);
                    }
                    else{
                        long sum=0;
                        for (int i=0;i<26;i++){
                            if (arr[i]>duplicates){
                                sum=sum+arr[i]-duplicates;
                            }
                        }
                        System.out.println(sum);
                    }
                }
            }
        }catch (Exception e){
            return;
        }

    }
}
