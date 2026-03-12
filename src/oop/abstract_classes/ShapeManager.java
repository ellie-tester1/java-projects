package oop.abstract_classes;

// We will utilize this class to create an object of Triangle class
// using Shape abstract class

public class ShapeManager {

    public static void main(String[] args) {

        Shape shapeObj1 = new Triangle("Scalene Triangle", 2, 3, 4, 1);
        shapeObj1.printShapeName();
        System.out.println("Perimeter is from Triangle class: " + shapeObj1.calculatePerimeter());
        System.out.println("Area os Triangle is: " + shapeObj1.calculateArea());
        ((Triangle) shapeObj1).printSides();
        System.out.println("============================");


        // Square
        Square square = new Square("MySquare", 5);

        // Маалыматтарды экранга чыгаруу
        square.printSides();
        System.out.println("Perimeter: " + square.calculatePerimeter());
        System.out.println("Area: " + square.calculateArea());
    }


    }

    // Task: Create a Square class which extends the Shape abstract class and provide
    // implementation to the abstract methods.

