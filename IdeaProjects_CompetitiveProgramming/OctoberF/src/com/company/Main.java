package com.company;

import com.sun.org.apache.xml.internal.serializer.utils.SerializerMessages_zh_CN;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        try {
            Scanner sc = new Scanner(System.in);


            int t = sc.nextInt();

            while (t-- > 0) {

                int input = sc.nextInt();

                Integer integer = input;

                String str = integer.toString();

                String ans = "";

                for (int i = 0; i < str.length() - 1; i++) {
                    int point = (int) str.charAt(i) ^ (int) str.charAt(i + 1);
                    ans += point;
                }

                ans += (int) str.charAt((str.length() - 1)) ^ (int) str.charAt(0);

                if (str.length() == 1) {
                    System.out.println(input);
                } else {
                    System.out.println(ans);

                }
            }
        }catch (Exception e){
            return;
        }
    }
}
