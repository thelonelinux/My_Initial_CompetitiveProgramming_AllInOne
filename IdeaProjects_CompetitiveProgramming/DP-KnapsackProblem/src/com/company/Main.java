package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Dynamic Programming Tabulation method of 0/1 Knapsack problem

        int[] value={1,3,7,8,12,15,16,17};
        int[] weight={1,2,3,4,5,6,7,8};

        int sack=8;

        int[][] arr=new int[value.length+1][sack+1];

        for (int i=0;i<value.length+1;i++){


            for (int w=0;w<sack+1;w++){

                if (i==0 || w==0){    //This is for all 0th row and first i.e. 0th column in each other row.
                    arr[i][w]=0;

                }else if (weight[i-1]<=w){    //Here we have use (i-1) index because it will come to this index after i>0; so don't worry for IndexOutOfBoundException
                    int someNum=arr[i-1][w-weight[i-1]];
                    arr[i][w]=Math.max(value[i-1]+someNum,arr[i-1][w]);

                }else{
                    arr[i][w]=arr[i-1][w];
                }

            }
        }

        System.out.println(arr[value.length][sack]);

    }
}
