package oop.mobileDevice;

public class Tablet {

    String brand;
    String model;
    int year;
    double price;
    int memory;
    String color;
    boolean hasCamera;

    public Tablet(){
        this("Unknown brand", "Unknown model");

    }
    public Tablet (String brand, String model){
        this.brand = brand;
        this.model = model;
    }

//    public Tablet (String brand, String color){
//       this.brand = brand;
//       this.color = color;

    public Tablet (String brand, String model, int year, double price, int memory, String color, boolean hasCamera ){

        this(brand, model);
        this.year = year;
        this.price = price;
        this.memory = memory;
        this.color = color;
        this.hasCamera = hasCamera;
    }
public void printTabletDetails(){

      String details = "The barand is : " + brand
              + " The model is : " + model
              + " year is " + year;
      System.out.println(details);
  }
}

