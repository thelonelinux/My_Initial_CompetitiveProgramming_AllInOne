package com.company;

import java.util.HashSet;

public class Main {



    public static void main(String[] args) {
	// write your code here

        HashSet<Integer> hashSet=new HashSet<>();

        hashSet.add(5);
        hashSet.add(2);
        hashSet.add(7);
        hashSet.add(2);
        hashSet.add(null);

        hashSet.forEach(integer -> System.out.println(integer));
        System.out.println(hashSet);

        int i;
        int j;
        int k;

         i=(j=4)+(k=9);

         System.out.println(i);
    }
}
