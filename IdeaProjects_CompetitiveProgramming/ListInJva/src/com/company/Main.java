package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //since list is an interface
        //you cannot implement list without defining all its methods;
        //so we implement list by using ArrayList or LinkedList or Vector or Stack;

//        Vector<Integer> vector = new Vector<>(5);
//        ArrayList<Integer> arrayList = new ArrayList<>(5);
//        LinkedList<Integer> linkedList = new LinkedList<>();
//        Stack<Integer> stack = new Stack<>();
//
//        vector.add(5);
//        arrayList.add(5);
//        linkedList.add(5);
//        stack.push(5);
//
//        //List is an interface, and the instances of List can be created in the following ways:
//
//        List a = new ArrayList();
//        List b = new LinkedList();
//        List c = new Vector();
//        List d = new Stack();
//
//        Stack stack1 = new Stack();
//
//
//        b.add(5);
//        b.size();
//
//        //and so on;

        // Creating a list

        //creating a list;

        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(0, 1);  // adds 1 at 0 index
        l1.add(1, 2);  // adds 2 at 1 index
        System.out.println(l1);  // [1, 2]

        // Creating another list
        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(1);
        l2.add(2);
        l2.add(3);

        // Will add list l2 from 1 index
        l1.addAll(1, l2);
        System.out.println(l1);

        // Removes element from index 1
        l1.remove(1);
        System.out.println(l1); // [1, 2, 3, 2]

        // Prints element at index 3
        System.out.println(l1.get(3));

        // Replace 0th element with 5
        l1.set(0, 5);
        System.out.println(l1);


    }
}
