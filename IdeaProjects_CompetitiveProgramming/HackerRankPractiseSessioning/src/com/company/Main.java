package com.company;

public class Main {

    static int howManyGames(int p, int d, int m, int s) {
        int count=0;
        while (s>0  && s>=p){
            s=s-p;
            p=p-d;
            if(p<m){
                p=m;
            }
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
	// write your code here
        int p=100;
        int d=1;
        int m=1;
        int s=99;
        System.out.println(howManyGames(p,d,m,s));
    }
}
