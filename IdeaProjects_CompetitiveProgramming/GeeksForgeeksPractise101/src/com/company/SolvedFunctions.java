package com.company;

import java.util.Arrays;
import java.util.HashSet;

public class SolvedFunctions
{

    static String solution(int[] arr){

        HashSet<Integer> set = new HashSet<>();
        for(int s=0;s<arr.length;s++){
            set.add(arr[s]*arr[s]);
        }

        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){

                int a=(int)Math.pow(arr[i],2);
                int b=(int)Math.pow(arr[j],2);
                int sum=a+b;


                if(set.contains(sum)){
                    return "Yes";
                }
            }
        }
        return "No";
    }

    static int solution(String s1 , String s2){

        int i=Integer.parseInt(s1,2);
        int j=Integer.parseInt(s2,2);

        return i*j;
    }


    static int solution2(int[] arr){

        int count=0;

        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(i*arr[i]>j*arr[j]){
                    count++;
                }
            }
        }
        return count;
    }

    static int[] solution3(int[] arr){

        int[] arr2= Arrays.stream(arr).toArray();


        for(int i=0;i<arr.length;i++){
            int temp=arr[i];
            arr2[i]=arr[temp];

        }

        return arr2;
    }

    static int solutiong(int[] arr){

        int maxVal=0;
        for(int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]<=arr[j]){
                    int val=j-i;
                    maxVal=Math.max(maxVal,val);
                }
            }
        }

        return maxVal;

    }



}
