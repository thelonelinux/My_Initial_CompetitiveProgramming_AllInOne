package com.company;

import javax.sql.rowset.FilteredRowSet;
import java.io.*;
import java.util.Arrays;
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

    public static void main(String[] args) throws java.lang.Exception{
        Scanner sc=new Scanner(System.in);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        Reader sc=new Reader();
        BufferedWriter wr=new BufferedWriter(new OutputStreamWriter(System.out));

        int t=Integer.parseInt(br.readLine());
        while (t-->0){
            String line2=br.readLine();
            String[] arg=line2.trim().split("'\\s+");
            int row=Integer.parseInt(arg[0]);
            int col=Integer.parseInt(arg[1]);

            String[] arr=new String[row];
            String line=br.readLine();
            String[] str=line.trim().split("\\s+");
            for (int i = 0; i<row;i++){
                arr[i]=str[i];
            }

            if (row==1 || col==1){
                System.out.println(arr[0].charAt(arr[0].length()-1));
            }
            else{

                //For first string
                int maxDistancePossible=0;
                for (int i=0;i<col;i++){
                    if (arr[0].charAt(i)==35){
                        maxDistancePossible=i;
                        break;
                    }
                }

                //Now Checking for depth
                int maxDepth=0;
                boolean maxDepthUpdated=false;
                for (int i=1;i<row;i++){
                    for (int j=0;j<col;j++){
                        if (arr[i].charAt(0)==35){
                            maxDepth=i;
                            maxDepthUpdated=true;
                            break;
                        }
                    }
                    if (maxDepthUpdated){
                        break;
                    }

                }

                for (int i=0;i<row;i++){
                    if (i==0){
                        for (int k=0;k<maxDistancePossible;k++){
                            System.out.print(arr[i].charAt(k));
                        }
                    }
                    if (i<row-1){
                        System.out.print(arr[i].charAt(maxDepth));
                    }
                    if (i==row-1){
                        for (int m=maxDepth;m<col;m++){
                            System.out.print(arr[i].charAt(m));
                        }
                    }
                }
            }

            System.out.println();



        }
    }
}
