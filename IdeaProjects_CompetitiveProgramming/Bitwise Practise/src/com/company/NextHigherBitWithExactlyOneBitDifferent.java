package com.company;

public class NextHigherBitWithExactlyOneBitDifferent {

    static int nextGreater(int N)
    {
        int power_of_2 = 1, shift_count = 0;

        // It is guaranteed that there
        // is a bit zero in the number
        while (true) {
            // If the shifted bit is zero then break
            if (((N >> shift_count) & 1) % 2 == 0)
                break;

            // increase the bit shift
            shift_count++;

            // increase the power of 2
            power_of_2 = power_of_2 * 2;
        }

        // set the lowest bit of the number
        return (N + power_of_2);
    }

    // Driver code
    public static void main(String[]a)
    {
        int N = 525;

        // display the next number
        System.out.println("The next number is = " + nextGreater(N));

    }

}
