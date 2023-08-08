package com.company;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    //first check in which sequnce he is telling lie. Whether in odd or even
    //This can be done by asking to check 1 at the first. Because no number less then 1.
    //If he say 1 as L means he telling lie because no number lesser than 1 in our domain
    //So we must work with even sequence else work with same sequence if he tells the truth


    // A very better solution. Every time if he gives L for 1 means he just speak the lies. So ask next question he will always speak the truth
    //So finally got the truth.

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
        long[] arr=new long[10000000];
        for (int i=0;i<arr.length;i++){
            arr[i]=i;
        }
        long grader=sc.nextLong();
        char reply='G';
        long ans;


        int count=0;

        // keep on tracking his lie. And whenever he speaks lie ask the real question.
        //Checking whether he is speaking true or lie.

        long max=1000000000;
        long min=0;
        long upper=max;
        long lower=min;
        boolean goAhead=false;

        do {
                ans=sc.nextLong();

                //first check in which sequnce he is telling lie. Whether in odd or even
                //This can be done by asking to check 1 at the first. Because no number less then 1.
                //If he say 1 as L means he telling lie because no number lesser than 1 in our domain
                //So we must work with even sequence else work with same sequence if he tells the truth


                // A very better solution. Every time if he gives L for 1 means he just speak the lies. So ask next question he will always speak the truth
                //So finally got the truth.


                if (ans>grader && count%2==0){
                    System.out.println("G");   //true
                    reply='G';

                }
                if (ans<grader && count%2==0){
                    System.out.println("L");  //true
                    reply='L';

                }if (ans>grader && count%2==1){
                    System.out.println("L");  //lies
                    reply='L';

                }
                if (ans<grader && count%2==1) {
                    System.out.println("G");   //lies
                    reply = 'G';

                }
                if (ans==grader){
                    System.out.println("E");
                    reply='E';
                }
                count++;

                if (ans==1 && reply=='L'){
                    //He told the lie.
                    //goAhead
                    goAhead=true;
                    System.out.print("He told lie, ask next question he will give true answer only");
                }else if(ans==1 && reply=='G'){
                    System.out.print("He is telling the truth. So repeat same question by asking 1 until he says a lie");
                }else{
                    System.out.print("He is telling the truth ");
                }


        }while (reply!='E');



    }
}
