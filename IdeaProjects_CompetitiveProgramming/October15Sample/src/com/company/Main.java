package com.company;

import javax.xml.validation.SchemaFactoryConfigurationError;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc=new Scanner(System.in);


        System.out.println("Enter the first element :");
        int n=sc.nextInt();

        System.out.println("Enter the second element ");
        int m=sc.nextInt();

        System.out.println("Enter the choice of your operation");

        System.out.println("1->Add");
        System.out.println("2->Subtract");
        System.out.println("3->Multiply");
        System.out.println("0->Exit");

        int choice;


        do {

             choice=sc.nextInt();

            switch (choice){

                case 1 :  System.out.println(n+m);
                          System.out.println("Enter next operation");
                          break;

                case 2 : System.out.println(n-m);
                         System.out.println("Enter next operation");
                         break;

                case 3 : System.out.println(n*m);
                         System.out.println("Enter next operation");
                          break;

                default: System.out.println("You have entered something else  ");
                         System.out.println("Enter next operation or enter 0 to exit");
                         break;
            }

        }
        while (choice!=0);






    }
}
