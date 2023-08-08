package com.company;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {

    static long mostFrequent(long arr[], long n) {

        // find the max frequency using linear traversal
        long max_count = 1, res = arr[0], curr_count = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1])
                curr_count++;
            else {
                if (curr_count > max_count) {
                    max_count = curr_count;
                    res = arr[i - 1];
                }
                curr_count = 1;
            }
        }

        // If last element is most frequent
        if (curr_count > max_count)
        {
            max_count = curr_count;
            res = arr[(int)n - 1];
        }

        return res;
    }

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
        BufferedWriter wr=new BufferedWriter(new OutputStreamWriter(System.out));
        int t=sc.nextInt();
        while (t-->0){
            long n=sc.nextLong();
            long[] arr=new long[(int)n];
            for (int i=0;i<arr.length;i++){
                arr[i]=sc.nextLong();
            }


            Arrays.sort(arr);
            //most frequent element
            long repetitions=mostFrequent(arr,n);
            long numOfRepetition=0;
            long max=0;
            long maxFrequency=0;
            for (int i=0;i<arr.length;i++){
                if (arr[i]==repetitions){
                    numOfRepetition++;
                }
                if (arr[i]==max){
                    maxFrequency++;
                }
            }

            long[] someArray=Arrays.stream(arr).distinct().toArray();
            int len=someArray.length;
            boolean[] booleans=new boolean[(int)n];


            if (numOfRepetition>=3){
                System.out.println("NO");
//                wr.write("NO"+"\n");
            }
            else if (n==len){
                System.out.println("YES");
//                wr.write("YES"+"\n");
                for (int i=0;i<arr.length;i++){
                    System.out.print(arr[i]+" ");
//                    wr.write(arr[i]+" ");
                }
                System.out.println();
//                wr.write("\n");
            }
            if (numOfRepetition==2){
                if (repetitions==arr[(int)n-1] || maxFrequency>=2){
                    System.out.println("NO");
//                    wr.write("NO"+"\n");
                }
                else{
                    System.out.println("YES");
//                    wr.write("YES"+"\n");
                    Set<Long> set =new HashSet<>();
                    for (int i=0;i<arr.length;i++){

                        if (set.add(arr[i])){
                            System.out.print(arr[i]+" ");
//                            wr.write(arr[i]+" ");
                            booleans[i]=true;
                        }

                    }
                    for (int i=arr.length-1;i>=0;i--){
                        if (!booleans[i]){
                            System.out.print(arr[i]+" ");
//                            wr.write(arr[i]+" ");
                        }
                    }
                    System.out.println();
//                    wr.write("\n");
                }
            }

        }
//        wr.flush();

    }
}
