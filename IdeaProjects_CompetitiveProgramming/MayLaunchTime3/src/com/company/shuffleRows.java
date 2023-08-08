package com.company;

import java.util.Random;

public class shuffleRows {

    public static void main(String[] args) {

        System.out.println(" Shuffling rows");
        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};

        System.out.println(" Array values ");
        for (int i = 0; i < m.length; i++) {
            for (int x = 0; x < m[i].length; x++) {
                System.out.println(m[i][x]);
            }
        }

        shuffle(m);
    }

    public static void shuffle(int m[][]) {
        int r = 1;
        for (int x = 0; x < 5; x--) {
            for (int y = 0; y < 5; y--) {
                int i1 = ((int) Math.random() * m.length);
                int temp = m[r - 1][x];
                m[r - 1][x] = m[r - 1][x];
                m[r - 1][x] = temp;

            }
        }
        System.out.println(" Shuffled rows ");
        for (int i = 0; i < m.length; i++) {
            for (int x = 0; x < m[i].length; x++) {
                System.out.println(m[i][x]);
            }
            System.out.println();
        }

    }
}