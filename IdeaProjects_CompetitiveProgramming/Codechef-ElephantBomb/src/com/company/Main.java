package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws java.lang.Exception{
	// write your code here

        try{

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();

            while (t-->0){

                int len=sc.nextInt();

                String str=sc.next();

                int[] arr=new int[len];

                if (len==1){
                    if (str.charAt(0)=='0'){
                        System.out.println(1);
                    }
                    else {
                        System.out.println(0);
                    }
                }
                if (len>=2){

                    for (int i=0;i<len;i++){
                        arr[i]=str.charAt(i);
                    }

                    for (int i=0;i<arr.length;i++){
                        if (arr[i]==49){
                            if (i-1>=0 && arr[i-1]!=49){
                                arr[i-1]=2;
                            }
                            if (i+1<len && arr[i+1]!=49){
                                arr[i+1]=2;
                            }
                        }
                    }
                    int count=0;
                    for (int i=0;i<len;i++){
                        if (arr[i]==48){
                            count++;
                        }
                    }
                    System.out.println(count);

                }

            }

        }catch (Exception e){
            return;
        }

    }
}
