package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    //This is actual answer but it's going TLE in range(l,r)
    static long realAndLongMethod(long x,long y,long l, long r){
        long max=0;
        long answer=0;
        for (long z=l;z<=r;z++){
            long sum=(x&z)*(y&z);
            if (sum>max){
                max=sum;
                answer=z;
            }
        }
        System.out.print("Real Max=> "+max+" ");
        if (answer==0){
            return l;
        }else {
            return answer;
        }
    }

    //This is already assumed answer that the answer must be the max possible (2^n-1) present in range(l,r)
    static long logarithmicAnswerOnly(long x,long y,long l, long r){
        long p = (long)(Math.log(r) / Math.log(2));
        long ans=(long)Math.pow(2, p);
        long finalAns=ans-1;
        long max=(x&finalAns)*(y&finalAns);

        if (ans<=r && ans>=l) {
            System.out.print("Logarithmic max(if contains 2^n-1 in its range)=>" + max+" ");
            return (ans - 1);
        }else{
            System.out.print("Not any (2^n-1) term in it ");
            return -1;
        }
    }

    //This is to be used when range lies from Range(0,Xor of x and y)
    // In this approach we have taken out the xor value and then subsequently reducing left and right bits from 1 to 0
    // And then checking for all these values whose value is maximum
    static long xoredAnswer(long x,long y,long l, long r){

        long main=x | y;
        String xored=Long.toBinaryString(main);

        List<Long> list=new ArrayList<>();
        list.add(main);

        //turning off the right most set bit to zero
        long mainValue=main;
        for (long i=0;i<xored.length();i++){
            long value=mainValue&(mainValue-1);
            String str2=new String();
            str2=Long.toBinaryString(value);
//                    System.out.println(str2+ " It's value is "+value);
            list.add(value);
            mainValue=value;
            if (value==0){
                break;
            }
        }
        //for turning off the left most set bit to zero
        for (int i=0; i<xored.length()-1;i++){
            if (xored.charAt(i)=='1'){
                String str=new String();
                str=xored.substring(i+1,xored.length());
                long decimal=Integer.parseInt(str,2);
                list.add(decimal);
//                        System.out.println("New String " + str+ " Value is "+ decimal);
            }
        }
        Collections.sort(list);

        List<Long> newList=new ArrayList<>();
        for (int i=0;i<list.size();i++){
            if (list.get(i)>=l && list.get(i)<=r){
                newList.add(list.get(i));
            }
        }
//                System.out.println("Other way");
        long max=0;
        long ans=0;
        for (int i=0;i<newList.size();i++){
            long sum=(x&newList.get(i))*(y&newList.get(i));
            if (sum>max){
                ans=newList.get(i);
            }
        }
        if (ans==0){
            System.out.print("It's not range between R(0,x xored y) ");
            return -1;
        }else{
            long finalAns=(x&ans)*(y&ans);
            System.out.print("xored max=>"+finalAns);
            return ans;
        }


    }

    //This will work for only case if l=0;
    static long logarithmicJustWithin(long x,long y,long l, long r){
        double pow=1;
        long ans=0;
        int i=1;
        long main=x|y;
        long min=Math.min(main,y);
        if (x==0 || y==0){
            System.out.print("Logarithmic Within answer "+0);
            return 0;
        }else if (l==0 ){
            while (pow<=min){
                pow=Math.pow(2,i);
                i++;
            }
            ans=(long)Math.pow(2,i-2);
            long power=ans-1;
            long max=(x&power)*(y&power);
            System.out.print("Logarithmic max (if l=0) "+max);
            return ans-1;
        }
         return 0;
    }

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

                //Here even xored is not promising even by removing the bits from left or right even if you put l=0;
                //logarithmic is only for few cases

                System.out.println("Real=>"+realAndLongMethod(x,y,l,r));
                System.out.println("########################################################################3");
//                System.out.println("Logarithmic=>"+logarithmicAnswerOnly(x,y,l,r));
//                System.out.println("########################################################################3");
                System.out.println(" Xored=>"+xoredAnswer(x,y,l,r));
//                System.out.println("########################################################################3");
//                System.out.println(" Logarithmic(if l=0)=>"+logarithmicJustWithin(x,y,l,r));
                System.out.println("########################################################################3");
                System.out.println("Case when xoring x and y gives the xored value and it lies in the range R(l,r) then ans is xored only ");
                long xored=x|y;
                if (xored>=l && xored<=r){
                    System.out.println("So here Ans is xored only "+xored);
                }

                /**     Case-1: if x=0 and y=0
                 *                 -> The resultant bitwise and and product will be always zero in the given range
                 *                 -> So just print the smallest of the given range i.e. "r"
                 *
                 *     Case-2: if l=0 and r be anything
                 *                 -> Mostly we've seen any number with (2^n-1) which is the max possible power of 2 in given range is the answer
                 *                 -> No it's not the answer.
                 *
                 *                 BUT:
                 *                 for the case: When x=1 and y=50
                 *                          -> Whose XOR value is 51
                 *                              ->If Range(0,100)        =>Answer is 51
                 *                              ->If Range(0,30)         =>Answer is 19



                  */
            }
        }catch (Exception e){
            return;
        }
    }
}
