package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        try{
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while (t-->0){
                int len=sc.nextInt();
                String string=sc.next();

                int count=0;
                char initial=string.charAt(0);
                for (char c : string.toCharArray()){

                    if (c=='A' && initial=='B'){
                        count++;
                        initial='A';
                    }
                    if (c=='B'  && initial=='A'){
                        count++;
                        initial='B';
                    }
                }
                if (string.charAt(0)=='B' && len==1){
                    System.out.println(count);
                }else {
                    System.out.println(count-1);
                }
            }
        }catch (Exception e){ return;
        }

    }
}
