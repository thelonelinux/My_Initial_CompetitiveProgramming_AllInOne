package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);

        String[] temp = br.readLine().split(" ");
        int N = Integer.parseInt(temp[0]);
        int Q = Integer.parseInt(temp[1]);
        int Type2 = 0 ;
        int[] Type = new int[Q];
        int[] Index = new int[Q];
        int[] Bit = new int[Q];

        for(int i_Type=0; i_Type < Q; i_Type++)
        {  String[] inp = br.readLine().split(" ");
            Type[i_Type] = Integer.parseInt(inp[0]);
            Index[i_Type] = Integer.parseInt(inp[1]);
            Bit[i_Type] = Integer.parseInt(inp[2]);
            if(Type[i_Type]==2) Type2++ ;
        }

        int[] out_ = Queries(Index, Bit, Type, N, Q, Type2);
        for(int i_out_=0; i_out_<out_.length; i_out_++)
        {
            System.out.println(out_[i_out_]);
        }

        wr.close();
        br.close();
    }

     static boolean isKthBitSet(int n,int k){


         if(((n>>(k-1))&1)==1){
             return true;

        }
        else{
            return false;
        }
    }

    static int[] Queries(int[] Index, int[] Bit, int[] Type, int N, int Q, int Type2){
        // Write your code here
        int[] arr=new int[N];
        int[] ans=new int[Type2];
        int c=0;

        for (int i=0;i<Q;i++){
            if(Type[i]==1){
                int index=Index[i]-1;
                if(!isKthBitSet(arr[index],(Bit[i]+1))){
                    arr[index]=arr[index]+(int)Math.pow(2,Bit[i]);
                }
                else{
                    int divisor=(int)Math.pow(2,Bit[i]);
                    arr[index]=arr[index]/divisor;
                    if(arr[index]==1){
                        arr[index]=0;
                    }
                }

            }

            if(Type[i]==2){
                int count =0;

                int uptoRange=Index[i];
                for(int j=0;j<uptoRange;j++){
                    if(isKthBitSet(arr[j],(Bit[i]+1))){
                        count++;
                    }
                }
                ans[c++]=count;


            }
        }

        return ans;

    }
}