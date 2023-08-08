package com.company;

public class Vehicle {

    public String brand;//accessed everywhere outside the folder also;
    protected String model;  //protected are only for this same package only i.e. com.company of OOPs;
    private double price; //this private data member cant be called in main function;
    int numWheels;
    int yearOfManufacture;
    String color;  //default data members are treated as public;for all package in this OOPs;
   public static int numOfCars;  //Only this can be accessed using Vehicle.numOfCars. and not by its object;
                          //that is by class itself and not by the object;

    final int numberOfCustomers=50;//this final means its values cant be changed now.
               //its value is either declared here of initialized in the constructor.
    //such final can be used for methods also which cant be overridden.
    //i.e. it cant be inherited.

    //for private we need to set getter and setter to get the values outiside the class in main class
    //getter and setter are mostly used for private data members only;
    public double getPrice(){
        return this.price;
//        return price;  //this way also do;

    }

    public void setPrice(int n){
        this.price=n;
    }

    public void printDescription(){
        System.out.println(brand+" "+model+" "+price+" "+numWheels);
    }
}
