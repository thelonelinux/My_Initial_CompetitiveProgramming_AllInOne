package com.company;

import java.util.Arrays;
import java.util.Collections;

public class PreviousFunctionsStoredHere {

    static int ans(int[] arr, int key){
        Arrays.sort(arr);

        return arr[key-1];
    }

    static int contains(int[] arr){

        if (arr.length==2){
            return 0;
        }
        if(arr.length==3){
            if (arr[1]>=arr[0]  && arr[1]>=arr[2]){
                return 0;
            }
        }
        int sum=0;

        Integer[] integers=new Integer[arr.length];

        for (int j=0;j<arr.length;j++){
            integers[j]=arr[j];
        }

        for(int i=1;i<arr.length-1;i++){

            Integer[] arr2=Arrays.copyOfRange(integers,0,i);
            int leftMax= Collections.max(Arrays.asList(arr2));

            Integer[] arr3=Arrays.copyOfRange(integers,i,arr.length);
            int rightMax=Collections.max(Arrays.asList(arr3));

            int minVal=Math.min(leftMax,rightMax);
            if(minVal>=arr[i]){
                sum=sum+minVal-arr[i];
            }



        }
        if(sum<0){
            return 0;
        }

        return sum;
    }

    static int checkLeftMax(int[] arr, int curr){
        int max=0;
        for(int i=curr;i>=0;i--){
            max=Math.max(max,arr[i]);
        }
        return max;
    }

    static int checkRightMax(int[] arr, int curr){
        int max=0;
        for (int i=curr;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        return max;
    }


}
