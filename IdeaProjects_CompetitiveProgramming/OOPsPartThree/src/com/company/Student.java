package com.company;

public class Student extends Person {

    int marks;

    public void displayMarks(){
        System.out.println(this.marks);
    }


    //Overridden method of parent class

    @Override
    public void displayInfo() {
        System.out.println(this.name+" "+this.age+" "+this.marks);
    }
}
