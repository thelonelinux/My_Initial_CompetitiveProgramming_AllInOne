package com.company;

import javax.script.ScriptContext;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int[] climbingLeaderboard(int[] given, int[] check) {

        int[] ans=new int[check.length];

        int[] arr= Arrays.stream(given).distinct().toArray();

        int j=arr.length-1;
        for (int i=0;i<check.length;i++){
            if (check[i]<arr[j]){
                ans[i]=j+2;
//                System.out.println(j+2);
            }
            else if (check[i]==arr[j]){
                ans[i]=j+1;
//                System.out.println(j+1);
            }
            else {
                if (j==0){
                    ans[i]=1;
//                    System.out.println(1);

                }else{
                    j--;
                    i--;

                }

            }
        }
        return ans;


    }


    public static void main(String[] args) {
	// write your code here

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();


        int[] given=new int[n];


        for (int i=0;i<n;i++){
            given[i]=sc.nextInt();
        }
        int a=sc.nextInt();
        int[] check=new int[a];

        for (int j=0;j<a;j++){
            check[j]=sc.nextInt();
        }

        int[] ans=new int[a];

        ans=climbingLeaderboard(given,check);

        for (int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }


    }
}
