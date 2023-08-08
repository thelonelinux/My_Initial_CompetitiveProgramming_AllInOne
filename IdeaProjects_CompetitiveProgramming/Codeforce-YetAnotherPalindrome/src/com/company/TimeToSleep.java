package com.company;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TimeToSleep {


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
        int n=sc.nextInt();
        int mod=sc.nextInt();
        int l=sc.nextInt();
        int u=sc.nextInt();

        int[] arr=new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int[][] ans=new int[n][n+1];

        int number=0;
        int max=0;
        for (int i=0;i<2;i++){
            number=arr[0]-i;
            if (number>=mod){
                number=number-mod;
            }
            if (number>=l && number<=u){
                ans[0][i]=1;
                max=Math.max(max,1);
            }else{
                ans[0][i]=0;
                max=Math.max(max,0);
            }
        }


        number=arr[0];
        int realNumber=number;
        for(int i=1;i<n;i++){
           realNumber+=arr[i];
           number=realNumber%mod;
           for (int j=0;j<=i+1;j++){
               if (number>=mod){
                   number=number%mod;
               }
               if (number<0){
                   number=23;
               }

               if (number>=l && number<=u){
                   if (j==0){
                       ans[i][j]=ans[i-1][j]+1;
                       max=Math.max(ans[i][j],max);
                   }else{
                       ans[i][j]=Math.max(ans[i-1][j],ans[i-1][j-1])+1;
                       max=Math.max(ans[i][j],max);
                   }

               }else{

                   if (j==0){
                       ans[i][j]=ans[i-1][j];
                       max=Math.max(ans[i][j],max);
                   }else{
                       ans[i][j]=Math.max(ans[i-1][j],ans[i-1][j-1]);
                       max=Math.max(ans[i][j],max);

                   }

               }
               number--;

           }
       }

       System.out.println(max);

    }

}
