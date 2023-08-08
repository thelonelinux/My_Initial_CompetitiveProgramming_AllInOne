package com.company;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FloatPractise {

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

    public static void precisionCompute(long x, long y, int n) {
        // Base cases
        if (y == 0) {
            System.out.print("Infinite");
            return;
        }
        if (x == 0) {
            System.out.print("0");
            return;
        }
        if (n <= 0) {
            // Since n <= 0, don't compute after
            // the decimal
            System.out.print(x / y);
            return;
        }

        // Handling negative numbers
        if (((x > 0) && (y < 0)) || ((x < 0) && (y > 0))) {
            System.out.print("-");
            x = x > 0 ? x : -x;
            y = y > 0 ? y : -y;
        }

        // Integral division
        long d = x / y;

        // Now one by print digits after dot
        // using school division method.
        for (int i = 0; i <= n; i++) {
            System.out.print(d);
            x = x - (y * d);
            if (x == 0)
                break;
            x = x * 10;
            d = x / y;
            if (i == 0)
                System.out.print(".");
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

            //for multiplication common divisor
            // for multiplication check only perfect multiple and no remainder.
            //for that first divide and also check the modulus.
            // if modulus is zero then ok otherwise not perfect multiple it is


            //choose that to be the minimum in as divisor in if two of the triplets are small in tuple than other
//           for (int i=0;i<3;i++){
//               System.out.println();
//           }


            //Also if any of the number in p,q or r is zero then don't check for that.
            //If less than 1 means our tuple needs to be mulitiplied by some decimal and not integer so we can't take it
            //If we get 1 means our numbers are same so don't count it
            //If we get greater than one now you count it. But if it's not some integer than leave it. Only count total number of integer division we got
            // Non perfect divisor are not useful to handle it with


            // if we get atleast 2 perfect divisor (which are not 1) than only proceed else multiplication operation performing is not good better go addition
            //If we have atleast two of the given PQR are zero then abort multiplication
            //If we have 1 zeroes in PQR then other are equal
            precisionCompute(a,p,10);
            System.out.println();
            precisionCompute(b,q,10);
            System.out.println();
            precisionCompute(c,r,10);
            System.out.println();

        }
    }


}
