package com.company;

import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.HashSet;
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


    public static void main(String[] args) throws java.lang.Exception{
	// write your code here
        //For now working for only case M=0;
        try{
            Reader sc=new Reader();
            BufferedWriter wr=new BufferedWriter(new OutputStreamWriter(System.out));
            int t=sc.nextInt();
            while (t-->0){
                int n=sc.nextInt();
                int m=sc.nextInt();
                int[] arr=new int[n];
                for (int i=0;i<n;i++){
                    arr[i]=sc.nextInt();
                }
                HashSet<Integer> set=new HashSet<Integer>();

                int[][] swapable;
                if (m!=0){
                    swapable=new int[m][2];
                    for (int i=0;i<m;i++){
                        swapable[i][0]=sc.nextInt();
                        swapable[i][1]=sc.nextInt();
                        if (m<10){
                            int num=(swapable[i][0]*10)+swapable[i][1];
                            int rev=(swapable[i][1]*10)+swapable[i][0];
                            set.add(num);
                            set.add(rev);
                        }
                    }
                }

                if (m==0){
                    if (n==1){
                        System.out.println(0);
                    }else if (n==2){
                        if (arr[0]>arr[1]){
                            System.out.println(1);
                        }else{
                            System.out.println(0);
                        }
                    }else if(n>2){
                        int count=0;
                        for (int i=0;i<n;i++){
                            if (arr[i]==i+1){
                                continue;
                            }else {
                                for (int j=i+1;j<n;j++){
                                    if (arr[j]==i+1){
                                        int c=arr[i];
                                        arr[i]=arr[j];
                                        arr[j]=c;
                                        count++;
                                    }
                                }
                            }
                        }
                        System.out.println(count);
                    }
                }else if(m!=0){
                    if (m<=9){

                        int count=0;
                        for (int i=0;i<n;i++){
                            if (arr[i]==i+1){
                                continue;
                            }else {
                                for (int j=i+1;j<n;j++){
                                    if (arr[j]==i+1){
                                        int num=(arr[i]*10)+arr[j];
                                        int rev=(arr[j]*10)+arr[i];
                                        int c=arr[i];
                                        arr[i]=arr[j];
                                        arr[j]=c;
                                        if (set.contains(num) && set.contains(rev)){
                                            count=count;
                                        }else{
                                            count++;
                                        }

                                    }
                                }
                            }
                        }
                        System.out.println(count);
                    }else{
                        System.out.println(0);
                    }
                }
            }
            wr.flush();
        }catch (Exception e){
            return;
        }
    }
}
