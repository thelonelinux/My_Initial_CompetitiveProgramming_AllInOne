package com.company;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int s=7;
        int t=11;

        int a=5;
        int b=15;

        int[] apples=new int[]{-2,2,1};
        int[] oranges=new int[]{5,-6};

        int[] applelanding=new int[apples.length];
        int[] orangelanding=new int[oranges.length];

        for (int i=0;i<apples.length;i++){
            applelanding[i]=apples[i]+a;
        }

        for (int i=0;i<oranges.length;i++){
            orangelanding[i]=oranges[i]+b;
        }


        int count1=0;
        int count2=0;

        for (int i=0;i<apples.length;i++){
            if(applelanding[i]>=s && applelanding[i]<=t){
                count1=count1+1;
            }
        }

        for (int i=0;i<oranges.length;i++){
            if(orangelanding[i]>=s && orangelanding[i]<=t){
                count2=count2+1;
            }
        }

        int[] arr=new int[]{count1,count2};

        System.out.println(count1);
        System.out.println(count2);



    }
}
