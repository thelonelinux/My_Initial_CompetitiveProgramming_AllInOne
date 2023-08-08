package com.company;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Codechef_Chefina_Swaps {

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
            long[] A=new long[n];
            long[] B=new long[n];

            for (int i=0;i<n;i++){
                A[i]=sc.nextLong();
            }
            for (int i=0;i<n;i++){
                B[i]=sc.nextLong();
            }

            Arrays.sort(A);
            Arrays.sort(B);

            if (n == 1) {
                if (A[0]==B[0]){
                    System.out.println(0);
                }else{
                    System.out.println(-1);
                }
            }
            else if(n>1){

                if (Arrays.equals(A,B)){
                    System.out.println(0);
                }
                else{
                   //Put all in common array
                    //and then check it each value is present in even number of times using of course map
                    //If any value is not present in even number of times then print -1
                    //If all the value is present in even number of times

                    //then check the possible doubletsA in any array
                    //the output is num of doubletsA

                    long[] commonArray=new long[2*n];
                    Map<Long, Integer> map=new HashMap<>();
                    for (int i=0;i<commonArray.length;i++){
                        if (!map.containsKey(commonArray[i])){
                            map.put(commonArray[i],1);
                        }
                        else{
                            int oldValue=map.get(commonArray[i]);
                            map.replace(commonArray[i],oldValue,oldValue+1);
                        }
                    }

                    boolean ansGiven=false;
                    for (Map.Entry<Long,Integer> entry: map.entrySet()){

                        long key=entry.getKey();
                        int value=entry.getValue();
                        if (value%2==1){
                            ansGiven=true;
                            System.out.println(-1);
                            break;
                        }
                    }


                    //If all the value is present in even number of times
                    //then check the possible doubletsA in any array
                    //the output is num of doubletsA
                    Map<Long, Integer> doubletsA=new HashMap<>();
                    if (!ansGiven){
                        for (int i=0;i<A.length;i++){
                            if (!doubletsA.containsKey(A[i])){
                                doubletsA.put(A[i],1);
                            }
                            else{
                                int oldValue=doubletsA.get(A[i]);
                                doubletsA.replace(A[i],oldValue,oldValue+1);
                            }
                        }
                        long numOfdoubletsA=0;
                        for (Map.Entry<Long,Integer> entry: doubletsA.entrySet()){
                            long key=entry.getKey();
                            int value=entry.getValue();
                            if (value>1){
                                numOfdoubletsA+=value/2;
                            }
                        }
                        System.out.println(numOfdoubletsA);
                    }
                }

            }




        }
    }
}
