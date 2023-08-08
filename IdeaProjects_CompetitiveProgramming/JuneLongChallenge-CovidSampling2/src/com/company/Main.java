package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws java.lang.Exception{
	// write your code here

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();   //which value is 2
        while (t-->0){
            int len=sc.nextInt();   //which value is 60
            int P=sc.nextInt();    //which value is 2 most often; after doing 2 only you have to reply your matrix.
            int q=5*len*len;


            int[][] arr=new int[len][len];
            int X=-1;

            int first=1;  //just enter 1
            int r1=1;
            int c1=0;
            int r2=r1;
            int c2=c1;
            int grader=0;

            System.out.println(1+" "+1+" "+60+" "+1+" "+60);
            System.out.flush();
            grader=sc.nextInt();
            if (grader==0){
                System.out.println(2);
                for (int i=0;i<len;i++){
                    for (int j=0;j<len;j++){
                        System.out.print(arr[i][j]+" ");
                        System.out.flush();
                    }
                    System.out.println();
                    System.out.flush();
                }
                X=sc.nextInt();
                if (X==1 ){
                    break;
                }else{
                    continue;
                }
            }


            while ( X!=1 ){
                //Ask your range

                if (c1>=len){
                    r1++;
                    c1=1;
                    r2=r1;
                    c2=c1;
                }else{

                    c1++;
                    r2=r1;
                    c2=c1;
                }

                System.out.println(1+" "+r1+" "+c1+" "+r2+" "+c2);
                System.out.flush();
                //Grader's reply
                int greder=sc.nextInt();


                if (greder==1){
                    arr[r1-1][c1-1]=1;
                }else{
                    arr[r1-1][c1-1]=0;
                }



                if (r1==len && c1==len){
                    System.out.println(2);
                    for (int i=0;i<len;i++){
                        for (int j=0;j<len;j++){
                            System.out.print(arr[i][j]+" ");
                            System.out.flush();
                        }
                        System.out.println();
                        System.out.flush();
                    }
//                    System.out.println("Enter the value of x");
                    X=sc.nextInt();
                    if (X==1 ){
                        break;
                    }else{
                        continue;
                    }
                }


            }
//            System.out.println("Successful");
        }

    }
}
