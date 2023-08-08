package com.company;

import sun.nio.ch.sctp.SctpNet;

import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

import static jdk.nashorn.internal.parser.TokenType.CASE;

public class Main {

//    static void clockWise(int[] arr, int d){
//
//        Collections.rotate(arr);
//    }

    static int ans(int[] arr, char c, int pos,int currentPos){

        if (c=='R'){

            System.out.println(arr[currentPos-1]);

        }
        else if (c=='A'){
            currentPos=currentPos-pos;

        }

        else if(c=='C'){
            currentPos=currentPos+pos;

        }
        return 0;
    }

    static int currentPos;




    public static void main(String[] args) {
	// write your code here

        Scanner sc=new Scanner(System.in);

        int len=sc.nextInt();

        int querie=sc.nextInt();

        int[] arr=new int[len];

        for (int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }


        while (querie-->0){
            char c=sc.next().charAt(0);
            int pos=sc.nextInt();


             switch (c){


                 case 'A':currentPos=(currentPos-(pos)%len)%len;
                 break;

                 case 'C': currentPos=(currentPos+(pos)%len)%len;
                 break;

                 case 'R': if (currentPos==0)currentPos=currentPos+pos;
                     System.out.println(arr[currentPos-1]);
                     break;
             }



        }
    }
}
