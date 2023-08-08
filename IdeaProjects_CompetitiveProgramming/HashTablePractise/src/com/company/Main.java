package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        String[] magazines={"ive", "got", "a", "lovely", "bunch" ,"of" ,"coconuts"};
//        String[] note={"ive", "got", "some", "coconuts",};
//
//        Hashtable<Integer, String> hs=new Hashtable<>();
//
//        for (int i=0;i<magazines.length;i++){
//            hs.put(i,magazines[i]);
//        }
//
//        int count=0;
//        for(int j=0;j<note.length;j++){
//            if(hs.contains(note[j])){
//                count++;
//            }
//        }
//        if(count==note.length){
//            System.out.println("Yes");
//        }
//        else{
//            System.out.println("No");
//        }=



        List<Integer> list =new ArrayList<>();

        list.add(5);
        list.add(7);
        list.add(8);
        list.add(1);
        list.add(2);




        Collections.sort(list);

//        list.forEach(System.out::println);
        list.clear();
        list.forEach(System.out::println);






    }
}
