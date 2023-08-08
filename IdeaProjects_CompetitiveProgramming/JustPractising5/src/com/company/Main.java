package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Scanner sc=new Scanner(System.in);

        int len1=sc.nextInt();
        int[] arr1=new int[len1];

        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }

        int len2=sc.nextInt();
        int[] arr2=new int[len2];

        for(int i=0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }


        int len3=sc.nextInt();
        int[] arr3=new int[len3];

        for(int i=0;i<arr3.length;i++){
            arr3[i]=sc.nextInt();
        }

        List<Integer> list=new ArrayList<>();
        int count=0;
        int i=0;
        int j=0;
        int k=0;

        while(i<len1){
            list.add(arr1[i]);
            list.add(arr2[j]);
            list.add(arr3[k]);

            Collections.sort(list);
            int first=list.get(0);
            int second=list.get(1);
            int third=list.get(2);

            if(first+second>third){
                count++;
            }


            if(k<len3-1){
                k++;
            }else {
                j++;
                k=0;
            }

            if(j>=len2){
                j=0;
                i++;
            }
            list.clear();





        }







        System.out.println(count);
    }
}
