package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class A {

    public static void main(String[] args) throws IOException {
        // write your code here


        Scanner scanner = new Scanner(System.in);


        InputStreamReader iSR = new InputStreamReader(System.in);

        BufferedReader bR = new BufferedReader(iSR);
//
//        String s = bR.readLine();
//
//        int i = Integer.parseInt(bR.readLine());
//
//        long l = Long.parseLong(bR.readLine());
//
//        double d = Double.parseDouble(bR.readLine());

        System.out.println("Enter the char vlaue");

        char c = (char) bR.read();

        System.out.println("you entered value is "+ c);

    }
}