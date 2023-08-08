package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        int[] keyboards=new int[]{3,1};
//        int[] drives=new int[]{5,2,8};
//
//        int b=10;

        int[] keyboards=new int[]{4};
        int[] drives=new int[]{5};

        int b=5;

        int maxexpense=0;

        int ans=0;


        for (int i=0;i<keyboards.length;i++){
            for (int j=0;j<drives.length;j++){
                maxexpense=maxexpense+keyboards[i]+drives[j];

                if (maxexpense<=b){
                    ans=Math.max(ans,maxexpense);
                }
                maxexpense=0;
            }
        }

        if(ans==0){
            ans=ans-1;
        }

        System.out.println(ans);
    }
}
