package com.company;

public class Students {

    final static int numOfStudents=50;
    String name;
    private int rollNo;

    //Although java itself creates a default constructor initilizing integer to 0,bool to false
    //and strings to null;

    //but as soon as we create our own constructor explicitly then that implicit constructor goes off;

    //crating our own constructor;

    //Normally constructor is used to initialize the values;

    //this below constructor is called as parameterized constructor;

    public void Students(String name,int rollNo){
        this.name=name;
        this.rollNo=rollNo;
    }

    //or
    //this is simple constructor;

    public void Students(){
        this.name=name;
        this.rollNo=rollNo;
    }

    //copy constructor;
    //here this constructor can be used to copy the data member values of one object to another;

    public void Students(Students s){
        this.rollNo=s.rollNo;
        this.name=s.name;
    }



    //working with methods now;

    public String getName(){
        return this.name;
    }

    public int getRollNo(){
        return this.rollNo;
    }

    //for static data members you need to make static methods as getters and setters;

    public static int getNumOfStudents(){
        return Students.numOfStudents;
    }

    public void fun(){
        System.out.println("Well! Hello students");
    }
}
