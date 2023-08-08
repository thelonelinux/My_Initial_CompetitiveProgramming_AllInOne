package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    static int flatlandSpaceStations(int n, int[] c) {
        if(n==c.length){
            return 0;
        }

        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=i;
        }

        int[] postPositionDistance= new int[n];
        for(int v=0;v<n;v++){
            postPositionDistance[v]=n;
        }

        for(int m=0;m<c.length;m++){
            for (int j=0;j<n;j++){
                int distance=Math.abs(c[m]-arr[j]);
                postPositionDistance[j]=Math.min(postPositionDistance[j],distance);



            }
        }

        Arrays.sort(postPositionDistance);
        return postPositionDistance[n-1];
    }

    public static void main(String[] args) {
	// write your code here

        int n=5;
        int[] c={0,4};

        System.out.println(flatlandSpaceStations(n,c));
    }
}
