package com.company;


class Hii implements Runnable{

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

class Helloo implements  Runnable{

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

public class Threading {

    public static void main(String[] args) {

        Runnable obj1=new Hii();
        Runnable obj2 =new Helloo();

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        t1.start();
        t2.start();
    }
}
