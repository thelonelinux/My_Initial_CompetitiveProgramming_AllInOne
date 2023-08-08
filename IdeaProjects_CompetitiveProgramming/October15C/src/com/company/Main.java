package com.company;

import java.util.Scanner;

public class Main {

    static int N ;
    static int Row,Col;

    static int largestKSubmatrix(int [][]a)
    {
        int [][]dp = new int [Row][Col];
        int result = 0;
        for (int i = 0 ;
             i < Row ; i++)
        {
            for (int j = 0 ;
                 j < Col ; j++)
            {
                if (i == 0 || j == 0)
                    dp[i][j] = 1;

                else
                {
                    if (a[i][j] == a[i - 1][j] &&
                            a[i][j] == a[i][j - 1] &&
                            a[i][j] == a[i - 1][j - 1])
                    {
                        dp[i][j] = (dp[i - 1][j] > dp[i][j - 1] &&
                                dp[i - 1][j] > dp[i - 1][j - 1] + 1) ?
                                dp[i - 1][j] :
                                (dp[i][j - 1] > dp[i - 1][j] &&
                                        dp[i][j - 1] > dp[i - 1][j - 1] + 1) ?
                                        dp[i][j - 1] :
                                        dp[i - 1][j - 1] + 1;
                    }
                    else dp[i][j] = 1;
                }
                result = result > dp[i][j] ?  result : dp[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        N=len;
        Row=len;



        String[] strings=new String[len];

        for (int i=0;i<strings.length;i++){
            strings[i]=sc.next();
        }
        int count=0;

        for (int i=0;i<strings[0].length();i++){
            if (strings[0].charAt(i)!='#'){
                count++;
            }
        }
        char[][] arr=new char[len][count];
        int[][] arr2=new int[len][count];

        int a,b,c,d;
        a=b=c=d=0;


        for (int i=0;i<len;i++){
            for (int j=0;j<strings[i].length();j++){
                if(strings[i].charAt(j)!='#'){

                    arr[a][b++]=strings[i].charAt(j);
                    arr2[c][d++]=(int)strings[i].charAt(j);
                }

            }
            a++;
            c++;
            b=0;
            d=0;
        }
        Col=count;

        System.out.print(largestKSubmatrix(arr2));

//        for (int i=0;i<arr2.length;i++){
//            for (int j=0;j<arr2[i].length;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println("");
//        }
    }
}

