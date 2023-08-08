package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    static int minimumNumber(int n, String password) {

        int typesRequired=containsAll(password);
        if(password.length()>=6){
            return 4-typesRequired;
        }

        int numRequired=6-password.length();
        return Math.max(numRequired,4-typesRequired);

    }

    static  int containsAll(String password){
        int countainsSpecial=0,countainsUpper=0,countainsLower=0,countainsNum=0;
        for(int i=0;i<password.length();i++){
            if((int)password.charAt(i)>32  && (int)password.charAt(i)<46){
                countainsSpecial=1;
            }
            if((int)password.charAt(i)>64  && (int)password.charAt(i)<91){
                countainsUpper=1;
            }
            if((int)password.charAt(i)>96  && (int)password.charAt(i)<123){
                countainsLower=1;
            }
            if((int)password.charAt(i)>47  && (int)password.charAt(i)<58){
                countainsNum=1;
            }
        }


       return countainsLower+countainsNum+countainsSpecial+countainsUpper;
    }

    public static void main(String[] args) {
	// write your code here



        String string="AUzs-nV";
        System.out.println(minimumNumber(string.length(),string));

    }
}
