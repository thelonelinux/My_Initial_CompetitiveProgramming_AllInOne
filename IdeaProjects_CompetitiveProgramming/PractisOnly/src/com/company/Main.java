package com.company;

/**package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public  class Main {

    static class FastReader{

        StringTokenizer st;
        BufferedReader br;

        public FastReader(){
            br=new BufferedReader(new InputStreamReader(System.in));
        }

        String next(){
            while (st==null || !st.hasMoreElements()){

                try {
                    st=new StringTokenizer(br.readLine());
                }
                catch (IOException e){
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
            String  str="";

            try {
                str=br.readLine();
            }catch (IOException e){
                e.printStackTrace();
            }
            return str;
        }

    }

    public static int[] ans(int[] arr, int size, int numOfRotations){

        Queue<Integer> q=new LinkedList<>();

        for(int i=0;i<size;i++){
            q.add(arr[i]);
        }

        for(int j=0;j<numOfRotations;j++){
            int removedele = q.remove();
            q.add(removedele);

        }

        int[] arr2=new int[size];
        for(int m=0;m<size;m++){
            arr2[m]=q.peek();
            q.remove();
        }

        return arr2;

    }

    public static void main (String[] args) {
        //code
        FastReader s=new FastReader();


        //Enter the tesCase;
        int testCase=s.nextInt();

        for(int i=0;i<testCase;i++){

            //Enter the size of ith array;
            int size=s.nextInt();

            //Enter the num of rootations;
            int d=s.nextInt();

            //Enter the array elements
            int[] arr=new int[size];
            for(int j=0;j<size;j++){
                arr[j]=s.nextInt();
            }

            int[] arr2=ans(arr,size,d);
            for(int p=0;p<size;p++){
                System.out.print(arr2[p]+" ");
            }
            System.out.println("");
        }
    }
}