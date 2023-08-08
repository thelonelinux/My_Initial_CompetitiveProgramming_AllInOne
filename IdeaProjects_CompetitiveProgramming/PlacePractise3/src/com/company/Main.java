package com.company;

public class Main {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {


        int count=0;
        int i=1;

        while (i<c.length){

            if (c[0]==0){

                if(c[i]==0) {
                    count = count + 1;
                }
            }
            i++;
        }

//        for (int j=0;j<c.length-2;j++){
//            if (c[j]==0 && c[j+1]==0 && c[j+2]==0){
//                count=count-1;
//            }
//        }

        int k=0;
        while (k<c.length-2){
            if (c[k]==0 && c[k+1]==0 && c[k+2]==0){
                count=count-1;
                k=k+2;
            }
            else{
                k++;
            }
        }

        return count;


    }

    public static void main(String[] args) {
	// write your code here

        int[] array={0,1,0,0,0,0,0,1,0,1,0,0,0,1};

        System.out.println(jumpingOnClouds(array));



    }
}
