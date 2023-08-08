package com.company;

import com.sun.xml.internal.ws.util.StringUtils;

public class Main {


    static long repeatedString(String s, long n){

        long multiplier=n/s.length();
        long mod=n%s.length();
        int modInt=(int)mod;

        int count=0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='a'){
                count=count+1;
            }
        }

        long totalCount=count*multiplier;
        String subString=s.substring(0,modInt);

        int modCount=0;
        for (int j=0;j<subString.length();j++){
            if (subString.charAt(j)=='a'){
                modCount=modCount+1;
            }
        }

        long finalCount=totalCount+modCount;

        return finalCount;
    }

    public static void main(String[] args) {
	// write your code here

        String string="abcac";
        int n=10;

        System.out.println(repeatedString(string,n));
    }
}
