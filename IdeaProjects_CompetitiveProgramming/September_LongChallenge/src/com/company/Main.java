package com.company;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws java.lang.Exception{
	// write your code here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long n=sc.nextLong();
            Set<Long> set=new HashSet<>();
            long[] arr=new long[(int)n];
            boolean containsZero=false;
            for (int i=0;i<n;i++){
                arr[i]=sc.nextLong();
                if (arr[i]==0){
                    containsZero=true;
                }
            }
            long[] arrDistinct= Arrays.stream(arr).distinct().toArray();
            long len=arrDistinct.length;
            if (containsZero){
                len--;
            }
            System.out.println(len);
        }
    }
}
