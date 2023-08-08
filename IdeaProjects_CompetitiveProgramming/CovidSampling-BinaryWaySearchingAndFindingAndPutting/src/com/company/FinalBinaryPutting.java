package com.company;

import java.util.Scanner;

public class FinalBinaryPutting {
    static int total;

    public static void fillAll1InRange(int R1,int C1, int R2, int C2, int[][] arr){
        for (int i=R1;i<=R2;i++){
            for (int j=C1;j<=C2;j++){
                arr[i][j]=1;
            }
        }
    }

    public static void findAll(int len, Scanner sc, int R1, int C1, int R2, int C2, int total, int grade,int[][] arr){

        System.out.println(1+" "+R1+" "+C1+" "+R2+" "+C2);
        System.out.flush();
        System.out.println(total);
        System.out.flush();
         int newGrade=sc.nextInt();
//        if (total==grade && grade==(R2-R1+1)*(C2-C1+1)){
//            fillAll1InRange(R1,C1,R2,C2,arr);
//            return;
//        }
//         if(total==0){
//            //Fill All Zero in Range (Means do nothing) and we have found all the 1's so return
//            return;
//        }
        int newTotal=total;
        if (newTotal==0){
            return;
        }
         if (newGrade==(R2-R1+1)*(C2-C1+1) || grade==(R2-R1+1)*(C2-C1+1)){
             newTotal=newTotal-newGrade;
            fillAll1InRange(R1, C1, R2, C2, arr);
            return;
         }

         if (grade==0 || newGrade==0){
             return;
         }
        if (total==0){
            return;
        }

        //Separate Condition

        if (R1==R2){
            //Means we've reached to specific row so now check their
//            if (C2>C1){
//                return;
//            }
            findAll(len, sc, R1, C1, R2, (C2+C1)/2, newTotal, newGrade, arr);   //First Half
            findAll(len, sc, R1, (C2+C1)/2+1, R2, C2, newTotal, newGrade, arr);   //Second Half
        }


        findAll(len, sc, R1, C1, (R2+R1)/2, C2, newTotal, newGrade, arr); //First Half
        findAll(len, sc, R2/2+1, C1, R2, C2, newTotal, newGrade, arr);  //Second Half
    }

    public static void main(String[] args) throws java.lang.Exception{

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();   //which value is 2
        while (t-->0){
            int len=sc.nextInt();   //which value is 60
            int P=sc.nextInt();    //which value is 2 most often; after doing 2 only you have to reply your matrix.
            int q=5*len*len;

            int[][] arr=new int[len+1][len+1];
            int X=-1;


            System.out.println(1+" "+1+" "+1+" "+len+" "+len);
            System.out.flush();
            total=sc.nextInt();
            int grade=total;

            findAll(len,sc,1,1,len,len,total,grade,arr);

//            findAll(len,sc,1,1,len/2,len,total,total,arr);
//            findAll(len,sc,len/2+1,1,len,len,total,total,arr);

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
                continue;
            }else{
            }


        }
    }
}
