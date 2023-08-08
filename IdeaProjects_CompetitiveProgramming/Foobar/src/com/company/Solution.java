package com.company;

public class Solution {

    public static int solution(String x) throws java.lang.Exception {
        //testCase when it contains all same element
        char ch = x.charAt(0);
        boolean bool = false;
        for (int j = 1; j < x.length(); j++) {
            if (ch == x.charAt(j)) {
                bool = true;
            } else {
                bool = false;
                break;
            }
        }
        if (bool) {
            return 1;
        }

        for (int i = 0; i < x.length() / 2; i++) {

            String sub = x.substring(0, i + 1);
            int len = sub.length();
            char c = x.charAt(i + 1);

            if (sub.charAt(0) == c) {
                //Number of that substring that may present in the whole string
                int loops = x.length() / len;

                //it's possible that len is not divisor of string length so it will leave some leftover
                int mod = x.length() % sub.length();

                if (mod == 0) {
                    //Means it is a divisor so it may contain all substring similar and also it may won't contain

                    //so lets check for each loop substring
                    //So the substring to be check after each iteration
                    int begin = i + 1;
                    int end = i + 1 + len;
                    boolean ok = true;

                    while (loops-- > 0) {
                        String toBeChecked = x.substring(begin, end);
                        if (sub.equals(toBeChecked)) {
                            ok = true;
                        } else {
                            ok = false;
                            break;
                        }
                        begin = begin + len;
                        end = end + len;

                    }

                    //Now after checking all the substring in loops
                    //if ok remains true then
                    if (ok) {
                        return loops;
                    } else {
                        //Do further checking
                        break;
                    }
                }
            }
        }
        return 1;
    }

    public static void main(String[] args) throws java.lang.Exception {

        System.out.println(solution("ababefab"));
        System.out.println(solution("ababeababe"));
        System.out.println(solution("ababefabef"));
        System.out.println(solution("ababe"));
        System.out.println(solution("abab"));
        System.out.println(solution("ababc"));
        System.out.println(solution("abcabcabcabc"));
        System.out.println(solution("abccbaabccba"));

    }


}
