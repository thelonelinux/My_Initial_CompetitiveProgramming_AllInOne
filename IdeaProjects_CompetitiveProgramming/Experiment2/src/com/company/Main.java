package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.lang.*;
public class Main {
    static String str="";
    private static boolean keyword(int start,int end){
        HashSet<String> keys=new HashSet<>();
        keys.add("for");
        keys.add("if");

        String cur="";
        for(int i=start;i<=end;i++){
            cur+=str.charAt(i);
        }
        if(keys.contains(cur)){
            return true;
        }
        return false;
    }
    private static boolean whitespace(int start,int end){
        HashSet<String> keys=new HashSet<>();
        keys.add(" ");
        String cur="";
        for(int i=start;i<=end;i++){
            cur+=str.charAt(i);
        }
        if(keys.contains(cur)){
            return true;
        }
        return false;
    }
    private static boolean variable(int start,int end){
        char a=str.charAt(start);
        if(!(a>='a'&&a<='z')){
            return false;
        }
        for(int i=start;i<=end;i++){
            a=str.charAt(i);
            if(!((a>='a'&&a<='z')||(a>='0'&&a<='9'))){
                return false;
            }
        }
        return true;
    }
    private static boolean cparen(int start,int end){
        HashSet<String> keys=new HashSet<>();
        keys.add(")");
        String cur="";
        for(int i=start;i<=end;i++){
            cur+=str.charAt(i);
        }
        if(keys.contains(cur)){
            return true;
        }
        return false;
    }
    private static boolean oparen(int start,int end){
        HashSet<String> keys=new HashSet<>();
        keys.add("(");
        String cur="";
        for(int i=start;i<=end;i++){
            cur+=str.charAt(i);
        }
        if(keys.contains(cur)){
            return true;
        }
        return false;
    }
    private static boolean number(int start,int end){
        char a;
        for(int i=start;i<=end;i++){
            a=str.charAt(i);
            if(!((a>='0'&&a<='9'))){
                return false;
            }
        }
        return true;
    }
    public static void main (String[] args) throws Exception {
        File file = new File("/home/vicky/Desktop/main.txt");
        PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new FileReader(file));
        out.println();
        String st[]=br.readLine().split("#");
        str=st[0];
        int n=str.length();
        boolean flag=true;
        HashMap<String,String> map=new HashMap<>();
        out.println("Input String is: "+str);
        out.println();
        for(int i=0;i<n;i++){
            if(i<n-2&&str.charAt(i)=='/'&&str.charAt(i+1)=='/'){
                break;
            }
            for(int j=n-1;j>=i;j--){
                if(keyword(i,j)){
                    String cur=str.substring(i,j+1);
                    map.put(cur,"keyword");
                    i=j;
                }
                else if(whitespace(i,j)){
                    String cur=str.substring(i,j+1);
                    map.put(cur,"whitespace");
                    i=j;
                }
                else if(cparen(i,j)){
                    String cur=str.substring(i,j+1);
                    map.put(cur,"closing parenthesis");
                    i=j;
                }
                else if(oparen(i,j)){
                    String cur=str.substring(i,j+1);
                    map.put(cur,"opening parenthesis");
                    i=j;
                }
                else if(variable(i,j)){
                    String cur=str.substring(i,j+1);
                    map.put(cur,"variable");
                    i=j;
                }
                else if(number(i,j)){
                    String cur=str.substring(i,j+1);
                    map.put(cur,"number");
                    i=j;
                }
            }
        }
        if(flag){
            out.println("Program Compiled Successfully");
        }
        else{
            out.println("Program encountered an error");
            out.flush();
            return;
        }
        out.println("Tokens are");
        Set<String> set=map.keySet();
        for(String u:set){
            out.println(u+" : "+map.get(u));
        }

        out.flush();
        out.close();
    }
}


