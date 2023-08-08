package com.company;

public class Main {

    static int squares(int a, int b) {

        double  small=(Math.sqrt(a));
        int small2=(int)small;

        int count=0;
        if(small-small2==0){
            count++;
        }

        int large=(int)Math.sqrt(b);

        return large-small2+count;



    }

    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {

        int year=y1-y2;
        int month=m1-m2;
        int day=d1-d2;

        if(y1>y2){
            return year*10000;
        }

        if(m1>m2 && d1>d2 && y1>=y2){
            if(month>=5){
                return month*500;
            }
            return month*500+day*15;
        }
        if(m1>m2  &&  d1<=d2  && y1>=y2){
            return month*500;
        }
        if(m1>=m2 && d1>d2 && y1>=y2){
            return day*15;
        }

        return 0;


    }

    public static void main(String[] args) {
	// write your code here

//        int a=3;
//        int b=9;
//
//        System.out.println(squares(a,b));

//        double d=Math.floor(Math.sqrt(99));
//        double e=Math.sqrt(1000);
//        System.out.println(d);
//        System.out.println(e);

//        2 7 1014
//        1 1 1015

        int d1=28;
        int m1=2;
        int y1=2015;

        int d2=15;
        int m2=4;
        int y2=2015;

        System.out.println(libraryFine(d1,m1,y1,d2,m2,y2));





    }
}
