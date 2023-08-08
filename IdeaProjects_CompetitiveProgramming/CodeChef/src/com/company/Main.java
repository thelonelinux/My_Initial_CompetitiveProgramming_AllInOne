package com.company;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{

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

    public static void main (String[] args) throws java.lang.Exception
    {
        FastReader s=new FastReader();
        int testCase=s.nextInt();

        for(int i=0;i<testCase;i++){
            int N=s.nextInt();
            int M=s.nextInt();
            int K=s.nextInt();
            int L=s.nextInt();
            int R=s.nextInt();

            int[][] arr=new int[N][2];
            for(int j=0;j<N;j++){
                for(int m=0;m<2;m++){
                    arr[j][m]=s.nextInt();
                }
            }
            int myTemp=0;
            int price=100;

            for(int v=0;v<N;v++){
                if(K<arr[v][0]){
                    myTemp=arr[v][0]-M;

                    if(myTemp<=R  &&  myTemp>=L){
                        myTemp=0;
                        price=Math.min(price,arr[v][1]);
                    }

                }

                if(K>arr[v][0]){
                    myTemp=arr[v][0]+M;

                    if(myTemp<=R && myTemp>=L){

                        myTemp=0;
                        price=Math.min(price,arr[v][1]);
                    }

                }
                myTemp=0;
            }

           if(price==100){
               System.out.println(-1);
           }
           else {
               System.out.println(price);
           }


        }
    }
}

