package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Pattern matching code in O(n-m);

        String string="abckdermiya;aldsf";

        String pattern="dermiya";

        StringBuilder sb;

        for (int i=0;i<string.length()-pattern.length()+1;i++){

            int i2=pattern.length()+i;

            sb=new StringBuilder(string.substring(i,i2));

            if ((sb.toString()).equals(pattern)){
                System.out.println("String found at index "+ i);
                break;

            }
        }

//        String sub=string.substring(0,pattern.length());

//        System.out.println(sub);
//        System.out.println(pattern);

    }
}
