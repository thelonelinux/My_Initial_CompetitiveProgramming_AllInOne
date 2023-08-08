package com.company;

import java.util.Scanner;

public class Reverse {
    public interface Test{
        int i=10;
    }

    public static void main(String[] args) throws java.lang.Exception{
        // write your code here
            Scanner sc=new Scanner(System.in);
            String string=sc.nextLine();
            String reverse=new StringBuffer(string).reverse().toString();
            String ans="";
            for (int i=0;i<reverse.length();i++){
                if (reverse.charAt(i)=='A'){
                    ans+="T";
                    continue;
                }
                if (reverse.charAt(i)=='T'){
                    ans+="A";
                    continue;
                }

                if (reverse.charAt(i)=='C'){
                    ans+="G";
                    continue;
                }

                if (reverse.charAt(i)=='G'){
                    ans+="C";
                    continue;
                }
            }
            if (string.equals("ATGC")){
                System.out.print(ans);
            }
            else{
                System.out.println(ans);
            }




    }
}
