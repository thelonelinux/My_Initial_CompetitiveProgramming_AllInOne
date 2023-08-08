package com.company;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Codechef_MissingVertexFinal {

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
            while (t-->0) {
                long n = sc.nextInt();
                long number=4*n-1;
                long[][] arr=new long[(int)number][2];

                for (int i=0;i<arr.length;i++){
                    arr[i][0]=sc.nextLong();
                    arr[i][1]=sc.nextLong();
                }

                Map<Long, Long> mapPairX=new HashMap<>();
                Map<Long,Long> mapPairY=new HashMap<>();

                for (int i=0;i<number;i++){
                    if (!mapPairX.containsKey(arr[i][0])){
                        mapPairX.put(arr[i][0],(long)1);
                    }else{
                        long oldValue=mapPairX.get(arr[i][0]);
                        long newValue=oldValue+1;
                        mapPairX.replace(arr[i][0],oldValue,newValue);
                    }
                }

                for (int i=0;i<number;i++){
                    if (!mapPairY.containsKey(arr[i][1])){
                        mapPairY.put(arr[i][1],(long)1);
                    }else{
                        long oldValue=mapPairY.get(arr[i][1]);
                        long newValue=oldValue+1;
                        mapPairY.replace(arr[i][1],oldValue,newValue);
                    }
                }
                long storeX=0;
                for (Map.Entry<Long,Long> entry: mapPairX.entrySet()){
                    long key=entry.getKey();
                    long value=entry.getValue();
                    if (value%2==1){
                        storeX=key;
                    }
                }
                long storeY=0;
                for (Map.Entry<Long,Long> entry: mapPairY.entrySet()){
                    long key=entry.getKey();
                    long value=entry.getValue();
                    if (value%2==1){
                        storeY=key;
                    }
                }

                System.out.println(storeX+" "+storeY);

            }



    }
}
