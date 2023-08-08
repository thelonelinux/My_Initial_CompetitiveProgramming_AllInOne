package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        try{
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while (t-->0){

                int count=0;
                List<Integer> list=new ArrayList<>();
                int n=sc.nextInt();
                list.add(n);
                if (n>30){
                    count++;
                }
                while (n!=-1){
                    n=sc.nextInt();
                    list.add(n);
                    if (n>30){
                        count++;
                    }
                }
                int sum=0;
                int sumOfIndex=0;

                for (int i=0;i<list.size();i++){
                    if (list.get(i)%2==0){
                        sumOfIndex+=i+1;
                        sum=sum+(list.get(i)*sumOfIndex);

                    }
                }

                long ans=sum/sumOfIndex;
                System.out.println(count+" "+ ans);

            }

        }catch (Exception e){
            return;
        }

    }
}
