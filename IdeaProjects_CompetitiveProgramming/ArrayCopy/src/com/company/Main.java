package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        char[] a=new char[]{'v','i','k','a','s','k','u','m','a','r'};

        char[] b=new char[a.length];

        System.arraycopy(a,0,b,0,a.length);
        System.out.println(new String(b));

    }
}
