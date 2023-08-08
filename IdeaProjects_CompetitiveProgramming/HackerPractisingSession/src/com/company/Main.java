package com.company;

public class Main {

    static int beautifulTriplets(int d, int[] arr) {
        int gotOne=0;
        int count=0;

        for(int i=0;i<arr.length-d;i++){
            int temp=arr[i];
            for(int j=i+1;j<arr.length;j++){

                if(arr[j]-temp==d){
                    temp=arr[j];
                    gotOne++;
                }
            }
            if(gotOne>=2){
                count++;

            }
            gotOne=0;
        }
        return count;



    }

    public static void main(String[] args) {
	// write your code here

        int d=3;
        int[] arr={1 ,2 ,4 ,5 ,7 ,8 ,10};

        System.out.println(beautifulTriplets(d,arr));
    }
}
