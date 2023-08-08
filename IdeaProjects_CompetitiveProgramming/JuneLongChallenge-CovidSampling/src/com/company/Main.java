package com.company;

import org.xml.sax.helpers.XMLReaderAdapter;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

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
        Reader sc=new Reader();

        int t=sc.nextInt();
        while (t-->0){

            long a=sc.nextLong();
            long b=sc.nextLong();
            long c=sc.nextLong();

            long x=sc.nextLong();
            long y=sc.nextLong();
            long z=sc.nextLong();

            long diff1=a-x;
            long diff2=b-y;
            long diff3=c-z;

            long[] arr={diff1,diff2,diff3};

            long[] arr2= Arrays.stream(arr).distinct().toArray();
            long counMin=0;
            if (diff1==0){
                counMin--;
            }
            if (diff2==0){
                counMin--;
            }
            if (diff3==0){
                counMin--;
            }

            long firstMultiply=0;
            long secondMultiply=0;
            long thirdMultiply=0;

            if ((a>=x && b>=y)|| (a>=x && c>=z)|| (b>=y && c>=z)){
                 firstMultiply=a/x;
                 secondMultiply=b/y;
                 thirdMultiply=c/z ;
            }else{
                 firstMultiply=x/a;
                 secondMultiply=y/b;
                 thirdMultiply=z/c ;
            }
            long[] mulArr={firstMultiply,secondMultiply,thirdMultiply};
            long[] arrMul= Arrays.stream(mulArr).distinct().toArray();

            long counMul=0;
            if (diff1==0){
                counMul--;
            }
            if (diff2==0){
                counMul--;
            }
            if (diff3==0){
                counMul--;
            }


            System.out.println(arr2.length+counMin);
        }
    }
}
