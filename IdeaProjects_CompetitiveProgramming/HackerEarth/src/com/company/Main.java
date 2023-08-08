package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class Main {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        String start="(";
        String end=")";

        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));

        int num=Integer.parseInt(bufferedReader.readLine());

        String[] inputs = new String[num];



        for(int j=0;j<num;j++ ){
            inputs[j]= bufferedReader.readLine();
        }


        int[] arr=new int[num];

        for(int i=0 ; i<num; i++){
            int t=0;
            while(inputs[i].charAt(t)!=')'){
                t++;
            }

            arr[i]=t;
        }

        for (int m=0;m<num;m++){

            System.out.println(2*arr[m]);

        }


    }
}

