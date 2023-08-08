package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Vehicle vehicle=new Vehicle();

        vehicle.numWheels=4;
        vehicle.model="A6";
        vehicle.brand="BMW";
        vehicle.color="Black";
        vehicle.yearOfManufacture=2018;
        vehicle.setPrice(1000000);
//      vehicle.numberOfCustomers=60;// here changing the final data members shows error;

        System.out.println("The price of Bmw is "+vehicle.getPrice());
        vehicle.printDescription();




        Vehicle audi = new Vehicle();

        audi.numWheels=4;
        audi.color="Black";
        audi.brand="Audi";
        audi.model="A5";
        audi.setPrice(200000);
        audi.numOfCars=50;  //though static data members is accessed by the object but it shows warning
        audi.yearOfManufacture=2018;
        audi.printDescription();

        Vehicle.numOfCars=50;
        System.out.println("there are total "+Vehicle.numOfCars+" cars");

    }
}
