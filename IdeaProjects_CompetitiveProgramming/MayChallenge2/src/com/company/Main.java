package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        try{
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while (t-->0){
                long len=sc.nextLong();
                long query=sc.nextLong();
                String string=sc.next();
                int[] arr=new int[26];

                for (char c : string.toCharArray()){
                    int num=c-97;
                    arr[num]=arr[num]+1;
                }

                while (query-->0){
                    long duplicates=sc.nextLong();
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
