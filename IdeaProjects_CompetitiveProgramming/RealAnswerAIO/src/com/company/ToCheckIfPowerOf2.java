package com.company;

public class ToCheckIfPowerOf2 {

    public static void main(String[] args) {
        System.out.println(powerOf2(32));
    }

    private static boolean powerOf2(int number){
        return (number > 0) && ((number & (number - 1)) == 0);
    }
}
