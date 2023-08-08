package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] h=new int[]{1,3,1,4,5,1,4,2,3,1,6,1,2,5,6,4,1,2,3,2,1,2,3,2,1,1};

        Map<Character, Integer> map = new HashMap<>();
        map.put('a',h[0]);
        map.put('b',h[1]);
        map.put('c',h[2]);
        map.put('d',h[3]);
        map.put('e',h[4]);
        map.put('f',h[5]);
        map.put('g',h[6]);
        map.put('h',h[7]);
        map.put('i',h[8]);
        map.put('j',h[9]);
        map.put('k',h[10]);
        map.put('l',h[11]);
        map.put('m',h[12]);
        map.put('n',h[13]);
        map.put('o',h[14]);
        map.put('p',h[15]);
        map.put('q',h[16]);
        map.put('r',h[17]);
        map.put('s',h[18]);
        map.put('t',h[19]);
        map.put('u',h[20]);
        map.put('v',h[21]);
        map.put('w',h[22]);
        map.put('x',h[23]);
        map.put('y',h[24]);
        map.put('z',h[25]);

        String word = "abc";

        int len=word.length();

        int[] arr = new int[len];

        for (int i=0;i<word.length();i++){
            arr[i]=map.get(word.charAt(i));
        }

        Arrays.sort(arr);

        int max=arr[word.length()-1];



        int pdf=max*len;


        System.out.println(pdf);


        //       int n=map.get(word.charAt(0));
//        int p=map.get(word.charAt(1));
//        int q=map.get(word.charAt(2));

//        int max=Math.max(n,p);
//        int max2=Math.max(max,q);

//        String word="aba";

//        Scanner scanner = new Scanner(System.in);
//
//        int n=scanner.nextInt();
//
//        char[] word = new char[n];
//
//        for (int i=0;i<word.length;i++){
//            word[i] = scanner.next();
//        }




//        System.out.println(map.get("a"));



//        int len=word.length();
//
//        //97-->0 index for in h;
//
//        char[] chars=new char[word.length()];
//
//
//        for (int i=0;i<chars.length;i++){
//            chars[i]=word.charAt(i);
//
//        }
//
//        char[] char2 = new char[word.length()];
//        int[] max = new int[word.length()];
//
//       for (int i=0;i<word.length();i++){
//           max[i]= Character.highSurrogate(word.charAt(i));
////           max[i]=map.get(word.charAt(i));
//       }
//
//        Arrays.sort(max);
////
////       int n=map.get("a");
////       System.out.println(n);
//
//       int maxNum=max[max.length-1];
//       int ans=maxNum*word.length();
//       System.out.println(ans);

    }
}
