package com.company;

public class Main {


    static int gcd(int num1, int num2)
    {
        if (num1 == 0)
            return num2;
        return gcd(num2 % num1, num1);
    }


    static int findGCD(int[] arr, int n)
    {
        int result = arr[0];
        for (int i = 1; i < n; i++)
            result = gcd(arr[i], result);

        return result;
    }

    public static void main(String[] args) {
	// write your code here

//        int[] arr = {96, 32, 16};
//        int n = arr.length;
//        System.out.println(findGCD(arr, n));
//
//        int hcf=gcd(75,45);
//
//        System.out.println(hcf);

//        int a, b;
        int[] myArray = {50,25, 125, 625};
        int size = myArray.length;
        int result = myArray[0];
        int i = 1;
        while(i<size)
        {
            if(myArray[i]%result==0)
            {
                i++;
            } else {
                result = myArray[i]%result;
                i++;
            }
        }
        System.out.println("GCD is "+result);

    }
}
