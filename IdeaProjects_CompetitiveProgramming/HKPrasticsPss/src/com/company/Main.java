package com.company;

import com.sun.org.apache.xpath.internal.operations.Bool;

import javax.swing.plaf.IconUIResource;

public class Main {

    static int fairRations(int[] B) {

        if(isAllEven(B)){
            return 0;
        }
        int sum=0;
        for(int m=0;m<B.length;m++){
            sum=sum+B[m];
        }

        if(sum%2!=0){
            return -1;
        }
        int count=0;

        for(int i=0;i<B.length-1;i++){
            if(B[i]%2!=0){
                B[i]=B[i]+1;
                B[i+1]=B[i+1]+1;
                count++;
            }
        }
        return count;

    }

    static Boolean isAllEven(int[] B){

        for (int i=0;i<B.length;i++){
            if(B[i]%2!=0){
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {
	// write your code here

        int[] B={4,5,6,7};
/**
        int result = fairRations(B);
        if(result==-1)
            bufferedWriter.write("NO");
        else
            bufferedWriter.write(String.valueOf(result));
*/
        System.out.println(fairRations(B));
    }
}
