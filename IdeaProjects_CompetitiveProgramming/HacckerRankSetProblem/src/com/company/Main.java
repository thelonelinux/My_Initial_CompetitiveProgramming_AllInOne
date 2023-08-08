package com.company;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import javax.swing.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<Integer> a=new ArrayList<>();
        List<Integer> b=new ArrayList<>();

        a.add(2);
        a.add(4);

        b.add(16);
        b.add(32);
        b.add(96);


        BigInteger bg=new BigInteger(b.get(0).toString());
        BigInteger bg2=new BigInteger(b.get(1).toString());


        BigInteger bghcf=bg.gcd(bg2);

        System.out.println(bghcf.toString());

        int lowestFreq=a.get(a.size()-1);
        int highestFreq=b.get(b.size()-1);

        for(int i=0;i<b.size();i++){
            if(b.get(i)%lowestFreq==0){

            }
        }



    }
}
