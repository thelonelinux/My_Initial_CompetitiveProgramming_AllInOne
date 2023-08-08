# JavaFastReaderAndWriter:
->This code contains fast reader and writer for java competitive programming.
->Soemetimes you have to take n number of inputs in array and return those arrays containint n numbers so to save yourself from TLE we can make use of
fast Reader and Writer in java.
->It also contains some time saving predefined codes like showing double upto some decimal point using pattern, predefined graph to make edges etc.



#In KickStar Coding to submit your code to a problem in java language:

-> You must make class of "Solution" if you make any other class name to submit the code then it will give Runtime Error.

-> Example code as:

import java.util.;
import java.io.*;
import java.lang.*;

public class Solution{
  
  public static void main(String[] args) throws java.lang.Exception{
      //Write your code here

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

public static void main(String[] args) throws IOException {

    try{

        Reader sc=new Reader();
        int testCases = sc.nextInt();

        while(testCases-->0){

            String s1=sc.readLine();
            String s2=sc.readLine();

            int zeroInS1=0;
            int oneInS1=0;
            int zeroInS2=0;
            int oneInS2=0;


            for(int i=0;i<s1.length();i++){
                if(s1.charAt(i)=='0'){
                    zeroInS1++;
                }else{
                    oneInS1++;
                }


                if(s2.charAt(i)=='0'){
                    zeroInS2++;
                }else{
                    oneInS2++;
                }

            }
            int numberOfOnesAtBeginning = Math.min(zeroInS1,oneInS2)+Math.min(zeroInS2,oneInS1);
            String ans="";
            for(int j=0;j<numberOfOnesAtBeginning;j++){
                ans+='1';
            }
            int lengthOfString=s1.length();
            int numberOfZerosAfterOne = lengthOfString-numberOfOnesAtBeginning;
            for(int k=0;k<numberOfZerosAfterOne;k++){
                ans+='0';
            }
            System.out.println(ans);

        }

    }catch (Exception e){
        return;
    }



}
      
  }
  
  
}




#FOR CODEFORCES -- THERE IS NO SUCH THING IN LIKE TO MAKE SOME SPECIFIC CLASS NAME THERE WHILE SUBMITTING THE CODE, JSUT DIRECTLY COPY AND PASTE FROM INTELLIJIDEA EXCEPT DON'T COPY AND PASTE THE PACKAGE NAME , START COPYING FROM ONLY IMPORT AND BELOW.
