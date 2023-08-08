package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    static String happyLadybugs(String b) {

        int[] lb = new int['Z' - 'A' + 1];
        boolean esp = false;
        //The number of ladybirds for each color is saved in lb
        //and evaluated if there is at least one space
        for (char c : b.toCharArray()) {
            if(c!='_'){
                lb[c-'A']++;
            }else{
                esp = true;
            }
        }
        //If there are no spaces, all the ladybugs should have an equal partner
        if (!esp) {
            for (int i = 1; i < b.length()-1; i++) {
                if(b.charAt(i)!=b.charAt(i-1) && b.charAt(i)!=b.charAt(i+1)){
                    return "NO";
                }
            }
        }
        //If there are spaces, there can not be a ladybug of a single color
        for (int i : lb) {
            if(i==1) return "NO";
        }
        //If there is no unhappy ladybug
        return "YES";
    }



    public static void main(String[] args) {
	// write your code here
        String b="YYR_B_BR";  //YES

        String string="RBY_YBR";  //yes

        String string2="B_RRBR";  //yes

        String string1="X_Y__X";  //no

        String string4="__";  //yes
        String s2="BBB";

        //if even single color of that then return no
        //if odd number but more than 1 then return yes;
        //if all empty then return yes by default;

       System.out.println(happyLadybugs(s2));

    }
}
