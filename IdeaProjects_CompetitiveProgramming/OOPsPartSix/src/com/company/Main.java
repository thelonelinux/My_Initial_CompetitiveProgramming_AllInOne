package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Pair<String> pair = new Pair<>();

        pair.first="vicky";

        System.out.println(pair.first);



        Pair<Integer> pair1=new Pair<>();

        pair1.first=212;

        System.out.println(pair1.first);



        //multi type parameters

        MultiPair<String,Integer> multiPair=new MultiPair<>();

        multiPair.first="hello";

        multiPair.second=124;

        System.out.println(multiPair.first+multiPair.second);
    }
}
