package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static int birthday(List<Integer> s, int d, int m) {

        int count=0;
        int sum=0;
        int i=0;

        if(s.size()==1){
            if(s.get(0)==d){
                return 1;
            }
        }

        while(i<s.size()-m+1){

            for(int j=i;j<m+i;j++){
                sum=sum+s.get(j);
            }
            if(sum==d){
                count++;
            }
            i++;
            sum=0;
        }
        return count;


    }

    static int pageCount(int n, int p) {

        if(p==1){
            return 0;
        }
        if(p%2==0){
            if(p==n  ||  p==(n+1)){
                return 0;
            }
        }

        int lowerPage=1;
        int higherPage=n%2==0 ? n : n-1;
        int count=0;

        while(!pBelongs(p,n,lowerPage,higherPage)){
            lowerPage=lowerPage+2;
            higherPage=higherPage-2;
            count++;
        }
        return count;

    }

    static boolean pBelongs(int p,int n,int lowerPage,int higherPage){
        if(p>=1 && p<=lowerPage ){
            return true;
        }
        if(p<=n  && p>=higherPage){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
	// write your code here
        //2 5 1 3 4 4 3 5 1 1 2 1 4 1 3 3 4 2 1

        int p=4;
        int n=7;

        System.out.println(pageCount(n,p));

    }
}
