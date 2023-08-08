package com.company;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Practise {

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

    static int AdditionAnswer(long p,long q, long r, long a, long b, long c){
        long diff1=a-p;
        long diff2=b-q;
        long diff3=c-r;

        long[] arr={diff1,diff2,diff3};

        //Here a,b,c,p,q,r can also be negative number
        //For difference . Here no matter whether you need to keep p,q,r greater or smaller than a,b,c;
        Set<Long> set=new HashSet<>();
        int count=0;

        for (int i=0;i<3;i++){
            if (arr[i]==0){
                //nothing to do
            }
            if (arr[i]!=0){
                boolean ans=set.add(arr[i]);
                if (ans==true){
                    count++;
                }
            }
        }
        return count;
        //For the case when multiplying numbers in tuple can convert it into the required tuple
        //If only
    }

    public static void main(String[] args) throws java.lang.Exception{
        // write your code here
        Reader sc=new Reader();

        int t=sc.nextInt();
        while (t-->0) {

            long p = sc.nextLong();
            long q = sc.nextLong();
            long r = sc.nextLong();

            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();

            System.out.println(AdditionAnswer(p,q,r,a,b,c));


        }
    }
}
