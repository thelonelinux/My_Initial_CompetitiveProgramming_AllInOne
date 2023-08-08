package com.company;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
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

            long p=sc.nextLong();
            long q=sc.nextLong();
            long r=sc.nextLong();

            long a=sc.nextLong();
            long b=sc.nextLong();
            long c=sc.nextLong();

            long diff1=a-p;
            long diff2=b-q;
            long diff3=c-r;

            boolean flag=false;

            /**
             * This is the case of addition requirements only
             */

            //Case when all three are same and difference is 0
            if (diff1==diff2 && diff2==diff3 && diff1==0 ){
                if (flag==false){
                    System.out.println(0);
                    flag=true;
                }

            }

            //Case When all three are same but not 0
            if (diff1==diff2 && diff2==diff3 && diff1!=0){
                if (flag==false){
                    System.out.println(1);
                    flag=true;
                }

            }

            //Case when two of them are same but not zero
            if ((diff1==diff2 && diff1!=0 && diff3!=0) || (diff1==diff3 && diff1!=0 && diff2!=0) || (diff2==diff3 && diff2!=0 && diff1!=0)){
                //Means atleast two different types of d required
                if (flag==false){
                    System.out.println(2);
                    flag=true;
                }

            }

            //Case when two of them are same and other is zero
            if ((diff1==diff2 && diff1!=0 && diff3==0) || (diff2==diff3 && diff2!=0 && diff1==0) || (diff1==diff3 && diff1!=0 && diff2==0)){
                //Means only one kind of d is required and other is 0
                if (flag==false){
                    System.out.println(1);
                    flag=true;
                }
            }

            //Case when none of them are equal and none of them is zero
            if ((diff1!=diff2 && diff1!=diff3 && diff2!=diff3) && (diff1!=0 && diff2!=0 && diff3!=0)){
                //So we need at least three d to make it same. Or check if possible multiply can get common result
                if (flag==false){
                    System.out.println(3);
                    flag=true;
                }

            }




        }
    }
}
