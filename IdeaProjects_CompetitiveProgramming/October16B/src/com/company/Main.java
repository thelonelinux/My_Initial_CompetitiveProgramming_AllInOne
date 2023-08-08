package com.company;

import org.omg.PortableServer.LIFESPAN_POLICY_ID;

import java.util.*;

public class Main {

    static  class Student{
        String name;
        Integer age;


        public Student(String hisNamePlease, int hisAgePlease){
            this.name=hisNamePlease;
            this.age=hisAgePlease;
        }

        @Override
        public String toString() {
            return "Customer{" + "Name=" + name + ", Age=" + age + '}';
        }

    }


    static Comparator<Student> compareStudent=new Comparator<Student>() {
        @Override
        public int compare(Student student, Student t1) {
            int nameCompare=(student.name).compareTo(t1.name);
            int ageCompare=(student.age).compareTo(t1.age);

            if (nameCompare == 0) {
                return ((ageCompare == 0) ? nameCompare : ageCompare);
            } else {
                return nameCompare;
            }
        }
    };

    public static void main(String[] args) {
	// write your code here

        List<Student> list=new ArrayList<Student>();

        list.add(new Student("Aradhna",22));
        list.add(new Student("Nikita",23));
        list.add(new Student("Menuka",25));
        list.add(new Student("Pummi",24));
        list.add(new Student("Nikita",26));
        list.add(new Student("Nikita",25));

        Collections.sort(list,compareStudent);



      Iterator<Student> custIterator = list.iterator();

        System.out.println("After Sorting:\n");
        while (custIterator.hasNext()) {
            System.out.println(custIterator.next());
        }

    }
}
