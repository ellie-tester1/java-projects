package oop.abstract_classes;

public class Square extends Shape{

    private int side;

    // Constructor
    public Square(String name, int side) {
        super(name); // Shape классынын конструктору чакырылат
        this.side = side;
    }

    // Периметрди эсептөө
    public int calculatePerimeter() {
        return 4 * side;
    }

    // Аянтын эсептөө
    public double calculateArea() {
        return side * side;
    }

    // Квадраттын параметрлерин чыгарат
    public void printSides() {
        System.out.println("Side of Square is : " + side);
    }
        }



