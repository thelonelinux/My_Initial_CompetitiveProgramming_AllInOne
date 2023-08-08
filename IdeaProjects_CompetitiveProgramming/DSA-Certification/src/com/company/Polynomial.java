package com.company;

import java.io.*;

public class Polynomial {



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

        static long[] multiply(int A[], int B[], int m, int n) {
            long[] ans=new long[m+n-1];
            for (int i=0; i<m+n-1; i++) {
                ans[i]=0;
            }

            for (int i=0; i<m; i++) {
                for (int j=0; j<n;j++) {
                    ans[i+j] += A[i]*B[j];
                }
            }

            return ans;
        }

        public static void main(String[] args) throws java.lang.Exception {

            Reader sc = new Reader();
            BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
            int t = sc.nextInt();
            while (t-- > 0) {
                int first = sc.nextInt();
                int second = sc.nextInt();
                int[] A = new int[first];
                int[] B = new int[second];
                for (int i = 0; i < first; i++) {
                    A[i] = sc.nextInt();
                }
                for (int i = 0; i < second; i++) {
                    B[i] = sc.nextInt();
                }

                //Solution
                long[] ans = multiply(A, B, first, second);
                for (int i=0;i<ans.length-1;i++){
//                    System.out.print(ans[i]+" ");
                    wr.write(ans[i]+" ");
                }
//                System.out.println();
                wr.write(ans[ans.length-1]+"\n");
            }
            wr.flush();
            wr.close();


        }
}
