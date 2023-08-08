package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String str="aabbccc";
        String str2="abccc";

        HashSet<Character> hs=new HashSet<Character>();

        List<Character> list=new ArrayList<>();


        for(int i=0;i<str.length();i++){
            hs.add(str.charAt(i));
            list.add(str.charAt(i));
        }

        List<Character> sortedList=new ArrayList<>(hs);


        int count=0;
        int[] arr=new int[sortedList.size()];
        List<Integer> arrList=new ArrayList<>();



        for(int j=0;j<sortedList.size();j++) {
             count=Collections.frequency(list, sortedList.get(j));
             arr[j]=count;
             arrList.add(count);

        }
        HashSet<Integer> arrHashSet=new HashSet<>(arrList);
        List<Integer> sortedList2=new ArrayList<>(arrHashSet);

        int frequency=0;
        int[] arr2=new int[sortedList2.size()];

        for (int v=0;v<sortedList2.size();v++){
            frequency=Collections.frequency(arrList,sortedList2.get(v));
            arr2[v]=frequency;

        }

        for (int m=0;m<arr.length;m++){
            System.out.println(arr[m]);
        }

        Arrays.sort(arr2);

        if(frequency>2){
            System.out.println("NO");
        }
        if(arr2[0]-arr2[arr2.length-1]<=1){
            System.out.println("YES");

        }
        else {
            System.out.println("YES");
        }







    }
}
