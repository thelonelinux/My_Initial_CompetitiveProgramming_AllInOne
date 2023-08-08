package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        try{ Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while (t-->0){
                int len=sc.nextInt();
                String str=sc.next();
                int count=0;
                int sum=0;

                for (int i=0;i<len;i++){
                    if (str.charAt(i)=='1'){
                        count++;
                        sum=sum+count;
                    }
                }
                System.out.println(sum);
            }
        }catch (Exception e){ return;
        }

    }
}
