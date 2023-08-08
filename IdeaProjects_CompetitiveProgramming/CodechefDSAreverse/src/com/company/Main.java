package com.company;

import java.util.Scanner;
import java.util.Vector;

public class Main {

    public static void main(String[] args) throws java.lang.Exception{
	// write your code here

        Scanner s = new Scanner(System.in);
        int n =s.nextInt(),temp=n;
        s.nextLine();
        Vector<String[]> svec = new Vector<String[]>();
        while(temp--!=0){
            String str = s.nextLine();
            String[] arr = str.split("[\\s | . | , | ! | ? | ;  | : | @ |  * |']+");
            svec.add(arr);
            // s.nextLine();
        }
        for(int i=n-1;i>=0;i--){
            String[] exa = svec.get(i);
            int len = exa.length;
            for(int j=len-1;j>=0;j--){
                System.out.print(exa[j]+" ");
            }
            System.out.print("\n");
        }

    }
}
