package com.company;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        String s=br.readLine();
//        int i=Integer.parseInt(br.readLine());
//        int j=Integer.parseInt(br.readLine());
//
//        System.out.println(i+  "Hele "+j);

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        int num[] = new int[1000];
//        String[] strNums;
//        long startTime, endTime;
//
//
//        String[] arr=reader.readLine().split(" ");
//        int[] intarr=new int[arr.length];
//
//        for(int i=0;i<arr.length;i++)
//            intarr[i]=Integer.parseInt(arr[i]);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

//        StringTokenizer tk = new StringTokenizer(input.readLine());
//        int m = Integer.parseInt(tk.nextToken());
//        long l=Long.parseLong(tk.nextToken());
//        double d=Double.parseDouble(tk.nextToken());
//        char c=tk.nextToken().charAt(0);
//        String s = tk.nextToken();
//
//        System.out.println(m );
//        System.out.println(l+ "  hello "+s);
//        System.out.println(d+ "  hello "+s);
//        System.out.println(c+ "  hello "+s);
        String[] s=(br.readLine()).split(" ");

        int K=Integer.parseInt(s[0]);



        int N=Integer.parseInt(s[1]);

        int O=Integer.parseInt(s[2]);



        System.out.println(K);
        System.out.println(N);
        System.out.println(O);


    }
}
