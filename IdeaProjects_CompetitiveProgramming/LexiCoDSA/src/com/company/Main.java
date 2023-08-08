package com.company;

import java.io.*;
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

//        Reader sc = new Reader();
        Scanner sc=new Scanner(System.in);
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = sc.nextInt();
        while (t-- > 0) {

            String str=sc.next();
            int[] arr=new int[str.length()];

            for (int i=0;i<arr.length;i++){
                arr[i]=((int)str.charAt(i)-97);
            }
            long maxPossible=25*str.length();
            long sum=0;
            for (int i=0;i<arr.length;i++){
                sum=sum+arr[i];
            }
            char[] chars=str.toCharArray();
            if (sum>=maxPossible || str.length()==1 || sum==0){
                System.out.println(-1);
            }else{
                //Lets Constrcut the string

                for (int i=str.length()-1;i>=0;i--){
                    if (chars[i]=='z'){
                        if (i-1>=0){
                            if (chars[i-1]=='z'){
                                //just leave this one
                                //Since decreasing this one won't can't increase the second last z to more os leave this type of condition
                            }else{
                                //change first to down and second last to up
                                chars[i]='y';
                                int num=(int)chars[i-1];
                                num++;
                                chars[i-1]=(char)(num);
                                break;

                            }
                        }

                    }else{
                        //REst for all other case it works fine only if second one is z then move to third last
                        if (i-1>0){
                            if (chars[i-1]!='z'){
                                int num=(int)chars[i-1];
                                num++;

                                int num2=(int)chars[i];
                                num2--;
                                chars[i]=(char)num2;
                                chars[i-1]=(char)num;
                                break;
                            }

                            if (chars[i-1]=='z'){
                                if (chars[i]!='z'){
                                    int num=(int)chars[i];
                                    num++;
                                    chars[i]=(char)num;

                                    int num2=(int)chars[i-1];
                                    num2--;
                                    chars[i-1]=(char)num2;
                                    break;
                                }
                            }
                        }

                    }
                }
                String finalAns=new String(chars);
                System.out.println(sum+" "+finalAns);
            }


        }
        wr.close();


    }
}
