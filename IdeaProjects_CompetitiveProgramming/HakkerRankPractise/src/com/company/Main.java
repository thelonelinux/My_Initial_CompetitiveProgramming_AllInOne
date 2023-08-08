package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class Main {

    static String[] weightedUniformStrings(String s, int[] queries) {

        HashSet<Integer> set= new HashSet<>();
        int k=2;

        for(char c : s.toCharArray()){
            int integer=(int)c;
            integer=integer-96;
            boolean bool=set.add(integer);
            if(!bool){
                set.add(integer*k++);
            }
            else {
                k=2;
            }
        }

        String[] ans=new String[queries.length];
        for(int i=0;i<queries.length;i++){
            if(set.contains(queries[i])){
                ans[i]="Yes";
            }
            else{
                ans[i]="No";
            }
        }

        return ans;
    }


    public static void main(String[] args) {
	// write your code here

        String s="aaabbbbcccddd";

        int[] queries={9,7,8,12,5};

        String[] ans=weightedUniformStrings(s,queries);

        Arrays.stream(ans).forEach(System.out::println);







    }
}