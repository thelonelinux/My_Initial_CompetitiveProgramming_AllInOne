package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        String str = new String("07:15:45PM");

        //convert 12 hour time format to 24 hour;

        String s= "07:15:45PM";


        String s2=s.replace("PM","");

        String s3=s2.replace("07","19");


        //conversion of the char into its ASCII value;

//        int c=(int)'0';
//
//        int d=(int)'7';
//
//        int e=(int)'e'+(int)'f';
//
//
//        System.out.print(c);

        String str="07:15:45PM"; //to convert this string into "12";

        String S=str.substring(2,8);

        char S1= str.charAt(8);


        char s4=str.charAt(0);
        char s5=str.charAt(1);

        int a=(int) s4;
        int b=(int) s5;

        //if PM

        //if AM leave it as usual and remove PM only

        //here we are dealing for pm

        if(S1=='P'){

            if(a==48 ){
                a=a+1;
                b=b+2;
            }else if (a==49 && b<=49){
                a=a+1;
                b=b+2;
            }

        }

        if(S1=='A'){
            if(a==49 && b==50){
                a=a-1;
                b=b-2;
            }
        }



        char s6=(char) a;
        char s7=(char) b;

        String s9=""+s6+s7+S;

        System.out.print(s9);


    }
}
