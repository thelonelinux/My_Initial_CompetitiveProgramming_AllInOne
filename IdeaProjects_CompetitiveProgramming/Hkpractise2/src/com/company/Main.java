package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {

        int count=0;
        float slope=0;

        if(n==1){
            return 0;
        }
        if(n==2 && k==0){
            return 3;
        }
        if(n>2 && k==0){
            for(float i=0;i<n;i++){
                for(float j=0;j<n;j++){
                    slope=(i-r_q)/(j-c_q);
                    if(slope==1 ||slope==-1 ){
                        count++;
                    }
                }
            }
        }

        int ans=count-1+(2*(n-1));
        return ans;


    }

    static int[] acmTeam(String[] topic) {

        int len=topic[0].length();
        double all=Math.pow(2,len);
        int count=0;



        double bit=0;
        for(int i=0;i<topic.length-1;i++){

            for(int j=i+1;j<topic.length;j++){
                bit=Integer.parseInt(topic[i],2)|Integer.parseInt(topic[j],2);

                if(bit==all-1){
                    count++;
                }
            }

        }
        int[] ans={topic[0].length(), count};
        return ans;


    }

    static String appendAndDelete(String s, String t, int k) {
        int extra=Math.abs(s.length()-t.length());

        if(s.equals(t)){
            return "Yes";
        }
        if(extra<k){
            return "Yes";
        }
        else{
            return "No";
        }


    }


    public static void main(String[] args) {
	// write your code here

       String s1="ashley";
       String s2="ash";
       System.out.println(appendAndDelete(s1,s2,2));
    }
}
