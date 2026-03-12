package oop.abstract_classes;

// Triangle class extends Shape abstract class and implements its
// abstract methods

public class Triangle extends Shape {

    int sideA;
    int sideB;
    int sideC;
    int height;

    public Triangle(String name, int sideA, int sideB, int sideC, int height) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.height = height;
    }

    public int calculatePerimeter() {
        int perimeter = sideA + sideB + sideC + height;
        return perimeter;
    }

    public double calculateArea() {
        double area = (double) (height * sideC) / 2;
        return area;
    }

    public void printSides() {
        String sideInfo = "Side A: " + sideA
                + "\nSide B: " + sideB
                + "\nSide C: " + sideC
                + "\nHeight: " + height;
        System.out.println(sideInfo);
    }
}
