package com.company;

import java.util.Scanner;

public class Codechef {


        public  static long power(long x, long y) {
            long m1= 1000000007;
            long n= y;
            if(x==0)
                return 0;
            long ans= x;
            long tot=1;
            while(n>0)
            {
                if(n%2==1)
                    tot= (tot*ans)%m1;
                ans= (ans*ans)%m1;
                n=n>>1;
            }
            return tot%m1;
        }

        public static void main (String[] args) throws java.lang.Exception {
            Scanner scan = new Scanner(System.in);
            long m = 1000000007;
            int t = scan.nextInt();
            for(int T=0;T<t;T++)
            {
                long sum=0;
                int n = scan.nextInt();
                long a1 = scan.nextLong();
                long a= a1;
                if(a==0)
                    System.out.println(0);
                else if(a==1)
                    System.out.println(n);
                else
                {
                    long p1=1;
                    long ans=0;
                    for(int i=1;i<=n;i++)
                    {
                        long k = ((2*i)-1);

               /* for(int i1=0;i1<k;i1++)
                    p1= ((p1%m)*(a%m))%m;*/
                        long p = power((a),(k));
                        ans= ((ans)+p)%m;
                        a = ((a%m)*(p%m))%m;

                    }
                    System.out.println(ans);
                }
                //511620149
            }

        }
}
