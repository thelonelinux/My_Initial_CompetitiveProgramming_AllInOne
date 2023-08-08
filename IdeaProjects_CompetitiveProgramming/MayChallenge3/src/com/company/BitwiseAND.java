package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BitwiseAND {

    public static void main(String[] args) {



        int x=125;
        int y=155;
        int main=x | y;
        System.out.println(main);
        String xored=Integer.toBinaryString(main);
        System.out.println("xored Value is "+xored);
        System.out.println("###################################################");

        List<Integer> list=new ArrayList<>();
        list.add(main);



        //turning off the right most set bit to zero
        int mainValue=main;
        System.out.println(xored+" First this "+mainValue);
        for (int i=0;i<xored.length();i++){
            int value=mainValue&(mainValue-1);
            String str2=new String();
            str2=Integer.toBinaryString(value);
            System.out.println(str2+ " It's value is "+value);
            list.add(value);
            mainValue=value;
            if (value==0){
                break;
            }
        }

//        int rightMost=main&(main-1);
//        System.out.println(rightMost);
//        String firsRightShift=Integer.toBinaryString(rightMost);
//        System.out.println(firsRightShift);
//
//        int secondRightMost=rightMost&(rightMost-1);
//        System.out.println(secondRightMost);
//        String secondRightShift=Integer.toBinaryString(secondRightMost);
//        System.out.println(secondRightShift);

        //and so on.......

        //for turning off the left most set bit to zero
        System.out.println("###################################################");
        System.out.println("Turned off left bits values are as follows");
        System.out.println(xored+" First this "+main);
        for (int i=0; i<xored.length()-1;i++){
            if (xored.charAt(i)=='1'){
                String str=new String();
                str=xored.substring(i+1,xored.length());
                int decimal=Integer.parseInt(str,2);
                list.add(decimal);
                System.out.println("New String " + str+ " Value is "+ decimal);

            }
        }

        System.out.println("###################################################");
        Collections.sort(list);
        int l=0;
        int r=10;
        for (int i=list.size()-1;i>=0;i--) {
            if (list.get(i)<=r){
                System.out.println("Answer is "+list.get(i));
                break;
            }
        }

        List<Integer> newList=new ArrayList<>();
        for (int i=0;i<list.size();i++){
            if (list.get(i)>=l && list.get(i)<=r){
                newList.add(list.get(i));
            }
        }
        System.out.println("Other way");
        int max=0;
        int ans=0;
        for (int i=0;i<newList.size();i++){
            int sum=(x&newList.get(i))*(y&newList.get(i));
            if (sum>max){
                ans=newList.get(i);
            }
        }
        System.out.println(ans);


    }
}
