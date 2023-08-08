package com.company;



public class TestClass {

    public static void main(String[] args){
        try{

            doTest();
        }

        catch (Exception me){

            System.out.println(me);

        }

    }

    static void doTest() throws Exception{

        int[] array = new int[10];
        array[10] =1000;
        doAnotherTest();

    }

    static void doAnotherTest() throws Exception{

        throw new Exception("Exception from doAnotherTest" );
    }
}
