package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here

//        int[] arr = {4, 8, 5,2, 1, 6,5, 3,5,1};
//
//        Arrays.sort(arr);
//
//        int curr_count=1;
//        int max_count=1;
//        int res=arr[0];
//
//        for (int i=1; i<arr.length;i++){
//
//            if (arr[i]==arr[i-1]){
//
//                curr_count++;
//            }
//            else {
//                if (curr_count>max_count){
//
//                    max_count=curr_count;
//
//                    res=arr[i-1];
//                }
//            }
//
////        int[] temp=new int[arr.length];
////
////        int j=0;
////
////        for (int i=0;i<arr.length-1;i++){
////
////            if (arr[i]!=arr[i+1]){
////
////                temp[j]=arr[i];
////                j++;
////            }
////        }
////
////        temp[j++]=arr[arr.length-1];
////
////        for (int i=0;i<j;i++){
////
////            arr[i]=temp[i];
////        }
////
////        for (int i=0; i<j;i++){
////            System.out.println(arr[i] + " ");
//        }
//
//        System.out.println(res);
////
////        Arrays.sort(arr);
////
////        int[] temparr=new int[arr.length];
////
////        int temp;
////
////        for (int i=0;i<arr.length;i++){
////
////            for (int j=i+1;j<arr.length;j++){
////
////                if (arr[i]==arr[j]){
////
////                    temp=arr[j];
////
////                }
////                arr[]
////            }
////        }
//
//
//
////
////        for (int i=0;i<arr.length;i++){
////            System.out.println(arr[i]+ " ");
////        }
////
////        System.out.println("Arrays after sorting");
////
////
////        Arrays.sort(arr);
////
////
////        for (int i=0;i<arr.length;i++){
////            System.out.println(arr[i]+ " ");
////        }
////
////    }

        {
            Queue queue = new Queue(1000);

            queue.enqueue(10);
            queue.enqueue(20);
            queue.enqueue(30);
            queue.enqueue(40);

            System.out.println(queue.dequeue() +
                    " dequeued from queue\n");

            System.out.println("Front item is " +
                    queue.front());

            System.out.println("Rear item is " +
                    queue.rear());
        }
    }
}
