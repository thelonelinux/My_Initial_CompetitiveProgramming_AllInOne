package com.company;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static List<Integer> gradingStudents(List<Integer> grades) {

        List<Integer> list=new ArrayList<Integer>();


        int m=0;


        for (int i=0;i<grades.size();i++){

            if (grades.get(i)<38){
                list.add(m++,grades.get(i));
            }
            else {
                if (grades.get(i)%5==3){
                    list.add(m++,grades.get(i)-3+5);
                }

                if (grades.get(i)%5==4){
                    list.add(m++,grades.get(i)-4+5);
                }

                if (grades.get(i)%5<=2){
                    list.add(m++,grades.get(i));
                }

            }

        }

        return list;

    }

    public static void main(String[] args) {
	// write your code here

//        Integer a = 10;
//
//        String octalString=Integer.toOctalString(45);
//        String binaryString=Integer.toBinaryString(45);
//
//
//        System.out.println(octalString +"   "+ binaryString );
//
//
//
//
//        System.out.println(a);

//        int a =255;

//        int askdh=5;
////
////        String customString=Integer.toString(a,16);
////
////
////        System.out.println(customString);
////
////        String string="123";
////
////        int i=Integer.parseInt(string);
////
////        System.out.println(i);
////        System.out.println(string);
//
////        int a=9;
////
////
////        for (int j=0 ; j<a ; ++j){
////
////            for (int k=a ; k>j ; k--){
////
////                System.out.print(" ");
////            }
////
////            for (int l=0 ; l<j ; l++){
////
////                System.out.print(l+" " );
////            }
////
////
////
////            System.out.println(" ");
////
////        }
//
//        int askkdh=5;

//
//        for (int j=0 ; j<a ; ++j){
//
//
//            for (int l=0 ; l<j ; l++){
//
//                System.out.print(" ");
//            }
//
//            for (int k=a ; k>j ; k--){
//
//                System.out.print(k+" " );
//            }
//
//        int[] arr=new int[5];
//
//        arr[0]=5;
//
//        for (int value : arr) {
//
//            System.out.println(value);
//        }

        //most frequent element in the array

//        int[] arr={5,9,3,7,5,1,5,1};
//
//        Arrays.sort(arr);




//        for (int value : arr) {
//
//            System.out.println(value);
//        }

//        int[] arr2 = new int[0];
//
//
//        for (int i=0;i<arr.length-1;i++){
//
//
//            if (arr[i]==arr[i+1]){
//
//                int b=0;
//
//                arr2[b]=arr[i+1];
//
//            }
//
//        }
//
//        System.out.println(arr2[0]);

//        String pattern= "dd/MM/yyyy";
//
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
//
//        String date = simpleDateFormat.format(new Date());
//
//        System.out.println(date);
//
//        Integer integer =505;
//
//        String string= integer.toString();
//
//        System.out.println(string);
//
//        String string2= "555";
//        Integer integer1=Integer.valueOf(string2);
//
//        System.out.println(integer1);


        List<Integer>  integerList = new ArrayList<Integer>();

        integerList.add(0,73);
        integerList.add(1,67);
        integerList.add(2,38);
        integerList.add(3,33);



        System.out.println(gradingStudents(integerList));


//        System.out.println(integerList.get(0));




    }
}
