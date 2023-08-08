package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.function.IntUnaryOperator;

public class Main {

    static  class FastReader{

        BufferedReader br;
        StringTokenizer st;


        public FastReader(){
            br=new BufferedReader(new InputStreamReader(System.in));
        }

        String next(){
            if(st==null || !st.hasMoreElements()){
                try{
                    st=new StringTokenizer(br.readLine());
                }catch (IOException e){
                    e.printStackTrace();
                }

            }
            return st.nextToken();
        }

        int nextInt(){
            return Integer.parseInt(next());
        }

        long nextLong(){
            return Long.parseLong(next());

        }

        double nextDouble(){
            return Double.parseDouble(next());
        }

        String nextLine(){
            String str="";

            try{
                str=br.readLine();
            }catch (IOException e){
                e.printStackTrace();
            }
            return str;
        }


    }


    public static void main(String[] args) {
	// write your code here

        FastReader s=new FastReader();

        double withDraw=s.nextDouble();
        double avail=s.nextDouble();
        double ans=avail;

        if(withDraw%5==0){
            ans=avail-withDraw-0.5;
        }
        else {
            ans=avail;
        }


        System.out.printf("%.2f", ans);
    }
}
