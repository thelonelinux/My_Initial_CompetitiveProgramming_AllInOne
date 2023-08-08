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

    /** Dragon dens */

    public static void main(String[] args) throws java.lang.Exception{
	// write your code here
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


            if (type==2){       /**  When query is of Type 2  */

                /** Find maximum tastiness */

                long start=b;
                long end=c_Or_k;
                long totalTastiness=0;

                /** First let's check if we can possibly reach to the end from start if there is no single element of height greater than start**/

                /**Base Case 1 */
                boolean noHigherBetween=true;
                if (start<end){  /** From first to last **/
                    for (long j=start;j<=end;j++){
                        if (height[(int)j]>height[(int)start]){
                            System.out.println(-1);
                            noHigherBetween=false;
                            break;
                        }
                    }
                }
                else if (end<start){
                    for (long j=start;j>=end;j--){
                        if (height[(int)j]>height[(int)start]){
                            System.out.println(-1);
                            noHigherBetween=false;
                            break;
                        }
                    }
                }

                /** Real Case of coding start from here when there is no actual highest mountain in between start and end*/
                if (noHigherBetween){


                    /** Base Case 1 --> When start and end is same */
                    if (Math.abs(start-end)==0){
                        System.out.println(taste[(int)start]);
                        continue;  /**  Move to next query  */
                    }
                    /**Base Case 2 --> When start and end no gap between them*/
                    if (Math.abs(start-end)==1){
                        if (height[(int)start]>height[(int)end]){
                            long sum=taste[(int)start]+taste[(int)end];
                            System.out.println(sum);
                            continue; /** Move to next qeurey  */
                        }else{
                            System.out.println(-1);
                            continue;
                        }
                    }



                    /** Real coding starts from here */

                    if (start<end){   /** From last to first*/
//                        totalTastiness=taste[(int)start];
                        totalTastiness=0;
                        long superMaximum=height[(int)start];
                        long newMaximum=height[(int)start];
                        for (long j=start+1;j<=end;j++){
                            long point=height[(int)j];
                            if (point<newMaximum && point<superMaximum){
                                totalTastiness+=taste[(int)j];
                                newMaximum=point;
                            }
                            else if(point>=newMaximum){  /** We already know that no element in between is maximum than superMax as it was already checked above*/
                                /**Delete all previous and start from here counting the tastiness*/
                                totalTastiness=0;
                                totalTastiness+=taste[(int)j];
                                newMaximum=point;
                            }
                        }
                        System.out.println(totalTastiness+taste[(int)start]);
                    }

                    if (end<start){  /** Means from end to start**/

                        totalTastiness=0;
                        long superMaximum=height[(int)start];
                        long newMaximum=height[(int)start];
                        for (long j=start-1;j>=end;j--){
                            long point=height[(int)j];
                            if (point<newMaximum && point<superMaximum){
                                totalTastiness+=taste[(int)j];
                                newMaximum=point;
                            }
                            else if(point>=newMaximum){  /** We already know that no element in between is maximum than superMax as it was already checked above*/
                                /**Delete all previous and start from here counting the tastiness*/
                                totalTastiness=0;
                                totalTastiness+=taste[(int)j];
                                newMaximum=point;
                            }
                        }
                        System.out.println(totalTastiness+taste[(int)start]);
                    }

                }
            }

            else{ /** Case when it's type 1 And we only need to change the tastiness*/
                //Update the tastiness of b to c_Or_k
                taste[(int)b]=c_Or_k;
            }
        }

    }
}
