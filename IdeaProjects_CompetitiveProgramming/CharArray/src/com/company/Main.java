package com.company;

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

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

    public static void main (String[] args) {
        //code

        FastReader s=new FastReader();


        //Enter the number of testCase

        int testCase=s.nextInt();


        for(int i=0;i<testCase;i++){

            //Enter the side of the ith Testcase char array;

            int size=s.nextInt();

            //Enter the char element array of nuts;
            int[] arr=new int[size];

            for(int m=0;m<size;m++){
                arr[m]=(int)s.next().charAt(0);
            }

            //Enter the char element array of bolts;
            int[] arr2=new int[size];

            for(int p=0;p<size;p++){
                arr2[p]=(int)s.next().charAt(0);
            }


            char[] chars=new char[5];

            Arrays.sort(arr);



            for(int n=0;n<size;n++){
                chars[n] =(char)arr[n];
            }

            for(int j=0;j<size;j++){
                System.out.print(chars[j]+" ");
            }
            System.out.println("");
            for(int l=0;l<size;l++){
                System.out.print(chars[l]+" ");
            }
        }
















    }
}