package com.company;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

//import dp.Main.PrimsPair;

public class Main {

    /** here we have made our own input method . the fastest method in java
    */


    public static int lowerBound(long[] array, int length, long value) {
        int low = 0;
        int high = length;
        while (low < high) {
            final int mid = (low + high) / 2;
            if (value <= array[mid]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        // TODO Auto-generated method stub

        FastReader sc = new FastReader();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner scn = new Scanner(System.in);
        // PrintWriter pr = new PrintWriter(new BufferedWriter(new
        // OutputStreamWriter(System.out)));
        // long arr[]=new long[5000];
        // for(int i=0;i<5000;i++)


        //Our input for number of testcase
        int t = sc.nextInt();


        for (int p = 0; p < t; p++) {

            //Enter the length of the size of array of your pth test case;
            int n = sc.nextInt();
            long[] ch = new long[760001];  //the size of the Array is the constraint given;
            HashSet<Integer>h=new HashSet<>();

            /**Enter the number with spaces or with enter , it won't matter
            //Here you will enter the array element and we will put them in HashSet
            //HashSet will add them in sorted manner and no duplications*/
            for (int i = 1; i <=n; i++) {
                int x = sc.nextInt();
                h.add(x);

            }
//System.out.println(h);


            for (int i = 1; i <= 750010; i++) {
                if (h.contains(i)==false)continue;
                {
                    ch[i]++;
                    for (int j = (int) i*2; j <= 750010; j += i) {
                        if (h.contains(j)) {
                            ch[j]=ch[i]+ch[j];
                            //	System.out.println(j+" "+i);
                        }
                    }
                }
            }
            long sum = 0;
            for (int i = 1; i <= 750010; i++)
                sum = (sum + ch[i]) % 1000000007;
            System.out.println(sum);
        }

    }
}
