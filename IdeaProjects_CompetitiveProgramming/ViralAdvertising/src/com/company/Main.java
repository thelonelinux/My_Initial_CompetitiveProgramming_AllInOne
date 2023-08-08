package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);

        int n=scanner.nextInt();

        int initial=5;

        int cumm=0;

        int firsttaken=0;



        for(int i=0;i<n;i++){

            firsttaken=initial/2;
            cumm=cumm+firsttaken;
            initial=firsttaken*3;


        }

        System.out.println(cumm);

    }
}
