package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] arr={1,5,8,5,6};

        int x=5;

        for (int i=0;i<arr.length;i++){
            if(x==arr[i]){
                System.out.print(i+" ");
            }

        }

        int sum=0;

        for (int i=0;i<arr.length;i++){
            if(x==arr[i]){
                sum=sum+1;
            }

        }

        System.out.print(sum);
    }
}
