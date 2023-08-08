package com.company;

import java.util.Scanner;

 class Solution {

    static void findWaitingTime(int processes[], int n,int bt[], int wt[], int quantum) {
        int rem_bt[] = new int[n];
        for (int i = 0 ; i < n ; i++)
            rem_bt[i] = bt[i];

        int t = 0; // Current time
        while(true) {
            boolean done = true;

            for (int i = 0 ; i < n; i++) {

                if (rem_bt[i] > 0)
                {
                    done = false; // There is a pending process

                    if (rem_bt[i] > quantum) {

                        t += quantum;
                        rem_bt[i] -= quantum;
                    }
                    else {
                        t = t + rem_bt[i];
                        wt[i] = t - bt[i];
                        rem_bt[i] = 0;
                    }
                }
            }
            if (done == true) {
                break;
            }
        }
    }

    static void findTurnAroundTime(int processes[], int n,int bt[], int wt[], int tat[]) {

        for (int i = 0; i < n ; i++) {
            tat[i] = bt[i] + wt[i];
        }
    }

    static void findavgTime(int processes[], int n, int bt[],int quantum) {
        int wt[] = new int[n], tat[] = new int[n];
        int total_wt = 0, total_tat = 0;

        findWaitingTime(processes, n, bt, wt, quantum);
        findTurnAroundTime(processes, n, bt, wt, tat);

        for (int i=0; i<n; i++) {
            total_wt = total_wt + wt[i];
            total_tat = total_tat + tat[i];
        }

        System.out.println((float)total_wt / (float)n);
    }


    public static void main(String[] args) throws java.lang.Exception{
        // process id's
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int[] arr=new int[len];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int[] runTime=new int[len];
        for (int i=0;i<arr.length;i++){
            runTime[i]=sc.nextInt();
        }

        int quantum = sc.nextInt();
        findavgTime(arr, len, runTime, quantum);
    }
}
