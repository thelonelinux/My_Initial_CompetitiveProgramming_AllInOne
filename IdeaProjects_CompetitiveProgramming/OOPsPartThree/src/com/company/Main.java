package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Person person=new Person();

        Person personstudent=new Student(); //No Error: since person has its all part in Student class;

        Student student=new Student();

//        Student studentperson = new Person();  //Error: Its bcoz Student does not has all its attributes in Person;
                 //it has some new attributes also which is not present in the parent;


        person.age=10;
        person.name="bk";


        personstudent.name="vkp";
        personstudent.age=20;
        ((Student) personstudent).marks=40;  //Its actually type casting;

        person.displayInfo();

        personstudent.displayInfo();
    }
}
