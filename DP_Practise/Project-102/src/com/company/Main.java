package com.company;

public class Main {

    public static void main(String[] args) {
        int num=7;
        int mid=num/2;

        for (int i=0; i<num ; i++){
            for(int j=0;j<num; j++){
                int upperMid=mid+i;
                int lowerMid=mid-i;

                if(i<=mid){
                    if (j<=upperMid && j>=lowerMid){
                        System.out.print("  ");
                    }
                    else {
                        System.out.print("* ");
                    }
                }

                if (i>mid){
                    int k=num-i-1;
                    int newUpper=mid+k;
                    int newLower=mid-k;

                    if (j<=newUpper && j>=newLower){
                        System.out.print("  ");
                    }
                    else {
                        System.out.print("* ");
                    }
                }
            }
            System.out.println("");
        }

    }
}
