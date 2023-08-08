package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
	// write your code here

        try{

            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while (t-->0){
                int len=sc.nextInt();
                int[] arr=new int[len+1];

                for (int i=0;i<len;i++){
                    arr[i]=sc.nextInt();
                }
                arr[len]=0;

                HashSet<Integer> set=new HashSet<>();
                HashSet<Integer> set2=new HashSet<>();
                int[] array=new int[10000];

                array[arr[0]]++;
                set2.add(arr[0]);
                Boolean ans1=true;
                Boolean ans2=true;
                boolean flag=false;

                for (int i=1;i<len+1;i++){
                    array[arr[i]]++;
                    if (arr[i-1]!=arr[i]){
                        ans1=set.add(array[arr[i-1]]);
                        ans2=set2.add(arr[i]);
                    }
                    if (!ans1 || !ans2){
                        System.out.println("NO");
                        flag=true;
                        break;
                    }
                }
                if (flag==false){
                    System.out.println("YES");
                }
            }


        }catch (Exception e){
            return;
        }
    }
}
