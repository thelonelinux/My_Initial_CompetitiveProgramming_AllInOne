package com.company;

import java.util.Scanner;

public class Main {

    static int commonChild(String X, String Y) {

        int m=X.length();
        int n=Y.length();

        int[][] L = new int[m+1][n+1];

        for (int i=0; i<=m; i++)
        {
            for (int j=0; j<=n; j++)
            {
                if (i == 0 || j == 0)
                    L[i][j] = 0;
                else if (X.charAt(i-1) == Y.charAt(j-1))
                    L[i][j] = L[i-1][j-1] + 1;
                else
                    L[i][j] = Math.max(L[i-1][j], L[i][j-1]);
            }
        }

        int index = L[m][n];
        int temp = index;

        char[] lcs = new char[index+1];
        lcs[index] = ' '; // Set the terminating character


        int i = m, j = n;
        while (i > 0 && j > 0)
        {

            if (X.charAt(i-1) == Y.charAt(j-1))
            {
                lcs[index-1] = X.charAt(i-1);

                i--;
                j--;
                index--;
            }


            else if (L[i-1][j] > L[i][j-1])
                i--;
            else
                j--;
        }

        return lcs.length-1;
    }


    public static void main(String[] args) {
	// write your code here

        Scanner sc=new Scanner(System.in);

        String str1=sc.next();
        String str2=sc.next();

        System.out.println(commonChild(str1,str2));
    }
}
