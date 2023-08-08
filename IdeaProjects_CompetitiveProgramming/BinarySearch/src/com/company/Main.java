package com.company;

import static java.util.Arrays.binarySearch;

public class Main {

    int number;
    int[] array;


//    //Binary Search with recursion
//    // Returns index of x if it is present in arr[l..r], else return -1
//    int binarySearch(int arr[], int l, int r, int x)
//    {
//        if (r>=l)
//        {
//            int mid = l + (r - l)/2;   // If the element is present at the middle itself
//
//            if (arr[mid] == x)
//                return mid;
//
//            // If element is smaller than mid, then it can only be present in left subarray
//
//            if (arr[mid] > x)
//                return binarySearch(arr, l, mid-1, x); // Else the element can only be present in right subarray
//
//            return binarySearch(arr, mid+1, r, x);
//        }
//
//        // We reach here when element is not present in array
//
//        return -1;
//    }
//
//    public static void main(String[] args) {
//	// write your code here
//
//
//        Main ob = new Main();
//        int arr[] = {2,3,4,10,40};
//        int n = arr.length;
//        int x = 10;
//        int result = ob.binarySearch(arr,0,n-1,x);
//        if (result == -1)
//            System.out.println("Element not present");
//        else
//            System.out.println("Element found at index " +
//                    result);
//
//
//

    //Binary search without recursion;


//    public void binarySearch(int[] array,int mumber) {
//        int first = 0;
//        int last = array.length - 1;
//        int middle = (first + last) / 2;
//
//        while (first <= last) {
//            if (array[middle] == number) {
//                first = middle + 1;
//            } else if (array[middle] == number) {
//                System.out.printf(number + " found at location %d %n", middle);
//                break;
//            } else {
//                last = middle - 1;
//            }
//            middle = (first + last) / 2;
//        }
//        if (first == last) {
//            System.out.println(number + " is not present in the list.\n");
//        }
//    }

    public  int binarySearch(int[] input,int number) {
        int low = 0;
        int high = input.length - 1;
        while (high >= low) {
            int middle = (low + high) / 2;
            if (input[middle] == number) {
                return middle;
            }
            else if (input[middle] < number) {
                low = middle + 1;
            } else if (input[middle] > number) {
                high = middle - 1;
            }
        }
        return -1;
    }



    public  static void main(String[] args){

        int[] arr = new int[]{1,2,3,5,5};
        int num=5;

       Main main = new Main();

       main.array=arr;

       int index=main.binarySearch(main.array,5);

       System.out.print(index);









    }
}
