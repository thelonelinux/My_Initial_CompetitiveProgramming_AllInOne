package com.company;

import javax.xml.validation.SchemaFactoryLoader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    static String[] cavityMap(String[] grid) {

        if(grid.length<=2){
            return grid;
        }


        char[][] chars=new char[grid.length][];

        for(int v=0;v<grid.length;v++){

            chars[v]=grid[v].toCharArray();

        }

        for(int i=1;i<chars.length-1;i++){
            for(int j=1;j< chars.length-1;j++){

                if(chars[i][j]>chars[i+1][j]  && chars[i][j]>chars[i][j+1] && chars[i][j]>chars[i-1][j]  && chars[i][j]>chars[i][j-1]){
                    chars[i][j]='X';
                }

            }
        }

        String[] strings=new String[grid.length];
        for(int p=0;p<grid.length;p++){
            strings[p]=new String(chars[p]);
        }
        return strings;

    }

    public static void main(String[] args) {
	// write your code here

        String[] grid={"1112",
                      "1912",
                      "1892",
                      "1234"};

        String[] strings=cavityMap(grid);

        for(int i=0;i<strings.length;i++){
            System.out.println(strings[i]);
        }

//        char[][] chars=new char[grid.length][];
//
//        for(int i=0;i<grid.length;i++){
//
//            chars[i]=grid[i].toCharArray();
//
//        }
//
//        for (int m=0;m<chars.length;m++){
//            for(int n=0;n<chars.length;n++){
//                System.out.print(chars[m][n]+" ");
//            }
//            System.out.println("");
//        }
    }
}
