package oop.vehicle;

public class Vehicle {

    String type;
    String make;
    String model;
    int year;
    int numberOfWheels;
    String color;



    //Vehicle vehicle1 = new Vehicle("Volvo", "V80", 2018, 4, "Red");
    public Vehicle(String make, String model, int year, int numberOfWheels){
        this.make = make;
        this.model = model;
        this.year = year;
        this.numberOfWheels = numberOfWheels;
        this.color = color;

    }

    public void startVehicle(){ System.out.println("Vehicle has started!"); }

    public void stopVehicle(){ System.out.println("Vehicle has stopped!"); }

    public void honk(){ System.out.println("Beep beep!"); }



}
