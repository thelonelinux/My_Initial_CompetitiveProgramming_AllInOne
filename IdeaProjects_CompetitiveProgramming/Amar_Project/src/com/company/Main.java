package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws java.lang.Exception{
	// write your code here

        System.out.println("####################################### Finding Word Frequency   ##########################################################3");

        /** Finding Word Frequency    */
        String[] arr={"Apple", "Boy", "Cat", "Dog", "Elephant" , "Apple"};


        Map<String, Integer> map=new HashMap<>();
        for (int i=0;i<arr.length;i++){
            if (!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else{
                int previousValue=map.get(arr[i]);
                int newValue=previousValue+1;
                map.replace(arr[i],previousValue,newValue);
            }
        }

        for (Map.Entry<String,Integer> entry: map.entrySet()){
            String word=entry.getKey();
            Integer value=entry.getValue();
            System.out.println("word "+word+" is present "+value+" times");
        }

        System.out.println();
        System.out.println("#######################################Finding the frequency of character in the string##########################################################3");


        /** Finding the frequency of character in the string*/
        String character="abcdefsdfaadfsrdb";

        Map<Character,Integer> characterMap=new HashMap<>();
        for (int i=0;i<character.length();i++){
            if (!characterMap.containsKey(character.charAt(i))){
                characterMap.put(character.charAt(i),1);
            }
            else{
                int previousValue=characterMap.get(character.charAt(i));
                int newValue=previousValue+1;
                characterMap.replace(character.charAt(i),previousValue,newValue);
            }
        }

        for (Map.Entry<Character,Integer> entry: characterMap.entrySet()){
            Character character1=entry.getKey();
            Integer value=entry.getValue();
            System.out.println("Character "+character1+" is present "+value+" times in the string "+character);
        }

    }
}
