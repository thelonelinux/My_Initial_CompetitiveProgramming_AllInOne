package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        try{

            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while (t-->0){
                int len=sc.nextInt();
                int[] arr=new int[len];
                for (int i=0;i<len;i++){
                    arr[i]=sc.nextInt();
                }

                int count=1;
                List<Integer> list=new ArrayList<>();
                for (int i=0;i<len-1;i++){
                    int diff=arr[i+1]-arr[i];
                    if (diff<=2){
                        count++;
                    }
                    if (diff>2){
                        list.add(count);
                        count=1;
                    }
                }
                list.add(count);

                if (list.size()==1){
                    System.out.println(count+" "+count);
                }else {
                    int max=Collections.max(list);
                    int min=Collections.min(list);
                    System.out.println(min+" "+max);
                }


            }

        }catch (Exception e){
            return;
        }
    }
}
