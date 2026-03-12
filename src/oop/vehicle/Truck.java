package oop.vehicle;

public class Truck extends  Vehicle {

    int weightLimit;
    int grossWeight;

    public Truck(String make, String model, int year, int numberOfWheels, String color, int weightLimit, int grossWeight) {
        //super() -> keyword is used to refer to the parent class's constructor it has to be used as the first statement
        // within the  constructor of the child class
        super(make, model, year, numberOfWheels);
        this.weightLimit = weightLimit;
        this.grossWeight = grossWeight;

    }

    public void attachTrailer(int trailerNumber) {
        System.out.println(trailerNumber + " is now attached to truck: " + make);
    }

    public void dropTrailer() {
        System.out.println("Trailer has been detached from the truck: " + make);
    }
}
