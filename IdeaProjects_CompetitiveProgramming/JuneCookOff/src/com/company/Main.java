package com.company;

import javax.print.attribute.HashAttributeSet;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws java.lang.Exception {
	// write your code here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long len=sc.nextLong();
            long box=sc.nextLong();


            long[] arr=new long[(int)len];
            for (int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            for (long i=0;i<len;i++){
                if (arr[(int)i]==i+1){
                    //Ok
                }else{
                    System.out.println(i+1);
                    break;
                }
            }

        }
    }
}
