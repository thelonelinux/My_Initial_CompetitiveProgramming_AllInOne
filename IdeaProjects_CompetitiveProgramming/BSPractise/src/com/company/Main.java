package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        int[] input = new int[]{1,2,3,4,5,6,7};
        int number=5;

//        Main main = new Main();
//
//        main.array=arr;
//
//        int index=main.binarySearch(main.array,5);

        //before applying binary search first sort the array;

        int low = 0;
        int high = input.length - 1;
        while (high >= low) {
            int middle = (low + high) / 2;
            if (input[middle] == number) {
                 System.out.println(middle);
                 break;
            }
            else if (input[middle] < number) {
                low = middle + 1;
            } else if (input[middle] > number) {
                high = middle - 1;
            }
        }

    }
}
