package com.company;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] arr={1,2,3,4,5};

        List<Integer> list=new ArrayList<>();


        for (int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }

        Arrays.stream(arr).forEach(System.out::print);

        System.out.println("");

        Collections.rotate(list,2);

        list.forEach(System.out::print);
    }
}
