package com.company;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws java.lang.Exception{
	// write your code here

        Scanner sc=new Scanner(System.in);
        BufferedWriter wr=new BufferedWriter(new OutputStreamWriter(System.out));
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();

            if (n==1){
//                System.out.println(-1);
                wr.write(-1+"\n");
            }
            else{
//                String str="2";
//                System.out.print(2);
                wr.write(2+"");

                for (int i=0;i<n-1;i++){
//                    str+=3;
//                    System.out.print(3);
                    wr.write(3+"");
                }

//                System.out.println();
                wr.write("\n");

            }

        }
        wr.flush();
        wr.close();
    }
}
