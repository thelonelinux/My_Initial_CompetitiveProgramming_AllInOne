package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class FrequentElements {

    static int mostFrequent(int arr[], int n) {
        Arrays.sort(arr);
        int max_count = 1, res = arr[0];
        int curr_count = 1;

        for (int i = 1; i < n; i++)
        {
            if (arr[i] == arr[i - 1])
                curr_count++;
            else
            {
                if (curr_count > max_count)
                {
                    max_count = curr_count;
                    res = arr[i - 1];
                }
                curr_count = 1;
            }
        }
        if (curr_count > max_count)
        {
            max_count = curr_count;
            res = arr[n - 1];
        }

        return res;
    }

    public static void main(String[] args) throws Exception{

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
           String string = sc.next();
           char[] chars=string.toCharArray();
           int[] arr=new int[chars.length];
           for (int i=0;i<arr.length;i++){
               arr[i]=(int)chars[i];
           }

            int n=arr.length;
            Arrays.sort(arr);
            int max_count = 1, res = arr[0];
            int curr_count = 1;

            for (int i = 1; i < n; i++)
            {
                if (arr[i] == arr[i - 1])
                    curr_count++;
                else
                {
                    if (curr_count > max_count)
                    {
                        max_count = curr_count;
                        res = arr[i - 1];
                    }
                    curr_count = 1;
                }
            }
            if (curr_count > max_count)
            {
                max_count = curr_count;
                res = arr[n - 1];
            }



           char ans=(char)res;

           System.out.println(ans);

        }

    }

}
