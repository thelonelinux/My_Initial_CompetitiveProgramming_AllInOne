package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static long mod=(long)1e9+7;

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);

        String string=sc.next();
        boolean ansGot=false;
        for (int i=0;i<string.length();i++){
            if (string.charAt(i)=='c' || string.charAt(i)=='k'){
                System.out.println(0);
                ansGot=true;
                break;
            }
        }

        if (ansGot==false){


            int numberOfGG=0;
            int numberOfFF=0;
            List<Integer> list=new ArrayList<>();

            for (int i=0;i<string.length();i++){

                if (string.charAt(i)=='f'){
                    numberOfFF++;
                }

                if (string.charAt(i)=='g'){
                    numberOfGG++;
                }

                if (numberOfFF>=2 && string.charAt(i)!='f'){
                    if (numberOfFF==2){
                        list.add(numberOfFF);
                    }else{
                        int maximumPossiblePairs=numberOfFF/2;
                        long sum=0;
                        while (maximumPossiblePairs-->0){
                            sum=sum+
                        }
                    }

                    numberOfFF=0;
                }

                if (numberOfGG>=2 && string.charAt(i)!='g'){
                    list.add(numberOfGG);
                    numberOfGG=0;
                }

                if (numberOfFF==1 && string.charAt(i)!='f'){
                    numberOfFF=0;
                }
                if (numberOfGG==1 && string.charAt(i)!='g'){
                    numberOfGG=0;
                }

            }

            //At end also we may reach without storing it so check if there is some to store then store

            if (numberOfFF>=2){
                list.add(numberOfFF);
            }
            if (numberOfGG>=2){
                list.add(numberOfGG);
            }
            long ans=1;
            for (int i=0;i<list.size();i++){
                ans=(((ans)%mod)*((list.get(i))%mod)%mod);
            }

            System.out.println(ans);


        }
    }
}
