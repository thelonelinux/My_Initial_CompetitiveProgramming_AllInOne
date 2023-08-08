package com.company;

public class Main {





    static int compare(String string, String subString){

        if(string.equals(subString)){
            return string.length();
        }
        int count=0;

        for (int i=0;i<subString.length();i++){

            if (subString.charAt(i)==string.charAt(i)){
                count++;
            }
            else {
                break;
            }
        }

        return count;

    }

    public static void main(String[] args) {
	// write your code here

        String str="ababbaaa";


        for(int i=0;i<str.length();i++){

            String sub=str.substring(i,str.length());

            System.out.print(sub+" ");

            System.out.println(compare(str,sub));
        }



    }
}
