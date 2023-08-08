package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Simple Exception handling example;
        //finally block is always executed;

        //there can be 0 of many catch block but only one finally block;

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the divisor");

        int divisor= scanner.nextInt();

        System.out.println("enter the dividend");

        int dividend = scanner.nextInt();



        try {
            int data=dividend/divisor;
            System.out.println(data);
        }catch (ArithmeticException e){
            System.out.println("Divide by zero error") ; //since its arithmetic error and so only this is caught;
        }catch (ArrayIndexOutOfBoundsException f){
            System.out.println("Not divided by zero");
        }
        finally {
            System.out.println("Finally block is always executed");
        }

        System.out.println("Out of catch and try and finally");
    }


}
