package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int no_strings=scn.nextInt();
        ArrayList<String> al=new ArrayList<>();
        for(int i = 0; i<no_strings; i++) {
            al.add(scn.next());
        }
        al= solve(al);
        for(String str: al) {
            System.out.println(str);
        }
    }

    public static ArrayList<String> solve(ArrayList<String> names) {
        HashSet<String> s = new HashSet<>();
        HashMap<String, Integer> m = new HashMap<>();
        ArrayList<String> l = new ArrayList<>();
        for (String name : names) {
            if (m.containsKey(name)) {
                int n = m.get(name); m.put(name, n+1);
                l.add(name + " " + Integer.toString(n+1));
            } else { m.put(name, 1);
            String t = "";
            boolean inserted = false;
            for (char c : name.toCharArray()) {
                t += c;
                if (!inserted && !s.contains(t) ) {
                    inserted = true;
                    l.add(t);
                } s.add(t);
            } if (!inserted) l.add(t);
            }
        } return l;
    }
}