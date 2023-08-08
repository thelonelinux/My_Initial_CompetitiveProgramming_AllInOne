package com.company;

import javax.management.InstanceNotFoundException;
import java.util.*;
import java.util.stream.LongStream;

public class HackerRankComptetion {


    public static List<Integer> getMaxCharCount(String s, List<List<Integer>> queries) {
        // queries is a n x 2 array where queries[i][0] and queries[i][1] represents x[i] and y[i] for the ith query.
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
        List<Integer> Anslist=new ArrayList<>();
        for (int i=0;i<queries.size();i++){
            int min=queries.get(i).get(0);
            int max=queries.get(i).get(1);
            //temp=new int[max-min+1];
            temp=Arrays.copyOfRange(arr,min,max+1);
            Arrays.sort(temp);
            int maxValue=temp[temp.length-1];
            for (int j=temp.length-1;j>=0;j--){
                if (temp[j]==maxValue){
                    count++;
                    if (count==temp.length){
                        Anslist.add(count);
                        count=0;
                        break;
                    }
                }else {
                    Anslist.add(count);
                    count=0;
                    break;
                }
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
