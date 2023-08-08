package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here


//        Scanner scanner =new Scanner(System.in);
//
//
//        InputStreamReader iSR=new InputStreamReader(System.in);
//
//        BufferedReader bR=new BufferedReader(iSR);
//
//        String s=bR.readLine();
//
//        int i=Integer.parseInt(bR.readLine());
//
//        long l= Long.parseLong(bR.readLine());
//
//        double d=Double.parseDouble(bR.readLine());
//
//        char c=(char)bR.read();
//
//
//
//
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        String string=bufferedReader.readLine();
//        int int1=Integer.parseInt(bufferedReader.readLine());
//        long l1=Long.parseLong(bufferedReader.readLine());
//        double d2=Double.parseDouble(bufferedReader.readLine());

        FileReader fr=new FileReader("/home/vicky/Desktop/file.txt");
        BufferedReader br=new BufferedReader(fr);

        int i;
        while((i=br.read())!=-1){
            System.out.print((char)i);
        }
        br.close();
        fr.close();

        Set set= new TreeSet();



    }
}
