package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while (t-->0){

            int n=sc.nextInt();
            int h=sc.nextInt();
            int y1=sc.nextInt();
            int y2=sc.nextInt();
            int l=sc.nextInt();
            int arr[][]=new int[2][n];
            for(int i=0;i<n;i++){
                arr[0][i]=sc.nextInt();
                arr[1][i]=sc.nextInt();
            }
            int count=0;
            for(int i=0;i<n;i++)
            {
                if(l>0)
                {
                    if(arr[0][i]==1)
                    {
                        if((h-y1)<=arr[1][i])
                            count++;
                        else
                        {
                            if(l!=1) {
                                count++;
                            }
                            l--;
                        }
                    }
                    else
                    {
                        if(y2>=arr[1][i])
                            count++;
                        else
                        {
                            if(l!=1) {
                                count++;
                            }
                            l--;
                        }
                    }
                }
                else
                    break;
            }

            System.out.println(count);
        }

    }
}
