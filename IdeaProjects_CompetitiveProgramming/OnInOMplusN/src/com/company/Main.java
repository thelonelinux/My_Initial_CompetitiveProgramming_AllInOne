package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[][] arr={{1,2,3,9},{4,5,6,7},{8,45,21,32}};

        int i=0;
        int j=0;

        while (i<arr.length){

            System.out.println(arr[i][j]);

            if(j<arr[i].length){
                j++;
            }
            if(j==arr[i].length){
                i++;
                j=0;
            }

        }
    }
}
