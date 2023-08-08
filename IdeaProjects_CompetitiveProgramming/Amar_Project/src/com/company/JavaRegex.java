package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

public class JavaRegex {

    public static void main(String[] args) throws java.lang.Exception{
        // write your code here

        System.out.println("####################################### Finding Word Frequency   ##########################################################3");

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of lines of sentence you want to add : ");
        int n =s.nextInt(),temp=n;
        s.nextLine();
        Vector<String[]> svec = new Vector<String[]>();
        System.out.println("Enter your sentences");
        while(temp--!=0){
            String str = s.nextLine();
            String arr[] = str.split("[\\s | . | , | ! | ? | ;  | : | @ |  * |']+");
            svec.add(arr);
            // s.nextLine();
        }
        Map<String, Integer> map=new HashMap<>();
        Map<Character,Integer> characterMap=new HashMap<>();
        for(int i=0;i<n;i++){
            String[] arr = svec.get(i); /** getting nth line*/
            int len = arr.length;

            for(int j=0;j<len;j++){  /** traversing each line to find word frequency */

                if (!map.containsKey(arr[j])){
                    map.put(arr[j],1);
                }
                else{
                    int previousValue=map.get(arr[j]);
                    int newValue=previousValue+1;
                    map.replace(arr[j],previousValue,newValue);
                }
            }


            for (int k=0;k<len;k++){  /** Looking for each character frequency*/

                String character=arr[k];
                for (int l=0;l<character.length();l++){

                    if (!characterMap.containsKey(character.charAt(l))){
                        characterMap.put(character.charAt(l),1);
                    }
                    else{
                        int previousValue=characterMap.get(character.charAt(l));
                        int newValue=previousValue+1;
                        characterMap.replace(character.charAt(l),previousValue,newValue);
                    }

                }

            }
        }

        for (Map.Entry<String,Integer> entry: map.entrySet()){
            String word=entry.getKey();
            Integer value=entry.getValue();
            System.out.println("word <"+word+"> is present <"+value+"> times");
        }


        System.out.println();
        System.out.println("#######################################Finding the frequency of character in the given sentence##########################################################3");
        for (Map.Entry<Character,Integer> entry: characterMap.entrySet()){
            Character character=entry.getKey();
            Integer value=entry.getValue();
            System.out.println("Character <"+character+"> is present <"+value+"> times ");
        }

    }
}
