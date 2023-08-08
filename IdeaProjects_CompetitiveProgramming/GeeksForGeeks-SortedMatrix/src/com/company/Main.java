package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int len=sc.nextInt();
            int[] arr=new int[len];

            for (int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            int capacity=sc.nextInt();

            int min=0;
            int max=capacity-1;
            int fault=0;
            int[] checkArr=new int[len];
            for (int i=0;i<arr.length;i++){

                if (i<capacity){
                    boolean found=false;
                    if (i==0){
                        checkArr[i]=arr[i];
                        fault++;
                    }else{
                        for (int j=0;j<i;j++){
                            if (arr[i]==checkArr[j]){
                                //Ok
                                found=true;
                            }
                        }
                        if (found==true){
                            //ok
                        }else{
                            fault++;
                        }
                    }
                }else{
                    boolean found=false;
                    for (int k=min;k<=max;k++){
                        if (k<len){
                            if (arr[i]==checkArr[k]){
                                //ok
                                found=true;
                            }
                        }
                    }
                    if (found==true){
                        min=min;
                        max=max;
                    }else{
                        fault++;
                        min++;
                        max++;
                    }
                }

            }
            System.out.println(fault);


        }
    }
}
