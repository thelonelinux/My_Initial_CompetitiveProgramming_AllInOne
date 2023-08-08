package com.company;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<5;i++){
            System.out.println("Enter the first name :");
            String firstName=sc.nextLine();
            System.out.println("Enter the last Name :");
            String lastName=sc.nextLine();
            System.out.println("Enter the age :");
            int n=Integer.parseInt(sc.nextLine());
        }
    }
}
