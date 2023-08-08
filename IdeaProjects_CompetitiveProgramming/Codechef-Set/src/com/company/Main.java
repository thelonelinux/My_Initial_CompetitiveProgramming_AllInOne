package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        try{

            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while (t-->0){
                String real=sc.next();
                String match=sc.next();

                HashSet<Character> set=new HashSet<Character>();
                for (char c: real.toCharArray()){
                    set.add(c);
                }
                int count=0;
                for (char c : match.toCharArray()){
                    boolean bool2=set.contains(c);
//                    boolean bool=set.add(c);
                    if(bool2){
                        count++;
                    }
                }
                System.out.println(count);
            }

        }catch (Exception e){
            return;
        }

    }
}
