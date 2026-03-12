package MethodsInJava;

public class Car {
    String make;
    String model;
    int makeYear;
    String type;
    String color;
    double engineSize;
    float fuelConsumption;

    public Car(String make, String model, int makeYear, String type, String color, double engineSize, float fuelConsumption) {
        this.make = make;
        this.model = model;
        this.makeYear = makeYear;
        this.type = type;
        this.color = color;
        this.engineSize = engineSize;
        this.fuelConsumption = fuelConsumption;
    }


    public  void  startEngine(){
        System.out.println(this.make + " " + this.model +  " Engine has started!");
    }
    public void  drive(){
        System.out.println( this.model + " is driving!");
    }
    public  void  turnOnAC(){
        System.out.println("AC is on!");
    }
    public  void  openWindow(String window){
        System.out.println(window + " is open now for " + this.model);
    }

    public static void main(String[] args) {
     Car gx470 = new Car ("Lexus", "GX470", 2009, "Truck", "White", 4.7, 13.5f);
     gx470.startEngine();
     gx470.drive();
     gx470.turnOnAC();

     Car bmw = new Car ("BMW", "X7", 2003, "SUV", "Black", 4.4, 21.00f);
 bmw.startEngine();
 bmw.openWindow("Front driver side");
    }



}
