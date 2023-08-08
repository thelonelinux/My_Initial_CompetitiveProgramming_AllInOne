package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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

    public static void main(String[] args)
    {
        FastReader s=new FastReader();

        System.out.println("Enter the Value of n");
        int n = s.nextInt();

        System.out.println("Enter the Value of k");
        int k = s.nextInt();


        System.out.println("Enter the char value");
        char c=s.next().charAt(0);

        System.out.println("Enter the string value");
        String str=s.next();


        int count = 0;
        while (n-- > 0)
        {
            System.out.println("Enter the value of x until n-- > 0");
            int x = s.nextInt();
            if (x%k == 0)
                count++;
        }
        System.out.println("The value of Char is "+ c);
        System.out.println("The value of count is "+ count);
        System.out.println("The value of String is "+ str);
    }
}
