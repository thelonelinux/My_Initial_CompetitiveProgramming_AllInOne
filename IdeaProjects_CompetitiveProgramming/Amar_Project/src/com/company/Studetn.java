package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Studetn {

    static  class Student {
        String name;
         int rollNumber;
        int marks;
        char section;

        Student(String name, int rollNumber, int marks, char section)
        {
            this.name = name;
            this.rollNumber = rollNumber;
            this.marks = marks;
            this.section = section;
        }

        void print()
        {
            System.out.println("Section is "+section + " - " +"Roll Number is "+rollNumber + " - " +"Name is "+ name + " - " +"His marks is "+ marks );
        }
    }

    static class RollNumberComparator implements Comparator {
        public int compare(Object o1,Object o2){
            Student s1=(Student)o1;
            Student s2=(Student)o2;

            if(s1.rollNumber==s2.rollNumber)
                return 0;
            else if(s1.rollNumber>s2.rollNumber)
                return 1;
            else
                return -1;
        }
    }

    public static void main(String s[]) throws java.lang.Exception{
        Student anand = new Student("Anand", 5, 87, 'A');
        Student saroja = new Student("Saroja", 6, 91, 'A');
        Student aswini = new Student("Aswini", 9, 55, 'C');
        Student manthra = new Student("Manthra", 10, 76, 'B');
        Student satya = new Student("Satya", 11, 76, 'C');
        Student bhadra = new Student("Bhadra", 4, 71, 'C');
        Student venki = new Student("Venki", 8, 45, 'B');
        Student kanchana = new Student("Kanchana", 2, 39, 'B');

        List<Student> students = new ArrayList<Student>();
        students.add(anand);
        students.add(saroja);
        students.add(aswini);
        students.add(manthra);
        students.add(satya);
        students.add(bhadra);
        students.add(venki);
        students.add(kanchana);


        Collections.sort(students,new RollNumberComparator());
        System.out.println("Students sorted on the basis of roll Number");

        for(int i = 0; i < students.size(); i++)
        {
            students.get(i).print();
        }

    }
}



