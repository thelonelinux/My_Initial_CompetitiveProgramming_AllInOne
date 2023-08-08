package com.company;

public class Main {


    public static long[][] forLowerFromHigher(long[] height, long[] taste){

        long[][]  ans=new long[height.length][height.length];

        for (int i=1;i<=height.length-1;i++){
            //distance from i to others j
            long localMaxHeight=0;
            long previousTotalValueTasted=0;
            for (int j=i;j<=height.length-1;j++){
                if (i==j){
                    localMaxHeight=height[j];
                    previousTotalValueTasted+=taste[i];
                    ans[i][j]=taste[i];
                }else{
                    if (localMaxHeight<height[j]){
                        localMaxHeight=height[j];
                        previousTotalValueTasted+=taste[j];
                        ans[i][j]=previousTotalValueTasted;
                    }
                    else {
                        ans[i][j]=0;
                    }
                }

            }
        }

        return ans;


    }

    public static long[][] forUpperFromLower(long[] height,long[] taste){

        long[][] newArray=new long[height.length][height.length];

        for (int i=height.length-1;i>=1;i--){
            //distance from i to others j
            long localMaxHeight=0;
            long previousTotalValueTasted=0;
            for (int j=i;j>=1;j--){
                if (i==j){
                    localMaxHeight=height[j];
                    previousTotalValueTasted+=taste[i];
                    newArray[i][j]=taste[i];
                }else{
                    if (localMaxHeight<height[j]){
                        localMaxHeight=height[j];
                        previousTotalValueTasted+=taste[j];
                        newArray[i][j]=previousTotalValueTasted;
                    }
                    else {
                        newArray[i][j]=0;
                    }
                }
            }
        }

        return newArray;

    }

    public static void main(String[] args) {
	// write your code here

        long[] height={ 0,3 ,1 ,4 ,1, 5};   /** 10 element made 11 by adding 0 at first so that count for i remains integer only so 1-10*/
        long[] taste={0,1 ,2 ,4, 8 ,16};
        /* Also take zero to remove unnecessary so that 1 points to 1 rather than 0th index**/

        /** But this generated Array is for only if we have to go to i from any point from i+1 and so on*/
        long[][]  ans=new long[height.length][height.length];
        ans=forLowerFromHigher(height,taste);

//        for (int i=1;i<=height.length-1;i++){
//            //distance from i to others j
//            long localMaxHeight=0;
//            long previousTotalValueTasted=0;
//            for (int j=i;j<=height.length-1;j++){
//                if (i==j){
//                    localMaxHeight=height[j];
//                    previousTotalValueTasted+=taste[i];
//                    ans[i][j]=taste[i];
//                }else{
//                    if (localMaxHeight<height[j]){
//                        localMaxHeight=height[j];
//                        previousTotalValueTasted+=taste[j];
//                        ans[i][j]=previousTotalValueTasted;
//                    }
//                    else {
//                        ans[i][j]=0;
//                    }
//                }
//
//            }
//        }

        System.out.println("Ok"+" "+ans[2][5]);
        /** this above gives answer like this going to 2 i.e. i    from 5 i.e. j    and always j>=i**/


        /** So let's make another array for that */
        long[][] newArray=new long[height.length][height.length];
        newArray=forUpperFromLower(height,taste);

//        for (int i=height.length-1;i>=1;i--){
//            //distance from i to others j
//            long localMaxHeight=0;
//            long previousTotalValueTasted=0;
//            for (int j=i;j>=1;j--){
//                if (i==j){
//                    localMaxHeight=height[j];
//                    previousTotalValueTasted+=taste[i];
//                    newArray[i][j]=taste[i];
//                }else{
//                    if (localMaxHeight<height[j]){
//                        localMaxHeight=height[j];
//                        previousTotalValueTasted+=taste[j];
//                        newArray[i][j]=previousTotalValueTasted;
//                    }
//                    else {
//                        newArray[i][j]=0;
//                    }
//                }
//            }
//        }

        System.out.println("Ok2"+" "+newArray[4][3]);    /** It gives i from j*(j>i)   */
        /** This gives answer about going to 4 i.e. j from 3 i.e. i and here always i>=j*/




    }
}
