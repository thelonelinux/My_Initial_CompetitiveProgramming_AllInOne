package com.company;

import sun.text.normalizer.CharacterIteratorWrapper;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static long totalPairs(int K, long N){

        long totalGenerated=N*K;


        return 0;


    }


    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);

        //Arrangement of N elements in K distinct places with repitions allowed
        //Math.pow(N,K);

        int t=sc.nextInt();

        while (t-->0){

            long n=sc.nextInt();
            long realN=n;

            int k=sc.nextInt();



            String str="";

            double power=Math.pow(n,k);
            int i=0;
            int j=0;
            int c=0;

            while (power-->0){

                str+=(char)(97+i);
                c++;


                while (n-->1){
                    if (c==realN){
                        j++;
                    }
                    str+=(char)(97+(j));


                }


                System.out.println(str);
                str="";

                n=realN;
                if (c==realN){
                    i++;
                    c=0;
                }
                j=0;


           }


        }


    }
}
