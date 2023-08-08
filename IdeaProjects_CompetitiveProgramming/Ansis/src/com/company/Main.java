package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public  class Main
{




    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);

        HashMap<String,Integer> map=new HashMap<>();

        map.put("saturday",1);
        map.put("sunday",2);
        map.put("monday",3);
        map.put("tuesday",4);
        map.put("wednesday",5);
        map.put("thursday",6);
        map.put("friday",7);


        int testCase=sc.nextInt();

        while (testCase-->0){


            String first=sc.next();
            String last=sc.next();

            int lower=sc.nextInt();
            int upper=sc.nextInt();


            int firstDay=map.get(first);
            int lastDay=map.get(last);

            int duration=0;

            if(firstDay<=lastDay)
                duration=Math.abs(lastDay-firstDay)+1;
            else
                duration=(8-firstDay)+lastDay;

            int cou=0;
            int e=duration;
            int d=upper;
            int c=lower;
            int index=e;
            for(int j=e;j<=d;j=j+7)
            {
                if((j<=d)&&(j>=c))
                {
                    cou++;
                }
                if(cou==1)
                    index=j;
            }
            // System.out.println(cou);
            if(cou==0)
                System.out.println("impossible");
            else if (cou==1)
                System.out.println(index);
            else
                System.out.println("many");
        }

//            if(duration>=lower && duration<=upper){
//
//                int nextDuration=duration+7+duration;
//
//                if (nextDuration>=lower && nextDuration<=upper){
//                    System.out.println("many");
//                }
//                else {
//                    System.out.println(duration);
//                }
//
//
//            }
//            else {
//                System.out.println("impossible");
//            }



    }
}
