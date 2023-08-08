package com.company;

import java.io.*;
import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class Main {

    //Actual Submission We are working on for guess in codechef is this

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
        try{

            Reader sc=new Reader();
            Scanner scanner=new Scanner(System.in);

            int t=sc.nextInt();
            while (t-->0){

                long grader=sc.nextLong();
                long ans=1;
                long max=grader;
                long min=0;
                long mid=(max+min)/2;
                char oneReply;
                char trueReply='A';

                do {
                    ans=1;
//            oneReply=check(ans,grader);
                    System.out.println("1");
//                    wr.write("1"+"\n");
                    System.out.flush();
                    oneReply= scanner.next().charAt(0);
//                    System.out.print(oneReply+" ");

                    if (oneReply=='L'){
//                    System.out.print("Enter for "+mid+" ");

                        System.out.println(mid);
//                        wr.write(mid+"\n");
                        System.out.flush();
//                char trueReply=check(mid,grader);
                        trueReply=scanner.next().charAt(0);

                        if (trueReply=='L'){
                            max=mid-1;
                            min=min;
                            mid=(max+min)/2;
                        }else if (trueReply=='G'){
                            min=mid+1;
                            max=max;
                            mid=(max+min)/2;
                        }else if (trueReply=='E'){
                            oneReply='E';
                        }
                    }
                }while (oneReply!='E' || trueReply!='E');
            }

        }catch (Exception e){
            return;
        }
    }
}
