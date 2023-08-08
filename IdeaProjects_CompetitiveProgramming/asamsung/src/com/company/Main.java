package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc=new Scanner(System.in);

        int testCase=sc.nextInt();

        for(int t=0;t<testCase;t++){

            int len=sc.nextInt();
            int key=sc.nextInt();
            int min=sc.nextInt();


            int[] arr=new int[len];

            for(int i=0;i<len;i++){
                arr[i]=sc.nextInt();

            }

            Arrays.sort(arr);

            int ans=len-2;
            ans=ans*ans;

            if(len<=2){
                System.out.println(len);
            }
            else {
                System.out.println(ans+1);
            }






        }



    }
}
