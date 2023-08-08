package com.company;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
	// write your code here

        Scanner sc=new Scanner(System.in);

        int len1=sc.nextInt();
        int[] arr1=new int[len1];

        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }

        int len2=sc.nextInt();
        int[] arr2=new int[len2];

        for(int i=0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }


        int len3=sc.nextInt();
        int[] arr3=new int[len3];

        for(int i=0;i<arr3.length;i++){
            arr3[i]=sc.nextInt();
        }

        List<Integer> hs=new ArrayList<>();
        int count=0;

        for(int i=0;i<len1;i++){
            hs.add(arr1[i]);
            for(int j=0;j<len2;j++){
                hs.add(arr2[j]);

                for(int k=0;k<len3;k++){
                    hs.add(arr3[k]);
                    Collections.sort(hs);
                    if(hs.get(0)+hs.get(1)>hs.get(2)){
                        count++;

                    }

                        hs.clear();
                        hs.add(arr1[i]);
                        hs.add(arr2[j]);

                }
                hs.clear();
                hs.add(arr1[i]);

            }
            hs.clear();

        }

        System.out.println(count);

    }
}
