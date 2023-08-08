package com.company;

public class Main {

    static int minimumSwaps(int[] arr) {
        int count =0;

        for(int i=0;i<arr.length;i++){
            if((i+1)!=arr[i]){
                int index=find(i+1,arr);
                int num=arr[i];
                arr[i]=arr[index];
                arr[index]=num;
                count++;
            }
        }
        return count;


    }

    public static int find(int n, int[] arr){
        for(int i=0;i<arr.length;i++){
            if(n==arr[i]){
                return i;

            }

        }
        return 0;


    }

    public static void main(String[] args) {
	// write your code here

        int[] arr={1, 3, 5, 2, 4, 6, 7};
        int ans=minimumSwaps(arr);
        System.out.println(ans);
    }
}
