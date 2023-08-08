package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Main {


    public static void main(String args[])
    {

       BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        int distance=sc.nextInt();


        int o1=sc.nextInt();
        int o2=sc.nextInt();
        int o3=sc.nextInt();


        int c1=sc.nextInt();
        int c2=sc.nextInt();
        int c3=sc.nextInt();
        int c4=sc.nextInt();

        int oAns=o1+(distance-o2)*o3;

        int cAns=c2+(distance/c1)*c3+distance*c4;

        if(oAns<cAns){
            System.out.println("Online Taxi");
        }
        else {
            System.out.println("Classic Taxi");
        }

    }
}
