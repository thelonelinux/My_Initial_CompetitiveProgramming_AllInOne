package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Final {

    public static void main(String[] args) {


        try{

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int t=Integer.parseInt(br.readLine());
            while(t-->0){
                String lines=br.readLine();
                String[] strRead=lines.trim().split("\\s+");
                long x=Long.parseLong(strRead[0]);
                long y=Long.parseLong(strRead[1]);
                long l=Long.parseLong(strRead[2]);
                long r=Long.parseLong(strRead[3]);

                long main=x | y;
                String xored=Long.toBinaryString(main);

                List<Long> list=new ArrayList<>();
                list.add(main);

                //turning off the right most set bit to zero
                long mainValue=main;
                for (long i=0;i<xored.length();i++){
                    long value=mainValue&(mainValue-1);
                    String str2=new String();
                    str2=Long.toBinaryString(value);
//                    System.out.println(str2+ " It's value is "+value);
                    list.add(value);
                    mainValue=value;
                    if (value==0){
                        break;
                    }
                }
                //for turning off the left most set bit to zero
                for (int i=0; i<xored.length()-1;i++){
                    if (xored.charAt(i)=='1'){
                        String str=new String();
                        str=xored.substring(i+1,xored.length());
                        long decimal=Integer.parseInt(str,2);
                        list.add(decimal);
//                        System.out.println("New String " + str+ " Value is "+ decimal);
                    }
                }
                Collections.sort(list);

                List<Long> newList=new ArrayList<>();
                for (int i=0;i<list.size();i++){
                    if (list.get(i)>=l && list.get(i)<=r){
                        newList.add(list.get(i));
                    }
                }
//                System.out.println("Other way");
                long max=0;
                long ans=0;
                for (int i=0;i<newList.size();i++){
                    long sum=(x&newList.get(i))*(y&newList.get(i));
                    if (sum>max){
                        ans=newList.get(i);
                    }
                }
                System.out.println(ans);
            }
        }catch (Exception e){
            return;
        }

    }
}
