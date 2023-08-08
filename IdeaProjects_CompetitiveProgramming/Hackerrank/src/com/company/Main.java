package com.company;

import java.util.*;

public class Main {

    public static List<Integer> stringAnagram(List<String> dictionary, List<String> query) {
        // Write your code here
        List<String> newDictionary=new ArrayList<String>();
        for(int i=0;i<dictionary.size();i++){
            char[] in=dictionary.get(i).toCharArray();
            Arrays.sort(in);
            String string=new String(in);
            newDictionary.add(string);
        }

        List<String> newQuery=new ArrayList<String>();
        for(int i=0;i<query.size();i++){
            char[] in=query.get(i).toCharArray();
            Arrays.sort(in);
            String string=new String(in);
            newQuery.add(string);
        }
        Map<String,Integer> stored=new HashMap<String, Integer>();
        for (int i=0;i<newDictionary.size();i++){
            if (stored.containsKey(newDictionary.get(i))){
                int value=stored.get(newDictionary.get(i));
                stored.replace(newDictionary.get(i),++value);
            }else{
                stored.put(newDictionary.get(i),1);
            }
        }


        List<Integer> ans=new ArrayList<Integer>();
        for(int i=0;i<query.size();i++){
            if (stored.get(newQuery.get(i))==null){
                ans.add(0);
            }else{
                ans.add(stored.get(newQuery.get(i)));
            }


        }
        return ans;


    }


    public static void main(String[] args) {
	// write your code here

        List<String> dictionary= new ArrayList<>();
        dictionary.add("boy");
        dictionary.add("yob");
        dictionary.add("girl");
        dictionary.add("hello");

        List<String> query=new ArrayList<>();
        query.add("byo");
        query.add("griil");

        List<Integer> ans=new ArrayList<>();
        ans=stringAnagram(dictionary,query);

        for (int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }
    }
}
