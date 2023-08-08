package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    static String[] bigSorting(String[] unsorted) {

        //   Arrays.sort(unsorted);

        Arrays.sort(unsorted, (x, y) -> {
            if (x.length() == y.length()) {
                return x.compareTo(y);
            }

            return x.length() - y.length();
        });

        return unsorted;
    }



    public static void main(String[] args) {
	// write your code here

        String[] strings={"8",
                "1",
                "2",
                "100",
                "12303479849857341718340192371",
                "3084193741082937",
                "3084193741082938",
                "111",
                "200"};

       String[] ans=bigSorting(strings);

        Arrays.stream(ans).forEach(System.out::println);


    }
}
