package com.company;

public class Main {

    public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String[] args) {
	// write your code here

        int[] array = new int[]{2,5,9,8};


        int n=array.length;




        for(int i=1;i<n;++i){

            int key=array[i];
            int j=i-1;


            while (j>=0 && array[j]>key){

                array[j+1] = array[j];
                j = j-1;

            }
            array[j+1]=key;
        }

        printArray(array);
    }
}
