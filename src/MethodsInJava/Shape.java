package MethodsInJava;

public class Shape {

    String shapeName;
    int height;
    int width;

    public Shape (String shapeName, int height, int width) {
        this.shapeName = shapeName;
        this.height = height;
        this.width = width;
    }

    public static void main(String[] args) {
        Shape square = new Shape("Square", 2, 2);
        Shape rhombus = new Shape("Rhombus", 3, 5);
       Shape rectangle = new Shape("Rectangle", 4, 8);

        int squarePerimeter = square.calculatePerimeter();
        square.printData(squarePerimeter);
        rhombus.printData(rhombus.calculatePerimeter());
        rectangle.printData(rectangle.calculatePerimeter());
    }
    // create a method which calculates the perimeter of the shape and returns it
    public int calculatePerimeter() {
    int perimeter = 2 * (height + width);
    return perimeter;
    }

    // create a method which prints object property data
    public void printData(int data) {
    System.out.println(shapeName + " perimeter is: " + data);
}
}
