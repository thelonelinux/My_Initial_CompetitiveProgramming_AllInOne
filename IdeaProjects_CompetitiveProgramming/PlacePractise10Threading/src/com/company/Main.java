package com.company;

 class Hi extends Thread{

     public void run(){

         for (int i=0;i<5;i++){
             System.out.println("Hi");

             try {
                 Thread.sleep(1000);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }

         }

     }

}

class Hello extends Thread{

     public  void run(){

         for (int i=0;i<5;i++){
             System.out.println("Hello");


             try {
                 Thread.sleep(5000);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }

         }
     }
}

public class Main {

    public static void main(String[] args) {
	// write your code here

        Hi hi=new Hi();

        Hello hello =new Hello();

        hi.start();

        hello.start();


    }
}
