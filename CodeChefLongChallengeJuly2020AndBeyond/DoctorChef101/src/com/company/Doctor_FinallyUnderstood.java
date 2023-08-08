package com.company;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Doctor_FinallyUnderstood {

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

    /*** Doing for only first 20 marks when all the elements are same */

    public static void main(String[] args) throws java.lang.Exception{
        // write your code here

        Scanner scan=new Scanner(System.in);
        Reader sc=new Reader();
        BufferedWriter wr=new BufferedWriter(new OutputStreamWriter(System.out));
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            long cure=sc.nextLong();
            long[] A=new long[n];
            long sum=0;
            for (int i=0;i<n;i++){
                A[i]=sc.nextLong();
                sum=sum+A[i];
            }

            Arrays.sort(A);

            long removingDubplicates= Arrays.stream(A).distinct().toArray().length;

            /*** Doing for only first 20 marks when all the elements are same */
            if (removingDubplicates==1){
                long number=A[0];
                if (cure>=number){
                    System.out.println(n);
                }else{
                    long count=0;
                    while (cure<number){
                        count++;
                        cure=cure*2;

                    }
                    System.out.println(count+n);
                }
            }


            else{
                /** For rest of the case now */
                long newCount=0;
                while(sum!=0){
                    for (int i=0;i<n;i++){
                        if (A[i]!=0){

                            /** Case when our cure is greater than population*/
                            if (A[i]<cure){
                                continue;
                            }
                            else if (A[i]==cure){
                                newCount++;
                                cure=A[i]*2;
                                A[i]=0;
                                continue;
                            }
                            /**Case when our cure is not greater than population*/
                            else{
                                long originalValue=A[i];
                                long subtractedValue=A[i]-cure;
                                newCount++;
                                while (subtractedValue>0){

                                    newCount++;
                                }
//                                newCount++;
//                                cure=A[i]*2;
                                A[i]=0;
                            }
                        }
                    }
                    long newSum=0;
                    long newCure=Long.MAX_VALUE;
                    for (int j=0;j<A.length;j++){
                        newSum=newSum+A[j];
                        if(A[j]!=0){
                            newCure=Math.min(newCure,A[j]);
                        }
                    }
                    cure=newCure;
                    sum=newSum;
                }

                System.out.println(newCount);
            }

        }
    }
}
