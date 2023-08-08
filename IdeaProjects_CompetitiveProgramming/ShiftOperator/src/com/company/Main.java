package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//
//        int i=0;
//        int j=i<<0;
//
//        System.out.println(j);
        int n=3;
        int k=0;

        for (int i = 0; i < 8; i++)
        {
            System.out.print("{ ");

            // Print current subset
            for (int j = 0; j < n; j++) {

                // (1<<j) is a number with jth bit 1
                // so when we 'and' them with the
                // subset number we get which numbers
                // are present in the subset and which
                // are not
                k=i & (1 << j);
                if ((k) > 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println("}");
        }
    }
}
