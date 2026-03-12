package oop.mobileDevice;

public class mobileDevice {

    String brand;
    String model;
    int year;
    double price;
    int memory;
    String color;

    public mobileDevice(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    //this() keyword is used for referring to the  constructor of this object
    //it also takes parameters to initialize the instance variables

    public mobileDevice (String brand, String model, int year, double price, int memory, String color ){

        this(brand, model);
        this.year = year;
        this.price = price;
        this.memory = memory;
        this.color = color;

    }

        public void printTabletDetails() {
            System.out.println("Brand: " + brand + ", Model: " + model + ", Price: $" + price + ", Memory: " + memory + "GB" +  ", Color: " + color);
    System.out.println("-------------------------------------------------------------------------------");
    }
}
