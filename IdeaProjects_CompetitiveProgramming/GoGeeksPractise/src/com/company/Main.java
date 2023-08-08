package com.company;

import com.sun.xml.internal.bind.v2.model.annotation.AbstractInlineAnnotationReaderImpl;

import java.lang.reflect.AnnotatedType;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc=new Scanner(System.in);

        int testCase=sc.nextInt();

        for(int t=0;t<testCase;t++){

            int len=sc.nextInt();
            int[] arr=new int[len];

            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }

            int[] arr2=Arrays.stream(arr).sorted().toArray();
            int index=0;
            for(int j=0;j<arr.length;j++){
                 index= Arrays.binarySearch(arr,arr2[j]);
                System.out.print(index+1+" ");
            }
            System.out.println("");
        }
    }
}
