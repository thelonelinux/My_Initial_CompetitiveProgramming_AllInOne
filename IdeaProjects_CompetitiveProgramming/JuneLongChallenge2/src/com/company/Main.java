package com.company;

import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

    public static void main(String[] args) throws java.lang.Exception {


            Reader sc=new Reader();
            int t=sc.nextInt();
            while (t-->0){

                int len=sc.nextInt();
                int[] arr=new int[len];
                for (int i=0;i<arr.length;i++){
                    arr[i]=sc.nextInt();
                }
                boolean ans=false;

                if (len==1){
                    if (arr[0]==5){
                        ans=true;
                        System.out.println("YES");
                    }else{
                        ans=true;
                        System.out.println("NO");
                    }

                }else {
                    if (arr[0]==5){
                        int countFive=1;
                        int countTen=0;
                        int countFifteen=0;

                        for (int i=1;i<arr.length;i++){

                            if (arr[i]==10 && countFive>0){
                                countTen++;
                                countFive--;

                            }else if (arr[i]==15){
                                if (countFive>=2 || countTen>0){
                                    if (countFive>2 && countTen==0){
                                        countFifteen++;
                                        countFive=countFive-2;
                                    }else {
                                        countTen--;
                                        countFifteen++;
                                    }
                                }else {
                                    ans=true;
                                    System.out.println("NO");
                                    break;
                                }
                            }else if(arr[i]==5){
                                countFive++;
                            }else {
                                ans=true;
                                System.out.println("NO");
                                break;
                            }
                        }
                    }else{
                        ans=true;
                        System.out.println("NO");
                    }
                }
                if (ans==false){
                    System.out.println("YES");
                }
            }
    }
}
