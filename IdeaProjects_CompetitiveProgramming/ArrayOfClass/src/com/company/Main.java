package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //making and passing values to class  like an array;
        //only array created and no person created;

        Person[] people = new Person[100];

        //but you need to initialize every array of class to as a Person class object by
        //using new Person();
        //so we make a loop to initialize every one of them;

        for (int i=0;i<people.length;i++){

            people[i]=new Person();

        }



       people[0].name="abc";
       people[0].age=1;
       people[0].setMarks(50);

       people[5].age=5;
       people[5].name="def";
       people[5].setMarks(80);

        System.out.println(people[0].age);
        System.out.println(people[0].getMarks());



        System.out.println(people[5].age);
        System.out.println(people[5].getMarks());


    }
}
