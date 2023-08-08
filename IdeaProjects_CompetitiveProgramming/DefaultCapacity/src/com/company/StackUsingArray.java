package com.company;

public class StackUsingArray {

   //These are instance variables or object variables;

    public int[] data;
    public int tos;


    //Normally Default capacity of an array is 0;
    //And that of ArrayList is 10;




    //so here we pass an default capacity for our array;


    //And also this is a class variable since use of static;

    public static final int DEFAULT_CAPACITY=20;


    //In case if we have not made any size of array then we can make it from constructor itself;

    public StackUsingArray() throws Exception{
        this(DEFAULT_CAPACITY);  //This will call the constructor i.e. one having paramaterised constructor with int arg;

        //which we have passed  DEFAULT_CAPACITY as integer here;
        //understood in video also;
    }

    //functions are use for data manipulation whereas constructor is for initialisation;


    public StackUsingArray(int capacity) throws Exception{

        if (capacity<1){
            throw new Exception("Please enter the valid capacity");
        }

        this.data=new int[capacity];

        this.tos=-1;

    }


    public int size(){
        return this.tos+1;
    }

    public void push(int j) {


            data[++tos] = j; //you can write here this.stackArray also . But this will also do;

    }



}
