package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }

    static int fact(int n){
        String s=Integer.toString(n);
        BigInteger bg=new BigInteger(s);
        int fact=1;

        while (n!=0){
            fact=(fact*n)%1000000007;
            n--;

        }
        return fact;

    }

    public static void main (String[] args) {
        //code


        FastReader s=new FastReader();
        int testCase=s.nextInt();

        for(int i=0;i<testCase;i++){

            int x=s.nextInt();
            int y=s.nextInt();
            int sum=x+y;

            int up=fact(sum);
            int down=fact(x)*fact(y);
            int ans=up/down;
            System.out.println(ans);


        }

    }
}
