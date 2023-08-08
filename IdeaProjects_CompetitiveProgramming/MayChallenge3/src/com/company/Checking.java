package com.company;

public class Checking {

    public static void main(String[] args) {

        int x=120;
        String xString=Integer.toBinaryString(x);
        System.out.println(xString);

        int y=150;
        String yString=Integer.toBinaryString(y);
        System.out.println(yString);
        int xored=x|y;
        String string=Integer.toBinaryString(xored);
        System.out.println(string);

        System.out.println(string);
    }
}
