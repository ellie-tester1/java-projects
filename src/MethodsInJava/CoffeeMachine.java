package MethodsInJava;

import java.util.Scanner;

public class CoffeeMachine {
    String brand;
    double price;
    int cupSize;

    //constuctor

    public CoffeeMachine(String brand, double price, int cupSize) {
        this.brand = brand;
        this.price = price;
        this.cupSize = cupSize;
    }

    public void  printDetails(){
        System.out.println("The brand for cm1 is: " + this.brand);  ////create a double  variable and store the price for cm1
        System.out.println("The price for cm1 is: " + this.price);  //create an int variable and store the supported cup size for cm_1
        System.out.println("The cup size for cm1 is: " + this.cupSize);
        System.out.println("///////////////////////////////////////////");
    }

    //method to print the discounted price of coffee machine price info


    public void applyDiscount() {
        double discountPriceHalfOff = this.price * 0.5;
        System.out.println("******************************"+
                "\nThe " + this.brand + " coffee machine price info: " +
                "\nOriginal price: $" + this.price +
                "\nAfter 50% of the price is: $" + discountPriceHalfOff+
                "\n************************************");
    }

    public static void main(String[] args) {
        //instantiate an object of CoffeeMachine class
        CoffeeMachine cm_1 = new CoffeeMachine("Keurig", 299.99, 9);  //created a Strung literal variable and stored the brand for cm_1
       cm_1.printDetails();
       cm_1.applyDiscount();

        CoffeeMachine cm_2 = new CoffeeMachine("Lor Barist",129.00, 4);
        cm_2.printDetails();

        CoffeeMachine cm_3 = new CoffeeMachine("De Longhi",225.99, 9);
        cm_3.printDetails();

        CoffeeMachine cm_4 = new CoffeeMachine("Cuisinart",439.00, 14);
        cm_4.printDetails();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the coffee machine brand name: ");
        String coffeeMachineBrand = scanner.nextLine();
        System.out.println("Please enter the price of the coffee machine: ");
        double coffeeMachinePrice = scanner.nextDouble();

        System.out.println("Please enter supported cup size for coffee machine: ");
        int coffeeMachineCupSize = scanner.nextInt();

        CoffeeMachine cm_5 = new CoffeeMachine(coffeeMachineBrand, coffeeMachinePrice, coffeeMachineCupSize);
        cm_5.printDetails();


        }

    }


