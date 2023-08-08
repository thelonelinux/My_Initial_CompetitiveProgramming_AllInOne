package com.company;

import com.sun.xml.internal.ws.util.StringUtils;

public class Main {



    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) throws Exception{


        long multiplier=n/s.length();
        long mod=n%s.length();
        int mod2=(int)mod;

//        StringBuilder builder = new StringBuilder();
//        for (int i = 0; i < multiplier; i++) {
//            builder.append(s);
//        }

        StringBuilder builder = new StringBuilder();
        int i=1;
        try {
            for (  i=0; i<multiplier; i++ )
                builder.append(s);
        } catch ( OutOfMemoryError e ) {
            System.out.println(i); // OUTPUT: 1207959551
            System.out.println(Integer.MAX_VALUE); // OUTPUT: 2147483647
        }

        String appendedString= builder.toString();

        String modString=s.substring(0,mod2);

        String finalString=appendedString+modString;

        long count=0;
        for (int m=0;m<finalString.length();m++){
            if(finalString.charAt(m)=='a'){
                count=count+1;
            }
        }

        return count;
    }

    public static void main(String[] args) throws Exception {
	// write your code here

        String string="abcac";

        int n=10;

        String s="abcac";
        int multiplier=s.length();
        int mod2=2;

        System.out.println(repeatedString(string,n));
//
//        StringBuilder builder = new StringBuilder();
//        for (int i = 0; i < multiplier; i++) {
//            builder.append(s);
//        }
//        String appendedString= builder.toString();
//
//        String modString=s.substring(0,mod2);
//
//        String finalString=appendedString+modString;
//
//        System.out.println(finalString);
    }
}
