package com.company;

import java.io.*;

public class RadheAndGeeta {

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

        Reader sc = new Reader();
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] Radhe = new int[n];
            int[] Geeta = new int[n];
            for (int i = 0; i < n; i++) {
                Radhe[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                Geeta[i] = sc.nextInt();
            }
            int[] deck=new int[m];
            for (int i = 0; i < m; i++) {
                deck[i] = sc.nextInt();
            }

            int GeetaPoint=0;
            int RadhePont=0;
            int pointer=0;
            for (int i=0;i<n;i++){

                if (Radhe[i]>Geeta[i]){
                    RadhePont++;
                    if (pointer<m){
                        if (deck[pointer]>deck[pointer+1]){
                            RadhePont++;

                        }else {
                            GeetaPoint++;
                        }
                        pointer=pointer+2;
                    }

                }
                if (Geeta[i]>Radhe[i]){
                    GeetaPoint++;
                    if (pointer<m){
                        if (deck[pointer]>deck[pointer+1]){
                            GeetaPoint++;
                        }else{
                            RadhePont++;
                        }
                        pointer=pointer+2;
                    }
                }
            }

            //Now if still the deck card is left then

            boolean radheTurns=false;
            if (Radhe[n-1]>Geeta[n-1]){
                radheTurns=true;
            }
            while (pointer<m){

                if (radheTurns){
                    //means at last radhe won
                    //so whereever the pointer has left we can begin by assigning it to radhe
                    if (deck[pointer]>deck[pointer+1]){
                        RadhePont++;
                        radheTurns=true;
                    }else{
                        GeetaPoint++;
                        radheTurns=false;
                    }
                }else{
                    if (deck[pointer]>deck[pointer+1]){
                        GeetaPoint++;
                        radheTurns=false;
                    }else{
                        RadhePont++;
                        radheTurns=true;
                    }
                }
            }

            //Solution
            if (RadhePont>GeetaPoint){
                System.out.println("Radhesh wins");

            }else if (RadhePont<GeetaPoint){
                System.out.println("Geethakoomaree wins");
            }else{
                System.out.println("Tie");
            }


        }
        wr.close();


    }
}
