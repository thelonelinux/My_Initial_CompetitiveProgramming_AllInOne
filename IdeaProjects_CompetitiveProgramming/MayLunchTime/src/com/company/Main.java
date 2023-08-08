package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        try{
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while (t-->0){
                int numOfPlayers=sc.nextInt();
                int cost=sc.nextInt();
                int len=numOfPlayers;
                int[] arr=new int[len];
                int[] arr2=new int[len];

                for (int i=0;i<len;i++){
                    arr[i]=sc.nextInt();
                }
                for (int i=0;i<len;i++){
                    arr2[i]=sc.nextInt();
                }

                int length=Arrays.stream(arr2).distinct().toArray().length;
                int leftCost=100-cost;

                if (leftCost==0 || arr.length==1 || length==1){
                    System.out.println("no");
                }else{
                    int minFirst=Integer.MAX_VALUE;
                    int minSecond=Integer.MAX_VALUE;
                    for (int i=0;i<len;i++){

                        if (arr2[i]==0){
                            if (arr[i]<minFirst){
                                minFirst=arr[i];
                            }
                        }

                        if (arr2[i]==1){
                            if (arr[i]<minSecond){
                                minSecond=arr[i];
                            }
                        }
                    }

                    int sum=minFirst+minSecond;
                    if (sum>leftCost){
                        System.out.println("no");
                    }else{
                        System.out.println("yes");
                    }
                }
            }

        }catch (Exception e){
            return;
        }
    }
}
