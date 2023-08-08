package com.company;

import java.io.*;

public class Main {

    //15 points answered
    //For Fastest Reader Use Reader Class Defined here
    //For Fastest Writer We have BufferedWriter in Main Funciton only
    //Remember only by using BufferedReader if it's showing TLE means your code or algorithm is not optimized enough
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

    static boolean powerOf2(long number){
        return (number > 0) && ((number & (number - 1)) == 0);
    }

    static long realAndLongMethod(long x,long y,long l, long r){
        long max=0;
        long answer=0;
        for (long z=l;z<=r;z++){
            long sum=(x&z)*(y&z);
            if (sum>max){
                max=sum;
                answer=z;
            }

        }
//        System.out.print("Real Max=> "+max+" ");
        if (answer==0){
            return l;
        }else {
            return answer;
        }
    }

    static long realAndLongMethodWithUptoJustPreviousPowerOf2(long x,long y,long l, long r){
        long max=0;
        long answer=0;
        for (long z=l;z<=r;z++){
            long sum=(x&z)*(y&z);
            if (sum>max){
                max=sum;
                answer=z;
            }
            if (powerOf2(l)){
                break;
            }
        }
//        System.out.print("Real Max=> "+max+" ");
        if (answer==0){
            return l;
        }else {
            return answer;
        }
    }

    static long realAndLongMethod2(long x,long y,long l, long r){
        long max=0;
        long answer=0;
        for (long z=(r-(y-x));z<=r;z++){
            long sum=(x&z)*(y&z);
            if (sum>max){
                max=sum;
                answer=z;
            }
        }
//        System.out.print("Real Max=> "+max+" ");
        if (answer==0){
            return l;
        }else {
            return answer;
        }
    }


    public static void main(String[] args) throws java.lang.Exception {

        try{
            Reader s=new Reader();
            BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
            int t=s.nextInt();
            while (t-->0) {

                long x = s.nextLong();
                long y = s.nextLong();
                long l = s.nextLong();
                long r = s.nextLong();

                if (x==0 || y==0) {
                    bw.write(l+"\n");
                }else if(r>=(x|y) && l<=(x|y)){
                    bw.write((x|y)+"\n");
                }else {
                    bw.write(realAndLongMethod(x,y,l,r)+"\n");
                }
            }
            bw.flush();
        }catch (Exception e){
            return;
        }
    }
}
