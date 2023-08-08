package com.company;

public class Main {

    public static void main(String[] args) {

//        int x1=0;
//        int v1=3;
//        int x2=4;
//        int v2=2;

        int x1=0;
        int v1=2;
        int x2=5;
        int v2=3;

//        int n=0;
//
//        while ((x1+v1*n)!=(x2+v2*n)){
//            n++;
//
//
//        }
//
//        String yes="YES";
//        String no="NO";
//
//        if (n<0){
//            System.out.println("NO");
//        }
//        else{
//            System.out.println("YES");
//
//        }

//        int p=100;
//        String s="";
//
//        for (int i=0;i<p;i++)
//        {
//            s="";
//            if((x1+v1*p)==(x2+v2*p)){
//               s="YES";
//               break;
//            }
//            else {
//                s="NO";
//            }
//        }
//
//        System.out.println(s);




        int q=0;
        String s="";

        while (q<10000){
            s="";
            if((x1+v1*q)==(x2+v2*q)){
                s="YES";
                break;
            }
            else {
                s="NO";
            }
            q++;

        }
        System.out.println(s);





    }
}
