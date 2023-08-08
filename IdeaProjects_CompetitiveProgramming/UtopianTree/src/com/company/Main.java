package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Period  Height
        //0          1
        //1          2
        //2          3
        //3          6
        //4          7
        //5          14

        //starting from string;
        //1->spring(2*height)     2->sutumn(+1 height)


        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the spring cycles :");

        int n=scanner.nextInt();

        int height=1;

        for (int i = 0;i<n;i++){
            if(i%2==0){
                height=height*2;
            }
            else {
                height=height+1;
            }
        }

        System.out.println(height);
    }
}
