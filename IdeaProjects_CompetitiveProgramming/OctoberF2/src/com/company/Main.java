package com.company;

// Working program using Reader Class
import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        Reader reader = new Reader();
        Writer writer = new Writer();

        int iterations = reader.nextInt();
        while(iterations-- > 0){
            String number = reader.nextString();
            int len = number.length();
            if(len == 1){
                writer.println(number);
                continue;
            }
            StringBuilder sb = new StringBuilder("");
            for(int i = 0; i < len - 1; ++i){
                int first = number.charAt(i);
                int second = number.charAt(i + 1);
                sb.append((first ^ second));
            }
            int last = number.charAt(len - 1);
            int around = number.charAt(0);
            sb.append((last ^ around));
            writer.println(sb);
        }
        writer.close();
    }
}



//Borrowed from HackerEarth https://www.hackerearth.com/practice/notes/inputoutput-in-javascanner-bufferedreader-self-made-fast-io/
class Reader
{
    private byte[] buf=new byte[1024];
    private int index;
    private InputStream in;
    private int total;
    public Reader()
    {
        in=System.in;
    }
    public int next()throws IOException
    {
        if(total<0)
            throw new InputMismatchException();
        if(index>=total)
        {
            index=0;
            total=in.read(buf);
            if(total<=0)
                return -1;
        }
        return buf[index++];
    }
    public int nextInt()throws IOException
    {
        int integer=0;
        int n=next();
        while(isWhiteSpace(n))
            n=next();
        int neg=1;
        if(n=='-')
        {
            neg=-1;
            n=next();
        }
        while(!isWhiteSpace(n))
        {
            if(n>='0'&&n<='9')
            {
                integer*=10;
                integer+=n-'0';
                n=next();
            }
            else throw new InputMismatchException();
        }
        return neg*integer;
    }
    public double nextDouble()throws IOException
    {
        double doub=0;
        int n=next();
        while(isWhiteSpace(n))
            n=next();
        int neg=1;
        if(n=='-')
        {
            neg=-1;
            n=next();
        }
        while(!isWhiteSpace(n)&&n!='.')
        {
            if(n>='0'&&n<='9')
            {
                doub*=10;
                doub+=n-'0';
                n=next();
            }
            else throw new InputMismatchException();
        }
        if(n=='.')
        {
            n=next();
            double temp=1;
            while(!isWhiteSpace(n))
            {
                if(n>='0'&&n<='9')
                {
                    temp/=10;
                    doub+=(n-'0')*temp;
                    n=next();
                }
                else throw new InputMismatchException();
            }
        }
        return doub*neg;
    }
    public String nextString()throws IOException
    {
        StringBuilder sb=new StringBuilder();
        int n=next();
        while(isWhiteSpace(n))
            n=next();
        while(!isWhiteSpace(n))
        {
            sb.append((char)n);
            n=next();
        }
        return sb.toString();
    }
    private boolean isWhiteSpace(int n)
    {
        if(n==' '||n=='\n'||n=='\r'||n=='\t'||n==-1)
            return true;
        return false;
    }
}

class Writer
{
    private final BufferedWriter bw;
    public Writer()
    {
        this.bw=new BufferedWriter(new OutputStreamWriter(System.out));
    }
    public void print(Object object)throws IOException
    {
        bw.append(""+object);
    }
    public void println(Object object)throws IOException
    {
        print(object);
        bw.append("\n");
    }
    public void close()throws IOException
    {
        bw.close();
    }
}