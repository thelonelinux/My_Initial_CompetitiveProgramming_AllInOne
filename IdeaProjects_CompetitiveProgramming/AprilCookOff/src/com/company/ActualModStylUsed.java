package com.company;

import java.util.Scanner;

public class ActualModStylUsed {

    static long mod=1000000000+7;
    static long power(long x, long y)
    {
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

    public static void main(String[] args)  {
        // write your code here

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){

            long size=sc.nextLong();
            long a=sc.nextLong();
            long odd=1;
            long ans=power(a,1)%mod;
             a=(ans%mod)*(a%mod);
            for (int i=1;i<size;i++){
                odd=odd+2;
                long p=power(a,odd);
                ans=(ans+p)%mod;
                a=((p%mod)*(a%mod))%mod;
            }

            System.out.println(ans);

        }

    }
}
