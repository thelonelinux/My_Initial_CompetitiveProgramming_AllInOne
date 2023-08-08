package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args)throws Exception {

        int[] arr=new int[]{1,2,3,4,3,3,2,1};
        Arrays.sort(arr);
        int zeroes=0;
        int ans=0;
        int[] temp=new int[arr.length];
        int g=0;

        for (int i=0;i<arr.length;i++) {
            int n=arr[i];
            if (n != 0) {

                for (int m = 0; m < arr.length; m++) {
                    if (arr[m] == 0) {
                        zeroes = zeroes + 1;
                    }
                }
                ans = arr.length - zeroes;
                temp[g] = ans;
                g++;
                ans = 0;
                zeroes = 0;

                for (int j = i; j < arr.length; j++) {
                    arr[j] = arr[j] - n;
                }
            }
        }

        System.out.println("Temp Elements");
        for (int m=0;m<g;m++){
            System.out.println(temp[m]);
        }

//        int count=0;
//        for (int i=0;i<temp.length;i++){
//            if (temp[i]>0){
//                count=count+1;
//            }
//        }
//
//        int[] newtemp = new int[temp.length-count];
//        int i=0;
//
//        for (int v=0;v<temp.length;v++){
//            if(temp[v]>0){
//                newtemp[i]=temp[v];
//                i++;
//            }
//        }
//
//        System.out.println("After return");
//        for (int m=0;m<newtemp.length;m++){
//           System.out.println(newtemp[m]);
//        }


    }
}
