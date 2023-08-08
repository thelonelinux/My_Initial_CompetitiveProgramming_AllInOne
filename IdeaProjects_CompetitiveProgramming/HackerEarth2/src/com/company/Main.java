package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main  {

    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        //Scanner sc = new Scanner();
        Reader in = new Reader();
        Main solver = new Main();
        solver.solve(out, in);
        out.flush();
        out.close();

    }

    static int maxn = (int)1e5*2;
    static int mod=(int)1e9+7;
    static int n,t,m,k,cnt;

    static boolean vis[][];
    static long[][] dp;
    static StringBuilder dfs;

    void solve(PrintWriter out, Reader in) throws IOException{
        n = in.nextInt();
        m = in.nextInt();

        int[][] arr = new int[n+1][m+1];
        for(int i=1;i<=n;i++)
            for(int j=1;j<=m;j++)
                arr[i][j] = in.nextInt();


        boolean[] prime = new boolean[100001];
        for(int i=2;i<=100000;i++){
            if(!prime[i]){
                if(i*i<=100000)
                    for(int j=2*i;j<=100000;j+=i)
                        prime[j] = true;
            }
        }

        dp = new long[n+2][m+2];
        dp[1][1]=1L;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(!prime[arr[i][j]]) dp[i][j] = (dp[i][j]+dp[i-1][j]+dp[i-1][j-1]+dp[i][j-1])%mod;
            }
        }


        out.println(dp[n][m]);
        if(dp[n][m]==0) return;

        vis = new boolean[n+1][m+1];
        BFS(n,m);

        dfs = new StringBuilder("");
        DFS(1,1);

        out.println(dfs);

    }

    static void BFS(int l,int r){
        vis[l][r]=true;
        if(l==1 && r==1) return;

        if(dp[l-1][r-1]>0 && !vis[l-1][r-1]) BFS(l-1,r-1);
        if(dp[l-1][r]>0 && !vis[l-1][r]) BFS(l-1,r);
        if(dp[l][r-1]>0 && !vis[l][r-1]) BFS(l,r-1);
    }

    static void DFS(int l,int r){
        dfs.append(l+" "+r+"\n");
        if(l==n && r==m) return;

        if(l<n && r<m && vis[l+1][r+1]) DFS(l+1,r+1);
        else if(l<n && vis[l+1][r]) DFS(l+1,r);
        else if(r<m && vis[l][r+1]) DFS(l,r+1);
    }

    static class Edge implements Comparable<Edge> {
        int x,y;

        Edge(int x,int y){
            this.x = x;
            this.y = y;
        }


        public int compareTo(Edge o){
            return this.x- o.x;
        }
    }

    static class Reader {

        private InputStream mIs;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public Reader() {
            this(System.in);
        }

        public Reader(InputStream is) {
            mIs = is;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();

            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = mIs.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public String nextLine() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isEndOfLine(c));
            return res.toString();
        }

        public String next() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        public long nextLong() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public boolean isEndOfLine(int c) {
            return c == '\n' || c == '\r' || c == -1;
        }

    }
}