package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int margin=sc.nextInt();

        for (int i=0;i<n;i++){
            int a=sc.nextInt();
            if (a>=margin){
                System.out.println("Good boi");
            }else{
                System.out.println("Bad boi");
            }
        }
    }
}
