package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
	// write your code here

        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int t=Integer.parseInt(br.readLine());
            while (t-->0){
                String lines=br.readLine();
                String[] str=lines.trim().split("\\s+");
                long x=Long.parseLong(str[0]);
                long y=Long.parseLong(str[1]);
                long l=Long.parseLong(str[2]);
                long r=Long.parseLong(str[3]);

                long p = (long)(Math.log(r) / Math.log(2));
                long ans=(long)Math.pow(2, p);

                if (ans<=r && ans>=l) {
                    System.out.println(ans - 1);
                }else{
                    System.out.println(-1);
                }
//                 else{
//                    long max=0;
//                    long answer=0;
//                    for (long z=l;z<=r;z++){
//                        long sum=(x&z)*(y&z);
//                        if (sum>max){
//                            max=sum;
//                            answer=z;
//                        }
//                    }
//                    System.out.println(answer);
//                }
            }

        }catch (Exception e){
            return;
        }

    }
}
