package com.company;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {



    static class Reader {
            final private int BUFFER_SIZE = 1 << 16;
            private DataInputStream din;
            private byte[] buffer;
            private int bufferPointer, bytesRead;

            public Reader() {
                din = new DataInputStream(System.in);
                buffer = new byte[BUFFER_SIZE];
                bufferPointer = bytesRead = 0;
            }

            public Reader(String file_name) throws IOException {
                din = new DataInputStream(new FileInputStream(file_name));
                buffer = new byte[BUFFER_SIZE];
                bufferPointer = bytesRead = 0;
            }

            public String readLine() throws IOException {
                byte[] buf = new byte[64]; // line length
                int cnt = 0, c;
                while ((c = read()) != -1) {
                    if (c == '\n')
                        break;
                    buf[cnt++] = (byte) c;
                }
                return new String(buf, 0, cnt);
            }

            public int nextInt() throws IOException {
                int ret = 0;
                byte c = read();
                while (c <= ' ')
                    c = read();
                boolean neg = (c == '-');
                if (neg)
                    c = read();
                do {
                    ret = ret * 10 + c - '0';
                } while ((c = read()) >= '0' && c <= '9');

                if (neg)
                    return -ret;
                return ret;
            }

            public long nextLong() throws IOException {
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

            public double nextDouble() throws IOException {
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

                if (c == '.') {
                    while ((c = read()) >= '0' && c <= '9') {
                        ret += (c - '0') / (div *= 10);
                    }
                }

                if (neg)
                    return -ret;
                return ret;
            }

            private void fillBuffer() throws IOException {
                bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
                if (bytesRead == -1)
                    buffer[0] = -1;
            }

            private byte read() throws IOException {
                if (bufferPointer == bytesRead)
                    fillBuffer();
                return buffer[bufferPointer++];
            }

            public void close() throws IOException {
                if (din == null)
                    return;
                din.close();
            }
        }
        /**The wll hidden trick here is start from cure/2 it will ultimately get double and rest can come in it also in sequence*/
        /**
         * But Still here I am missing some unidentified testcase I don't know which are those
         */
    public static void main(String[] args) throws java.lang.Exception {
            // write your code here

            Scanner scan = new Scanner(System.in);
            Reader sc = new Reader();
            BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                long cure = sc.nextLong();
                long[] A = new long[n];
                long initialCure = cure;
                if (cure%2==1){
                    cure=cure/2;
                    cure=cure+1;
                }
                else {
                    cure = cure / 2;
                }

                boolean flag = true;
                if (cure == 0) {
                    cure = 1;
                    flag = false;
                }

                for (int i = 0; i < n; i++) {
                    A[i] = sc.nextLong();
                }

                Arrays.sort(A);
                int count = 0;
                int i = 0;

                int index = 0;
                //Since on first day only it can't pick country having very less population than number of cures
                for (int j = 0; j < n; j++) {
                    if (cure <= A[j]) {
                        index = j;
                        if (initialCure <= A[j] && flag) {
                            cure = initialCure;
                            break;
                        }
                        if (flag) {
                            cure = A[j];
                        }

                        break;
                    }
                }
                i = index;
                //But at end add all those which we have skipped in beginning
                //That is from where we started and last left overall i.e index;


                while (A[n - 1] >= 0) {

                    if (A[i] > cure) {
                        cure = cure * 2;
                        count++;
                        i = i;
                        continue;
                    } else if (A[i] <= cure) {
                        cure = A[i] * 2;
                        A[i] = 0;
                        count++;
                        if (i < n - 1) {
                            i++;
                        } else {
                            break;
                        }
                    }
                }

                System.out.println(count + index);
            }
        }


}

/**
 *
 * 4 3
 * 1 1 1 6
 *
 * This test case ain't working because ans should be 5 but we are getting 6;
 *
 * */