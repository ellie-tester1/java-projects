package oop.shapes_method_override;

public class CalculateShapeDimensions {
    public static void main(String[] args) {

        Square square = new Square();
        square.name = "Square";
        square.sideLength = 5;
        System.out.println("Length of Square is: " + square.calculatePerimeter());


        //compile static type polymorphism
        square.calculateArea();
        square.calculateArea(5);


        Shape squareObj = new Square();
        ((Square) squareObj).sideLength = 4;
        int perimeterOfSquareObj = squareObj.calculatePerimeter();
        System.out.println("Perimeter: " + perimeterOfSquareObj);
    }
}
