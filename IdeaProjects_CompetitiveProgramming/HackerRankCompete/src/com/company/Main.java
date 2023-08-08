package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<Integer> getMaxCharCount(String s, List<List<Integer>> queries) {
        String s1= s.toLowerCase();
        char[] chars=s1.toCharArray();
        int[] arr=new int[s.length()];
        List<Integer> list=new ArrayList<>();
        for (int i=0;i<chars.length;i++){
            arr[i]=(int)chars[i];
            list.add(arr[i]);
        }
        int[] temp;
        int count=0;
        int maxvalue=0;
        List<Integer> Anslist=new ArrayList<>();
        for (int i=0;i<queries.size();i++){
            int min=queries.get(i).get(0);
            int max=queries.get(i).get(1);
            if ((min-max)==0){
                Anslist.add(1);
            }else {
                if (arr[min]>0){
                    count++;
                    maxvalue=arr[min];
                }
                for (int j=min+1;j<=max;j++){
                    if (arr[j]>maxvalue){
                        maxvalue=arr[j];
                        count=1;

                    }else if (arr[j]==maxvalue){
                        count++;
                    }
                }
                Anslist.add(count);
                count=0;
            }
        }
        return Anslist;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        String str=sc.next();
        int numOfQueries=sc.nextInt();
        ArrayList<List<Integer>> queries=new ArrayList<List<Integer>>();
        ArrayList<Integer> values;
        int[][] arr=new int[numOfQueries][2];
        for (int i=0;i<numOfQueries;i++){
            for (int j=0;j<2;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<numOfQueries;i++){
            values=new ArrayList<>();
            for (int j=0;j<2;j++){
                values.add(arr[i][j]);
            }
            queries.add(values);
        }
        List<Integer> ans=getMaxCharCount(str,queries);
        for (int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }
    }
}
