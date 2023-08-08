package com.company;

public class Main {





    public static void main(String[] args) {
	// write your code here

//        hello();
//
//        int sum=sum(4,9);
//
//        System.out.println("sum is "+sum);

        //testing if the local variables can swapo the global variables after the function call
        // is finished.
        //the answer here we find is no
        //once the function calling is complete the global variables retains its values
        //because they are made in stack all primitive datas
        //rest see in the java crux book

        int x=5;
        int y=6;

        System.out.println("before swaping the values "+" x="+x +" y="+y);

        swap(x,y);

        System.out.println("after swaping the values "+" x="+x +" y="+y);






    }


    public static void hello(){
        System.out.println("hello world");
    }

    public static int sum(int a, int b){
        return a+b;
    }

    public static void swap(int a,int b){
        int temp;
        temp=b;
        b=a;
        a=temp;

        System.out.println("the swap values are "+" a="+a+" b="+b);

    }
}
