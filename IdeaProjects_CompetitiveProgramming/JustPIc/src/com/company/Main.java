package com.company;

import java.io.*;
import java.util.*;
import java.lang.*;


public class Main {

    private static InputStream stream;
    private static byte[] buf=new byte[1024];
    private static int curChar;
    private static int numChars;
    private static PrintWriter pw;


    public static void main(String args[] ) throws Exception {

        InputReader(System.in);
        pw=new PrintWriter(System.out);
        new Thread(null,new Runnable(){
            public void run(){
                try{
                    solve();
                    pw.close();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }, "1", 1<<26).start();



    }



    private static LinkedList<Integer> adj[];
    private static boolean Visited[];

    private static void buildgraph(int n){
        adj=new LinkedList[n+1];
        Visited=new boolean[n+1];

        for(int i=0;i<=n;i++){
            adj[i]=new LinkedList<Integer>();
        }
    }


    private static void solve(){
        int n=nextInt();
        buildgraph(n);
        dp=new long[n+1];
        nextInt();
        nextInt();
        for(int i=1;i<n;i++){
            int v=nextInt();
            int w=nextInt();
            adj[w].add(v);
            adj[v].add(w);
        }

        dfs(1,0);
        for(int i=2;i<=n;i++){
            pw.println((n-dp[i])*dp[i]);
        }
    }

    private static long dp[];
    private static void dfs(int curr, int par){
        Visited[curr]=true;
        for(int x:adj[curr]){
            if(!Visited[x]){
                dfs(x,curr);
            }
        }
        dp[curr]++;
        dp[par]+=dp[curr];
    }

    private static void InputReader(InputStream stream1){
        stream=stream1;
    }

    private static boolean isWhitespace(int c){
        return c==' ' || c== '\n' || c=='\r'  || c=='\t'  || c==-1;
    }

    private static int read(){
        if(numChars==-1){
            throw new InputMismatchException();
        }
        if(curChar>=numChars){
            curChar=0;
            try{
                numChars=stream.read(buf);
            }catch(IOException e){
                throw new InputMismatchException();
            }
            if(numChars<=0){
                return -1;
            }
        }
        return buf[curChar++];
    }

    private static int nextInt(){
        int c=read();
        while(isSpaceChar(c)){
            c=read();
        }
        int sgn=1;
        if(c=='-'){
            sgn=-1;
            c=read();
        }
        int res=0;
        do{
            if(c<'0' || c>'9'){
                throw new InputMismatchException();

            }
            res*=10;
            res+=c-'0';
            c=read();
        }while(!isSpaceChar(c));
        return res*sgn;
    }

    private static boolean isSpaceChar(int c){
        return isWhitespace(c);
    }



}
