package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<Integer> values= Arrays.asList(1,5,2,6,8,7,3);

        List<Integer> list = new ArrayList<>(values);




//        list.forEach(i -> System.out.println(i));


//        list.forEach(System.out::println);



        list.forEach(System.out::println);


    }
}
