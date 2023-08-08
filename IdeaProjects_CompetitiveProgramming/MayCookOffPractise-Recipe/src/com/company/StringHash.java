package com.company;

import java.util.HashSet;

public class StringHash {

    public static void main(String[] args) {

        HashSet<String> set=new HashSet<>();

        String string="acc";
        String rev="acc";

        set.add(string);
        set.add(rev);

        if (set.size()==1){
            System.out.println("It's same");
        }else{
            System.out.println("It's not same");
        }

    }
}
