package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String str="Pork";

        String myStringArray[][] = {{"Apple", "Banana"}, {"Pork", "Beef"} };

        for(int i=0;i<myStringArray.length;i++){
            for(int j=0;j<myStringArray[i].length;j++){
                if(str.equals(myStringArray[i][j])){
                    System.out.println("Ok it matches "+myStringArray[i][j]);
                    break;
                }
            }
        }
    }
}
