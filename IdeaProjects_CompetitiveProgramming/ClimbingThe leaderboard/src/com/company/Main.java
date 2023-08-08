package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int[] climbingLeaderboard(int[] scores, int[] alice) {

        //sorting the scoreboard
        Arrays.sort(scores);

        //removing the duplicates from the scoreboard
        int[] temp = new int[scores.length];

        int j = 0;

        for (int i = 0; i < scores.length - 1; i++) {

            if (scores[i] != scores[i + 1]) {
                temp[j++] = scores[i];
            }
        }
        temp[j++] = scores[scores.length - 1];

        //modifying new score board

        for (int i = 0; i < j; i++) {
            scores[i] = temp[i];
        }

        //finding the rank

        int[] ranks=new int[alice.length];

        int rank=0;

        for (int i=0;i<alice.length;i++){
            rank=1;
            for (int m=0;m<j;m++){
                if (alice[i]<scores[m]){
                    rank=rank+1;

                }
            }
            ranks[i]=rank;
        }

        return ranks;
    }

    public static void main(String[] args) {
        // write your code here

        int[] scores = new int[]{100, 100, 50, 40, 20, 10};

//        Arrays.sort(scores);
//
//
////        System.out.println("Before removal of duplicates : scoresayy :-");
////
////        for (int i = 0; i < scores.length; i++) {
////            System.out.print(scores[i] + " ");
////        }
////
////        System.out.println(" ");
////
////
////        System.out.println("After removing the duplicates : scoresay :-");
//
//        int[] temp = new int[scores.length];
//
//        int j = 0;
//
//        for (int i = 0; i < scores.length - 1; i++) {
//
//            if (scores[i] != scores[i + 1]) {
//                temp[j++] = scores[i];
//            }
//        }
//        temp[j++] = scores[scores.length - 1];
//
//        for (int i = 0; i < j; i++) {
//            scores[i] = temp[i];
//        }

//        for (int i = 0; i < j; i++) {
//            System.out.print(scores[i] + " ");
//        }
//        System.out.println(" ");


        //inputs;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of all the Alice's scores");

        int n = scanner.nextInt();

        int[] alice = new int[n];

        for (int i = 0; i < alice.length; i++) {
            alice[i]=scanner.nextInt();
        }

        int[] ans;

        ans=climbingLeaderboard(scores,alice);



        for (int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }

//        int[] ranks=new int[alice.length];
//
//        int rank=0;
//
//        for (int i=0;i<alice.length;i++){
//            rank=1;
//           for (int m=0;m<j;m++){
//               if (alice[i]<scores[m]){
//                   rank=rank+1;
//
//               }
//           }
//           ranks[i]=rank;
//        }

//        for (int i=0;i<ranks.length;i++){
//            System.out.println(ranks[i]);
//        }
    }
}
