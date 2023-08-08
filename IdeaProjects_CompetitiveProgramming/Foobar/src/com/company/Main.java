package com.company;

import java.util.Arrays;

public class Main {

    public static int solution(String x) {
        //Your code here

        int length=x.length();
        char ch=x.charAt(0);
        boolean bool=false;
        for (int j=1;j<x.length();j++){
            if (ch==x.charAt(j)){
                bool=true;
            }else {
                bool=false;
                break;
            }
        }
        if (bool){
            return length;
        }

        for(int i=0;i<x.length()/2;i++){

            String sub=x.substring(0,i+1);
            int len=sub.length();
            char c=x.charAt(i+1);

            int mod=x.length()%sub.length();

            if (sub.charAt(0)==c  && length>=(2*len)  && mod==0){

                int loops=x.length()/sub.length();
                int expectedCount=loops;
                loops=loops-1;
                int count=0;

                int initial=i+1;
                int last=i+1+len;

                while (loops-->0){
                    if (sub.equals(x.substring(initial,last))){
                        count++;
                    }
                    initial=initial+len;
                    last=last+len;
                }
                if (count+1==expectedCount){
                    return expectedCount;
                }else{
                    count=0;
                }
            }
        }



        return 1;
    }


    public static void main(String[] args) {
	// write your code here

        System.out.println(solution("ababefab"));
        System.out.println(solution("ababeababe"));
        System.out.println(solution("ababefabef"));
        System.out.println(solution("ababe"));
        System.out.println(solution("abab"));
        System.out.println(solution("ababc"));
        System.out.println(solution("abcabcabcabc"));
        System.out.println(solution("abccbaabccba"));
        System.out.println(solution("aaaa"));

    }
}
