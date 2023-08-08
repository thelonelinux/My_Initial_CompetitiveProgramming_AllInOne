package com.company;

import java.util.*;

public class Main {

    static int MOD=1000000007;

    public static int maxScore(List<Integer> a, int m) {
        int len=a.size();
        int segmentLength=m;
        int mod=len%segmentLength;
        int numOfSegments=len/segmentLength;
        Collections.sort(a);

        if (mod==0){
            numOfSegments=numOfSegments;
        }else if(mod!=0){
            numOfSegments=numOfSegments-1;
        }

        if (numOfSegments==0){
            int simpleSum=0;
            for (int i=0;i<len;i++){
                simpleSum=(((simpleSum)&MOD)+((a.get(i))%MOD))%MOD;
            }
            return simpleSum;
        }else {
            int storeIndex=0;
            int initial=1;
            int sum=0;
            for (int i=0;i<len;i++){
                sum=(((sum)%MOD)+(((a.get(i))%MOD)*((initial)%MOD)))%MOD;
                segmentLength--;
                if (segmentLength==0){
                    initial++;
                    segmentLength=m;
                    numOfSegments--;
                }
                if (numOfSegments==0){
                    storeIndex=i+1;
                   // initial++;
                    break;
                }

            }
            for (int j=storeIndex;j<len;j++){
                sum=((sum)%MOD)+(((initial)%MOD)*((a.get(j))%MOD))%MOD;
            }
            return sum;
        }


    }

    public static void main(String[] args) {

        try{
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while (t-->0){
                int len=sc.nextInt();
                int segmentLength=sc.nextInt();
                List<Integer> list=new ArrayList<>();
                for (int i=0;i<len;i++){
                    list.add(sc.nextInt());
                }
                System.out.println(maxScore(list,segmentLength));

            }
        }catch (Exception e){
            return;
        }

    }
}
