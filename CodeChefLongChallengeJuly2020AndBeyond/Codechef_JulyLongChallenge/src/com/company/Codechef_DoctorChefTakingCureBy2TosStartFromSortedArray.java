package com.company;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Codechef_DoctorChefTakingCureBy2TosStartFromSortedArray {

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
        while (t-->0){
            int n=sc.nextInt();
            long cure=sc.nextLong();
            long[] A=new long[n];

            for (int i=0;i<n;i++){
                A[i]=sc.nextLong();
            }

            Arrays.sort(A);
            int count=0;
            int i=0;
            boolean ans=true;

            /*** If cure is greater than max possible value in sorted array then just return the number of  countries because each one of them can be cure in each day*/
            if (cure>=A[n-1] && ans){
                System.out.println(n);
                ans=false;
            }

            /**  If cure is less than smallest element in the sorted array it means we can start from the start only **/
            if (cure<A[0] && ans){
                /** Just traverse all of them with curing countries one by one and doubling everytime after each cured used */

                while (A[n-1]>0 ){
                    long reducedNumber=A[i]-cure;
                    if (reducedNumber<=A[i]/2){
                        if (reducedNumber<=0){
                            A[i]=reducedNumber;
                            i++;
                        }else {
                            reducedNumber=reducedNumber*2;
                        }
                    }else{
                        reducedNumber=A[i];
                    }
                    if (cure==0){
                        cure=1;
                    }else{
                        cure=cure*2;
                    }

                    count++;

                }

                System.out.println(count);
                ans=false;

            }

            /** If number of cure is between some arrays in then better start from that element whose value is just cure/2 times or greater **/
            if (cure>A[0] && cure<=A[n-1] && ans){

                /**First make all of them half or you can directly also check without making half just do A[i]/2*/
                int indexOfStartingFromJustNextHalfOrHalf=0;
                int leftovers=0;
                for (int j=0;j<n-1;j++){
                    leftovers++;
                    if (cure>A[j] && cure<A[j+1]){
                        /**Then we will start our curing process from this point and the previous leftOver will be remained counting*/
                        break;
                    }
                    if (cure==A[j+1]){
                        break;
                    }
                }

                i=leftovers;
                while (A[n-1]>0 ){
                    long reducedNumber=A[i]-cure;
                    if (reducedNumber<=A[i]/2){
                        if (reducedNumber<=0){
                            A[i]=reducedNumber;
                            i++;
                        }else {
                            reducedNumber=reducedNumber*2;
                        }
                    }else{
                        reducedNumber=A[i];
                    }
                    if (cure==0){
                        cure=1;
                    }else{
                        cure=cure*2;
                    }

                    count++;

                }

                System.out.println(count+leftovers);


            }





        }
    }
}
