package com.company;

public class Main {

    public static void main(String[] args) {

//        int[] scores=new int[]{10, 5, 20, 20, 4 ,5 ,2, 25, 1};

        int[] scores =new int[]{3, 4, 21, 36, 10, 28, 35, 5, 24 ,42};


            int min=scores[0];
            int max=scores[0];
            int maxcount=0;
            int mincount=0;

            for(int i=0;i<scores.length;i++){
                if(scores[i]<min){
                    mincount=mincount+1;
                    min=scores[i];
                }
                else if(scores[i]>max){
                    maxcount=maxcount+1;
                    max=scores[i];
                }
            }


        int[] arr = new int[]{maxcount,mincount};


        System.out.println(maxcount+" "+mincount);
    }
}
