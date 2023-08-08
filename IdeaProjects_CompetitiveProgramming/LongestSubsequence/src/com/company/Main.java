package com.company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc=new Scanner(System.in);

        int len=sc.nextInt();

        int numOfQueries=sc.nextInt();

        int[] arr=new int[len];

        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        HashSet<Integer> hs=new HashSet<>();

        for(int t=0;t<numOfQueries;t++){
            int type=sc.nextInt();

            if(type==1){
                int low=sc.nextInt();
                int high=sc.nextInt();

                for(int i=low-1;i<high;i++){
                    hs.add(arr[i]);

                }
                count=hs.size();
                System.out.println(count);
            }
            else{
                int swap1=sc.nextInt();
                int swap2=sc.nextInt();
                String direction=sc.next();
                int temp=arr[swap1-1];
                arr[swap1-1]=arr[swap2-1];
                arr[swap2-1]=temp;
                hs.clear();
            }
        }

    }
}
