package com.company;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
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

    public static void main(String[] args) throws java.lang.Exception {
	// write your code here

        try{

            Reader sc=new Reader();
            int t=sc.nextInt();
            while (t-->0){
                int len=sc.nextInt();
                int[] arr=new int[len];

                for (int i=0;i<arr.length;i++){
                    arr[i]=sc.nextInt();

                }

                int count=0;
                for (int i=0;i<len;i++){
                    if (arr[i]==1){
                        count++;
                    }
                }

                int[] arrMin=new int[len];
                char[] chars=new char[len];
                int left=Integer.MAX_VALUE;
                int right=Integer.MAX_VALUE;

                for (int i=0;i<arr.length;i++){
                    if (arr[i]==1){
                        right=Integer.MAX_VALUE;
                        left=Integer.MAX_VALUE;
                        if (i<len-1 && i>0){

                            for (int k=i+1;k<len;k++){
                                if (arr[k]==1){
                                    right=k-i;
                                    break;
                                }
                            }
                            for (int m=i-1;m>=0;m--){
                                if (arr[m]==1){
                                    left=i-m;
                                    break;
                                }
                            }
                            arrMin[i]=Math.min(left,right);
                            if (left<right){
                                chars[i]='l';
                            }else{
                                chars[i]='r';
                            }

                        }else{
                            if (i==0){
                                left=Integer.MAX_VALUE;
                                for (int j=i+1;j<len;j++){
                                    if (arr[j]==1){
                                        right=j-i;
                                        break;
                                    }
                                }
                                arrMin[i]=Math.min(left,right);
                                chars[i]='r';
                            }
                            if (i==len-1){
                                for (int i1=len-2;i1>=0;i1--){
                                    if (arr[i1]==1){
                                        left=i-i1;
                                        break;
                                    }

                                }
                                arrMin[i]=left;
                                chars[i]='l';
                            }
                        }
                    }
                }

                int initial=0;
                char initialChar='m';
                int index=0;
                for (int i=0;i<len;i++){
                    if (arr[i]==1){
                        initial=arrMin[i];
                        initialChar=chars[i];
                        index=i;
                        break;
                    }
                }

                int sum=0;
                int skip=0;
                for (int i=index;i<len;i++){
                    if (arr[i]==1 ){
                        if (initial==arrMin[i] && initialChar!=chars[i]){
                            arrMin[i]=0;

                        }
                        initial=arrMin[i];
                        initialChar=chars[i];
                    }
                }

                if (count==1){
                    System.out.println(-1);
                }else{
                    int ans=0;
                    for (int i=0;i<arr.length;i++){
                        ans=ans+arrMin[i];
                    }
                    System.out.println(ans);


                }

//                for (int i=0;i<len;i++){
//                    if (arr[i]==1){
//                        System.out.println(arrMin[i]+" "+chars[i]);
//                    }
//                }

            }

        }catch (Exception e){
            return;
        }
    }
}
