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
                int n=sc.nextInt();
                int[] arr=new int[n];
                List<Integer> list=new ArrayList<Integer>();
                for (int i=0;i<n;i++){
                    arr[i]=sc.nextInt();
                    if (arr[i]==1){
                        list.add(i);
                    }
                }
                int flag=0;
                if (list.size()==1){
                    System.out.println("YES");
                }else {
                    for (int i=0;i<list.size()-1;i++){
                        if ((list.get(i+1)-list.get(i))<6) {
                            flag = 1;
                            break;
                        }
                    }
                    if (flag==1){
                        System.out.println("NO");
                    }else{
                        System.out.println("YES");
                    }
                }
            }

        }catch (Exception e){
            return;
        }
    }
}
