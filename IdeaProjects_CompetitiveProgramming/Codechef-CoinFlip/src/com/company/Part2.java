package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Part2 {

    public static void main(String[] args) {



            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while (t-->0){
                int numOfGame=sc.nextInt();
                while (numOfGame-->0){
                    int initials=sc.nextInt();
                    long rounds=sc.nextLong();
                    int finals=sc.nextInt();

                    long[] arr=new long[(int)rounds];
                    if (initials==1){
                        Arrays.fill(arr,1);
                    }
                    else {
                        Arrays.fill(arr,2);
                    }
                    for (int i=0;i<arr.length;i++){

                        arr[i]=arr[i]+rounds;
                        rounds--;
                    }

                    int countHead=0;
                    int countTails=0;
                    for (int i=0;i<arr.length;i++){
                        if (arr[i]%2==0){
                            countTails++;
                        }else {
                            countHead++;
                        }
                    }
                    if (finals==1){
                        System.out.println(countHead);
                    }else {
                        System.out.println(countTails);
                    }
                }
            }




    }

}
