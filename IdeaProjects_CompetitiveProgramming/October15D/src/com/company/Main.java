package com.company;

import sun.nio.ch.sctp.SctpNet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    static boolean similarString(String s1, String s2){

        HashSet<Character> set1=new HashSet<>();
        for (char c : s1.toCharArray()){
            set1.add(c);
        }
        int initialSize=set1.size();

        HashSet<Character> set2=new HashSet<>();

        for (char c : s2.toCharArray()){
            set2.add(c);
        }

         set1.retainAll(set2);

        int finalSize=set1.size();

        if (initialSize==finalSize){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int len=sc.nextInt();

        String[] str=new String[len];
        HashSet<String> set=new HashSet<>();

        for (int i=0;i<len;i++){
            str[i]=sc.next();
            set.add(str[i]);

        }
        int count=0;

        for (int i=0;i<len-1;i++){
            for (int j=i;j<len;j++){
                if (!str[i].equals(str[j]) && similarString(str[i],str[j])){
                    count++;
                }
            }
        }
        int ans=set.size()-count;

        System.out.print(ans);



    }
}