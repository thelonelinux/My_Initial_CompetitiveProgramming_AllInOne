package com.company;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
//
//        ArrayList<ArrayList<String>> listOLists = new ArrayList<ArrayList<String>>();
//
//
//        ArrayList<String> list1 = new ArrayList<String>();
//        list1.add("hello");
//        list1.add("world");
//        list1.add("boy");
//        listOLists.add(list1);
//
//        ArrayList<String> list2 = new ArrayList<String>();
//        list2.add("this is another list");
//        list2.add("hello");
//        listOLists.add(list2);
//
//        System.out.println(listOLists);

//        System.out.println("Hello World");


        ArrayList<ArrayList<Integer>> myList=new ArrayList<ArrayList<Integer>>();

        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(2);
        list1.add(5);
        list1.add(8);



        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(8);
        list2.add(6);
        list2.add(4);



        myList.add(list1);
        myList.add(list2);

        System.out.println(myList.get(0).get(2));

//        double d=5/6;
//        double n=5;
//        double m=6;
//
////        System.out.println("%.4f" +d);
////
////        double num = 1/6;
////        DecimalFormat df = new DecimalFormat("#.###");
////        df.setRoundingMode(RoundingMode.CEILING);
////        System.out.println(df.format(num));
////
////        double ans=Math.floor(num*10000)/10000;
////        System.out.println(ans);
//
////        System.out.printf("Hello %s!%n", "World");
//
////        System.out.printf("baeldung%nline%nterminator");
////
//        System.out.printf("%.6f %n",n/m);
//
//        System.out.printf("'%.4f'%n", 5.1473);


    }
}
