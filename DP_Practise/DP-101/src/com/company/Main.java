package com.company;

public class Main {

    static long strangeCounter(long t) {

        long x=3;
        long y=x;
        while( t > y ){
            x=x*2;
            y=y+x;

        }




        return (y-t+1);


    }

    public static void main(String[] args) {
	// write your code here

        System.out.println(strangeCounter(9));




    }
}
