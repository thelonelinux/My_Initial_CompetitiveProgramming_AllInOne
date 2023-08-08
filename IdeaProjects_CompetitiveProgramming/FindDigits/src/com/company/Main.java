package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int n=12;


        String s=Integer.toString(n);
//         String.valueOf(int);n;

//        System.out.println(s);


        int[] arr=new int[s.length()];

//      int num=0;
        int i=0;


        while (n!=0){
             int num=n%10;
            arr[i]=num;
            i++;
            num=0;
            n=n/10;
        }

//        for (int m=0;m<arr.length;m++){
//            System.out.println(arr[m]);
//        }

         n=12;


        int count=0;
        for (int j=0;j<arr.length;j++){
            if (arr[j]!=0){
                if (n%arr[j]==0){
                    count =count+1;
                }
            }

        }

        System.out.println( count);
    }
}
