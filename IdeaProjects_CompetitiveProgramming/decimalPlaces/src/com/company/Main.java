package com.company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

//     static double squareRoot(int number) {
//        double temp;
//
//        double sr = number / 2;
//
//        do {
//            temp = sr;
//            sr = (temp + (number / temp)) / 2;
//        } while ((temp - sr) != 0);
//
//        return sr;
//    }
//
//    public static void main(String[] args)
//    {
//        System.out.print("Enter any number:");
//        Double num2=Math.sqrt(100);
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        scanner.close();
//
//
//        System.out.println("Square root of "+ num+ " is: "+squareRoot(num));
//    }
//}

    public static void main(String[] args)
    {
        // Declare an object and initialize with
        // predefined standard input object
        Scanner sc = new Scanner(System.in);

        // Initialize sum and count of input elements
        int sum = 0, count = 0;

        // Check if an int value is available
        while (sc.hasNextInt())
        {
            // Read an int value
            int num = sc.nextInt();
            sum += num;
            count++;
        }
        int mean = sum / count;
        System.out.println("Mean: " + mean);
    }
}
