package com.company;

// Java program to evaluate area
// of a polygon using shoelace formula
import java.io.*;

class Area2
{
    // (X[i], Y[i]) are coordinates of i'th point.
    public static double polygonArea(double X[], double Y[],
                                     int n)
    {
        // Initialze area
        double area = 0.0;

        // Calculate value of shoelace formula
        int j = n - 1;
        for (int i = 0; i < n; i++)
        {
            area += (X[j] + X[i]) * (Y[j] - Y[i]);

            // j is previous vertex to i
            j = i;
        }

        // Return absolute value
        return Math.abs(area / 2.0);
    }

    // Driver program
    public static void main (String[] args)
    {
        double X[] = {0, 0, 4, 4};
        double Y[] = {0, 4, 0,4};

        int n = 4;
        System.out.println(polygonArea(X, Y, n));
    }

}
// This code is contributed by Sunnnysingh

