package com.company;

import java.io.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CodechefMissingPoint {

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
        while (t-->0) {
            int n = sc.nextInt();
            long[][] arr=new long[n][2];

            for (int i=0;i<arr.length;i++){
                arr[i][0]=sc.nextLong();
                arr[i][1]=sc.nextLong();
            }


            Set<Long> setX=new HashSet<>();
            Set<Long> setY=new HashSet<>();
           long distanceX=0;
           long distanceY=0;
            for (int i=0;i<n;i++){
                boolean ans=setX.add(arr[i][0]);
                if (ans==false){
                    //X is same
                    //so find y's distance
                    long previousY=0;
                    for (int j=0;j<n;j++){

                        if (arr[i][0]==arr[j][0]){
                            previousY=arr[j][1];
                            break;
                        }
                    }
                     distanceY=Math.abs(arr[i][i]-previousY);
                }


                boolean ans2=setY.add(arr[i][1]);
                if (ans2==false){
                    //Y is same
                    //so find x's distance
                    long previousX=0;
                    for (int j=0;j<n;j++){

                        if (arr[i][1]==arr[j][1]){
                            previousX=arr[j][0];
                            break;
                        }
                    }
                    distanceX=Math.abs(arr[i][0]-previousX);
                }


            }

            if (distanceX>distanceY){
                System.out.println(distanceX);
            }else{
                System.out.println(distanceY);
            }


        }
    }
}
