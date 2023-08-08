package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String string;

        System.out.println("enter the string text: ");

        string=bufferedReader.readLine();

        System.out.println("you entered: "+ string);
    }
}
