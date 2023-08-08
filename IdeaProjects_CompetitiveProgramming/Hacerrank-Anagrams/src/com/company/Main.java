package com.company;

import java.util.HashSet;

public class Main {

    static int makeAnagram(String a, String b) {

        HashSet<Character> set=new HashSet<>();
        char[] given=a.toCharArray();
        char[] pattern=b.toCharArray();
        int count=0;
        for (int i=0;i<pattern.length;i++){
            for (int j=0;j<given.length;j++){
                if (pattern[i]==given[j]){
                    given[j]='*';
                    count=count+2;
                    break;
                }
            }
        }
        int ans=a.length()+b.length()-count;
        return ans;
    }

    public static void main(String[] args) {
	// write your code here



        String s1="fcrxzwscanmligyxyvym";
        String str2="jxwtrhvujlmrpdoqbisbwhmgpmeoke";

        System.out.println(makeAnagram(s1,str2));

    }
}
