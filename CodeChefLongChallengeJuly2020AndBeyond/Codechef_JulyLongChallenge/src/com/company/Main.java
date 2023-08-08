package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    /********************************************* Fastest Reader in Java ******************************************/
    static class Reader {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        public Reader()
        {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public Reader(String file_name) throws IOException
        {
            din = new DataInputStream(new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public String readLine() throws IOException
        {
            byte[] buf = new byte[64]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1)
            {
                if (c == '\n')
                    break;
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }

        public int nextInt() throws IOException
        {
            int ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do
            {
                ret = ret * 10 + c - '0';
            }  while ((c = read()) >= '0' && c <= '9');

            if (neg)
                return -ret;
            return ret;
        }

        public long nextLong() throws IOException
        {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }

        public double nextDouble() throws IOException
        {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();

            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');

            if (c == '.')
            {
                while ((c = read()) >= '0' && c <= '9')
                {
                    ret += (c - '0') / (div *= 10);
                }
            }

            if (neg)
                return -ret;
            return ret;
        }

        private void fillBuffer() throws IOException
        {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }

        private byte read() throws IOException
        {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }

        public void close() throws IOException
        {
            if (din == null)
                return;
            din.close();
        }
    }

    public static void main(String[] args) throws java.lang.Exception{
	// write your code here

        Scanner scan=new Scanner(System.in);
        Reader sc=new Reader();
        BufferedWriter wr=new BufferedWriter(new OutputStreamWriter(System.out));
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int k=sc.nextInt();
            int l=sc.nextInt();
            int r=sc.nextInt();

            int c=0;
            int p=0;
            int[][] arr=new int[n][2];
            for (int i=0;i<n;i++){
                arr[i][0]=sc.nextInt();
                arr[i][1]=sc.nextInt();
            }
            int min=Integer.MAX_VALUE;

            for (int i=0;i<n;i++){
                c=arr[i][0];
                p=arr[i][1];
                if (k>=c+m){
                    int num=c+m;
                    if (num<=r && num>=l){
                        min=Math.min(min,p);
                        continue;
                    }
                }

                if (k<=c-m){
                    int num=c-m;
                    if (num<=r && num>=l){
                        min=Math.min(min,p);
                        continue;
                    }
                }

                boolean test=false;
                boolean test2=false;
                if (c>k && k>c-m){
                    test=true;
                }
                if (c<k && k<c+m){
                    test2=true;
                }

                if (k==c || test2 || test){
                    int num=k;
                    if (num<=r && num>=l){
                        min=Math.min(min,p);
                        continue;
                    }
                }
            }

            if (min==Integer.MAX_VALUE){
                System.out.println(-1);
            }else{
                System.out.println(min);
            }

        }
    }
}
