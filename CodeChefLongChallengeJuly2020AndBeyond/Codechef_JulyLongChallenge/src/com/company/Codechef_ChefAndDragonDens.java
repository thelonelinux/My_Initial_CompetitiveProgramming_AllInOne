package com.company;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Codechef_ChefAndDragonDens {

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

        int n=sc.nextInt();
        int q=sc.nextInt();

        long[] height=new long[n];
        long[] taste=new long[n];

        for (int i=0;i<n;i++){
            height[i]=sc.nextLong();
        }
        for (int i=0;i<n;i++){
            taste[i]=sc.nextLong();
        }

        long[][] query=new long[q][3];
        for (int i=0;i<q;i++){
            query[i][0]=sc.nextLong();
            query[i][1]=sc.nextLong();
            query[i][2]=sc.nextLong();
        }

        //Actual Answering start for queries
        for (int i=0;i<q;i++){
            long type=query[i][0];
            long b=query[i][1];
            long c_Or_k=query[i][2];

            if (type==2){
                //Find maximum tastiness
                long totalTastiness=0;

                long startingHeight=height[(int)b-1];
                long endingHeight=height[(int)c_Or_k-1];
                long numberOfTraverse=Math.abs(b-c_Or_k);

                if (numberOfTraverse==0){
                    System.out.println(taste[(int)b-1]);
                    continue;
                }
                if (numberOfTraverse==1){
                    totalTastiness=taste[(int)b-1]+taste[(int)c_Or_k-1];
                    System.out.println(totalTastiness);
                    totalTastiness=0;
                    continue;

                }
                if (numberOfTraverse>1){
                    while (numberOfTraverse-->0){
                       if (startingHeight>endingHeight){
                           //Means Go Downward And find longest decreasing subsequence or maximum tastiness subsequence

                       }else{
                           //Go Upward and find longest increasing subsequence or maximum tastiness subsequence
                       }

                    }
                }

            }else{
                //Update the tastiness of b to c_Or_k
                taste[(int)b-1]=c_Or_k;
            }
        }
    }
}
