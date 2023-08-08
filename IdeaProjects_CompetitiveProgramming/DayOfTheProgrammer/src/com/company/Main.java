package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    static String dayOfProgrammer(int year) {

        String s;

        String string1 = "12.09.";
        String string2 = "13.09.";
        String s3="26.09.1918";
        String s1 = string1 + Integer.toString(year);
        String s2 = string2 + Integer.toString(year);
        if (year==1918){
            s=s3;
            return s;
        }
        if (year % 4 == 0 && year % 100 != 0 ||year%400==0 || year == 1700 || year == 1800 || year == 1900) {
            s = s1;

        }
        else {
            s = s2;
        }

        return s;


    }

    public static void main(String[] args) {
	// write your code here

//        System.out.println(13+"."+1+"."+2016);
//
//        Date date = new Date();
//
//        System.out.println(date.toString());

        //Non leap year gives 13;
        //upto year 1700 even 1800 and 1900 is leap year;
        //and also we have to return a string;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Year");
        int year=scanner.nextInt();

        System.out.println(dayOfProgrammer(year));



//        String string1 = "12.09.";
//        String string2 = "13.09.";
//        String s1=string1+Integer.toString(year);
//        String s2=string2+Integer.toString(year);
//
//        if (year==1700 || year==1800 || year==1900){
//            System.out.println(s1);
//
//            if(year%4==0  && year%100!=0){
//                System.out.println(s1);
//
//            }
//        }
//        else {
//            System.out.println(s2);
//
//        }





//        System.out.println(s1);
//        System.out.println(s2);




//        String pattern = "dd.MM.yyyy";
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
//        String date = simpleDateFormat.format(new Date());
//        System.out.println(date);
    }
}
