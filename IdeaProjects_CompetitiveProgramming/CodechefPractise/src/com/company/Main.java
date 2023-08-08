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

    public static int ans(int min,int max, int frequency, int[] arr, int size) {

        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<size;i++){
            hs.add(arr[i]);
        }

        ArrayList<Integer> list=new ArrayList<>(hs);

        int count=1;
        int maxCount=1;
        int ans=-1;
        int m=0;

        for(int i=0;i<list.size();i++){

            for(int j=min;j<=max-1;j++){
                if(list.get(i)==arr[j]){
                    count++;
                }
                if(count>maxCount){
                    ans=list.get(i);
                }
            }
        }

        int finalAns=0;

        if( count>0 && count>=frequency){
            finalAns=ans;

        }
        else{
            finalAns=-1;
        }



        return finalAns;

    }

    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        FastReader s=new FastReader();

        //Enter the size of the Array;
        int size=s.nextInt();

        //Enter the number of testCase or queries
        int queries=s.nextInt();
        //Enter the Array elements;
        int[] arr=new int[size];
        for (int i=0; i<size; i++){
            arr[i]=s.nextInt();
        }

        //Now for each queries;
        for(int i=0;i<queries;i++){

            //Enter the minLimit;
            int min=s.nextInt();

            //Enter the maxLimit;
            int max=s.nextInt();

            //Enter the frequency of some element you want
            int frequency=s.nextInt();

            System.out.println(ans(min, max,frequency,arr,size));
        }
    }
}
/*

        5 1
        1 2 2 2 2
        1 1 1

*/