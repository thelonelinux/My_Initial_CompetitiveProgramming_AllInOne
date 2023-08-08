package com.company;

import java.util.Scanner;

public class Sameline {

    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        try {
            Scanner sc=new Scanner(System.in);
            int tc;
            tc=sc.nextInt();
            while((tc--)>0)
            {
                int tot=0,cnt=0,i=0,j,n,cntm=0;
                n=sc.nextInt();
                String s=sc.next();
                if(s.contains("1"))
                {
                    while(s.charAt(i)!='1')
                    {
                        cnt++;
                        i++;
                    }
                    if(cnt>1)
                        tot+=cnt-1;
                    j=n-1;
                    cnt=0;
                    while(s.charAt(j)!='1')
                    {
                        cnt++;
                        j--;
                    }
                    if(cnt>1)
                        tot+=cnt-1;
                    for(;i<=j;i++)
                    {
                        if(s.charAt(i)=='0')
                        {
                            cntm++;
                            //System.out.print(cntm+", ");
                        }
                        else
                        {
                            // System.out.print(cntm+",");

                            if(cntm>2)
                            {
                                tot+=cntm-2;
                            }
                            cntm=0;
                        }
                    }
                    if(cntm>2)
                    {
                        tot+=cntm-1;
                    }
                }
                else
                {
                    tot=n;
                }
                System.out.println(tot);
            }
        } catch(Exception e) {
        } finally {
        }
    }
}


