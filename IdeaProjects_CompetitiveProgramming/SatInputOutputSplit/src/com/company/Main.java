package com.company;

import jdk.internal.util.xml.impl.Pair;

import java.io.*;
import java.util.*;
import java.text.*;
import java.lang.*;
import java.math.*;

import static com.company.Main.out;

public class Main{

}
    /****************Constants***************/
    static PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static long mod=(long)1e9+7;
    static long mod1=998244353;
    static boolean sieve[];
    static ArrayList<Integer> primes;
    static ArrayList<Long> factorial;
    static HashSet<Pair> graph[];
    static boolean oj = System.getProperty("ONLINE_JUDGE") != null;
    /*************Solutions Begins**************/

    static class segmentTree{
        int n=0;
        int[] lo,hi;
        long[] value;
        segmentTree(int n){
            this.n=n;
            lo=new int[4*n+1];
            hi=new int[4*n+1];
            value=new long[4*n+1];
            init(1,1,n);
        }
        void init(int i,int left,int right){
            lo[i]=left;
            hi[i]=right;
            if(left==right){
                return;
            }
            int mid=(left+right)/2;
            init(2*i,left,mid);
            init(2*i+1,mid+1,right);
        }
        void update(int left,int right,long val){
            update(1,left,right,val);
        }
        long updateFunction(long a,long b){
            long c=a+b;
            return c;
        }
        long queryFunction(long a,long b){
            long c=Math.max(a,b);
            return c;
        }
        long query(int left,int right){
            return query(1,left,right);
        }
        void update(int i){
            value[i]=queryFunction(value[2*i],value[2*i+1]);
        }
        void update(int i,int left,int right,long val){
            if(left>hi[i]||right<lo[i]){
                return;
            }
            if(lo[i]==hi[i]){
                value[i]=val;
                return ;
            }
            update(2*i,left,right,val);
            update(2*i+1,left,right,val);
            update(i);
        }
        long query(int i,int left,int right){
            if(left>hi[i]||right<lo[i]){
                return Integer.MIN_VALUE;
            }
            if(lo[i]>=left&&hi[i]<=right){
                return value[i];
            }
            long l=query(2*i,left,right);
            long r=query(2*i+1,left,right);
            update(i);
            return queryFunction(l,r);
        }
    }
    public static void main (String[] args) throws Exception {
        String st[]= Main.br.readLine().split(" ");
        int n=Integer.parseInt(st[0]);
        long input[]=new long[n];
        st= Main.br.readLine().split(" ");
        for(int i=0;i<n;i++){
            input[i]=Long.parseLong(st[i]);
        }
        st= Main.br.readLine().split(" ");
        int q=Integer.parseInt(st[0]);
        int time[]=new int[n];
        int t1=0;
        long lev=0;
        int upd[]=new int[q];
 
        while(t1<q){
            st= Main.br.readLine().split(" ");
            int t=Integer.parseInt(st[0]);
            if(t==1){
                int idx=Integer.parseInt(st[1]);
                long a=Long.parseLong(st[2]);
                time[idx-1]=t1+1;
                input[idx-1]=a;
            }
            else{
                int a=Integer.parseInt(st[1]);
                upd[t1]=a;
            }
            t1++;
        }
        segmentTree seg=new segmentTree(q+1);
        for(int i=0;i<q;i++){
            seg.update(i+1,i+1,upd[i]);
        }
        for(int i=0;i<n;i++){
            input[i]=Math.max(input[i],seg.query(time[i]+1,q));
            out.print(input[i]+" ");
        }
/*************Solutions Ends*****************/
        out.flush();
        out.close();
    }
    }
/*************Template Begins***********…
