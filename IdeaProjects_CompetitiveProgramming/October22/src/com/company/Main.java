package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main (String[] args) throws java.lang.Exception {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while(t-- > 0){
            // int n = Integer.parseInt(br.readLine().trim());
            String[] sr =(br.readLine().trim().split(" "));

            long l = Long.parseLong(sr[0]);
            long r =  Long.parseLong(sr[1]);
            // long nod = (long)Math.floor(Math.log10(r)/Math.log10(2) + 1);
            // System.out.println(nod+" :nod");
            // long temp = (long)Math.pow(2,nod)-1;
            // System.out.println(temp+" :nod");
            long ans=0;
            //  if(temp<=r && temp >=l){
            //  	ans = temp|r;
            //  	System.out.println(ans);
            //  }
            //  else{
            //  	int min = -2147483648;
            long j = l;
            while((j|j+1)<r){
                j=j|(j+1);
            }
            ans = j|r;
            System.out.println(ans);
            //}
        }

    }
}