package com.company;

import java.util.*;

public class Main {


    // Driver code
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        String str=sc.next();

        char[] chars=str.toCharArray();
        List<Integer> list=new ArrayList<>();

        int[] arr=new int[chars.length];
        for(int i=0;i<str.length();i++){
            arr[i]=(int) chars[i];
            list.add((int)chars[i]);
        }

        int[] arr2=Arrays.stream(arr).distinct().sorted().toArray();

        if(arr2.length==2){
            System.out.println(0);
        }
        else {

            int[] index=new int[arr2.length];
            int c=0;

            for(int i=0;i<arr2.length-1;i++){
                int freq=Collections.frequency(list,arr2[i]);

                if(freq%2!=0){
                    index[c++]=str.indexOf(arr2[i]);

                }

            }

            Arrays.sort(index);
            int ans=0;
            int min=index[index.length-1];
            for(int i=0;i<index.length;i++){
                ans=Math.abs(arr[i+1]-arr[i]);
                min=Math.min(min,ans);

            }

            System.out.println(ans+1);

        }



    }
}

