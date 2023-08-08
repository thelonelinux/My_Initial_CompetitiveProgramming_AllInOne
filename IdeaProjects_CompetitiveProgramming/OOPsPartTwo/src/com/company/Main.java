package com.company;

import sun.reflect.generics.tree.Tree;
import java.io.*;
import java.util.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.BufferedReader;
import java.util.LinkedList;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here


//        Stack<Integer> stack=new Stack<>();       //these are already built class of stacks and queue.
//
//        LinkedList<Integer> linkedList= new LinkedList<>();  //you can directly create its object and apply push pop methods;

        //use of parseInt() ;
//        String s="50";
//        int n=Integer.parseInt(s);  //converts string to integer;
//
//        System.out.println(n);
//        System.out.println(s);






        //Difference between bufferedReader and Scanner;
        //Not so difference both perform with same speed and same way to perform;
        //Still scanner  is easy and simple to remember;
        //BufferedReader is a bit faster as compared to scanner because scanner
        // does parsing of input data and BufferedReader simply reads sequence of characters.

        //Use of BufferedReader;
//        BufferedReader br = new BufferedReader(new
//                InputStreamReader(System.in));
//        System.out.println("Enter an integer");
//        int a = Integer.parseInt(br.readLine());
//        System.out.println("Enter a String");
//        String b = br.readLine();
//        PrintStream printf = System.out.printf("You have entered:- " + a +
//                " and name as " + b);

        //use of scanner;
//        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter an integer");
//        int a = scn.nextInt();
//        System.out.println("Enter a String");
//        String b = scn.next();
//        System.out.printf("You have entered:- "
//                + a + " " + "and name as " + b);

        Students students = new Students();
        students.name="vicky";

        System.out.println(students.name);

        students.fun();

    }
}
