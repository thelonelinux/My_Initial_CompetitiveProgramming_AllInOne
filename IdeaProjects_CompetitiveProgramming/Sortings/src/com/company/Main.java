package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Bubble sort;

//        int[] arr = new int[5];

        //Bubble sort

        int[] arr={2,3,1,4,5};

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }

//        int max=arr[1]+arr[2]+arr[3]+arr[4];
//        int min=arr[0]+arr[1]+arr[2]+arr[3];
//

        int max=0;

        for (int i=1;i<arr.length;i++){
             max=max+arr[i];
        }

        int min=0;

        for (int i=0;i<arr.length-1;i++){
            min=min+arr[i];
        }

        System.out.println(max+" "+min);



    }
}
