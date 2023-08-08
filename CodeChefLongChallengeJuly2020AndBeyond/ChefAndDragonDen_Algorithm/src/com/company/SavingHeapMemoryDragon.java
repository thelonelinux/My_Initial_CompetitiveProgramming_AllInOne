package com.company;

import java.io.*;
import java.util.Scanner;

public class SavingHeapMemoryDragon {

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
        try{

            Reader sc=new Reader();
            BufferedWriter wr=new BufferedWriter(new OutputStreamWriter(System.out));
            int n=sc.nextInt();
            int q=sc.nextInt();

            long[] height=new long[n+1];
            long[] taste=new long[n+1];

            for (int i=1;i<n+1;i++){
                height[i]=sc.nextLong();
            }
            for (int i=1;i<n+1;i++){
                taste[i]=sc.nextLong();
            }


            long[][] query=new long[q][3];
            for (int i=0;i<q;i++){
                query[i][0]=sc.nextLong();
                query[i][1]=sc.nextLong();
                query[i][2]=sc.nextLong();
            }

            /**  Actual Answering start for each queries  */
            for (int i=0;i<q;i++){
                long type=query[i][0];
                long b=query[i][1];  /**Going from*/
                long c_Or_k=query[i][2];  /** Going to*/


                if (type==2){
                    /**  When query is of Type 2  */
                    if (b>=c_Or_k){  /** Example going from 5(b) to 2(c_Or_k)*/

                        long tastinessTillNow=0;
                        long maximumPossibleHeight=0;
                        long previousMaxTaste=0;
                        boolean reachedZeroAlso=false;
                        int index=(int)c_Or_k;/**Start from 2 to check for 2 to 2, 3 to 2 , 4 to 2, and 5 to 2, by storing their previousMaxValue*/
                        for (int i1=index;i1<=b;i1++){
                            if (i1==index){
                                maximumPossibleHeight=height[i1];
                                tastinessTillNow+=taste[i1];
                            }else{
                                if (maximumPossibleHeight<height[i1]){
                                    if (reachedZeroAlso){
                                        tastinessTillNow=taste[i1]+previousMaxTaste;
                                        reachedZeroAlso=false;
                                    }else {
                                        tastinessTillNow+=taste[i1];
                                    }
                                    maximumPossibleHeight=height[i1];
                                }else{
                                    previousMaxTaste=Math.max(tastinessTillNow,previousMaxTaste);
                                    tastinessTillNow=0;
                                    reachedZeroAlso=true;
                                }
                            }
                        }
                        if (tastinessTillNow==0){
//                            System.out.println(-1);
                            wr.write("-1"+"\n");
                        }else{
//                            System.out.println(tastinessTillNow);
                            wr.write(tastinessTillNow+"\n");
                        }
                    }

                    if (c_Or_k>b){   /** That is if he is going from 2(b) to 5(c_Or_k)*/
                        long tastinessTillNow=0;
                        long maximumPossibleHeight=0;
                        long previousMaxTaste=0;
                        boolean reachedZeroAlso=false;
                        int index=(int)c_Or_k;/**Start from 5 to check for 4 to 5, 3 to 5 , 2 to 5, and 1 to 5, by storing their previousMaxValue*/
                        for (int i1=index;i1>=b;i1--){
                            if (i1==index){
                                maximumPossibleHeight=height[i1];
                                tastinessTillNow+=taste[i1];
                            }else{
                                if (maximumPossibleHeight<height[i1]){
                                    if (reachedZeroAlso){
                                        tastinessTillNow=taste[i1]+previousMaxTaste;
                                        reachedZeroAlso=false;
                                    }else {
                                        tastinessTillNow+=taste[i1];
                                    }
                                    maximumPossibleHeight=height[i1];
                                }else{
                                    previousMaxTaste=Math.max(tastinessTillNow,previousMaxTaste);
                                    tastinessTillNow=0;
                                    reachedZeroAlso=true;
                                }
                            }
                        }
                        if (tastinessTillNow==0){
//                            System.out.println(-1);
                            wr.write("-1"+"\n");
                        }else{
//                            System.out.println(tastinessTillNow);
                            wr.write(tastinessTillNow+"\n");
                        }
                    }

                }
                else{ /** Case when it's type 1 And we only need to change the tastiness*/
                    //Update the tastiness of b to c_Or_k
                    taste[(int)b]=c_Or_k;
                }
            }

            wr.flush();
        }catch (Exception e){
            return;
        }


    }
}

/**Code testcase in which I have to remove the if else for updating the tillNowTaste in first if  part so let's check for others also**/
/***
 * 5 1
 * 3 1 4 1 5
 * 1 2 4 8 16
 * 2 5 1
 */

/** This also not working */
/**
 * 10 5
 * 3 4 5 2 6 4 5 3 8 3
 * 2 4 6 8 10 12 14 16 18 20
 * 2 9 1
 * 2 2 1
 * 2 3 2
 * 2 5 7
 * 2 5 8
 * */
