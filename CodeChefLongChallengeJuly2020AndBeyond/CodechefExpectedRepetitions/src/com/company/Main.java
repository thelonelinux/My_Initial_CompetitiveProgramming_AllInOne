package com.company;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Main {

    public  static int[] alphabetWeights=new int[26];

    public static long W(long a){

        return alphabetWeights[(int)a];
    }


    public static long P(long a){

        Long longs=a;
        String length=longs.toString();
        int len=length.length();

        if (len==1){
            return W(a);
        }

    }

    public static void main(String[] args) {
	// write your code here

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String string=sc.next();
            for (int i=0;i<26;i++){
                alphabetWeights[i]=sc.nextInt();
            }

            char[] chars=string.toCharArray();

            long[] longValueOfAlphabets=new long[chars.length];
            for (int i=0;i<longValueOfAlphabets.length;i++){
                longValueOfAlphabets[i]=chars[i]-97;
            }

            /** Let's assign their weight values already*/
            long[] weightValuesTakenAlready=new long[chars.length];
            for (int i=0;i<weightValuesTakenAlready.length;i++){
                weightValuesTakenAlready[i]=alphabetWeights[(int)longValueOfAlphabets[i]];
            }


            /** Real answer starts **/
            /** First find for all single elements in the list*/
            long count=0; /**This denotes the number of possible substring of that string which we will divide at last*/
            long sum=0;
            for (int i=0;i<string.length();i++){
                sum+=weightValuesTakenAlready[i];
                count++;
            }


            /** Now for all possible other substring */
            if (string.length()>=2){
                for (int i=0;i<string.length()-1;i++){


                    //taking two at time
                    for (int j=i+1;j<string.length();j++){

                        
                    }

                }
            }






        }

    }
}
