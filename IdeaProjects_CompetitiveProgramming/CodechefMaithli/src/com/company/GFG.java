package com.company;


import java.io.*;
import java.util.*;
import java.lang.*;

public class GFG{

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


    private static final int MAX = 1000001;

    private static final int[] factor = new int [MAX];
    public static void generatePrimeFactors() {
        factor[1] = 1;

        for (int i = 2; i < MAX; i++)
            factor[i] = i;

        for (int i = 4; i < MAX; i += 2)
            factor[i] = 2;


        for (int i = 3; i * i < MAX; i++) {


            if (factor[i] == i) {


                for (int j = i * i; j < MAX; j += i) {


                    if (factor[j] == j)
                        factor[j] = i;
                }
            }
        }
    }


    public static int calculateNoOFactors(int n) {
        if (n == 1)
            return 1;

        int ans = 1;


        int dup = factor[n];

        int c = 1;

        int j = n / factor[n];


        while (j != 1) {


            if (factor[j] == dup)
                c += 1;

            else {
                dup = factor[j];
                ans = ans * (c + 1);
                c = 1;
            }

            // prime factorizes a number
            j = j / factor[j];
        }


        ans = ans * (c + 1);

        return ans;
    }

    public static int smallest(int n) {
        for (int i = 1;; i++)


            if (calculateNoOFactors(i) >= n)
                return i;
    }


    public static void main (String args[])throws java.lang.Exception {
        // generate prime factors of number
        // upto 10^6
        generatePrimeFactors();

        int[] ans=new int[201];
        for (int i=1;i<ans.length;i++){
            ans[i]=smallest(i);
        }

        Reader sc=new Reader();
        BufferedWriter wr=new BufferedWriter(new OutputStreamWriter(System.out));
        int t=sc.nextInt();
        while (t-->0){

            int n = sc.nextInt();
//            System.out.println(smallest(n));
//            wr.write(smallest(n)+"\n");
            wr.write(ans[n]+"\n");
        }
        wr.flush();


    }
}



