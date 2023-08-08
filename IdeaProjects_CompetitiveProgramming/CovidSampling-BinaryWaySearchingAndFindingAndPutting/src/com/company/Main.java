package com.company;

import java.util.Scanner;

public class Main {

   public static void deepBinaryTracking(Scanner sc,long grader,int len,int R1,int C1, int R2, int C2){

       //First Half
       //(1,1)->(30,60)
       int indexR1=R1;
       int indexC1=C1;
       int indexR2=(R1+R2)/2;
       int indexC2=C2;
       //Now Ask How many 1's present in first element
       int reply=0;
       System.out.println(1+" "+indexR1+" "+indexC1+" "+indexR2+" "+indexC2);
       System.out.flush();
       reply=sc.nextInt();
       if (reply==0){
           //do nothing and move to next half
           int SecondHalfIndexR1=indexR2+1;
           int SecondHalfIndexC1=C1;
           int SecondHalfIndexR2=len;
           int SecondHalfIndexC2=C2;
           len=len/2;
           deepBinaryTracking(sc,grader-reply,len,SecondHalfIndexR1,SecondHalfIndexC1,SecondHalfIndexR2,SecondHalfIndexC2);
       }
       else if (reply==(len)*(len)){
           // Just put all the values in it as 1 and move to next half
       }
       else{
           //If all your content is in this half then no need to go in next half
           if (grader==reply){
               //No need to go in the next half
           }else{
               // go in the next half also
           }
       }

   }

    public static void main(String[] args) throws java.lang.Exception{
        // write your code here
        //Your marks will depend on number of queries you asked and not in memory efficiency or time optimization

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();   //which value is 2
        while (t-->0){
            int len=sc.nextInt();   //which value is 60
            int P=sc.nextInt();    //which value is 2 most often; after doing 2 only you have to reply your matrix.
            int q=5*len*len;


            int[][] arr=new int[len+1][len+1];
            int X=-1;


            //First query to ask for whole matrix
            int grader=0;
            System.out.println(1+" "+1+" "+1+" "+len+" "+len);
            System.out.flush();
            grader=sc.nextInt();
            //First Base Case --> If  none positive case is present
            if (grader==0){
                System.out.println(2);
                for (int i=1;i<=len;i++){
                    for (int j=1;j<=len;j++){
                        System.out.print(arr[i][j]+" ");
                        System.out.flush();
                    }
                    System.out.println();
                    System.out.flush();
                }
                X=sc.nextInt();
                if (X==1 ){
                    continue; // means go for next testcase //of course this will always return continue
                }else{
//                    System.out.println("You said non positive still giving wrong reply");
                }
            }
            //Second Base Case --> If all the case is positive
            else if (grader==(len*len)){
                System.out.println(2);
                for (int i=1;i<=len;i++){
                    for (int j=1;j<=len;j++){
                        System.out.print(1+" ");
                        System.out.flush();
                    }
                    System.out.println();
                    System.out.flush();
                }
                X=sc.nextInt();
                if (X==1 ){
                    continue; // means go for next testcase //of course this will always return continue
                }else{
//                    System.out.println("You said all positive still getting wrong reply");
                }
            }
            //Real Coding Starts
            else{

                deepBinaryTracking(sc,grader,len,1,1,60, 60);
            }



            //Now after we are done we can print our answer
            System.out.println(2);
            for (int i=1;i<=len;i++){
                for (int j=1;j<=len;j++){
                    System.out.print(arr[i][j]+" ");
                    System.out.flush();
                }
                System.out.println();
                System.out.flush();
            }
            X=sc.nextInt();
            if (X==1 ){
                continue; // means go for next testcase //of course this will always return continue
            }else{
//                    System.out.println("You said non positive still giving wrong reply");
            }

        }
    }
}
