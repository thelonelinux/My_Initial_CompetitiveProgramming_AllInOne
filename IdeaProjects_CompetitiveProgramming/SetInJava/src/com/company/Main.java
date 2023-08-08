package com.company;

// Java code for adding elements in Set
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        // Set deonstration using HashSet
        Set<String> hash_Set = new HashSet<String>();
        hash_Set.add("Hello");
        hash_Set.add("world");
        hash_Set.add("Hello");
        hash_Set.add("Amar");
        System.out.print("Set output without the duplicates : ");

        System.out.println(hash_Set);



        // Set deonstration using TreeSet
        System.out.print("Sorted Set after passing into TreeSet : ");
        Set<String> tree_Set = new TreeSet<String>(hash_Set);
        System.out.println(tree_Set);
    }
}