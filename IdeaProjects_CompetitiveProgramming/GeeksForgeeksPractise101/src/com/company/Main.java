package com.company;

import jdk.nashorn.internal.runtime.JSONListAdapter;
import org.omg.CORBA.INTERNAL;
import org.omg.PortableInterceptor.INACTIVE;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import sun.nio.cs.ext.MacHebrew;

import javax.activation.MimetypesFileTypeMap;
import javax.swing.*;
import javax.swing.plaf.IconUIResource;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {

    static int solution(int[] arr){

        int[] arr2;
        int count=0;

        int i=0;
        int j=i+2;

        while (i<arr.length-1){
            arr2=Arrays.copyOfRange(arr,i,j);
            boolean bool=isSame(arr2);
            if(bool){
                count++;
            }

            if(j<arr.length+1){
                j++;
            }
            if(j==arr.length+1){
                i++;
                j=i+2;
            }

        }

        return count;

    }

    static boolean isSame(int[] arr){
        int countZero=0;
        int countOne=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]==0){
                countZero++;
            }else {
                countOne++;
            }
        }
        if (countOne==countZero){
            return true;
        }
        return false;
    }

    static int countSubarrWithEqualZeroAndOne(int arr[], int n){

        HashMap<Integer,Integer> h = new HashMap<>();
        int count=0;
        int sum[] = new int[n];
        if(arr[0]==0) arr[0]=-1;
        sum[0]=arr[0];

        for(int i=1;i<n;i++){

            if(arr[i]==0) arr[i]=-1;
            sum[i]=arr[i]+sum[i-1];

        }
        h.put(0,1);

        for(int i=0;i<n;i++){

            int find=sum[i];
            if(h.containsKey(find)==true)
            {int v=h.get(find);
                count+=v;

            }else if(find==0)
                count++;
            if(h.containsKey(find)==true)
                h.put(find,h.get(find)+1);
            else h.put(find,1);
        }

        return count;
    }






    public static void main (String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int x=Integer.parseInt(br.readLine());
            int[] arr=new  int[x];

            String lines=br.readLine();
            String[] str=lines.trim().split("\\s+");


            for (int i=0;i<arr.length;i++){
                arr[i]=Integer.parseInt(str[i]);
            }

            System.out.println(countSubarrWithEqualZeroAndOne(arr,arr.length));


        }
    }

}