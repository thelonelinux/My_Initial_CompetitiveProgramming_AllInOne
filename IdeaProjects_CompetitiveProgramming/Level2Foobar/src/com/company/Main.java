package com.company;

public class Main {


    public static int[] solution(int[] l, int t) {
        // Your code here

        int[] ans=new int[2];

        //Case when the length of the arr==1;
        if (l.length==1){
            if (l[0]==t){
                ans[0]=0;
                ans[1]=0;
            }else{
                ans[0]=-1;
                ans[1]=-1;
            }
            return ans;
        }


        int initial=0;
        int next=0;
        int sum=0;
        while (next<=l.length-1  && initial<=l.length-1){
            sum=sum+l[next];
            if (sum==t){
                ans[0]=initial;
                ans[1]=next;
                return ans;

            }else if (sum>t){
                sum=sum-l[initial]-l[next];
                initial++;
                next=next;
            }else if (sum<t){
                next++;
            }


        }

        ans[0]=-1;
        ans[1]=-1;
        return ans;
    }


    public static void main(String[] args) {
	// write your code here



        int[] arr={1,2,3,4};
        int[] arr2={4, 3, 10, 2, 8};
        int[] arr3={4, 3, 5, 7, 8};
        int t=15;


        int[] ans=new int[2];
        ans=solution(arr3,12);
        System.out.println(ans[0]+" "+ans[1]);
    }
}
