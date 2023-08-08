package com.company;

import java.io.*;
import java.util.*;

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

    static void printList(List<Integer> list){
        for (int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.print("\b");
        System.out.println("");
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
                int[] array= Arrays.stream(arr).sorted().toArray();
                if (array.equals(arr)){
                    System.out.println(m);
                }else{
                    int[] pointer=new int[3];
                    List<Integer> list=new ArrayList<>();
                    List<Integer> sorted=new ArrayList<>();
                    int k=0;
                    for (int i=0;i<n;i++){
                        if (arr[i]!=i+1){
                            pointer[k++]=arr[i];
                            list.add(arr[i]);
                            sorted.add(arr[i]);
                        }
                    }
                    if (list.size()-1>m){
                        System.out.println(-1);
                    }else{
                        Collections.sort(sorted);
                        int flag=0;
                        for (int i=0;i<n;i++){
                            Collections.rotate(list,1);
                            if (list.equals(sorted)){
                                flag=1;
                                System.out.println(--m);
                                printList(list);
                                break;
                            }
                        }
                        if (flag==0){
                            System.out.println(-1);
                        }
                    }

                }
            }
            wr.flush();
        }catch (Exception e){
            return;
        }
    }
}
