package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Main {

    static long triplets(int[] a, int[] b, int[] c) {

        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);

        HashSet<Integer> hs=new HashSet<Integer>();

        for(int v=0;v<b.length;v++){
            hs.add(b[v]);
        }

        List<Integer> list=new ArrayList<Integer>(hs);

        int[] arr=new int[list.size()];

        for(int m=0;m<list.size();m++){
            arr[m]=list.get(m);
        }


        int i=0;
        int j=0;
        int k=0;
        long count=0;

        while(i<a.length  &&  j<b.length  &&  k<c.length){

            if(a[i]<=arr[j]  &&  c[k]<=arr[j]){
                count++;
                k++;

            }
            else {
                k++;
            }

            if(i==a.length){
                break;
            }

            if(i<a.length || j<arr.length){
                if( k==c.length){
                    k=0;
                    j++;
                }
            }

            if(i<a.length-1 ){
                if(j==arr.length){
                    j=0;
                    k=0;
                    i++;
                }
            }
        }
        return count;


    }

    public static void main(String[] args) {
	// write your code here
        int[] a={10,7,5,3,4,8,1 ,3 ,3,3,3,3,5,7,7,7,7,7};

        int[] b={5,7,9,1,3,4,2,5,7,1,1,1,1};

        int[] c={7,9,11,13};

        int[] arr = Arrays.stream(a).sorted().toArray();
        int[] brr = Arrays.stream(b).distinct().toArray();
        int[] crr = Arrays.stream(c).sorted().distinct().toArray();


        Arrays.stream(arr).forEach(System.out::println);

    }
}
