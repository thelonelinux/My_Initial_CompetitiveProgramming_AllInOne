package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String s="hello";

        char[] chars=s.toCharArray();

        for(char c : s.toCharArray()){
            System.out.println(s.indexOf(c));
        }
    }
}
