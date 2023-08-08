package com.company;

import java.util.Scanner;
import java.util.WeakHashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);

        int n=scanner.nextInt();                           //7;
        int m=scanner.nextInt();                             //19;
        int k=scanner.nextInt();                  //2;
        int warnedn=0;


//        for (int i=0;i<m%n;i++){
//            warnedn=warnedn+1;
//        }

        int i=m%n;

        warnedn=warnedn+i+k-1;

        System.out.println(warnedn);



    }
}
