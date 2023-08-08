package com.company;

import java.util.*;

public class Main {


    static int[] permutationEquation(int[] p) {

        List<Integer> list=new ArrayList<>();
        for (int i=0;i<p.length;i++){
            list.add(p[i]);
        }

        int[] arrIndex=new int[p.length];

        for (int i=0;i<list.size();i++){
            arrIndex[i]= list.indexOf(i+1)+1;
        }
        int[] ans=new int[p.length];
        int first,second;
        for (int i=0;i<p.length;i++){
             first=arrIndex[i];
             second=arrIndex[first-1];
            ans[i]=second;
        }

        return ans;

    }


    public static void main(String[] args) {
	// write your code here

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int[] arr=new int[n];

        for (int i=0;i<arr.length;i++){

            arr[i]=sc.nextInt();
        }

        int[] ans=permutationEquation(arr);

        for (int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }

    }
}
