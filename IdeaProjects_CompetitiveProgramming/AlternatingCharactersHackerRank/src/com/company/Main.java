package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String str="AAABBB";

        Stack<Character> stack=new Stack<>();

        int countDelete=0;

        for(char c : str.toCharArray()){

            switch (c)
            {
                case 'A':

                    if(!stack.isEmpty()) {

                        if (stack.peek() == 'A') {
                            countDelete++;
                        } else {
                            stack.push('A');
                        }
                    }
                    else {
                        stack.push('A');
                    }
                        break;


                case 'B':
                    if(!stack.isEmpty()) {
                        if (stack.peek() == 'B') {
                            countDelete++;
                        } else {
                            stack.push('B');
                        }
                    }
                    else {
                        stack.push('B');
                    }
                    break;



            }
        }

        System.out.println(countDelete);
    }
}
