package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc=new Scanner(System.in);

        int len=sc.nextInt();

        int maxHeight=sc.nextInt();

        int[] arr=new int[len];

        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int choice;
        int j=0;
        int key=0;

        do {

            choice=sc.nextInt();

            switch (choice){

                case 1 : if(j!=0){
                            j--;
                        }
                        break;

                case 2 : if(j!=arr.length-1){
                             j++;
                        }
                        break;


                case 3 : if(arr[j]!=0  && key==0){
                            arr[j]=arr[j]-1;
                            key=1;
                        }
                        break;

                case 4 : if (arr[j]!=maxHeight  && key==1){
                              arr[j]=arr[j]+key;
                              key=0;
                         }
                         break;

                default: break;
            }

        }
        while (choice!=0);

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }



    }
}
