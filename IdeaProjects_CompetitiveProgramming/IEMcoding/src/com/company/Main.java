package com.company;

import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    static void printPrecision(double d){

        DecimalFormat ft = new DecimalFormat("0.00");
        System.out.println(ft.format(d));
    }

    public static void main(String[] args) throws java.lang.Exception{
	// write your code here

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long n=sc.nextInt();
            long[] arr=new long[(int)n];
            for (int i=0;i<n;i++){
                arr[i]=sc.nextLong();
            }

            long sumOfExpanded=0;
            long countOfSwappedPeople=0;
            long traceBackSequunce=0;
            HashSet<Long> set=new HashSet<>();
            boolean ansGiven=true;
            for (int i=0;i<n;i++){
                long sequence=i+1+traceBackSequunce;
                if (sequence==arr[i] && !set.contains(arr[i])){
                    //Means its in sequence
                    //so leave it
                }
                else{
                    //It's not in sequence
                    if (!set.contains(sequence)){

                        sumOfExpanded+=Math.abs((i+1)-arr[i])*1000;
                        countOfSwappedPeople++;
                        long swapping=Math.abs((i+1)-arr[i]);
                        if (swapping>2){
                            System.out.println("Too Much");
                            ansGiven=false;

                            break;
                        }
                        //Now since there is some breakage so take back one number and restart with
                        //sequnce checking
                        traceBackSequunce--;
                    }

                    set.add(arr[i]);

                }
            }

            if (ansGiven){
                long ans=sumOfExpanded/countOfSwappedPeople;
                printPrecision(ans);

            }


        }
    }
}
