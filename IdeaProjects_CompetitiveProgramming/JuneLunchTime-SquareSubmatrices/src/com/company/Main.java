package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    static int findSum(int x1,int y1, int x2, int y2, int[][] arr){
        int sum=0;
        for (int i=x1;i<=x2;i++){
            for (int j=y1;j<=y2;j++){
                sum+=arr[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) throws java.lang.Exception{
        // write your code here
        try{

            Reader sc=new Reader();
            BufferedWriter wr=new BufferedWriter(new OutputStreamWriter(System.out));
            int t=sc.nextInt();
            while (t-->0) {

                int n=sc.nextInt();
                int sum=sc.nextInt();
                int[] arr=new int[n];
                for (int i=0;i<arr.length;i++){
                    arr[i]=sc.nextInt();
                }

                //Make the 2D Matrix
                int[][] array=new int[n][n];
                int sumTotal=0;
                for (int i=0;i<arr.length;i++){
                    for (int j=0;j<arr.length;j++){
                        array[i][j]=arr[i]+arr[j];
                        sumTotal=array[i][j];
                    }
                }

                //Check how many square submatrices make sum=given
                int count=0;
                //for above taking whole matrix
                if (sumTotal==sum){
                    count++;
                }


                //First Traverse all the string i.e  is 1x1 matrix
                for (int i=0;i<array.length;i++){
                    for (int j=0;j<array.length;j++){
                        if (array[i][j]==sum){
                            count++;
                        }
                    }
                }
                //Now for the rest sub square matrix make all possible squaer submatrix first
                //taking x1,y1,x2,y2
                if (n==1){
                    if (sumTotal==sum){
                        System.out.println(1);
                    }else{
                        System.out.println(0);
                    }
                    continue;
                }

                int x1=0;
                int y1=0;
                int x2=1;
                int y2=1;
                int size=1;
                while (x1<n && y1<n &&  x2<n && y2<n){

                    int ans=findSum(x1,y1,x2,y2,array);
                    if (ans==sum){
                        count++;
                    }
                    y1++;
                    y2++;
                    if (y2>=n){
                        x1++;
                        x2++;
                        y1=0;
                        y2=0;
                        y2=y2+size;
                        if (x2>=n){
                            //Now we need to go for next size submatrices
                            x1=0;
                            y1=0;
                            x2=0;
                            y2=0;
                            size++;
                            if (size<n){
                                x2=x2+size;
                                y2=y2+size;
                            }
                            else{
                                break;
                            }


                        }
                    }


                }
                System.out.println(count);
            }

        }catch (Exception e){
            return;
        }





    }
}
