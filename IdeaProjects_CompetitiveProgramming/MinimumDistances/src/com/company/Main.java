package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        int[] a=new int[]{7 ,1 ,3 ,4 ,1 ,7};

        int[] a=new int[]{1 ,2 ,3 ,4 ,10};


        int num=0;
        int min=a.length;

        for (int i=0;i<a.length-1;i++){
            for (int j=i+1;j<a.length;j++){
                if (a[i]==a[j]){
                    int index1=i;
                    int index2=j;
                     num=num+index2-index1;
                    min=Math.min(num,min);
                    num=0;
                }
            }

        }

        if(min>=0  && min<a.length){
            min=min;
        }
        else{
            min=-1;
        }

        System.out.println(min);
    }
}
