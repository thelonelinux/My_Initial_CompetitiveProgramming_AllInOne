package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FastREad {

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

    public static void main(String[] args) {


        try{
            FastReader s=new FastReader();
            int t=s.nextInt();
            while (t-->0){
                long len=s.nextLong();
                long query=s.nextLong();

                String string=s.next();

                int[] arr=new int[26];

                for (char c : string.toCharArray()){
                    int num=c-97;
                    arr[num]=arr[num]+1;
                }

                long duplicates;
                while (query-->0){
                    duplicates=s.nextLong();
                    if (duplicates==0){
                        System.out.println(len);
                    }
                    else{
                        long sum=0;
                        for (int i=0;i<26;i++){
                            if (arr[i]>duplicates){
                                sum=sum+arr[i]-duplicates;
                            }
                        }
                        System.out.println(sum);
                    }
                }
            }
        }catch (Exception e){
            return;
        }

    }
}
