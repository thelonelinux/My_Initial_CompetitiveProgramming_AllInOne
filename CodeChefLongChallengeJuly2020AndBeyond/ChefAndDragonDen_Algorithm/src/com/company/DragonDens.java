package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DragonDens {

//    static long[][] array=new long[20000][20000];
    /** This is giving runtime error of java heap memory full so*/
    /** So it's actually traversing only so this can be done in similar manner only with single O(1) space itself **/
//    static List<Long> list=new ArrayList<>(2000000000);

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

    /** Dragon dens */

    public static long[][] forLowerFromHigher(long[] height, long[] taste){

        long[][]  ans=new long[height.length][height.length];

        for (int i=1;i<=height.length-1;i++){
            //distance from i to others j
            long localMaxHeight=0;
            long previousTotalValueTasted=0;
            for (int j=i;j<=height.length-1;j++){
                if (i==j){
                    localMaxHeight=height[j];
                    previousTotalValueTasted+=taste[i];
                    ans[i][j]=taste[i];
                }else{
                    if (localMaxHeight<height[j]){
                        localMaxHeight=height[j];
                        previousTotalValueTasted+=taste[j];
                        ans[i][j]=previousTotalValueTasted;
                    }
                    else {
                        ans[i][j]=0;
                    }
                }

            }
        }

        return ans;


    }

    public static long[][] forUpperFromLower(long[] height,long[] taste){

        long[][] newArray=new long[height.length][height.length];

        for (int i=height.length-1;i>=1;i--){
            //distance from i to others j
            long localMaxHeight=0;
            long previousTotalValueTasted=0;
            for (int j=i;j>=1;j--){
                if (i==j){
                    localMaxHeight=height[j];
                    previousTotalValueTasted+=taste[i];
                    newArray[i][j]=taste[i];
                }else{
                    if (localMaxHeight<height[j]){
                        localMaxHeight=height[j];
                        previousTotalValueTasted+=taste[j];
                        newArray[i][j]=previousTotalValueTasted;
                    }
                    else {
                        newArray[i][j]=0;
                    }
                }
            }
        }

        return newArray;

    }

    public static void main(String[] args) throws java.lang.Exception{
        // write your code here

        try{

            Scanner scan=new Scanner(System.in);
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

            long[][]  ans;
            ans=forLowerFromHigher(height,taste);

            long[][] newArray;
            newArray=forUpperFromLower(height,taste);


            long[][] query=new long[q][3];
            for (int i=0;i<q;i++){
                query[i][0]=sc.nextLong();
                query[i][1]=sc.nextLong();
                query[i][2]=sc.nextLong();
            }

            /**  Actual Answering start for each queries  */
            for (int i=0;i<q;i++){
                long type=query[i][0];
                long b=query[i][1];
                long c_Or_k=query[i][2];
                long i1=c_Or_k;
                long j1=b;

                if (type==2){
                    /**  When query is of Type 2  */
                    if (i1>j1){
                        long finalAnswer=newArray[(int)i1][(int)j1];
                        if (finalAnswer==0){
                            System.out.println(-1);
                        }else{
                            System.out.println(newArray[(int)i1][(int)j1]);
                        }
                    }
                    else {
                        long finalAnswer=ans[(int)i1][(int)j1];
                        if (finalAnswer==0){
                            System.out.println(-1);
                        }else{
                            System.out.println(ans[(int)i1][(int)j1]);
                        }
                    }
                }
                else{ /** Case when it's type 1 And we only need to change the tastiness*/
                    //Update the tastiness of b to c_Or_k
                    taste[(int)b]=c_Or_k;
                    newArray=forUpperFromLower(height,taste);
                    ans=forLowerFromHigher(height,taste);
                }
            }

        }catch (Exception e){
            return;
        }


    }

}
